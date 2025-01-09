package Reflection_and_Annotations.Skeletons.blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Scanner scanner = new Scanner(System.in);


        Class<BlackBoxInt> blackBoxIntClass = BlackBoxInt.class;

        Constructor<BlackBoxInt> declaredConstructor = blackBoxIntClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);

        BlackBoxInt blackBoxInt = declaredConstructor.newInstance();

        Field innerValue = blackBoxIntClass.getDeclaredField("innerValue");
        String command = scanner.nextLine();

        while (!command.equals("END")){
            String commandName = command.split("_")[0];
            int parameter = Integer.parseInt(command.split("_")[1]);

            Method method = blackBoxIntClass.getDeclaredMethod(commandName, int.class);
            method.setAccessible(true);
            method.invoke(blackBoxInt, parameter);

            innerValue.setAccessible(true);

            System.out.println(innerValue.get(blackBoxInt));

            command = scanner.nextLine();
        }

    }
}

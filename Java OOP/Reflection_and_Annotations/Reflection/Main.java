package Reflection_and_Annotations.Reflection;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);

        //Import "Reflection.java" to your "src" folder in your project.
        // Try to use reflection and print some information about this class.
        // Print everything on a new line:
        //•	This class type
        //•	Super class type
        //•	All interfaces that are implemented by this class
        //•	Instantiate object using reflection and print it too

        Class<Reflection> reflection = Reflection.class;

        System.out.println(reflection);

        Class superClass = reflection.getSuperclass();

        System.out.println(superClass);

        Class<?>[] interfaces = reflection.getInterfaces();

        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }

        Reflection reflectedObject = reflection.getDeclaredConstructor().newInstance();

        System.out.println(reflectedObject);


    }
}

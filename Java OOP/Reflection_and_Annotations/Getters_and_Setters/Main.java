package Reflection_and_Annotations.Getters_and_Setters;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Class<Reflection> reflectionClass = Reflection.class;


        Method[] declaredMethods = reflectionClass.getDeclaredMethods();

        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.getName().startsWith("get")) {
                System.out.println(declaredMethod.getName() + " will return class " +
                        declaredMethod.getReturnType().getSimpleName());
            }
        }

        for (Method declaredMethod : declaredMethods) {
            Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
            if (declaredMethod.getName().startsWith("set")) {
                System.out.println(declaredMethod.getName() + " and will set field of class " +
                        parameterTypes[0].getSimpleName());
            }
        }

    }
}

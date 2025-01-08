package Reflection_and_Annotations.HighQualityMistakes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {


        Class reflectionClass = Reflection.class;
        Field[] declaredFields = reflectionClass.getDeclaredFields();



        for (Field declaredField : declaredFields) {
            if (!Modifier.isPrivate(declaredField.getModifiers())) {
                System.out.println(declaredField.getName() + " must be private!");
            }
        }

        Method[] declaredMethods = reflectionClass.getDeclaredMethods();

        for (Method declaredMethod : declaredMethods) {

            if (declaredMethod.getName().startsWith("get")) {
                if (!Modifier.isPublic(declaredMethod.getModifiers())) {
                    System.out.println(declaredMethod.getName() + " must be public!");
                }
            } else if (declaredMethod.getName().startsWith("set")) {
                if (!Modifier.isPrivate(declaredMethod.getModifiers())) {
                    System.out.println(declaredMethod.getName() + " must be private!");
                }
            }

        }


    }
}

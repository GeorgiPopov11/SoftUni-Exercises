package MidExamExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo {
    public static void main(String[] args) {


        List<String> items = Arrays.asList("bow", "sword", "crossbow", "jabala");
        int index = items.indexOf("sword");
        String indexOfSword = items.get(items.indexOf("sword"));
        items.set(index, "gun" );
        items.set(items.indexOf("gun" + 1), "sword");


        for (String item : items) {
            System.out.print(item + " ");
        }
    }
}

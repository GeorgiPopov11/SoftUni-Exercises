package Maps_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        //text text text

        Map<Character, Integer> textMap = new LinkedHashMap<>();

        for (char symbol : input.toCharArray()){
            if (symbol == ' ') {
                continue;
            }

            if (!textMap.containsKey(symbol)){
                textMap.put(symbol, 1);
            } else {
                textMap.put(symbol, textMap.get(symbol) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : textMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }







    }
}

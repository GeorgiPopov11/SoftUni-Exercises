package AssociativeArrays_Lambda_StreamAPI_Lab;

import java.util.*;

public class P03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();

        for (String word : words) {
            String lowerCaseWord = word.toLowerCase();

            if (wordsMap.containsKey(lowerCaseWord)) {
                wordsMap.put(lowerCaseWord, wordsMap.get(lowerCaseWord) + 1);
            } else {
                wordsMap.put(lowerCaseWord, 1);
            }

        }

        ArrayList<String> oddWords = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                oddWords.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", oddWords));

    }
}

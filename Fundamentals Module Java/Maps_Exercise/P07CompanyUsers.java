package Maps_Exercise;

import java.util.*;

public class P07CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> companyUsersMap = new LinkedHashMap<>();

        while (!input.equals("End")){

            String[] inputCommands = input.split(" -> ");
            String companyName = inputCommands[0];
            String employeeName = inputCommands[1];

            if (!companyUsersMap.containsKey(companyName)){
                companyUsersMap.put(companyName, new ArrayList<>());
              companyUsersMap.get(companyName).add(employeeName);
            } else {
                if (companyUsersMap.get(companyName).contains(employeeName)) {
                    companyUsersMap.get(companyName).set(companyUsersMap.get(companyName).size() - 1, employeeName);
                } else {
                    companyUsersMap.get(companyName).add(employeeName);
                }
            }


            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : companyUsersMap.entrySet()) {
            String companyName = entry.getKey();
            List<String> employees = entry.getValue();

            System.out.println(companyName);
            for (String employee : employees) {
                System.out.printf("-- %s%n", employee);
            }

        }


    }
}

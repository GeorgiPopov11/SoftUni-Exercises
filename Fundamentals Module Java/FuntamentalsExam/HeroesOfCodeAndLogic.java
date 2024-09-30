package FuntamentalsExam;

import java.util.*;

public class HeroesOfCodeAndLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> heroesMap = new LinkedHashMap<>();

        for (int i = 1; i <= n ; i++) {
            String hero = scanner.nextLine();
            String heroName = hero.split(" ")[0];
            String heroHitPoints = hero.split(" ")[1];
            String heroManaPoints = hero.split(" ")[2];

            heroesMap.put(heroName, new ArrayList<>());
            heroesMap.get(heroName).add(Integer.parseInt(heroHitPoints));
            heroesMap.get(heroName).add(Integer.parseInt(heroManaPoints));
        }

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] inputParts = input.split(" - ");
            String command = inputParts[0];
            String heroName = inputParts[1];

            if (command.equals("CastSpell")) {
                int manaNeeded = Integer.parseInt(inputParts[2]);
                String spellName = inputParts[3];
                if (heroesMap.get(heroName).getLast() >= manaNeeded) {
                    int manaLeft = heroesMap.get(heroName).getLast() - manaNeeded;
                    heroesMap.get(heroName).set(1, manaLeft);
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, manaLeft);
                } else {
                    System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                }
                
                
            } else if (command.equals("TakeDamage")) {
                int damage = Integer.parseInt(inputParts[2]);
                String attacker = inputParts[3];
                if (heroesMap.get(heroName).getFirst() > damage) {
                    int healthLeft = heroesMap.get(heroName).getFirst() - damage;
                    heroesMap.get(heroName).set(0, healthLeft);
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, healthLeft);
                } else {
                    System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                    heroesMap.remove(heroName);
                }
                
                
            } else if (command.equals("Recharge")) {
                int amount = Integer.parseInt(inputParts[2]);
                int currentMana = heroesMap.get(heroName).getLast();
                int manaOver = 200 - currentMana;
                heroesMap.get(heroName).set(1, currentMana + amount);

                if (heroesMap.get(heroName).getLast() > 200) {
                    heroesMap.get(heroName).set(1, 200);
                    //160 + 50 = 210
                    System.out.printf("%s recharged for %d MP!%n", heroName, manaOver);
                } else {
                    System.out.printf("%s recharged for %d MP!%n", heroName, amount);
                }
                
                
            } else if (command.equals("Heal")) {
                int amount = Integer.parseInt(inputParts[2]);
                int currentHealth = heroesMap.get(heroName).getFirst();
                int healthOver = 100 - currentHealth;
                heroesMap.get(heroName).set(0, currentHealth + amount);

                if (heroesMap.get(heroName).getFirst() > 100) {
                    heroesMap.get(heroName).set(0, 100);
                    System.out.printf("%s healed for %d HP!%n", heroName, healthOver);
                } else {
                    System.out.printf("%s healed for %d HP!%n", heroName, amount);
                }
                
            }


            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<Integer>> entry : heroesMap.entrySet()) {
            String heroName = entry.getKey();
            int health = entry.getValue().getFirst();
            int mana = entry.getValue().getLast();

            System.out.println(heroName);
            System.out.println("HP: " + health);
            System.out.println("MP: " + mana);

        }



    }
}

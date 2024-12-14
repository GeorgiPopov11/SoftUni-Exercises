package DefiningClasses.P02_Constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Car> carsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
           if (tokens.length == 1) {
               String brand = tokens[0];
               Car car = new Car(brand);
               carsList.add(car);

           } else {
            String brand = tokens[0];
            String model = tokens[1];
            int horsePower = Integer.parseInt(tokens[2]);
            Car car = new Car(brand, model, horsePower);
            carsList.add(car);

           }

        }

        for (Car car : carsList) {
            car.carInfo();
        }

    }
}

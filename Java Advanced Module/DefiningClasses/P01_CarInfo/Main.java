package DefiningClasses.P01_CarInfo;

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
            //Chevrolet Impala 390
            String carBrand = tokens[0];
            String carModel = tokens[1];
            int horsePower = Integer.parseInt(tokens[2]);

            Car car = new Car();
            car.setBrand(carBrand);
            car.setModel(carModel);
            car.setHorsePower(horsePower);

            carsList.add(car);
        }

        for (Car car : carsList) {
            car.carInfo();
        }

    }
}

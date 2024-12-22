package WorkingWithAbstraction.HotelReservation;

public class PriceCalculator {


    public static double calculatePrice (double pricePerDay, int numberOfDays, Season season, DiscountType discountType) {

        double pricePerDayMultiplied = pricePerDay * numberOfDays * season.getMultiplier();
        double totalPrice = pricePerDayMultiplied - (pricePerDayMultiplied * discountType.getPercentage());

        return totalPrice;
    }


}

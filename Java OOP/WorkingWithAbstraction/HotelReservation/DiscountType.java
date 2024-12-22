package WorkingWithAbstraction.HotelReservation;

public enum DiscountType {
    VIP(0.2),
    SecondVisit(0.1),
    None(0);

    private double percentage;

    DiscountType(double discount) {
        this.percentage = discount;
    }

    public double getPercentage() {
        return percentage;
    }
}

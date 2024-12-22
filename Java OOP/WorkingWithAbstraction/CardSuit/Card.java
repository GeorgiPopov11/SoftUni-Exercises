package WorkingWithAbstraction.CardSuit;

public enum Card {
    CLUBS,
    DIAMONDS,
    HEARTS,
    SPADES;

    @Override
    public String toString() {
        return String.format("Ordinal value: %d; Name value: %s",this.ordinal() ,this.name());
    }
}

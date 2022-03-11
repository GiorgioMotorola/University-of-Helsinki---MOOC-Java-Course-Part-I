
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;
    int price = squares * pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        boolean larger = false;

        if (this.squares > compared.squares) {
            larger = true;
        }
        return larger;
    }

    public int priceDifference(Apartment compared) {
        int difference = 0;
        int price = 0;
        int comparedPrice = 0;

        price = squares * pricePerSquare;

        comparedPrice = compared.pricePerSquare * compared.squares;

        difference = price - comparedPrice;

        return Math.abs(difference);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        boolean isMoreExpensive = false;

        int price = 0;

        int comparedPrice = 0;

        price = this.pricePerSquare * this.squares;

        comparedPrice = compared.pricePerSquare * compared.squares;

        if (price > comparedPrice) {

            isMoreExpensive = true;

        }

        return isMoreExpensive;
    }

}

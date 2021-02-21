package items;

public class Piano extends Instrument{

    private int noOfPedals;

    public Piano(
            String itemName, double buyingPrice, double sellingPrice,
            String colour, String material, int noOfPedals) {
        super(itemName, buyingPrice, sellingPrice, colour, material);
        this.noOfPedals = noOfPedals;
    }


}

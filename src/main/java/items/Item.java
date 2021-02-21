package items;

public abstract class Item {
    private String itemName;
    private double buyingPrice;
    private double sellingPrice;

    public Item(String itemName, double buyingPrice, double sellingPrice){
        this.itemName = itemName;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;

    }

    public String getItemName() {
        return itemName;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}

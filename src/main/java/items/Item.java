package items;

import behaviours.ISell;

public abstract class Item implements ISell {
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

    public double calcMarkUp(){
        double difference = this.sellingPrice - this.buyingPrice;
        return (difference / this.buyingPrice ) * 100;
    }


    public double getSellingPrice() {
        return sellingPrice;
    }




}

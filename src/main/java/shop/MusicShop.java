package shop;

import behaviours.ISell;
import items.Item;

import java.util.ArrayList;

public class MusicShop {
    private String name;
    private ArrayList<ISell> stock;

    public MusicShop(String name){
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }
    public ArrayList<ISell> getStock() {
        return this.stock;
    }

    public int getNumberOfItemsInStockList(){
        return this.stock.size();
    }


}

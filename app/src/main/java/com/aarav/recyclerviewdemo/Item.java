package com.aarav.recyclerviewdemo;

public class Item {
    int itemImage;
    String itemName;
    String itemDes;

    public Item(int itemImage, String itemName, String itemDes) {
        this.itemImage = itemImage;
        this.itemName = itemName;
        this.itemDes = itemDes;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDes() {
        return itemDes;
    }

    public void setItemDes(String itemDes) {
        this.itemDes = itemDes;
    }
}

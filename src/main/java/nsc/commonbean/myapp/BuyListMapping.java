package nsc.commonbean.myapp;

import java.io.Serializable;
import java.math.BigDecimal;

public class BuyListMapping implements Serializable {
    private int id;
    private String name;
    private int buyListType;
    private int itemCount;
    private BigDecimal price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getBuyListType() {
        return buyListType;
    }

    public void setBuyListType(int buyListType) {
        this.buyListType = buyListType;
    }

}

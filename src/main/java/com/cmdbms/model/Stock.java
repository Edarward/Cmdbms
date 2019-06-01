package com.cmdbms.model;

public class Stock {

    private Integer stockId;


    private String stockEquipment;


    private String stockProName;


    private Integer stockAmount;


    private String stockShelf;


    public Stock(Integer stockId, String stockEquipment, String stockProName, Integer stockAmount, String stockShelf) {
        this.stockId = stockId;
        this.stockEquipment = stockEquipment;
        this.stockProName = stockProName;
        this.stockAmount = stockAmount;
        this.stockShelf = stockShelf;
    }


    public Stock() {
        super();
    }


    public Integer getStockId() {
        return stockId;
    }


    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }


    public String getStockEquipment() {
        return stockEquipment;
    }


    public void setStockEquipment(String stockEquipment) {
        this.stockEquipment = stockEquipment == null ? null : stockEquipment.trim();
    }


    public String getStockProName() {
        return stockProName;
    }


    public void setStockProName(String stockProName) {
        this.stockProName = stockProName == null ? null : stockProName.trim();
    }


    public Integer getStockAmount() {
        return stockAmount;
    }


    public void setStockAmount(Integer stockAmount) {
        this.stockAmount = stockAmount;
    }


    public String getStockShelf() {
        return stockShelf;
    }


    public void setStockShelf(String stockShelf) {
        this.stockShelf = stockShelf == null ? null : stockShelf.trim();
    }
}
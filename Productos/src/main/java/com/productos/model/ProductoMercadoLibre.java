package com.productos.model;

import java.util.List;

public class ProductoMercadoLibre {
    private String title;

    private String category_id;

    private int price;

    private String currency_id;

    private int available_quantity;

    private String buying_mode;

    private String listing_type_id;

    private String condition;

    private String description;

    private String video_id;

    private String warranty;

    private List<Pictures> pictures;

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setCategory_id(String category_id){
        this.category_id = category_id;
    }
    public String getCategory_id(){
        return this.category_id;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return this.price;
    }
    public void setCurrency_id(String currency_id){
        this.currency_id = currency_id;
    }
    public String getCurrency_id(){
        return this.currency_id;
    }
    public void setAvailable_quantity(int available_quantity){
        this.available_quantity = available_quantity;
    }
    public int getAvailable_quantity(){
        return this.available_quantity;
    }
    public void setBuying_mode(String buying_mode){
        this.buying_mode = buying_mode;
    }
    public String getBuying_mode(){
        return this.buying_mode;
    }
    public void setListing_type_id(String listing_type_id){
        this.listing_type_id = listing_type_id;
    }
    public String getListing_type_id(){
        return this.listing_type_id;
    }
    public void setCondition(String condition){
        this.condition = condition;
    }
    public String getCondition(){
        return this.condition;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }
    public void setVideo_id(String video_id){
        this.video_id = video_id;
    }
    public String getVideo_id(){
        return this.video_id;
    }
    public void setWarranty(String warranty){
        this.warranty = warranty;
    }
    public String getWarranty(){
        return this.warranty;
    }
    public void setPictures(List<Pictures> pictures){
        this.pictures = pictures;
    }
    public List<Pictures> getPictures(){
        return this.pictures;
    }
}

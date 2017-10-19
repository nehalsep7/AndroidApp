package com.example.nehal.androidapp.RetrofitModels;

import java.util.List;

/**
 * Created by nehal on 18/10/17.
 */

public class Promotion {

    private int id;
    private int type;
    private String savings_text;
    private String promo_label;
    private int current_product_group_id;
    private List<Product_> products = null;
    private String live_up_savings_text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getSavings_text() {
        return savings_text;
    }

    public void setSavings_text(String savings_text) {
        this.savings_text = savings_text;
    }

    public String getPromo_label() {
        return promo_label;
    }

    public void setPromo_label(String promo_label) {
        this.promo_label = promo_label;
    }

    public int getCurrent_product_group_id() {
        return current_product_group_id;
    }

    public void setCurrent_product_group_id(int current_product_group_id) {
        this.current_product_group_id = current_product_group_id;
    }

    public List<Product_> getProducts() {
        return products;
    }

    public void setProducts(List<Product_> products) {
        this.products = products;
    }

    public String getLive_up_savings_text() {
        return live_up_savings_text;
    }

    public void setLive_up_savings_text(String live_up_savings_text) {
        this.live_up_savings_text = live_up_savings_text;
    }
}

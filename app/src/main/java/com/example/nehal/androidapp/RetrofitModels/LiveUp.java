package com.example.nehal.androidapp.RetrofitModels;

/**
 * Created by nehal on 18/10/17.
 */

public class LiveUp {

    private Double promo_price;
    private int savings;
    private Double savings_amount;
    private int savings_type;
    private String savings_text;

    public Double getPromo_price() {
        return promo_price;
    }

    public void setPromo_price(Double promo_price) {
        this.promo_price = promo_price;
    }

    public int getSavings() {
        return savings;
    }

    public void setSavings(int savings) {
        this.savings = savings;
    }

    public Double getSavings_amount() {
        return savings_amount;
    }

    public void setSavings_amount(Double savings_amount) {
        this.savings_amount = savings_amount;
    }

    public int getSavings_type() {
        return savings_type;
    }

    public void setSavings_type(int savings_type) {
        this.savings_type = savings_type;
    }

    public String getSavings_text() {
        return savings_text;
    }

    public void setSavings_text(String savings_text) {
        this.savings_text = savings_text;
    }
}

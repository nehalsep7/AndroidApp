package com.example.nehal.androidapp.RetrofitModels;

import com.example.nehal.androidapp.RetrofitModels.Discounts;

/**
 * Created by nehal on 18/10/17.
 */

public class Pricing {

    private int on_sale;
    private Double price;
    private Double promo_price;
    private Double savings;
    private int savings_type;
    private int promoId;
    private Double savings_amount;
    private String savings_text;
    private Discounts discounts;
    private String applicable_discount;

    public int getOn_sale() {
        return on_sale;
    }

    public void setOn_sale(int on_sale) {
        this.on_sale = on_sale;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPromo_price() {
        return promo_price;
    }

    public void setPromo_price(Double promo_price) {
        this.promo_price = promo_price;
    }

    public Double getSavings() {
        return savings;
    }

    public void setSavings(Double savings) {
        this.savings = savings;
    }

    public int getSavings_type() {
        return savings_type;
    }

    public void setSavings_type(int savings_type) {
        this.savings_type = savings_type;
    }

    public int getPromoId() {
        return promoId;
    }

    public void setPromoId(int promoId) {
        this.promoId = promoId;
    }

    public Double getSavings_amount() {
        return savings_amount;
    }

    public void setSavings_amount(Double savings_amount) {
        this.savings_amount = savings_amount;
    }

    public String getSavings_text() {
        return savings_text;
    }

    public void setSavings_text(String savings_text) {
        this.savings_text = savings_text;
    }

    public Discounts getDiscounts() {
        return discounts;
    }

    public void setDiscounts(Discounts discounts) {
        this.discounts = discounts;
    }

    public String getApplicable_discount() {
        return applicable_discount;
    }

    public void setApplicable_discount(String applicable_discount) {
        this.applicable_discount = applicable_discount;
    }
}

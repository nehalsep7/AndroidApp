package com.example.nehal.androidapp.RetrofitModels;

import java.util.List;

/**
 * Created by nehal on 18/10/17.
 */

public class Product {

    private List<String> category_tags = null;
    private int id;
    private String title;
    private String desc;
    private String sku;
    private List<Integer> categories = null;
    private List<Integer> types = null;
    private Details details;
    private ProductLife product_life;
    private Filters filters;
    private Image img;
    private List<Image> images = null;
    private Measure measure;
    private Pricing pricing;
    private Warehouse warehouse;
    private Attributes attributes;
    private DescriptionFields description_fields;
    private List<Promotion> promotions = null;
    private Inventory inventory;
    private int pr;

    public List<String> getCategory_tags() {
        return category_tags;
    }

    public void setCategory_tags(List<String> category_tags) {
        this.category_tags = category_tags;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public List<Integer> getCategories() {
        return categories;
    }

    public void setCategories(List<Integer> categories) {
        this.categories = categories;
    }

    public List<Integer> getTypes() {
        return types;
    }

    public void setTypes(List<Integer> types) {
        this.types = types;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public ProductLife getProduct_life() {
        return product_life;
    }

    public void setProduct_life(ProductLife product_life) {
        this.product_life = product_life;
    }

    public Filters getFilters() {
        return filters;
    }

    public void setFilters(Filters filters) {
        this.filters = filters;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public Measure getMeasure() {
        return measure;
    }

    public void setMeasure(Measure measure) {
        this.measure = measure;
    }

    public Pricing getPricing() {
        return pricing;
    }

    public void setPricing(Pricing pricing) {
        this.pricing = pricing;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public DescriptionFields getDescription_fields() {
        return description_fields;
    }

    public void setDescription_fields(DescriptionFields description_fields) {
        this.description_fields = description_fields;
    }

    public List<Promotion> getPromotions() {
        return promotions;
    }

    public void setPromotions(List<Promotion> promotions) {
        this.promotions = promotions;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getPr() {
        return pr;
    }

    public void setPr(int pr) {
        this.pr = pr;
    }
}

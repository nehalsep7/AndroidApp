package com.example.nehal.androidapp.RetrofitModels;

import java.util.List;

/**
 * Created by nehal on 18/10/17.
 */

public class ResponseModel {

    private List<Product> products = null;
    private Facets facets;
    private Filters_ filters;
    private int on_sale_count;
    private Status status;
    private int total;
    private int page;
    private int page_size;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Facets getFacets() {
        return facets;
    }

    public void setFacets(Facets facets) {
        this.facets = facets;
    }

    public Filters_ getFilters() {
        return filters;
    }

    public void setFilters(Filters_ filters) {
        this.filters = filters;
    }

    public int getOn_sale_count() {
        return on_sale_count;
    }

    public void setOn_sale_count(int on_sale_count) {
        this.on_sale_count = on_sale_count;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPage_size() {
        return page_size;
    }

    public void setPage_size(int page_size) {
        this.page_size = page_size;
    }
}



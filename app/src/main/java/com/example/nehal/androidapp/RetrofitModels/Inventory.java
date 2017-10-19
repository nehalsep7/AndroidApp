package com.example.nehal.androidapp.RetrofitModels;

import java.util.List;

/**
 * Created by nehal on 18/10/17.
 */

public class Inventory {

    private int atpStatus;
    private int maxSaleQty;
    private int qtyInCarts;
    private int qtyInStock;
    private int stockStatus;
    private int stockType;
    private List<AtpLot> atpLots = null;
    private String nextAvailableDate;
    private int limitedStockStatus;
    private int originalMaxSaleQty;
}

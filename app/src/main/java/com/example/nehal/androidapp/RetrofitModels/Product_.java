package com.example.nehal.androidapp.RetrofitModels;

import com.example.nehal.androidapp.RetrofitModels.Image_;

import java.util.List;

/**
 * Created by nehal on 18/10/17.
 */

public class Product_ {

    private List<Image_> images = null;
    private int group_id;
    private int min_qty;

    public List<Image_> getImages() {
        return images;
    }

    public void setImages(List<Image_> images) {
        this.images = images;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public int getMin_qty() {
        return min_qty;
    }

    public void setMin_qty(int min_qty) {
        this.min_qty = min_qty;
    }
}

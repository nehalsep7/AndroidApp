package com.example.nehal.androidapp.RetrofitModels;

/**
 * Created by nehal on 18/10/17.
 */

public class ProductLife {
    private int time;
    private String metric;
    private boolean is_minimum;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public boolean is_minimum() {
        return is_minimum;
    }

    public void setIs_minimum(boolean is_minimum) {
        this.is_minimum = is_minimum;
    }
}

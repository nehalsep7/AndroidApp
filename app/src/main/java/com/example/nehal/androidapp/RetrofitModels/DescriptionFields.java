package com.example.nehal.androidapp.RetrofitModels;

import java.util.List;

/**
 * Created by nehal on 18/10/17.
 */

public class DescriptionFields {

    private List<Secondary> secondary = null;
    private List<Primary> primary = null;

    public List<Secondary> getSecondary() {
        return secondary;
    }

    public void setSecondary(List<Secondary> secondary) {
        this.secondary = secondary;
    }

    public List<Primary> getPrimary() {
        return primary;
    }

    public void setPrimary(List<Primary> primary) {
        this.primary = primary;
    }
}

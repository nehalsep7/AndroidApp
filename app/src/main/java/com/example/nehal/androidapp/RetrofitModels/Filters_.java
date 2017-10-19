package com.example.nehal.androidapp.RetrofitModels;

import java.util.List;

/**
 * Created by nehal on 18/10/17.
 */

public class Filters_ {
    private List<Option> options = null;
    private List<Toggle> toggles = null;

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public List<Toggle> getToggles() {
        return toggles;
    }

    public void setToggles(List<Toggle> toggles) {
        this.toggles = toggles;
    }
}

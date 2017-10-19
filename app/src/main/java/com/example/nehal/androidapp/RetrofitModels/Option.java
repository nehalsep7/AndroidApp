package com.example.nehal.androidapp.RetrofitModels;

import java.util.List;

/**
 * Created by nehal on 18/10/17.
 */

public class Option {

    private String name;
    private String uri;
    private List<Type> types = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }
}

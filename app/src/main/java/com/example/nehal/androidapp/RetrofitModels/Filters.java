package com.example.nehal.androidapp.RetrofitModels;

/**
 * Created by nehal on 18/10/17.
 */

public class Filters {
    private int natural;
    private int vegan;
    private String vendor_name;
    private String brand_uri;
    private String mfr_name;
    private String brand_name;
    private int frequency;
    private int trending_frequency;
    private String country_of_origin;
    private int is_organic;
    private int fsc;

    public int getNatural() {
        return natural;
    }

    public void setNatural(int natural) {
        this.natural = natural;
    }

    public int getVegan() {
        return vegan;
    }

    public void setVegan(int vegan) {
        this.vegan = vegan;
    }

    public String getVendor_name() {
        return vendor_name;
    }

    public void setVendor_name(String vendor_name) {
        this.vendor_name = vendor_name;
    }

    public String getBrand_uri() {
        return brand_uri;
    }

    public void setBrand_uri(String brand_uri) {
        this.brand_uri = brand_uri;
    }

    public String getMfr_name() {
        return mfr_name;
    }

    public void setMfr_name(String mfr_name) {
        this.mfr_name = mfr_name;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getTrending_frequency() {
        return trending_frequency;
    }

    public void setTrending_frequency(int trending_frequency) {
        this.trending_frequency = trending_frequency;
    }

    public String getCountry_of_origin() {
        return country_of_origin;
    }

    public void setCountry_of_origin(String country_of_origin) {
        this.country_of_origin = country_of_origin;
    }

    public int getIs_organic() {
        return is_organic;
    }

    public void setIs_organic(int is_organic) {
        this.is_organic = is_organic;
    }

    public int getFsc() {
        return fsc;
    }

    public void setFsc(int fsc) {
        this.fsc = fsc;
    }
}

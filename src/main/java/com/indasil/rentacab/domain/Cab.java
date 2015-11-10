package com.indasil.rentacab.domain;

/**
 * Created by vashishta on 11/9/15.
 */
public class Cab {

    private Long id;
    private String model;

    // Total count
    private int total;


    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

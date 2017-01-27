package com.epam.task3.bean;

/**
 * Created by skarzhynskaya_katya on 1/27/17.
 */
public class Customer {

    private String good;

    public Customer(String good){
        this.good = good;
    }

    public Customer (){
        good = this.getGood();
    }

    public String getGood() {
        return good;
    }

    public void setGood(String good) {
        this.good = good;
    }



}

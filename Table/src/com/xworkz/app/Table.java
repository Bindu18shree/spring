package com.xworkz.app;

public class Table {

    public Table(){
        System.out.println("Table is created");
    }

    private int id;
    private String brand;
    private double cost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", cost=" + cost +
                '}';
    }
}

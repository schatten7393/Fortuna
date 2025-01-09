package com.example.fortunaapp.models;

public class Category {
    private String name;
    private int imageResourceId;

    public Category(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() { return name; }
    public int getImageResourceId() { return imageResourceId; }
}
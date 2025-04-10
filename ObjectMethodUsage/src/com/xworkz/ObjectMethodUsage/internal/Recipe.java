package com.xworkz.ObjectMethodUsage.internal;

public class Recipe {
    private String dishName;
    private int prepTimeMinutes;
    private boolean isVegetarian;

    public Recipe(String dishName, int prepTimeMinutes, boolean isVegetarian) {
        System.out.println("String, int, boolean-arg const of Recipe");
        this.dishName = dishName;
        this.prepTimeMinutes = prepTimeMinutes;
        this.isVegetarian = isVegetarian;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "dishName='" + dishName + '\'' +
                ", prepTimeMinutes=" + prepTimeMinutes +
                ", isVegetarian=" + isVegetarian +
                '}';
    }

    @Override
    public int hashCode() {
        return 57654;
    }
}

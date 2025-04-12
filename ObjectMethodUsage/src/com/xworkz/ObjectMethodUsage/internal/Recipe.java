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

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Recipe) {
                System.out.println("Ref instanceOf Recipe");
                Recipe recipe1 = this;
                Recipe  recipe2 = (Recipe) obj;
                if (recipe1.isVegetarian == recipe2.isVegetarian && recipe2.dishName == recipe1.dishName && recipe1.prepTimeMinutes == recipe2.prepTimeMinutes) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

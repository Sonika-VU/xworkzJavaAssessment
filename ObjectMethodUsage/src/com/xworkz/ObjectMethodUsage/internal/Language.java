package com.xworkz.ObjectMethodUsage.internal;

public class Language {
    private String name;
    private int speakersInMillions;
    private boolean isOfficial;

    public Language(String name, int speakersInMillions, boolean isOfficial) {
        System.out.println("String, int, boolean-arg const of Language");
        this.name = name;
        this.speakersInMillions = speakersInMillions;
        this.isOfficial = isOfficial;
    }

    @Override
    public String toString() {
        return "Language{" +
                "name='" + name + '\'' +
                ", speakersInMillions=" + speakersInMillions +
                ", isOfficial=" + isOfficial +
                '}';
    }

    @Override
    public int hashCode() {
        return 3245154;
    }
}

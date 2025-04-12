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

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Language) {
                System.out.println("Ref instanceOf Language");
                Language language1 = this;
                Language  language2 = (Language) obj;
                if (language1.name == language2.name && language1.isOfficial == language2.isOfficial) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

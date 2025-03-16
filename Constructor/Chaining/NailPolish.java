class NailPolish {
    String brand;
    String color;
    int volume;
    boolean isGlossy;
    boolean isQuickDry;
    boolean isLongLasting;

    public NailPolish() {
    }

    public NailPolish(String brand) {
        this.brand = brand;
    }

    public NailPolish(String brand, String color) {
        this(brand);
        this.color = color;
    }

    public NailPolish(String brand, String color, int volume) {
        this(brand, color);
        this.volume = volume;
    }

    public NailPolish(String brand, String color, int volume, boolean isGlossy) {
        this(brand, color, volume);
        this.isGlossy = isGlossy;
    }

    public NailPolish(String brand, String color, int volume, boolean isGlossy, boolean isQuickDry) {
        this(brand, color, volume, isGlossy);
        this.isQuickDry = isQuickDry;
    }

    public NailPolish(String brand, String color, int volume, boolean isGlossy, boolean isQuickDry, boolean isLongLasting) {
        this(brand, color, volume, isGlossy, isQuickDry);
        this.isLongLasting = isLongLasting;
    }

    public void display() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Color: " + this.color);
        System.out.println("Volume: " + this.volume + " ml");
        System.out.println("Is Glossy: " + this.isGlossy);
        System.out.println("Is Quick Dry: " + this.isQuickDry);
        System.out.println("Is Long Lasting: " + this.isLongLasting);
        System.out.println("=============================");
    }
}

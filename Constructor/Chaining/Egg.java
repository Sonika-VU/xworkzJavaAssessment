class Egg {
    String type;
    String size;
    int weight;
    String color;
    boolean isOrganic;
    boolean isFresh;

    public Egg() {
    }

    public Egg(String type) {
        this.type = type;
    }

    public Egg(String type, String size) {
        this(type);
        this.size = size;
    }

    public Egg(String type, String size, int weight) {
        this(type, size);
        this.weight = weight;
    }

    public Egg(String type, String size, int weight, String color) {
        this(type, size, weight);
        this.color = color;
    }

    public Egg(String type, String size, int weight, String color, boolean isOrganic) {
        this(type, size, weight, color);
        this.isOrganic = isOrganic;
    }

    public Egg(String type, String size, int weight, String color, boolean isOrganic, boolean isFresh) {
        this(type, size, weight, color, isOrganic);
        this.isFresh = isFresh;
    }

    public void display() {
        System.out.println("Type: " + this.type);
        System.out.println("Size: " + this.size);
        System.out.println("Weight: " + this.weight + "g");
        System.out.println("Color: " + this.color);
        System.out.println("Is Organic: " + this.isOrganic);
        System.out.println("Is Fresh: " + this.isFresh);
        System.out.println("=============================");
    }
}

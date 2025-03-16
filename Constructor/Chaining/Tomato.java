class Tomato {
    String variety;
    String color;
    int weight;
    boolean isRipe;
    boolean isOrganic;
    boolean isJuicy;

    public Tomato() {
    }

    public Tomato(String variety) {
        this.variety = variety;
    }

    public Tomato(String variety, String color) {
        this(variety);
        this.color = color;
    }

    public Tomato(String variety, String color, int weight) {
        this(variety, color);
        this.weight = weight;
    }

    public Tomato(String variety, String color, int weight, boolean isRipe) {
        this(variety, color, weight);
        this.isRipe = isRipe;
    }

    public Tomato(String variety, String color, int weight, boolean isRipe, boolean isOrganic) {
        this(variety, color, weight, isRipe);
        this.isOrganic = isOrganic;
    }

    public Tomato(String variety, String color, int weight, boolean isRipe, boolean isOrganic, boolean isJuicy) {
        this(variety, color, weight, isRipe, isOrganic);
        this.isJuicy = isJuicy;
    }

    public void display() {
        System.out.println("Variety: " + this.variety);
        System.out.println("Color: " + this.color);
        System.out.println("Weight: " + this.weight + " grams");
        System.out.println("Is Ripe: " + this.isRipe);
        System.out.println("Is Organic: " + this.isOrganic);
        System.out.println("Is Juicy: " + this.isJuicy);
        System.out.println("=============================");
    }
}

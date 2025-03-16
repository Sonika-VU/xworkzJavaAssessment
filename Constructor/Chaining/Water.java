class Water {
    String source;
    String state;
    int temperature;
    boolean isPure;
    boolean isDrinkable;
    boolean isMineralRich;

    public Water() {
    }

    public Water(String source) {
        this.source = source;
    }

    public Water(String source, String state) {
        this(source);
        this.state = state;
    }

    public Water(String source, String state, int temperature) {
        this(source, state);
        this.temperature = temperature;
    }

    public Water(String source, String state, int temperature, boolean isPure) {
        this(source, state, temperature);
        this.isPure = isPure;
    }

    public Water(String source, String state, int temperature, boolean isPure, boolean isDrinkable) {
        this(source, state, temperature, isPure);
        this.isDrinkable = isDrinkable;
    }

    public Water(String source, String state, int temperature, boolean isPure, boolean isDrinkable, boolean isMineralRich) {
        this(source, state, temperature, isPure, isDrinkable);
        this.isMineralRich = isMineralRich;
    }

    public void display() {
        System.out.println("Source: " + this.source);
        System.out.println("State: " + this.state);
        System.out.println("Temperature: " + this.temperature + "°C");
        System.out.println("Is Pure: " + this.isPure);
        System.out.println("Is Drinkable: " + this.isDrinkable);
        System.out.println("Is Mineral Rich: " + this.isMineralRich);
        System.out.println("=============================");
    }
}

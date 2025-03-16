class Color {
    String name;
    String type;  
    int red;
    int green;
    int blue;
    boolean isBright;

    public Color() {
    }

    public Color(String name) {
        this.name = name;
    }

    public Color(String name, String type) {
        this(name);
        this.type = type;
    }

    public Color(String name, String type, int red, int green, int blue) {
        this(name, type);
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public Color(String name, String type, int red, int green, int blue, boolean isBright) {
        this(name, type, red, green, blue);
        this.isBright = isBright;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("RGB: (" + this.red + ", " + this.green + ", " + this.blue + ")");
        System.out.println("Is Bright: " + this.isBright);
        System.out.println("=============================");
    }
}

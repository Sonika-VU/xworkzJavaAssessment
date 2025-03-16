class WaterBall {
    String material;
    String color;
    int size;
    boolean isBouncy;
    boolean isTransparent;
    boolean isFilledWithWater;

    public WaterBall() {
    }

    public WaterBall(String material) {
        this.material = material;
    }

    public WaterBall(String material, String color) {
        this(material);
        this.color = color;
    }

    public WaterBall(String material, String color, int size) {
        this(material, color);
        this.size = size;
    }

    public WaterBall(String material, String color, int size, boolean isBouncy) {
        this(material, color, size);
        this.isBouncy = isBouncy;
    }

    public WaterBall(String material, String color, int size, boolean isBouncy, boolean isTransparent) {
        this(material, color, size, isBouncy);
        this.isTransparent = isTransparent;
    }

    public WaterBall(String material, String color, int size, boolean isBouncy, boolean isTransparent, boolean isFilledWithWater) {
        this(material, color, size, isBouncy, isTransparent);
        this.isFilledWithWater = isFilledWithWater;
    }

    public void display() {
        System.out.println("Material: " + this.material);
        System.out.println("Color: " + this.color);
        System.out.println("Size: " + this.size + " cm");
        System.out.println("Is Bouncy: " + this.isBouncy);
        System.out.println("Is Transparent: " + this.isTransparent);
        System.out.println("Is Filled With Water: " + this.isFilledWithWater);
        System.out.println("=============================");
    }
}

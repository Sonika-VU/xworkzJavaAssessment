class Gun {
    String model;
    String caliber;
    int magazineCapacity;
    boolean isAutomatic;
    boolean hasSafety;
    boolean isLoaded;

    public Gun() {
    }

    public Gun(String model) {
        this.model = model;
    }

    public Gun(String model, String caliber) {
        this(model);
        this.caliber = caliber;
    }

    public Gun(String model, String caliber, int magazineCapacity) {
        this(model, caliber);
        this.magazineCapacity = magazineCapacity;
    }

    public Gun(String model, String caliber, int magazineCapacity, boolean isAutomatic) {
        this(model, caliber, magazineCapacity);
        this.isAutomatic = isAutomatic;
    }

    public Gun(String model, String caliber, int magazineCapacity, boolean isAutomatic, boolean hasSafety) {
        this(model, caliber, magazineCapacity, isAutomatic);
        this.hasSafety = hasSafety;
    }

    public Gun(String model, String caliber, int magazineCapacity, boolean isAutomatic, boolean hasSafety, boolean isLoaded) {
        this(model, caliber, magazineCapacity, isAutomatic, hasSafety);
        this.isLoaded = isLoaded;
    }

    public void display() {
        System.out.println("Model: " + this.model);
        System.out.println("Caliber: " + this.caliber);
        System.out.println("Magazine Capacity: " + this.magazineCapacity);
        System.out.println("Is Automatic: " + this.isAutomatic);
        System.out.println("Has Safety: " + this.hasSafety);
        System.out.println("Is Loaded: " + this.isLoaded);
        System.out.println("=============================");
    }
}

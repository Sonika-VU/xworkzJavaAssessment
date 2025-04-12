package com.xworkz.ObjectMethodUsage.internal;

public class Table {
    private String shape;
    private String material;
    private int legs;

    public Table(String shape, String material, int legs) {
        System.out.println("String, String, int-arg const of Table");
        this.shape = shape;
        this.material = material;
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Table{" +
                "shape='" + shape + '\'' +
                ", material='" + material + '\'' +
                ", legs=" + legs +
                '}';
    }

    @Override
    public int hashCode() {
        return 123435;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Table) {
                System.out.println("Ref instanceOf Table");
                Table table1 = this;
                Table  table2 = (Table) obj;
                if (table2.legs == table1.legs && table2.material == table1.material && table2.shape == table1.shape) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

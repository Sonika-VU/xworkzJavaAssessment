package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.DiningTable;
import com.xworkz.isARelation.Table;

public class TableRunner {

    public static void main(String[] args) {
        Table table = new Table();
        Table table1 = new DiningTable();
        DiningTable diningTable = new DiningTable();

        System.out.println("==========================");
        table.beDurable();
        table.beMovable();
        table.beStable();
        table.provideSurface();
        table.supportObjects();

        System.out.println("==========================");
        table1.beDurable();
        table1.beMovable();
        table1.beStable();
        table1.provideSurface();
        table1.supportObjects();

        System.out.println("==========================");
        diningTable.beDurable();
        diningTable.beMovable();
        diningTable.beStable();
        diningTable.provideSurface();
        diningTable.supportObjects();
    }
}

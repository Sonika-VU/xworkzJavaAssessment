package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.OakTree;
import com.xworkz.isARelation.Tree;

public class TreeRunner {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Tree tree1 = new OakTree();
        OakTree oakTree = new OakTree();

        System.out.println("=========================");
        tree.absorbWater();
        tree.grow();
        tree.bearFruit();
        tree.provideOxygen();
        tree.shedLeaves();

        System.out.println("=========================");
        tree1.absorbWater();
        tree1.grow();
        tree1.bearFruit();
        tree1.provideOxygen();
        tree1.shedLeaves();

        System.out.println("=========================");
        oakTree.absorbWater();
        oakTree.grow();
        oakTree.bearFruit();
        oakTree.provideOxygen();
        oakTree.shedLeaves();


    }
}

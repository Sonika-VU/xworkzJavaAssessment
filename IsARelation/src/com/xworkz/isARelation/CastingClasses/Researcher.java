package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.OakTree;
import com.xworkz.isARelation.Tree;

public class Researcher {

    public void research(Tree tree){
        tree.absorbWater();
        tree.grow();
        tree.bearFruit();
        tree.provideOxygen();
        tree.shedLeaves();

        if(tree instanceof OakTree){
            OakTree oakTree = (OakTree) tree;
            oakTree.takeWood();
        }
    }
}

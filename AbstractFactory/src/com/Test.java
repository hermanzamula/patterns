package com;

import com.factory.AbstractFactory;
import com.factory.LargeFactory;
import com.factory.SmallFactory;

public class Test {

    public static void main(String ... argc){
        final AbstractFactory largeFactory = new LargeFactory();
        final AbstractFactory smallFactory = new SmallFactory();

        largeFactory.createBoy().showDick();
        largeFactory.createGirl().showTits();

        smallFactory.createGirl().showTits();
        smallFactory.createBoy().showDick();
    }
}

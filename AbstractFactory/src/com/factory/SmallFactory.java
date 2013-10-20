package com.factory;

import com.product.Boy;
import com.product.Girl;
import com.product.impl.SmallDickBoy;
import com.product.impl.SmallTitsGirl;

public class SmallFactory implements AbstractFactory{
    @Override
    public Boy createBoy() {
        return new SmallDickBoy();
    }

    @Override
    public Girl createGirl() {
        return new SmallTitsGirl();
    }
}

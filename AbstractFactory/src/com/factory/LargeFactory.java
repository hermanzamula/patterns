package com.factory;

import com.product.Boy;
import com.product.Girl;
import com.product.impl.HugeDickBoy;
import com.product.impl.HugeTitsGirl;

public class LargeFactory implements AbstractFactory {

    @Override
    public Boy createBoy() {
        return new HugeDickBoy();
    }

    @Override
    public Girl createGirl() {
        return new HugeTitsGirl();
    }
}

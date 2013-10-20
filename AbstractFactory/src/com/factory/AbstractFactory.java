package com.factory;

import com.product.Boy;
import com.product.Girl;

public interface AbstractFactory {

    Boy createBoy();

    Girl createGirl();

}

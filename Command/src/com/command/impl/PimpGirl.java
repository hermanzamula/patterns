package com.command.impl;

import com.command.Pimp;
import com.product.impl.HugeTitsGirl;

public class PimpGirl implements Pimp{

    private HugeTitsGirl hugeTitsGirl = new HugeTitsGirl();

    @Override
    public void makeJoy() {
        hugeTitsGirl.showTits();
    }
}

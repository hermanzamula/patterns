package com;

import com.command.Pimp;
import com.command.impl.PimpGirl;

public class Dude {

    private Pimp pimp = new PimpGirl();

    void doExciting(){
        pimp.makeJoy();
    }

    public static void main(String ... argc) {
        new Dude().doExciting();
    }

}

package com.patterns.chain.impl;

import com.patterns.chain.CircleFucker;
import com.patterns.chain.model.Girl;

/**
 * @author Herman Zamula
 */
public class WhiteFucker extends CircleFucker {
    @Override
    protected void doFuck(Girl girl) {
        System.out.println("Ogh");
        girl.sayOh();
    }

}

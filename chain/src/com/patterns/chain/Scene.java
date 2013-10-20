package com.patterns.chain;

import com.patterns.chain.model.Girl;
import com.patterns.chain.impl.JapanFucker;
import com.patterns.chain.impl.NiggaFucker;
import com.patterns.chain.impl.SluttyGirl;
import com.patterns.chain.impl.WhiteFucker;

/**
 * @author Herman Zamula
 */
public class Scene {

    private Girl girl;
    private CircleFucker circleFucker;

    public Scene(Girl girl, CircleFucker ... fuckers) {
        this.girl = girl;
        int currentFuckerPosition = 0;
        int lastFuckerPosition = fuckers.length - 1;
        circleFucker = fuckers[currentFuckerPosition];
        while (currentFuckerPosition < lastFuckerPosition) {
            fuckers[currentFuckerPosition].setNext(fuckers[currentFuckerPosition + 1]);
            currentFuckerPosition ++;
        }
    }

    public void doShow() {
        circleFucker.fuck(girl);
    }

    public static void main(String ... argc) {
        final Scene scene = new Scene(new SluttyGirl(), new NiggaFucker(), new JapanFucker(), new WhiteFucker());
        scene.doShow();
    }

}

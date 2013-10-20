package com.patterns.chain;

import com.patterns.chain.model.Girl;
import com.patterns.chain.model.Guy;

/**
 * @author Herman Zamula
 */
public abstract class CircleFucker implements Guy {

    private CircleFucker guy;

    public CircleFucker setNext(CircleFucker guy) {
        this.guy = guy;
        return this.guy;
    }

    @Override
    public void seyHey() {
        System.out.println("Come on, baby");
    }

    public void fuck(Girl girl) {
        seyHey();
        doFuck(girl);
        if (guy != null) {
            guy.fuck(girl);
        }
    }

    protected abstract void doFuck(Girl girl);
}

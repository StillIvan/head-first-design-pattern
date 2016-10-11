package com.github.oycharming.pattern.adapter;

import com.github.oycharming.pattern.adapter.core.Turkey;

/**
 * @author Charming
 * @since 2016-09-06 21:16
 */
public class WildTurkey implements Turkey {
    /**
     * 火鸡不会呱呱叫，只会咯咯叫
     */
    @Override
    public void gobble() {
        System.out.println("Gobble gobble.");
    }

    @Override
    public void fly() {
        System.out.println("I am flying a short distance.");
    }
}

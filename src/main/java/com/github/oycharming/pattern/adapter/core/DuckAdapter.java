package com.github.oycharming.pattern.adapter.core;

/**
 * @author Charming
 * @since 2016-09-06 21:23
 */
public class DuckAdapter implements Turkey {
    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    /**
     * 火鸡不会呱呱叫，只会咯咯叫
     */
    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}

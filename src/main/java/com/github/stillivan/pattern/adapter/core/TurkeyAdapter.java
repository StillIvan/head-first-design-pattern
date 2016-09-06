package com.github.stillivan.pattern.adapter.core;

/**
 * 将火鸡转成鸭子的接口.
 * @author Charming
 * @since 2016-09-06 21:16
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    /**
     * 火鸡需要飞 5 次才能有鸭子那么远.
     */
    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}

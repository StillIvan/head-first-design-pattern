package com.github.stillivan.pattern.singleton;

/**
 * @author Charming
 * @since 2016-09-03 23:31
 */
public class ChocolateBoiler {
    private static ChocolateBoiler uniqueInstance;

    private boolean empty;

    private boolean boiled;

    private ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }

    /**
     * synchronized 保证了不会有两个线程可以同时进入这个方法
     * @return
     */
    public static synchronized ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }

    /**
     * 填满巧克力和牛奶
     */
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    /**
     * 排出巧克力
     */
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    /**
     * 煮沸
     */
    public void boil() {
        if (!isEmpty() && isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}

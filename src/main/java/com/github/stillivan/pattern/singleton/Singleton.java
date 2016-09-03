package com.github.stillivan.pattern.singleton;

/**
 * @author Charming
 * @since 2016-09-03 23:16
 */
public class Singleton {
    /**
     * 延迟实例化
     */
    private static Singleton uniqueInstance;

    /**
     * volatile 关键字确保，当 uniqueInstance 被初始化 singleton 实例时，
     * 多个线程能够正确处理 uniqueInstance 变量.
     */
    //private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    /**
     * 延迟实例化
     * @return
     */
    /*public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }*/

    /**
     * 同步块方法.进入同步块之后，再检查是否为空.
     * @return
     */
    /*public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }*/
}

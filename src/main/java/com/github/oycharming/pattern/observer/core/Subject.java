package com.github.oycharming.pattern.observer.core;

/**
 * 主题接口
 * Created by charming on 16/8/29.
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removerObserver(Observer observer);

    void notifyObservers();
}

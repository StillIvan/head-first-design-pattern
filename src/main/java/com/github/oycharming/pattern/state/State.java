package com.github.oycharming.pattern.state;

/**
 * 状态类接口.
 *
 * @author Charming
 * @since 2016-10-11 23:51
 */
public interface State {
    void insertQuarter();

    void  ejectQuarter();

    void turnCrank();

    void dispense();
}

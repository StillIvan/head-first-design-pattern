package com.github.oycharming.pattern.state;

/**
 * @author Charming
 * @since 2016-10-12 23:47
 */
public class SoldOutState implements State {
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Sorry, the gumball is sold out.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't insert a quarter.");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but the gumball is sold out.");
    }

    @Override
    public void dispense() {

    }
}

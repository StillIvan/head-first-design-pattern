package com.github.oycharming.pattern.state;

/**
 * @author Charming
 * @since 2016-10-12 23:46
 */
public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice does't get you another gumball.");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops the gumball has sold out.");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}

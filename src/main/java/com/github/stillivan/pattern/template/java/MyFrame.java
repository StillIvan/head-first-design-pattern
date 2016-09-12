package com.github.stillivan.pattern.template.java;

import java.awt.*;

import javax.swing.*;

/**
 * @author Charming
 * @since 2016-09-12 09:51
 */
public class MyFrame extends JFrame {
    private MyFrame(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    /**
     * paint 是一个钩子.
     * @param graphics
     */
    public void paint(Graphics graphics) {
        super.paint(graphics);
        String msg = "I rule!!";
        graphics.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame("Head First Design Patterns.");
    }
}

package com.github.stillivan.pattern.composite;

import java.util.Iterator;

/**
 * 空的迭代器.
 *
 * @author Charming
 * @since 2016-09-18 23:50
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {

    }
}

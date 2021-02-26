package com.dealership.util;

import com.dealership.model.User;

public abstract class DealershipCollection {

    protected int maxSize;

    public abstract User get(Object o);

    public abstract void add(User u) throws Exception;

    public abstract int size();

    public abstract void remove(Object o);

    public abstract User next();

    public abstract User previous();

    public abstract String toString();

    abstract boolean isEmpty();

    protected abstract void clear();


}

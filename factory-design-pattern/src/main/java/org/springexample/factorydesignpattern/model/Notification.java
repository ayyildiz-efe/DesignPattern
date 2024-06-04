package org.springexample.factorydesignpattern.model;

public interface Notification {
    // collect common behavior in an interface
    String send(String message);
}

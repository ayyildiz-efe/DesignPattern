package org.springexample.factorydesignpattern.model;

public class EmailNotification implements Notification {

    @Override
    public String send(String message) {
        return "Sending email notification: " + message;
    }
}

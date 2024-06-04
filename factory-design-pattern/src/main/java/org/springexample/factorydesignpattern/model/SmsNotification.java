package org.springexample.factorydesignpattern.model;

public class SmsNotification implements Notification {

    @Override
    public String send(String message) {
        return "Sending SMS notification: " + message;
    }
}

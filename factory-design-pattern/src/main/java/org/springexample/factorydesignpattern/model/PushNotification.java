package org.springexample.factorydesignpattern.model;

public class PushNotification implements Notification {

    @Override
    public String send(String message) {
        return "Sending push notification: " + message;
    }
}

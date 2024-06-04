package org.springexample.factorydesignpattern.service;

import org.springexample.factorydesignpattern.model.*;
import org.springframework.stereotype.Component;

@Component
public class NotificationFactory {
    public Notification createNotification(NotificationType type) {
        switch (type) {
            case EMAIL:
                return new EmailNotification();
            case SMS:
                    return new SmsNotification();
            case PUSH:
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown notification type : " + type);
        }
    }
}

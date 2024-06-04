package org.springexample.factorydesignpattern.dto;

public record NotificationRequest(
        String notificationtype,
        String message
) {
}

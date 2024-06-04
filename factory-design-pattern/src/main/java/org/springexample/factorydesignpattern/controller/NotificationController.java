package org.springexample.factorydesignpattern.controller;

import org.springexample.factorydesignpattern.model.Notification;
import org.springexample.factorydesignpattern.model.NotificationType;
import org.springexample.factorydesignpattern.service.NotificationFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    private NotificationFactory notificationFactory;

    public NotificationController(NotificationFactory notificationFactory) {
        this.notificationFactory = notificationFactory;
    }

    @GetMapping("/sendNotification")
    public String sendNotification(@RequestParam NotificationType type, @RequestParam String message) {
        Notification notification = notificationFactory.createNotification(type);
        return notification.send(message) + " Notification sent successfully";
    }

}

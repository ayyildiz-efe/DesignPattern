package org.springexample.factorydesignpattern.controller;

import org.springexample.factorydesignpattern.dto.NotificationRequest;
import org.springexample.factorydesignpattern.model.Notification;
import org.springexample.factorydesignpattern.model.NotificationType;
import org.springexample.factorydesignpattern.service.NotificationFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class NotificationController {
    private NotificationFactory notificationFactory;

    public NotificationController(NotificationFactory notificationFactory) {
        this.notificationFactory = notificationFactory;
    }

    @PostMapping("/sendNotification")
    public ResponseEntity sendNotification(@RequestBody NotificationRequest request) {
        Notification notification = notificationFactory.createNotification(request.notificationtype());
        return ResponseEntity.ok(notification.send(request.message()));
    }

}

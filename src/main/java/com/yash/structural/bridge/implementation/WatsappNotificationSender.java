package com.yash.structural.bridge.implementation;

public class WatsappNotificationSender implements NotificationSender{
    @Override
    public void sendNotification() {
        System.out.println("Notification send via Watsapp");
    }
}

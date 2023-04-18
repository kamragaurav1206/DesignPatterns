package com.yash.structural.bridge.implementation;

public class EmailNotificationSender implements NotificationSender{
    @Override
    public void sendNotification() {
        System.out.println("Notification send via Email");
    }
}

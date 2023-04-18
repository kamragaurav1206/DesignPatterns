package com.yash.structural.bridge.implementation;

public class SMSNotificationSender implements NotificationSender{
    @Override
    public void sendNotification() {
        System.out.println("Notification send via SMS");
    }
}

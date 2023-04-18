package com.yash.structural.bridge.implementation;

public class CallNotificationSender implements NotificationSender{
    @Override
    public void sendNotification() {
        System.out.println("Notification send via voice call");
    }
}

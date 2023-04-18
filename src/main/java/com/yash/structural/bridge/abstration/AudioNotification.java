package com.yash.structural.bridge.abstration;

import com.yash.structural.bridge.implementation.NotificationSender;

public class AudioNotification extends Notification{

    public AudioNotification(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void send() {
        sender.sendNotification();
    }
}

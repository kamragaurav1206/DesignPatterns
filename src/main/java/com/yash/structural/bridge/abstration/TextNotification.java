package com.yash.structural.bridge.abstration;

import com.yash.structural.bridge.implementation.NotificationSender;

public class TextNotification extends Notification{


    public TextNotification(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void send() {
        sender.sendNotification();
    }
}

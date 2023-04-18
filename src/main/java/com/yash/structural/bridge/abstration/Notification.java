package com.yash.structural.bridge.abstration;

import com.yash.structural.bridge.implementation.NotificationSender;

public abstract class Notification {

    public NotificationSender sender;

    Notification(NotificationSender sender){
        this.sender=sender;
    }

    public abstract void send();
}

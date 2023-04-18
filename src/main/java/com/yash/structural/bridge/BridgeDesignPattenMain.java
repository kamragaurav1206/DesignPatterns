package com.yash.structural.bridge;

import com.yash.structural.bridge.abstration.AudioNotification;
import com.yash.structural.bridge.abstration.Notification;
import com.yash.structural.bridge.abstration.TextNotification;
import com.yash.structural.bridge.implementation.CallNotificationSender;
import com.yash.structural.bridge.implementation.WatsappNotificationSender;

public class BridgeDesignPattenMain {

    public static void main(String[] args) {
        Notification audioNotification = new AudioNotification(new CallNotificationSender());
        audioNotification.send();
        Notification watsNotification = new TextNotification(new WatsappNotificationSender());
        watsNotification.send();
    }
}

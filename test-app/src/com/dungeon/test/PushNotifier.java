package com.dungeon.test;

public class PushNotifier implements Notifier {
    private Notifier child = null;

    public PushNotifier(Notifier child) {
        this.child = child;
    }

    public PushNotifier() {
    }

    @Override
    public void sendMessage(String text) {
        System.out.println("dialog window with text:  " + text);
        if (child != null) {
            child.sendMessage(text);
        }
    }

    @Override
    public void setChild(Notifier child) {
        this.child = child;
    }
}

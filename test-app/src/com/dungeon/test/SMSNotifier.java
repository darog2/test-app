package com.dungeon.test;

public class SMSNotifier implements Notifier {
    private Notifier child = null;

    public SMSNotifier(Notifier child) {
        this.child = child;
    }

    public SMSNotifier() {
    }

    @Override
    public void sendMessage(String text) {
        System.out.println("sms sent:  " + text);
        if (child != null) {
            child.sendMessage(text);
        }
    }

    @Override
    public void setChild(Notifier child) {
        this.child = child;
    }
}

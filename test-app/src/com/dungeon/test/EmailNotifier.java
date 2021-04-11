package com.dungeon.test;

public class EmailNotifier implements Notifier{
    private Notifier child = null;

    public EmailNotifier(Notifier child) {
        this.child = child;
    }

    public EmailNotifier() {
    }

    @Override
    public void sendMessage(String text) {
        System.out.println("email sent:  " + text);
        if (child!= null) {
            child.sendMessage(text);
        }
    }

    @Override
    public void setChild(Notifier child) {
        this.child=child;
    }
}

package com.dungeon.test;

public class RedditNotifier implements Notifier{


    public RedditNotifier(Notifier child) {
        this.child = child;
    }

    public RedditNotifier() {
    }


    private Notifier child = null;
    @Override
    public void sendMessage(String text) {
        System.out.println("reddit bot wrote you:  " + text);
        if (child!= null) {
            child.sendMessage(text);
        }
    }

    @Override
    public void setChild(Notifier child) {
        this.child = child;
    }
}

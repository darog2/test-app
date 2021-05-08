package com.dungeon.test;

public interface Notifier {
    void sendMessage(String text);

    void setChild(Notifier child);
}

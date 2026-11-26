package com.uas.jastipgo;

public class ChatModel {
    private String name;
    private String lastMessage;
    private String time;
    private int unreadCount;

    public ChatModel(String name, String lastMessage, String time, int unreadCount) {
        this.name = name;
        this.lastMessage = lastMessage;
        this.time = time;
        this.unreadCount = unreadCount;
    }

    public String getName() { return name; }
    public String getLastMessage() { return lastMessage; }
    public String getTime() { return time; }
    public int getUnreadCount() { return unreadCount; }
}

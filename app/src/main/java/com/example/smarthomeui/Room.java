package com.example.smarthomeui;

public class Room {
    private String roomName;
    private int thumbnail;


    public Room() {
        this.roomName = roomName;
    }

    public Room(String roomName, int thumbnail) {
        this.roomName = roomName;
        this.thumbnail = thumbnail;
    }


    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}

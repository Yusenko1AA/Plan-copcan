package com.java.usenko.service;

import com.java.usenko.entity.Room;
import com.java.usenko.entity.RoomStatus;

import java.util.List;

public interface RoomService {

    void addClientToRoom(Long clientId, Long roomId);

    void removeClientFromRoom(Long clientId, Long roomId);

    void changeRoomStatus(Long roomId, RoomStatus roomStatus);

    List<Room> getRoomsSortedByPrice();

    List<Room> getRoomsSortedBySleepPlace();

    List<Room> getRoomsSortedByStars();

    List<Room> getFreeRoomsSortedByPrice();

    List<Room> getFreeRoomsSortedBySleepPlace();

    List<Room> getFreeRoomsSortedByStars();

    int getSizeFreeRooms();

    void showRoom(Long roomId);

    Room getById(Long roomId);

    void create(Room room);
}

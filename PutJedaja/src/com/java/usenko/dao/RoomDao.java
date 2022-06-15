package com.java.usenko.dao;

import com.java.usenko.entity.Room;
import java.util.List;

public interface RoomDao {
    void add(Room room);
    void remove(Long roomId);
    Room get(Long roomId);
    List<Room> getAll();
    List<Room> getAllFreePlaces();
    void update(Long roomId, Room roomToUpdate);
}

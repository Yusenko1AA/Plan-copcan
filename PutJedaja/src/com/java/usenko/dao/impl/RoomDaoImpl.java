package com.java.usenko.dao.impl;

import com.java.usenko.dao.RoomDao;
import com.java.usenko.entity.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomDaoImpl extends AbstractDaoImpl<Room> implements RoomDao {

    @Override
    public void update(Long roomId, Room roomToUpdate) {
        Room oldRoom = get(roomId);
        oldRoom.setRoomStatus(roomToUpdate.getRoomStatus());
        oldRoom.setPrice(roomToUpdate.getPrice());
        oldRoom.setSleepPlace(roomToUpdate.getSleepPlace());
        oldRoom.setStars(roomToUpdate.getStars());
    }

    @Override
    public List<Room> getAllFreePlaces() {
        List<Room> freeRooms = new ArrayList<>();
        for (Room room : getAll()) {
            if (room.getClients().isEmpty() || room.getClients().size() < room.getSleepPlace()) {
                freeRooms.add(room);
            }
        }
        return freeRooms;
    }
}



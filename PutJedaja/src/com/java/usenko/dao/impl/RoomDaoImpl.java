package com.java.usenko.dao.impl;

import com.java.usenko.dao.RoomDao;
import com.java.usenko.entity.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomDaoImpl implements RoomDao {
    private List<Room> rooms = new ArrayList<>();

    @Override
    public void add(Room room) {
        rooms.add(room);
    }

    @Override
    public void remove(Long roomId) {
        rooms.removeIf(room -> room.getId().equals(roomId));
    }

    @Override
    public Room get(Long roomId) {
        for (Room room : rooms) {
            if (roomId.equals(room.getId())) {
                return room;
            }
        }
        return null;
    }

    @Override
    public List<Room> getAll() {
        return new ArrayList<>(rooms);
    }

    @Override
    public List<Room> getAllFreePlaces() {
        List<Room> freeRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.getClients().isEmpty() || room.getClients().size() < room.getSleepPlace()) {
                freeRooms.add(room);
            }
        }
        return freeRooms;
    }

    @Override
    public void update(Long roomId, Room roomToUpdate) {
        Room oldRoom = get(roomId);
        oldRoom.setRoomStatus(roomToUpdate.getRoomStatus());
        oldRoom.setPrice(roomToUpdate.getPrice());
        oldRoom.setSleepPlace(roomToUpdate.getSleepPlace());
        oldRoom.setStars(roomToUpdate.getStars());
    }
}



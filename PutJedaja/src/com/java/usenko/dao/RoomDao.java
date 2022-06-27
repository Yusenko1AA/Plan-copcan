package com.java.usenko.dao;

import com.java.usenko.entity.Room;

import java.util.List;

public interface RoomDao extends AbstractDao<Room> {
    List<Room> getAllFreePlaces();
}

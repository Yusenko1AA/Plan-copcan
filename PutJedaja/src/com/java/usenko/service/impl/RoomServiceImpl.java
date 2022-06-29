package com.java.usenko.service.impl;

import com.java.usenko.comparator.RoomByPriceComparator;
import com.java.usenko.comparator.RoomBySleepPlaceComparator;
import com.java.usenko.comparator.RoomByStarsComparator;
import com.java.usenko.dao.ClientDao;
import com.java.usenko.dao.MaintenanceDao;
import com.java.usenko.dao.RoomDao;
import com.java.usenko.entity.Client;
import com.java.usenko.entity.Room;
import com.java.usenko.entity.RoomStatus;
import com.java.usenko.service.RoomService;

import java.util.Comparator;
import java.util.List;

public class RoomServiceImpl implements RoomService {
    RoomDao roomDao;
    MaintenanceDao maintenanceDao;
    ClientDao clientDao;

    public RoomServiceImpl(){

    }

    public RoomServiceImpl(RoomDao roomDao, MaintenanceDao maintenanceDao, ClientDao clientDao) {
        this.roomDao = roomDao;
        this.maintenanceDao = maintenanceDao;
        this.clientDao = clientDao;
    }

    @Override
    public void create(Room room) {
        roomDao.add(room);
    }

    @Override
    public void addClientToRoom(Long clientId, Long roomId) {
        Room room = roomDao.get(roomId);
        Client client = clientDao.get(clientId);
        room.getClients().add(client);
        client.setRoom(room);
    }

    @Override
    public void removeClientFromRoom(Long clientId, Long roomId) {
        Room room = roomDao.get(roomId);
        Client client = clientDao.get(clientId);
        room.getClients().remove(client);
        client.setRoom(null);
    }

    @Override
    public void changeRoomStatus(Long roomId, RoomStatus roomStatus) {
        Room room = roomDao.get(roomId);
        room.setRoomStatus(roomStatus);
    }

    @Override
    public List<Room> getRoomsSortedByPrice() {
        return getAllSortedBy(new RoomByPriceComparator());
    }

    @Override
    public List<Room> getRoomsSortedBySleepPlace() {
        return getAllSortedBy(new RoomBySleepPlaceComparator());
    }

    @Override
    public List<Room> getRoomsSortedByStars() {
        return getAllSortedBy(new RoomByStarsComparator());
    }

    @Override
    public List<Room> getFreeRoomsSortedByPrice() {
        return getAllFreeSortedBy(new RoomByPriceComparator());
    }

    @Override
    public List<Room> getFreeRoomsSortedBySleepPlace() {
        return getAllFreeSortedBy(new RoomBySleepPlaceComparator());
    }

    @Override
    public List<Room> getFreeRoomsSortedByStars() {
        return getAllFreeSortedBy(new RoomByStarsComparator());
    }

    @Override
    public int getSizeFreeRooms() {
        return roomDao.getAllFreePlaces().size();
    }

    @Override
    public void showRoom(Long roomId) {
        Room room = roomDao.get(roomId);
        System.out.println(room);
    }

    @Override
    public Room getById(Long roomId) {
        return roomDao.get(roomId);
    }

    private List<Room> getAllSortedBy(Comparator<Room> comparator) {
        List<Room> rooms = roomDao.getAll();
        rooms.sort(comparator);
        return rooms;
    }

    private List<Room> getAllFreeSortedBy(Comparator<Room> comparator) {
        List<Room> freeRooms = roomDao.getAllFreePlaces();
        freeRooms.sort(comparator);
        return freeRooms;
    }

}

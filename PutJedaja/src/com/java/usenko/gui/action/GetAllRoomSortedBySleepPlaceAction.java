package com.java.usenko.gui.action;

public class GetAllRoomSortedBySleepPlaceAction extends AbstractAction{
    public GetAllRoomSortedBySleepPlaceAction(HotelProvider hotelProvider) {
        super(hotelProvider);
    }

    @Override
    public void execute() {
        System.out.println("Комнаты отсортированы по кол-ву спальных мест:");
        getHotelProvider().getRoomService().getRoomsSortedBySleepPlace().forEach(System.out::println);
    }
}

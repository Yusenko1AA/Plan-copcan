package com.java.usenko.gui.action;

public class GetAllFreeRoomSortedBySleepPlaceAction extends AbstractAction {
    public GetAllFreeRoomSortedBySleepPlaceAction(HotelProvider hotelProvider) {
        super(hotelProvider);
    }

    @Override
    public void execute() {
        System.out.println("Свободные комнаты отсортированы по кол-ву спальных мест:");
        getHotelProvider().getRoomService().getFreeRoomsSortedBySleepPlace().forEach(System.out::println);
    }
}

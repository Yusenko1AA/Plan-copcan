package com.java.usenko.gui.action;

public class GetAllFreeRoomSortedByStarsAction extends AbstractAction {
    public GetAllFreeRoomSortedByStarsAction(HotelProvider hotelProvider) {
        super(hotelProvider);
    }

    @Override
    public void execute() {
        System.out.println("Свободные комнаты отсортированы по кол-ву звезд:");
        getHotelProvider().getRoomService().getFreeRoomsSortedByStars().forEach(System.out::println);
    }
}

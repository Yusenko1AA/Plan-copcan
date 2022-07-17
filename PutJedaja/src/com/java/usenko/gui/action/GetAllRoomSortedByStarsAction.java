package com.java.usenko.gui.action;

public class GetAllRoomSortedByStarsAction extends AbstractAction {
    public GetAllRoomSortedByStarsAction(HotelProvider hotelProvider) {
        super(hotelProvider);
    }

    @Override
    public void execute() {
        System.out.println("Комнаты отсортированы по кол-ву звезд:");
        getHotelProvider().getRoomService().getRoomsSortedByStars().forEach(System.out::println);
    }
}

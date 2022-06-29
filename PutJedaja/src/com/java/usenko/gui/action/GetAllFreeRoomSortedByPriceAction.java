package com.java.usenko.gui.action;

public class GetAllFreeRoomSortedByPriceAction extends AbstractAction{
    public GetAllFreeRoomSortedByPriceAction(HotelProvider hotelProvider) {
        super(hotelProvider);
    }

    @Override
    public void execute() {
        System.out.println("Комнаты отсортированы по цене:");
        getHotelProvider().getRoomService().getFreeRoomsSortedByPrice().forEach(System.out::println);
    }
}

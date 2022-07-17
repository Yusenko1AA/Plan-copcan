package com.java.usenko.gui.action;

public class GetAllRoomSortedByPriceAction extends AbstractAction {
    public GetAllRoomSortedByPriceAction(HotelProvider hotelProvider) {
        super(hotelProvider);
    }

    @Override
    public void execute() {
        System.out.println("Комнаты отсортированы по цене:");
        getHotelProvider().getRoomService().getRoomsSortedByPrice().forEach(System.out::println);
    }
}

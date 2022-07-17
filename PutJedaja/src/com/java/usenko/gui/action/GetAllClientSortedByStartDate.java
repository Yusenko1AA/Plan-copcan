package com.java.usenko.gui.action;

public class GetAllClientSortedByStartDate extends AbstractAction {
    public GetAllClientSortedByStartDate(HotelProvider hotelProvider) {
        super(hotelProvider);
    }

    @Override
    public void execute() {
        System.out.println("Клиенты отсортированы по дате заселения:");
        getHotelProvider().getClientService().getClientsSortedByStartDate().forEach(System.out::println);
    }
}

package com.java.usenko.gui.action;

public class GetAllClientSortedByEndDate extends AbstractAction {
    public GetAllClientSortedByEndDate(HotelProvider hotelProvider) {
        super(hotelProvider);
    }

    @Override
    public void execute() {
        System.out.println("Клиенты отсортированы по дате выселения:");
        getHotelProvider().getClientService().getClientsSortedByEndDate().forEach(System.out::println);
    }
}

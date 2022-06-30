package com.java.usenko.gui.action;

public class GetAllClientSortedByAlphabet extends AbstractAction {
    public GetAllClientSortedByAlphabet(HotelProvider hotelProvider) {
        super(hotelProvider);
    }

    @Override
    public void execute() {
        System.out.println("Клиенты отсортированы по алфавиту:");
        getHotelProvider().getClientService().getClientsSortedByAlphabet().forEach(System.out::println);
    }
}

package com.java.usenko.gui.action;

public class GetLastThreeClientAction extends AbstractAction {
    public GetLastThreeClientAction(HotelProvider hotelProvider) {
        super(hotelProvider);
    }

    @Override
    public void execute() {
        System.out.println("Просмотреть 3-х последних клиентов и даты их пребывания:");
        getHotelProvider().getClientService().getThreeLastClients().forEach(System.out::println);
    }
}

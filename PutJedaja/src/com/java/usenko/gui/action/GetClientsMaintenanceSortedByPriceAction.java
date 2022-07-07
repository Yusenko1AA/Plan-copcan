package com.java.usenko.gui.action;

import com.java.usenko.entity.Client;

public class GetClientsMaintenanceSortedByPriceAction extends AbstractAction {
    public GetClientsMaintenanceSortedByPriceAction(HotelProvider hotelProvider) {
        super(hotelProvider);
    }

    @Override
    public void execute() {
        Client client = new Client();

        System.out.println("Отсортировать услуги клиента по цене:");
        getHotelProvider().getClientService().getClientsMaintenanceSortedByPrice(client.getId()).forEach(System.out::println);
    }
}

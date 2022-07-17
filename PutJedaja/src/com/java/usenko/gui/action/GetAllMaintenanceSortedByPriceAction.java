package com.java.usenko.gui.action;

public class GetAllMaintenanceSortedByPriceAction extends AbstractAction {
    public GetAllMaintenanceSortedByPriceAction(HotelProvider hotelProvider) {
        super(hotelProvider);
    }

    @Override
    public void execute() {
        System.out.println("Услуги отсортированы по цене:");
        getHotelProvider().getMaintenanceService().getMaintenanceSortedByPrice().forEach(System.out::println);
    }
}

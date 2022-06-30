package com.java.usenko.gui.action;

public class GetAllMaintenanceSortedByTypeAction extends AbstractAction {
    public GetAllMaintenanceSortedByTypeAction(HotelProvider hotelProvider) {
        super(hotelProvider);
    }

    @Override
    public void execute() {
        System.out.println("Услуги отсортированы по типу:");
        getHotelProvider().getMaintenanceService().getMaintenanceSortedByType().forEach(System.out::println);
    }
}

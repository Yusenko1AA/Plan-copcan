package com.java.usenko.gui.action;

public class GetAllMaintenanceSortedByDateAction extends AbstractAction {
    public GetAllMaintenanceSortedByDateAction(HotelProvider hotelProvider) {
        super(hotelProvider);
    }

    @Override
    public void execute() {
        System.out.println("Услуги отсортированы по датам:");
        getHotelProvider().getMaintenanceService().getMaintenanceSortedByDate().forEach(System.out::println);
    }
}

package com.java.usenko.gui.action;


import com.java.usenko.entity.Client;

public class GetAmountOfPaymentAction extends AbstractAction {
    public GetAmountOfPaymentAction(HotelProvider hotelProvider) {
        super(hotelProvider);
    }


    @Override
    public void execute() {
        System.out.println("Итоговая цена за проживание:");
        //TODO: Разобраться как вывести итоговую стоимость в пункт меню
        Client client = new Client();
        getHotelProvider().getClientService().amountOfPayment(client.getId());
    }
}

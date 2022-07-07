package com.java.usenko.gui.action;

import com.java.usenko.entity.Room;
import com.java.usenko.util.ScannerUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CreateRoomWriteCsvAction extends AbstractAction {
    public CreateRoomWriteCsvAction(HotelProvider hotelProvider) {
        super(hotelProvider);
    }

    @Override
    public void execute() throws FileNotFoundException {
        System.out.println("Введите идшник комнаты");
        long id = ScannerUtil.readLong();

        File csvFile = new File("D:\\JAVA\\room.csv");
        PrintWriter out = new PrintWriter(csvFile);

        Room room = getHotelProvider().getRoomService().getById(id);
        out.println(room);

        out.close();
        System.out.println("Комната записана в csv (путь к файлу D://JAVA):");
    }
}

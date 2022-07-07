package com.java.usenko.gui.action;

import com.java.usenko.entity.Room;
import com.java.usenko.util.ScannerUtil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadRoomFromCsvAction extends AbstractAction {
    public ReadRoomFromCsvAction(HotelProvider hotelProvider) {
        super(hotelProvider);
    }

    @Override
    public void execute() throws FileNotFoundException {
        System.out.println("Введите идшник комнаты");
        long id = ScannerUtil.readLong();

        Room room = getHotelProvider().getRoomService().getById(id);

        String path = "D:\\JAVA\\room.csv";
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

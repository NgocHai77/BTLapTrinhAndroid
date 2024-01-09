package jdev.tuan1demo1;

import java.net.InetAddress;

public class Tuan1Demo2 {
    public static void main(String[] args) {
        //lay dia chi IP cua may1 may chu
        try {
            //lay dai chi IP cua 1 trang web
            InetAddress inet=InetAddress.getByName("www.google.com");
            //lay ra dia chi ip
            System.out.println("Day la dia ip cua trang web google.com"+
                    inet.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

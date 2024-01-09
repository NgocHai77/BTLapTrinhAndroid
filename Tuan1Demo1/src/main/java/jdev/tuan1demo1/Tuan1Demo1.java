package jdev.tuan1demo1;

import java.net.InetAddress;

public class Tuan1Demo1 {

public static void main(String[] args) {
        try {
            //lay dai chi ip cua 1 trang web
            InetAddress inet=InetAddress.getByName("www.google.com");
            //thu ket noi trong thoi gian 5 giay
            boolean isKN=inet.isReachable(5000);
            //in ra thong bao
            if(isKN)
            {
                System.out.println("Co internet");
            }
            else
            {
                System.out.println("Khong ket noi duoc voi internet");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

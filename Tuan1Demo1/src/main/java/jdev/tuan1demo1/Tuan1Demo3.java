
package jdev.tuan1demo1;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class Tuan1Demo3 {
    public static void main(String[] args) {
        try {
            //lay ve tat ca cac interface cua may
            Enumeration<NetworkInterface> netInterface
                    = NetworkInterface.getNetworkInterfaces();
            //duyet qua tung giao dien
            while(netInterface.hasMoreElements())
            {
                NetworkInterface networkInterface
                        =netInterface.nextElement();
                //lay danh sach dia chi IP cua cac giao dien mang
                Enumeration<InetAddress> inetAdress
                        =networkInterface.getInetAddresses();
                //duyet qua tung dia chi IP va in ra man hinh
                while(inetAdress.hasMoreElements())
                {
                    InetAddress address
                            = inetAdress.nextElement();
                    System.out.println("Interface: "
                            +networkInterface.getName()
                            +"; Dia chi IP: "+address.getHostAddress())
                            ;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package jdev.tuan1demo1.Tuan2;
public class VongDoiLuong {
    public static void main(String[] args) {
       //Toa mot luong moi
       Thread t1 = new Thread(new MyRunable1());
       t1.start();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Ngat luong
        t1.interrupt();
    }
}
//Dinh nghia luong
class MyRunable1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Luong dang chay - trang thai"
        +Thread.currentThread().getState());
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Long bi ngat giac ngu - Trang thai"
            +Thread.currentThread().getState());
        }
        System.out.println("Luong da ket thuc - Trang thai"+
                Thread.currentThread().getState());
    }
    
}

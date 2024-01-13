package jdev.tuan1demo1.Tuan2;

public class MyThread extends Thread{
    //Cong viec can thuc hien
    @Override
    public void run() {
        System.out.println("Luong bat dau chay");
    }
    public static void main(String[] args) {
        //tao luong
        MyThread myThread=new MyThread();
        //bat dau luong
        myThread.start();
    }
    
}


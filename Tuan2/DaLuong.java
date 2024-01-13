package jdev.tuan1demo1.Tuan2;
public class DaLuong {
    public static void main(String[] args) {
        //goi cac luong
        Thread t1=new Thread(new MyRunable("Luong 1"));
        t1.start();
        //tao va goi luong 2
        Thread t2=new Thread(new MyRunable("Luong 2"));
        t2.start();
    }
}
//Dinh nghia cac luong
class MyRunable implements Runnable{
    private String threadName;//ten cua thread
    public MyRunable (String name)//ham khoi tao
    {
        this.threadName=name;
    }
    //ham run se thuc hien khi ham start duoc goi
    @Override
    public void run() {
        System.out.println("Bat dau thuc hien cong viec trong"
        +threadName);
        for(int i=0;i<=5;i++)
        {
            System.out.println(threadName+" buoc" + i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
        System.out.println("Bat dau cong viec trong"
        +threadName);
    }
    
}

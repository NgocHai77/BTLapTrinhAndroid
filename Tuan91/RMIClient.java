
package Tuan91;

import java.rmi.Naming;
import java.util.List;

public class RMIClient {
    public static void main(String[] args) {
        try {
            //tim doi tuong
            StudentService obj=(StudentService)
                    Naming.lookup("//localhost:1097/StudentService");
            //goi cac phuong thuc tu xa
            obj.addStudent("Nguyen Ngoc Hai", 24);
            obj.addStudent("Dang Bich Thuy", 20);
            List<Student> students=obj.getAllStudents();
            //in ra ket qua
            System.out.println("List sinh vien");
            for(Student std:students)
            {
                System.out.println("Name: "+std.getName()+
                        " - Age: "+std.getAge());
            }
            //xoa ket qua
            System.out.println("Xoa ket qua");
            obj.removeStudent("Dang Bich Thuy");
            System.out.println("Sau khi xoa");
            for(Student std:students)
            {
                System.out.println("Name: "+std.getName()+
                        " - Age: "+std.getAge());
            }
        } catch (Exception e) {
            System.err.println("Loi: "+e.toString());
            e.printStackTrace();
        }
    }
}

package Tuan91;

import java.rmi.RemoteException;
import java.rmi.Remote;
import java.util.List;

public interface StudentService extends Remote{
    public void addStudent(String name, int age) throws RemoteException;
    public void removeStudent(String name) throws RemoteException;
    public List<Student> getAllStudent() throws RemoteException;
}

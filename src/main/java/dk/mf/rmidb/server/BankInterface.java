package dk.mf.rmidb.server;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface BankInterface extends Remote
{
    List<Customer> getMillionaires() throws RemoteException;
    // @Query(value = "SELECT name FROM Customer  WHERE amount > 1000000")
    // List<Customer> findAllMillions();
    // List<Customer> findAllByName(String name);
}

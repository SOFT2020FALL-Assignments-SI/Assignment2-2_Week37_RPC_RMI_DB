package dk.mf.rmidb.client;
/**
 *
 * @author Dora Di
 */
import java.rmi.Naming;
import java.util.List;
import dk.mf.rmidb.server.*;

public class RMIClientDB
{
    public static void main(String args[])throws Exception
    {  
        // name =  rmi:// + ServerIP +  /EngineName;
        String remoteEngine = "rmi://localhost/BankServices";

        // Create local stub, lookup in the registry searching for the remote engine - the interface with the methods we want to use remotely
        BankInterface obj = (BankInterface) Naming.lookup(remoteEngine);

        List<Customer> list=obj.getMillionaires();
        for(Customer c:list)
        {
            System.out.println(c.getAccnum()+ " " + c.getName() + " " + c.getAmount());
        }  
    }
  
} 

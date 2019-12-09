import java.rmi.Naming;

public class Server {
    public static void main(String[] args) {
        try {
            Adder addService =  new AdderRemote();
            Naming.rebind("AddService",addService);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

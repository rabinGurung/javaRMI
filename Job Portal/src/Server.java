import java.rmi.Naming;

public class Server {
    public static void main(String[] args) {
        try {
            Adder addService =  new AdderRemote();
            Naming.rebind("//localhost/MyServer",addService);
            System.out.println("Server is ready");
            //new DatabaseConnection().getConnection();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

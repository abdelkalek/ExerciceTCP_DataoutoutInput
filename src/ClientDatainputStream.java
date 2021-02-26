import java.io.*;
import java.net.Socket;

public class ClientDatainputStream {
    public static void main(String[] args) throws IOException {
        Socket sc = new Socket("localhost", 9400);
        DataInputStream input = new DataInputStream(sc.getInputStream());
        DataOutputStream output = new DataOutputStream(sc.getOutputStream());
        boolean stop = false;
        while (!stop) {


            output.writeUTF("abdelkalek");
            System.out.println("client en Ecoute ......");
            String response = input.readUTF();
            System.out.println("Reponse de Serveur:     "+ response);
        }
        sc.close();
    }
    }

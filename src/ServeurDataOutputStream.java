import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServeurDataOutputStream {


        public static void main(String[] args) throws IOException {
            ServerSocket ss = new ServerSocket(9400,5);
            Socket sc ; //Socket Client
            while (true){
                sc= ss.accept();
                 String message = "Message part du serveur";

                  ///// bech te9bel donner men client ////
            DataInputStream dataInput = new DataInputStream(sc.getInputStream());
                message = dataInput.readUTF();
                System.out.println("Read:"+message);
                message = message.toUpperCase();
                //// Fin bech t9bel donner men Client////

                ///// bech Tab3eth donner lel client ////
            DataOutputStream dataOutput = new DataOutputStream(sc.getOutputStream());
                dataOutput.writeUTF(String.format(message));
                ///// bech Tab3eth donner lel client ////
        }

        }
    }



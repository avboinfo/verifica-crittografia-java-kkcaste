import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        Crypto c = new Crypto();
        Scanner input = new Scanner(System.in);
        int kC = 1;
        String kXOR = "Ciao";

        String messaggio = "";

        try {
            File f = new File("static/data.txt");

            Scanner leggiFile = new Scanner(f);
            while (leggiFile.hasNextLine()) {

                String s = leggiFile.nextLine();
                messaggio += s;

            }
        } catch (Exception e) {

        }

        
        String messaggioCriptatoCesare = Crypto.Cesar(messaggio, kC);

        System.out.println("Messaggio criptato:");
        String messaggioCriptato = Crypto.xorAlgo(messaggioCriptatoCesare, kXOR);
        System.out.println(messaggioCriptato);
        System.out.println("Messaggio decriptato:");

        String messaggioDecriptatoXOR = Crypto.xorAlgo(messaggioCriptato, kXOR);
        String messaggioDecriptato = Crypto.Cesar(messaggioDecriptatoXOR, kC * (-1));
        System.out.println(messaggioDecriptato);

    }
}

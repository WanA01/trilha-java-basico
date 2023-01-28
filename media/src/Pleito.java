import java.io.IOException;
import java.util.Scanner;

public class Pleito {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int habitantes;
        int brancos;
        int nulos;
        int validos;
       
        habitantes = input.nextInt();
        brancos = input.nextInt();
        nulos = input.nextInt();
        validos = input.nextInt();


       int pBrancos= (brancos * 100)/habitantes;
       int pNulos = (nulos * 100)/habitantes;
       int pValidos = (validos * 100)/habitantes;


        System.out.println("Brancos: "+pBrancos+"%");

        System.out.println("Nulos: "+pNulos+"%");

        System.out.println("Validos: "+pValidos+"%");
    }
}


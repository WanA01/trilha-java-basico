//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Media{
    public static void main(String[] args) throws IOException{
        //Scanner leitor = new Scanner(System.in);

       // System.out.println("Digite a primeira idade");
        //int idade1 = leitor.nextInt(); //recebe o proximo valor inserido como um int
        //System.out.println(idade1);
        
        //System.out.println("Digite a segunda idade");
        //int idade2 = leitor.nextInt(); //recebe o proximo valor inserido como um int
        //System.out.println(idade2);


        //System.out.println("Digite a terceira idade");
        //int idade3 = leitor.nextInt(); //recebe o proximo valor inserido como um int
        //System.out.println(idade3);
        
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br1.readLine());

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st2 = new StringTokenizer(br2.readLine());

        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st3 = new StringTokenizer(br3.readLine());
        
        int idade1 = Integer.parseInt(st1.nextToken());
        int idade2 = Integer.parseInt(st2.nextToken());
        int idade3 = Integer.parseInt(st3.nextToken());
       // System.out.println(idade1); // Imprime o dado
        //System.out.println(idade2);
        //System.out.println(idade3);
        

        
        int totInt = idade1 + idade2 + idade3; //realiza a soma dos valores
        double mediaInt = totInt / 3.0; //calcula a média do valores inseridos
            
        

            if ((mediaInt>=0)&&(mediaInt<=25)){
            System.out.println("Jovem!");
            } else if ((mediaInt>=26)&&(mediaInt<=60)) {
            System.out.println("Adulta!");
            } else if (mediaInt>60) {
            System.out.println("Idosa!");
            }

            //br.close();
        }
    }

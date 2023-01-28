import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class FlexaEscudoEspada{
  
public static void main(String[] args) throws IOException {
	
  BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
  StringTokenizer st1 = new StringTokenizer(br1.readLine());

  BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
  StringTokenizer st2 = new StringTokenizer(br2.readLine());
        
        
        int jogador = Integer.parseInt(st1.nextToken());
        int inimigo = Integer.parseInt(st2.nextToken());
        //int idade3 = Integer.parseInt(st3.nextToken());
        //final int FlEXA = 1;
	      //final int ESCUDO = 2;
	      //final int ESPADA = 3;
        
		if(jogador == 1 && inimigo == 1) {
			System.out.println("Empatou");
	   }else if((jogador == 1) && (inimigo == 2)){
	    System.out.println("Perdeu");
       }else if ((jogador == 3) && (inimigo == 2)){
		System.out.println("Ganhou");
		}		
    }
	//sc.close();
  }

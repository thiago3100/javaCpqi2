import java.util.Scanner;
import java.util.Random;

public class desafioDados {
    public static void main(String args[]) {
       
       Scanner s = new Scanner(System.in);
       System.out.println("Qual seu palpite ?");
       int palpite = s.nextInt();
       
       Random r = new Random();
       int dado = r.nextInt(6)+1;
       
       System.out.println("palpite: "+ palpite);
       System.out.println("dado: "+ dado);
       
       if(palpite == dado){
           System.out.println("Você acertou !!");
       }else{
           System.out.println("Você errou !!");
       }
    }
}
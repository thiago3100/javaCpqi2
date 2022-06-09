import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class While {
    public static void main(String args[]) {
        
        ArrayList<String> produtos = new ArrayList<String>();
        String[] preco = {"12", "39", "8", "34", "12" };
        
        Random r = new Random();
        int valor = r.nextInt(preco.length);
        String total = preco[valor];
        
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome do produto, para sair digite FIM");
        
        String produto;
        
        while(!"FIM" .equals(produto = s.nextLine())){
            produtos.add(produto);
        }
        
        String results = "Seu carrinho está com : "+produtos + "no valor total de : " +total +" reais";
        
        System.out.println(results);
    }
}


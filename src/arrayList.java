import java.util.ArrayList;


public class arrayList {
    public static void main(String args[]) {
        
        ArrayList<String> cores = new ArrayList<>();
        cores.add("azul");
        cores.add("vermelho");
        cores.add("branco");
        cores.add("preto");
          
        System.out.println("Tamanho: " +cores.toString());
        System.out.println("Tamanho: " +cores.size());
        System.out.println("nome cor: " +cores.get(3));
        System.out.println("posição: " +cores.indexOf("vermelho"));
        
        cores.remove("branco");
        System.out.println("Tem cinza? " +cores.contains("cinza"));
    }
}

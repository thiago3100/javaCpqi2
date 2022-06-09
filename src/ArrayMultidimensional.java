import java.util.Random;


public class ArrayMultidimensional {

    public static void main(String args[]) {
       
        String[] nome = {"luan", "ricardo", "maria", "joao", "pedro"};
        String[] idade = {"20", "12", "34", "78", "21"};
        
        Random r = new Random();
        
        int nomeSorted = r.nextInt(nome.length);
        String name = nome[nomeSorted];
        
        int idadeSorted = r.nextInt(nome.length);
        String age = idade[idadeSorted];
        
        String sorteio = name + " " + age;
        
        System.out.print(sorteio);
    }
}

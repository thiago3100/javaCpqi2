import java.util.Arrays;
public class ArraySimples {

    public static void main(String[] args) {
        
        String[] nomes = {"Thiago", "felipe", "santos", "farias"};
        System.out.println(Arrays.toString(nomes));
        
        int posicao = Arrays.binarySearch(nomes, "felipe");
        System.out.println(posicao);
        
        Arrays.sort(nomes, 0, nomes.length);
        System.out.println(Arrays.toString(nomes));
        
        Double[] valores = {12.84, 16.89};
        System.out.println(valores[1].doubleValue());
    }
}

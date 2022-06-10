public class CachorroTest {

    public static void main(String args[]) {
       Cachorro pitbull = new Cachorro();
       pitbull.tamanho = 30;
       pitbull.nome = "Zeus";
       pitbull.raça = "Pitbull";
       
       pitbull.latir();
       
       Cachorro viraLata = new Cachorro();
       viraLata.nome = "Caramelo";
       viraLata.raça = "Vira-Lata";
       viraLata.tamanho= 20;
       
       viraLata.latir();
    }
}
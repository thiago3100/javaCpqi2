public class IfElse {
    public static void main(String args[]) {
        
        int nota = 6;
        
        if(nota >=7 ){
            System.out.println("Passou !");
        } else {
            System.out.println("reprovou");
            if(nota >=6){
                System.out.println("mas pode fazer a recuperação !");
            }
        }
    }
}
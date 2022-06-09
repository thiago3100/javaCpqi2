public class Switch {
    public static void main(String args[]) {
        
        String tecnologia = "MySql";
        
        switch(tecnologia){
            case "MySql" :
            case "Oracle":
            case "MongoDb":
                System.out.print("Banco de dados");
                break;
            case "php" :
            case ".Net":
            case "java":
                System.out.print("Linguagem de programação");
                break;
            default:
                System.out.println("tecnologia não encontrada");
                break;
        }
    }
}

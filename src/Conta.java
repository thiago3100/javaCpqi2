public class Conta {
    String cliente;
    double saldo;
    
    void exibeSaldo(){
        System.out.println(cliente + " seu saldo é " +saldo);
    }
    
    void sacar(double valor){
        saldo -= valor;
    }
    void deposita(double valor){
        saldo += valor;
    }
    void tranferePara(Conta destino, double valor ){
        this.sacar(valor);
        destino.deposita(valor);
    }
    
}

public class caixaEletronico {

    public static void main(String args[]) {
       Conta cliente1 = new Conta();
       Conta destino = new Conta();
       
       cliente1.cliente = "Thiago";
       cliente1.saldo = 2400;
       cliente1.exibeSaldo();
       
       destino.cliente = "Felipe";
       destino.saldo = 4500;
       destino.exibeSaldo();
       
       cliente1.tranferePara(destino, 2000);
       cliente1.exibeSaldo();
       destino.exibeSaldo();
    }
}

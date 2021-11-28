package oo.contabanc;

class ClienteObj {

    String nome;
    String sobrenome;
    String cpf;

}

//////////////////////////////////////////////////////////////////////////////////////
public class ObjConta {

    int numero;
    double saldo;
    String titular;

    /// Métodos
    void deposita(double quantidade) {

        this.saldo += quantidade;
        /// Abreviação de saldo = saldo + quantidade
    }

    ///
    void saca(double quantidade) {
        /// Void não devolve nenhuma informação a quem pediu

        double novoSaldo;

        novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;

        /// This indica que é um atributo e não uma simples variável
    }

    ///
    boolean saca2(double valor) {
        System.out.println(String.format("\nPedido de saque de %s : %s", this.titular, valor));
        System.out.println("\nVerificando saldo...\n");
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente");
            return false;
        } else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }

    ///
    void transferePara(ObjConta destino, double valor) {
        this.saldo = this.saldo - valor;
        destino.saldo = destino.saldo + valor;
    }

    ///
    boolean transferePara2(ObjConta destino, double valor) {
        System.out.println(String.format("Pedido de transferência de %s para %s", valor, destino.titular));
        boolean retirou = this.saca2(valor);
        if (retirou == false) {
            System.out.println("\nNão transferiu\n");
            return false;
        } else {
            destino.deposita(valor);
            System.out.println("\nTransferiu\n");
            return true;
        }
    }
}

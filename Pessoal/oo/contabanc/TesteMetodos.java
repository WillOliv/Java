package oo.contabanc;

public class TesteMetodos {
    public static void main(String[] args) {

        /// Criando conta
        ObjConta c1, c2;
        String espace = "\n----- ----- ----- ----- ----- ----- ----- -----\n";

        c1 = new ObjConta();
        c2 = new ObjConta();

        /// Definindo valores
        c1.titular = "Will_1";
        c1.saldo = 1000;

        c2.titular = "Will_2";
        c2.saldo = 0;

        /// Deposita 500
        c1.deposita(500);

        /// Mostra estado atual
        System.out.println(String.format("\nNome : %s \nSaldo atual : %s", c1.titular, c1.saldo));

        /// Sacas (não devolve nada)
        c1.saca(0);

        /// Saca com condição
        if (c1.saca2(200)) {
            System.out.println("\nConsegui sacar\n");
            System.out.println("\nSaldo atual : " + c1.saldo);
        } else {
            System.out.println("\nNão conseguiu sacar");
        }

        System.out.println(espace);

        c1.transferePara2(c2, 1000);

        System.out.println(espace);

    }
}

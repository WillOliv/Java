package oo.contabanc;

public class Conta {
    public static void main(String[] args) {

        ObjConta Conta1, Conta2;

        /// Conta 1 e 2 não são dois objetos, são referências do objeto ObjConta
        /// Uma variável nunca é um objeto
        Conta1 = new ObjConta();
        Conta1.titular = ("Will");
        Conta1.saldo = 500;

        Conta2 = new ObjConta();
        Conta2.titular = ("Breno");
        Conta2.saldo = 2000;

        ObjConta Conta3 = Conta2;

        System.out.println(String.format("\nNome : %s \nSaldo atual : %s \n\nNome : %s \nSaldo atual : %s",
                Conta1.titular, Conta1.saldo, Conta2.titular, Conta2.saldo));

        System.out.println(String.format("\nNome : %s \nSaldo atual : %s \n", Conta3.titular, Conta3.saldo));
        /// Conta3 faz referência ao mesmo objeto referenciado por Conta2
        /// Quando utilizamos Conta2 ou Conta3, estamos nos referenindo ao mesmo objeto
    }
}

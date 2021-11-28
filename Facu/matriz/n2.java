package matriz;

public class n2 {

    public static void main(String[] args) {

        /// Tipos primitivos de dados (String)

        String teste;

        teste = " Teste de String ";

        System.out.println("\n");
        System.out.println(teste.length());
        System.out.println(teste.substring(1, 5));

        System.out.println("\n");
        System.out.println(teste);
        System.out.println(teste.trim());

        System.out.println("\n");
        System.out.println(teste.charAt(1));
        System.out.println(teste.replace("e", "3"));

        System.out.println("\n");
        System.out.println(teste.toLowerCase());
        System.out.println(teste.toUpperCase());

        System.out.println("\n");
        System.out.println(teste.equals("teste de string"));
        System.out.println(teste.contains("T"));

        System.out.println("\n");
        System.out.println(teste.equalsIgnoreCase(" teste de string "));
        System.out.println(String.format("%s ", teste));

        System.out.println("\n");
    }
}

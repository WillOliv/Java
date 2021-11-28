package basics;

public class b_StringThings {
    public static void main(String[] args) {

        String teste;
        int um, dois;
        double umDoisTres;

        um = 1;
        dois = 2;
        umDoisTres = 1.2398876;
        teste = " Teste de String ";

        System.out.println(teste.length());
        System.out.println(teste.substring(1, 5));

        System.out.println(teste);
        System.out.println(teste.trim());
        System.out.println(teste.charAt(1));

        System.out.println(teste.toLowerCase());
        System.out.println(teste.toUpperCase());
        System.out.println(teste.replace("e", "3"));

        System.out.println(teste.equals("teste de string"));
        System.out.println(teste.contains("T"));
        System.out.println(teste.equalsIgnoreCase("teste de string"));

        System.out.println(String.format("%s + um = dois", um, dois));
        System.out.println(String.format("%.2f", umDoisTres));
    }
}

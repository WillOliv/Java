package basics;

import javax.swing.JOptionPane;

public class Intro {
    public static void main(String[] args) {

        System.out.println("Para print padrão");
        JOptionPane.showMessageDialog(null, "Para print em pop-up");
        JOptionPane.showInputDialog("Para Input em pop-up");
        JOptionPane.showMessageDialog(null, "int = 19; \ndouble = 9.99; \nboolean = true;");
        // Para comentários

        String nome = "Will";
        JOptionPane.showMessageDialog(null, nome + ", + concatena variáveis");

    }
}

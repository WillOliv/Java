import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Introducao {
    public static void main(String[] args) {

        System.out.println("Para print padrão");
        JOptionPane.showMessageDialog(null, "Para print em pop-up");
        JOptionPane.showInputDialog("Para Input");
        //Para comentários

        String nome = "Will";
        //int idade = 19;
        //double enem = 595.24;
        //boolean vivo = true;

        JOptionPane.showMessageDialog(null, nome + ", + concatena variáveis");
        ////////////////////////////////////////////////////////////////////////

        double altura, peso, imc;
        //Definindo 3 variáveis do tipo double
        
        altura = Double.parseDouble(JOptionPane.showInputDialog("Altura : ")) ;
        peso = Double.parseDouble(JOptionPane.showInputDialog("Peso : "));
        imc = peso / (altura * altura);

        DecimalFormat decimal = new DecimalFormat("0.00");
        String valorFormatado = decimal.format(imc);
        //Limitando fração
        
        JOptionPane.showMessageDialog(null, "IMC = " + valorFormatado);
        //////////////////////////////////////////////////////////////////////////

        if (imc >= 17.5 && imc <= 25){
            JOptionPane.showMessageDialog(null, "Dentro da média");
        } else if (imc <= 17.5 && imc >= 25){
                JOptionPane.showMessageDialog(null, "Fora da média");
        }else{
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
}

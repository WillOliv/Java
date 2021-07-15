import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args) {
        
        double largura, comprimento, metroQ, area, preco;

        largura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a largura" ));
        comprimento = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o comprimento"));
        metroQ = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do metro quadrado"));

        area = largura * comprimento;
        preco = metroQ * area;

        DecimalFormat decimal = new DecimalFormat("0.00");
        String area2 = decimal.format(area);
        String preco2 = decimal.format(preco);

        JOptionPane.showMessageDialog(null, "Área total : " + area2 + "\nPreço : " + preco2);
    }
}

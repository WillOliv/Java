import javax.swing.JOptionPane;

public class Exercicio3 {

    public static void main(String[] args) {

        int calc, x, y;

        calc = Integer.parseInt(JOptionPane.showInputDialog("What do you want? \n1 - Addition \n2 - Subtraction \n3 - Multiplication \n4 - Division "));
        x = Integer.parseInt(JOptionPane.showInputDialog("Type the fist number"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Type a second number"));

        if (calc == 1){
            add(x, y);
        }
        else if (calc == 2){
            sub(x, y);
        }
        else if (calc == 3){
            mult(x, y);
        }
        else if (calc == 4){
            div(x, y);
        }
        else{
            JOptionPane.showMessageDialog(null, "Type numbers only");
        }
    }

    static void add(int x, int y){
        JOptionPane.showMessageDialog(null, x + y);
    }

    static void sub(int x, int y){
        JOptionPane.showMessageDialog(null, x - y);
    }

    static void mult(int x, int y){
        JOptionPane.showMessageDialog(null, x * y);
    }

    static void div(int x, int y){
        JOptionPane.showMessageDialog(null, x / y);
    }
}
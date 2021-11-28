package basics;

public class c_Condicionais {
    public static void main(String[] args) {

        int condicao = 10;
        if (condicao > 0) {
            System.out.println("Maior");
        } else if (condicao < 0) {
            System.out.println("Menor");
        } else {
            System.out.println("Error");
        }

        /// Forma reduzida

        boolean eMaior;
        eMaior = condicao > 0 ? true : false;
        System.out.println(eMaior);

        /// && = and /// || = or /// ! = not

        boolean hasHightIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminal = true;
        boolean isElegible = (hasHightIncome || hasGoodCredit) && !hasCriminal;
        System.out.println(isElegible);

    }
}

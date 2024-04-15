package swing2;

import javax.swing.*;

public class swing2 {

    public static void main(String[] entrada) {

        // VARIAVEIS

        int n1, n2;
        double div, pot;
        String msg;

        // ENTRADA

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero inteiro: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe um segundo numero inteiro: "));

        // PROCESSAMENTO

        div = (double) n1 / n2; // a conversão aqui é para possibilitar que o RESULTADO da divisão não trunque e
                                // passe a admitir resultados com números reais.
        pot = Math.pow(n1, n2);
        msg = "O resultado da divisao entre os dois numero e = " + div + "\n";
        msg = msg + "E a potencia do primeiro pelo segundo e = " + pot + "\n";

        // SAIDA

        JOptionPane.showMessageDialog(null, msg);

        System.exit(0);

    }
}
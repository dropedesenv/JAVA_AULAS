package swing;

import javax.swing.*;

public class swing {

    public static void main(String[] entrada) {

        // VARIAVEIS

        int n1, n2;
        double resto, raiz1, raiz2;
        String msg;

        // ENTRADA

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero inteiro: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo numero intero: "));

        // PROCESSAMENTO

        resto = n1 % n2;
        raiz1 = Math.sqrt(n1);
        raiz2 = Math.sqrt(n2);
        msg = "Os numeros informados foram = " + n1 + " e " + n2 + "\n";
        msg = msg + "O resto da divisao entre os numeros informados e = " + resto + "\n"
                + "E as raizes sao respectivamente = " + raiz1 + " e " + raiz2;

        // SAIDA

        JOptionPane.showMessageDialog(null, msg);

        System.exit(0);

    }

}

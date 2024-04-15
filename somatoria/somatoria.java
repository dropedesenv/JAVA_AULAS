package somatoria;

import javax.swing.JOptionPane;

public class somatoria {

    public static void main(String[] args) {

        // VARIAVEIS

        int n1 = 0, n2, soma, somatorio = n1;
        char op;
        String msg = "";

        // ENTRADA

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Iforme o primeiro valor: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Iforme o segundo valor: "));
        op = JOptionPane.showInputDialog("Informe o metodo: \n" + " 1: FOR \n 2: WHILE \n 3: DO/WHILE.").charAt(0);

        // PROCESSAMENTO

        soma = n1 + n2;

        switch (op) {

            case '1': // FOR

                if (n1 % 2 == 0 && n2 % 2 == 0) {

                    msg = msg + "Os Numeros sao pares e a soma entre eles e = " + soma + "\n";

                }

                for (int i = 1; i <= n2; i = i + 1)

                    somatorio = somatorio + n1;

                msg = msg + "O somatorio de " + n1 + ", em " + n2 + " vezes e = " + somatorio;

                break;

            case '2': // WHILE

                int i = 1;

                if (n1 % 2 == 0 && n2 % 2 == 0) {

                    msg = msg + "Os Numeros sao pares e a soma entre eles e = " + soma + "\n";

                }

                while (i <= n2) {

                    somatorio = somatorio + n1;
                    i = i + 1;
                }

                msg = msg + "O somatorio de " + n1 + ", em " + n2 + " vezes e = " + somatorio;

                break;

            case '3': // DO_WHILE

                int j = 1;

                if (n1 % 2 == 0 && n2 % 2 == 0) {

                    msg = msg + "Os Numeros sao pares e a soma entre eles e = " + soma + "\n";

                }

                do {

                    somatorio = somatorio + n1;
                    j = j + 1;
                }

                while (j <= n2);

                msg = msg + "O somatorio de " + n1 + ", em " + n2 + " vezes e = " + somatorio;

                break;

            default:
                JOptionPane.showMessageDialog(null, "Opcoes invalidas, calculo nao realizado");
                break;
        }

        JOptionPane.showMessageDialog(null, msg);

        System.exit(0);

    }

}

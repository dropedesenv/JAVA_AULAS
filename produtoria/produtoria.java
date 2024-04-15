package produtoria;

import javax.swing.*;

public class produtoria {

    public static void main(String[] entrada) {

        // VARIAVEIS

        int n1, n2, prod, p;
        char op;
        String msg = "";

        // ENTRADA

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe agora o segundo valor: "));
        op = (JOptionPane.showInputDialog("Digite 1 para obter o produto.\n Digite 2 para obter a produtoria: "))
                .charAt(0);
        p = 1;

        // PROCESSAMENTO

        switch (op) {

            case '1':
                if (n1 >= 0 && n2 >= 0) {

                    prod = n1 * n2;
                    msg = "O produto entre " + n1 + " e " + n2 + " e = " + prod;
                }
                break;

            case '2':
                if (n1 >= 0 && n2 >= 0) {

                    for (int i = 1; i <= n2; i = i + 1)

                        p = p * n1;
                    msg = "A produtoria de " + n1 + ", " + n2 + " vezes e = " + p;
                    break;
                }

            default:
                JOptionPane.showMessageDialog(null, "Opcoes escolhidas invalidas");
                break;

        }

        // SAIDA

        JOptionPane.showMessageDialog(null, msg);

        System.exit(0);

    }
}

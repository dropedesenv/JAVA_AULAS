package decisao;

import javax.swing.*;;

public class decisao {

    public static void main(String[] entrada) {

        // VARIAVEIS

        int n1;
        String msg = "";

        // ENTRADA

        n1 = Integer.parseInt(JOptionPane
                .showInputDialog("Insira um valor para descobrir se ele e negativo ou positivo, par ou impar: "));

        // PROCESSAMENTO

        if (n1 >= 0 && n1 % 2 == 0) {

            msg = "O valor informado foi = " + n1 + " e e positivo e par ";

        } else

        if (n1 >= 0 && n1 % 2 != 0) {

            msg = "O valor informado e " + n1 + " e e positivo e impar";

        } else if (n1 < 0 && n1 % 2 == 0) {

            msg = "O valor informado e " + n1 + " e e negativo e par";

        } else if (n1 < 0 && n1 % 2 != 0) {

            msg = "O valor informado e " + n1 + " e e negativo e impar";

        }

        // SAIDA

        JOptionPane.showMessageDialog(null, msg);

        System.exit(0);

    }

}

package tabuada;

import javax.swing.*;;

public class tabuada {

    public static void main(String[] entrada) {

        // VARIAVEIS

        int tabuada;
        char op = 0;
        String msg = "";

        // ENTRADA

        tabuada = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero que deseja obeter a tabuada: "));
        op = (JOptionPane.showInputDialog("Escolha o metodo de repeticao: \n 1 - for \n 2 - while \n 3 - do/while"))
                .charAt(0);

        // PROCESSAMENTO

        switch (op) {

            case '1':

                msg = msg + "METODO 'FOR' ESCOLHIDO. \n\n";

                for (int i = 0; i <= 10; i = i + 1)

                    msg = msg + "A tabuada de " + tabuada + " x " + i + " e: " + tabuada * i + "\n";

                break;

            case '2':

                msg = msg + "METODO 'WHILE' ESCOLHIDO. \n\n";
                int i = 0;

                while (i <= 10) {

                    msg = msg + "A tabuada de " + tabuada + " x " + i + " e: " + tabuada * i + "\n";

                    i = i + 1;
                }
                break;

            case '3':

                msg = msg + "METODO 'DO/WHILE' ESCOLHIDO. \n\n";
                int j = 0;

                do {

                    msg = msg + "A tabuada de " + tabuada + " x " + j + " e: " + tabuada * j + "\n";
                    j = j + 1;

                }

                while (j <= 10);

                break;

            default:
                JOptionPane.showMessageDialog(null, "Opcoes invalidas, calculo nao realizado");

                break;

        }

        // SAIDA

        if (op >= '1' && op <= '3') {

            JOptionPane.showMessageDialog(null, msg);

        }

        System.exit(0);

    }

}

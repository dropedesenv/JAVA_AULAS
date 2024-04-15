package matriz1;

import javax.swing.*;

public class matriz1 {

    public static void main(String[] entrada) {

        int vetor[] = { 2, 4, 6, 8, 10 };
        int matriz[][] = new int[2][3];
        String msg = "Vetor: ";

        // VETOR:

        for (int i = 0; i < vetor.length; i++) {

            msg = msg + vetor[i] + " ";

        }

        JOptionPane.showMessageDialog(null, msg);

        // MATRIZ:

        msg="Matriz: \n\n";

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {

                matriz[i][j] = Integer.parseInt(
                        JOptionPane.showInputDialog("Insira valores na matriz na linha: " + i + " e na coluna: " + j));

                msg = msg + matriz[i][j] + " ";

            }

            msg = msg + "\n";

        }

        JOptionPane.showMessageDialog(null, msg);

        System.exit(0);

    }
}
package programa1;

class programa1 {

    public static void main(String entrada[]) {

        int n1, n2, mod, div;
        double pot, raiz1, raiz2;
        String msg, msg2, msg3, msg4, msg5 = "";

        // Entrada de dados

        n1 = Integer.parseInt(entrada[0]);
        n2 = Integer.parseInt(entrada[1]);

        // Processamento

        mod = n1 % n2;
        div = n1 / n2;
        raiz1 = Math.sqrt(n1);
        raiz2 = Math.sqrt(n2);
        pot = Math.pow(n1, n2);

        // CONVERSÃO

        int raizint1 = (int) raiz1;
        int raizint2 = (int) raiz2;

        // SAIDA

        msg = n1 + " dividido por: " + n2 + " e igual a: " + div;
        msg2 = " e o resto da divisao e igual a: " + mod;
        msg3 = "Ja a raiz quadrada do primeiro numero e: " + raiz1 + " e do segundo e: " + raiz2;
        msg4 = "Respectivamente convertidos em numeros inteiros sao: " + raizint1 + " e " + raizint2;
        msg5 = "E a potencia do primeiro numero elevado pelo segundo e: " + pot;

        System.out.println(msg + msg2);
        System.out.println(msg3);
        System.out.println(msg4);
        System.out.println(msg5);

        System.exit(0);

    }

}

// comentario adicionado para teste de criação e sincronização de branch
public static void matrizesQ7() {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        int somaAcima = 0, somaAbaixo = 0, somaPrincipal = 0, somaSecundaria = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i < j) somaAcima += m[i][j];
                if (i > j) somaAbaixo += m[i][j];
                if (i == j) somaPrincipal += m[i][j];
                if (i + j == 2) somaSecundaria += m[i][j];
            }
        }

        System.out.println(somaAcima);
        System.out.println(somaAbaixo);
        System.out.println(somaPrincipal);
        System.out.println(somaSecundaria);
    }

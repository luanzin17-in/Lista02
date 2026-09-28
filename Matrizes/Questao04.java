public static void matrizesQ4() {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[4][4];
        int maiorLinha = 0, maiorColuna = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        int maior = m[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(m[i][j] + " ");
                if (m[i][j] > maior) {
                    maior = m[i][j];
                    maiorLinha = i;
                    maiorColuna = j;
                }
            }
            System.out.println();
        }

        System.out.println(maiorLinha + " " + maiorColuna);
    }

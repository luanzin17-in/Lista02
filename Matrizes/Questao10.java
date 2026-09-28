public static void matrizesQ10() {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][3];
        int[] vSoma = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < 3; j++) {
            int somaCol = 0;
            for (int i = 0; i < 3; i++) {
                somaCol += m[i][j];
            }
            vSoma[j] = somaCol;
        }

        for (int j = 0; j < 3; j++) {
            System.out.println(vSoma[j]);
        }
    }

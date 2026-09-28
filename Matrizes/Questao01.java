public static void matrizesQ1() {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[4][4];
        int cont = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = sc.nextInt();
                if (m[i][j] > 10) cont++;
            }
        }

        System.out.println(cont);
    }

public static void matrizesQ12() {
        Scanner sc = new Scanner(System.in);
        double[][] m1 = new double[2][2];
        double[][] m2 = new double[2][2];

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) m1[i][j] = sc.nextDouble();

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) m2[i][j] = sc.nextDouble();

        char opcao = sc.next().charAt(0);

        if (opcao == 'a') {
            double[][] m3 = new double[2][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    m3[i][j] = m1[i][j] + m2[i][j];
                    System.out.print(m3[i][j] + " ");
                }
                System.out.println();
            }
        } else if (opcao == 'b') {
            double[][] m3 = new double[2][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    m3[i][j] = m2[i][j] - m1[i][j];
                    System.out.print(m3[i][j] + " ");
                }
                System.out.println();
            }
        } else if (opcao == 'c') {
            double k = sc.nextDouble();
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    m1[i][j] += k;
                    m2[i][j] += k;
                }
            }
        } else if (opcao == 'd') {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) System.out.print(m1[i][j] + " ");
                System.out.println();
            }
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) System.out.print(m2[i][j] + " ");
                System.out.println();
            }
        }
    }

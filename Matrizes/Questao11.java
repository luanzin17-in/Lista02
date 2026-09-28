 public static void matrizesQ11() {
        Scanner sc = new Scanner(System.in);
        int[][] alunos = new int[5][4];

        int maiorNotaFinal = -1;
        int matMaior = -1;
        int somaNotasFinais = 0;

        for (int i = 0; i < 5; i++) {
            alunos[i][0] = sc.nextInt();
            alunos[i][1] = sc.nextInt();
            alunos[i][2] = sc.nextInt();
            alunos[i][3] = alunos[i][1] + alunos[i][2];

            somaNotasFinais += alunos[i][3];

            if (alunos[i][3] > maiorNotaFinal) {
                maiorNotaFinal = alunos[i][3];
                matMaior = alunos[i][0];
            }
        }

        System.out.println(matMaior);
        System.out.println((double) somaNotasFinais / 5);
    }

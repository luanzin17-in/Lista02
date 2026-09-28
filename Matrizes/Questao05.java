 public static void matrizesQ5() {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        boolean achou = false;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (m[i][j] == x) {
                    System.out.println(i + " " + j);
                    achou = true;
                    break;
                }
            }
            if (achou) break;
        }

        if (!achou) {
            System.out.println("não encontrado");
        }
    }

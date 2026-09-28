public static void matrizesQ13() {
        Scanner sc = new Scanner(System.in);
        int[][] teatro = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                teatro[i][j] = -1;
            }
        }

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            for (int k = 0; k < n; k++) {
                int f = sc.nextInt() - 1;
                int p = sc.nextInt() - 1;

                if (f >= 0 && f < 10 && p >= 0 && p < 10) {
                    if (teatro[f][p] == -1) {
                        teatro[f][p] = 1;
                    } else {
                        System.out.println("Poltrona ja foi vendida");
                    }
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(teatro[i][j] + " ");
            }
            System.out.println();
        }
    }

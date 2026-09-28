public static void matrizesQ8() {
        Random rand = new Random();
        int[][] orig = new int[4][4];
        int[][] trans = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                orig[i][j] = rand.nextInt(20) + 1;
                if (i < j) {
                    trans[i][j] = 0;
                } else {
                    trans[i][j] = orig[i][j];
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) System.out.print(orig[i][j] + "\t");
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) System.out.print(trans[i][j] + "\t");
            System.out.println();
        }
    }

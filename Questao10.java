 public static void vetoresQ10() {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];
        int[] y = new int[5];

        for (int i = 0; i < 5; i++) x[i] = sc.nextInt();
        for (int i = 0; i < 5; i++) y[i] = sc.nextInt();

        // a
        for (int i = 0; i < 5; i++) System.out.print((x[i] + y[i]) + " ");
        System.out.println();

        // b
        for (int i = 0; i < 5; i++) System.out.print((x[i] * y[i]) + " ");
        System.out.println();

        // c
        for (int i = 0; i < 5; i++) {
            boolean achou = false;
            for (int j = 0; j < 5; j++) {
                if (x[i] == y[j]) { achou = true; break; }
            }
            if (!achou) System.out.print(x[i] + " ");
        }
        System.out.println();

        // d
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (x[i] == y[j]) System.out.print(x[i] + " ");
            }
        }
        System.out.println();

        // e
        for (int i = 0; i < 5; i++) System.out.print(x[i] + " ");
        for (int i = 0; i < 5; i++) {
            boolean achou = false;
            for (int j = 0; j < 5; j++) {
                if (y[i] == x[j]) { achou = true; break; }
            }
            if (!achou) System.out.print(y[i] + " ");
        }
        System.out.println();
    }

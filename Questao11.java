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

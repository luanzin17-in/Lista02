public static void vetoresQ8() {
        Scanner sc = new Scanner(System.in);
        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int[] v3 = new int[20];

        for (int i = 0; i < 10; i++) v1[i] = sc.nextInt();
        for (int i = 0; i < 10; i++) v2[i] = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            v3[2 * i] = v1[i];
            v3[2 * i + 1] = v2[i];
        }

        for (int i = 0; i < 20; i++) {
            System.out.print(v3[i] + " ");
        }
        System.out.println();
    }

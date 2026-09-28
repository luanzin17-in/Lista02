 public static void vetoresQ5() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[20];
        for (int i = 0; i < 20; i++) {
            vet[i] = sc.nextInt();
        }
        for (int i = 0; i < 20; i++) {
            if (vet[i] % 2 != 0) {
                System.out.print(vet[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < 20; i += 2) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();
    }

 public static void vetoresQ9() {
        int[] vet = new int[100];
        int qtd = 0;
        int num = 1;

        while (qtd < 100) {
            if (num % 7 != 0 || num % 10 == 7) {
                vet[qtd] = num;
                qtd++;
            }
            num++;
        }

        for (int i = 0; i < 100; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();
    }

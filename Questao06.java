public static void vetoresQ6() {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[20];
        int[] idades = new int[20];
        int soma = 0;

        for (int i = 0; i < 20; i++) {
            nomes[i] = sc.next();
            idades[i] = sc.nextInt();
            soma += idades[i];
        }

        double media = (double) soma / 20;
        System.out.println(media);
        for (int i = 0; i < 20; i++) {
            if (idades[i] > media) {
                System.out.println(nomes[i]);
            }
        }
    }

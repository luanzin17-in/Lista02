public static void vetoresQ11() {
        Scanner sc = new Scanner(System.in);
        double[] v = new double[10];
        double soma = 0;

        for (int i = 0; i < 10; i++) {
            v[i] = sc.nextDouble();
            soma += v[i];
        }

        double m = soma / 10;
        double somaVariancia = 0;

        for (int i = 0; i < 10; i++) {
            somaVariancia += Math.pow(v[i] - m, 2);
        }

        double desvioPadrao = Math.sqrt(somaVariancia / 10);
        System.out.println(desvioPadrao);
    }


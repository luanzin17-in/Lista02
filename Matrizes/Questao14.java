 public static void matrizesQ14() {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String nome = sc.next();
            int faltas = 0;
            StringBuilder diasFaltados = new StringBuilder();

            for (int dia = 1; dia <= 30; dia++) {
                String presencia = sc.next();
                if (presencia.equalsIgnoreCase("F")) {
                    faltas++;
                    diasFaltados.append(dia).append(" ");
                }
            }

            if (faltas > 10) {
                System.out.println(nome + " - dias: " + diasFaltados.toString().trim());
            }
        }
    }
}

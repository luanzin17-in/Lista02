 public static void vetoresQ12() {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        int pos = 0;

        while (pos < 10) {
            int num = sc.nextInt();
            boolean existe = false;

            for (int i = 0; i < pos; i++) {
                if (v[i] == num) {
                    existe = true;
                    break;
                }
            }

            if (!existe) {
                v[pos] = num;
                pos++;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

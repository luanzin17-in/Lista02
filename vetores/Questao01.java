import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

class lista_02 {

    public static void main(String[] args) {
    }

   
    public static void vetoresQ1() {
        int[] A = {1, 0, 5, -2, -5, 7};
        int soma = A[0] + A[1] + A[5];
        System.out.println(soma);

        A[4] = 100;

        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }

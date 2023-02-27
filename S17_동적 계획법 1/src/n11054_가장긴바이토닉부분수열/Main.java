package n11054_가장긴바이토닉부분수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        String[] arr = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(arr[i]);
        }

        int[] dpUp = new int[N];
        int[] dpDown = new int[N];

        for (int i = 0; i < N; i++) {
            dpUp[i] = 1;

            for (int j = 0; j < i; j++) {
                if (A[j] < A[i] && dpUp[i] < dpUp[j] + 1) {
                    dpUp[i] = dpUp[j] + 1;
                }
            }
        }

        for (int i = N - 1; i >= 0; i--) {
            dpDown[i] = 1;

            for (int j = N - 1; j > i; j--) {
                if (A[j] < A[i] && dpDown[i] < dpDown[j] + 1) {
                    dpDown[i] = dpDown[j] + 1;
                }
            }
        }


        int max = 0;
        for (int i = 0; i < N; i++) {
            if (dpUp[i] + dpDown[i] > max) {
                max = dpUp[i] + dpDown[i];
            }
        }
        System.out.println(max - 1);
    }
}

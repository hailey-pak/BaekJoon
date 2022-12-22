package n2580_스도쿠;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[][] sudoku;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        sudoku = new int[9][9];

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);
    }

    static void dfs(int row, int col) {
        if (col == 9) {
            dfs(row + 1 , 0);
            return;
        }

        if (row == 9) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sb.append(sudoku[i][j]).append(' ');
                }
                sb.append('\n');
            }
            System.out.println(sb);
            System.exit(0);
        }

        if (sudoku[row][col] == 0) {
            for(int i = 1 ; i <= 9 ; i++) {
                if(check(row, col, i)) {
                    sudoku[row][col] = i;
                    dfs(row, col+1);
                }
            }
            sudoku[row][col] = 0;
            return;
        }

        dfs(row, col+1);
    }

    static boolean check(int row, int col, int value) {
        //행 비교
        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == value) {
                return false;
            }
        }

        //열 비교
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == value) {
                return false;
            }
        }

        //3x3 비교
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (sudoku[i][j] == value) {
                    return false;
                }
            }
        }

        return true;
    }

}

package com.Thread;

class MatrixMultiplicationThread extends Thread {
    private int[][] A, B, result;
    private int row, col, size;

    public MatrixMultiplicationThread(int[][] A, int[][] B, int[][] result, int row, int col, int size) {
        this.A = A;
        this.B = B;
        this.result = result;
        this.row = row;
        this.col = col;
        this.size = size;
    }

    public void run() {
        for (int k = 0; k < size; k++) {
            result[row][col] += A[row][k] * B[k][col];
        }
    }
}

public class MultiThreadMatrixMultiplication {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2},
            {3, 4}
        };
        int[][] B = {
            {5, 6},
            {7, 8}
        };
        int size = A.length;
        int[][] result = new int[size][size];

        Thread[][] threads = new Thread[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                threads[i][j] = new MatrixMultiplicationThread(A, B, result, i, j, size);
                threads[i][j].start();
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                try {
                    threads[i][j].join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

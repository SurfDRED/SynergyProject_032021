package ru.synergyitacademy.lesson5;

public class Matrix {
    //возврат единичной матрицы (через статичное поле и метод)
    static int[][] matrixUnit;

    static {
        matrixUnit = new int[][]{{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};
    }

    public static int[][] getMatrixUnit() {
        return matrixUnit;
    }

    //параметры матрицы произвольной размерности m x n
    private int m , n;
    //двумерный массив, хранящий элементы матрицы
    private int[][] userMatrix;

    //9. метод возврата размерностей матриц (геттеры размерности)
    public int getM() {
        return m;
    }
    //9. метод возврата размерностей матриц (геттеры размерности)
    public int getN() {
        return n;
    }

    public int[][] getUserMatrix() {
        return userMatrix;
    }

    // конструктор массив 2 x 2 (квадратная матрица)
    public Matrix() {
        this.m = 2;
        this.n = 2;
        this.userMatrix = new int[this.m][this.n];
    }
    //конструктор перегруженный произвольная матрица m x n
    public Matrix(int m, int n) {
        this.m = m;
        this.n = n;
        this.userMatrix = new int[this.m][this.n];
    }

    //Сложение матриц
    public int[][] MatrixAdd(int[][] matrixAdd) {
        int[][] result = new int[this.m][this.n];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = userMatrix[i][j] + matrixAdd[i][j];
            }
        }
        return result;
    }
    //Разница матриц
    public int[][] MatrixDelete(int[][] matrixDelete) {
        int[][] result = new int[this.m][this.n];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = userMatrix[i][j] - matrixDelete[i][j];
            }
        }
        return result;
    }

    //Умножение матриц на число
    public int[][] MatrixMultiplicationNumber(int number, int[][] matrixMultiNumber) {
        int[][] result = new int[this.m][this.n];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = matrixMultiNumber[i][j] * number;
            }
        }
        return result;
    }

    //Умножение матриц только если число столбцов матрицы A равно числу строк B
    public int[][] MatrixMultiplication(int[][] matrixMultiplication) {
        int[][] result = new int[this.m][this.n];
            for (int i = 0; i < userMatrix.length; i++) {
                for (int j = 0; j < matrixMultiplication[0].length; j++) {
                    for (int n = 0; n < matrixMultiplication.length; n++) {
                        result[i][j] += userMatrix[i][n] * matrixMultiplication[n][j];
                    }
                }
            }
            return result;
    }

    //Возведение матрицы в степень
    public int[][] MatrixSquaring(int step, int[][] matrixSquaring) {
        int[][] m1 = new int[this.m][this.n];
        int[][] m2 = new int[this.m][this.n];
        for (int x = 0; x < matrixSquaring.length; x++) {
            for (int y = 0; y < matrixSquaring[0].length; y++) {
                m1[x][y] = matrixSquaring[x][y];
                m2[x][y] = matrixSquaring[x][y];
            }
        }
        int[][] m3 = new int[this.m][this.n];

        for (int k = 2; k <= step; k++) {
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m2[0].length; j++) {
                    for (int n = 0; n < m2.length; n++) {
                        m3[i][j] += m1[i][n] * m2[n][j];
                    }
                }
            }
        // копирование массива
            if (k != step) {
                for (int x = 0; x < m3.length; x++) {
                    for (int y = 0; y < m3[0].length; y++) {
                        m1[x][y] = m3[x][y];
                        m3[x][y] = 0;
                    }
                }
            }
        }
        return m3;
    }

    //Вычисление определителя 2x2
    public int MatrixDeterminantA(int[][] matrixDeterminant) {
        int result;
        result = matrixDeterminant[0][0] * matrixDeterminant[1][1] - matrixDeterminant[0][1] * matrixDeterminant[1][0];
        return result;
    }
    //Вычисление определителя 3x3
    public int MatrixDeterminantB(int[][] matrixDeterminant) {
        int result;

        result = matrixDeterminant[0][0] * matrixDeterminant[1][1] * matrixDeterminant[2][2] +
                matrixDeterminant[0][1] * matrixDeterminant[1][2] * matrixDeterminant[2][0] +
                matrixDeterminant[0][2] * matrixDeterminant[1][0] * matrixDeterminant[2][1] -
                (matrixDeterminant[2][0] * matrixDeterminant[1][1] * matrixDeterminant[0][2] +
                        matrixDeterminant[2][1] * matrixDeterminant[1][2] * matrixDeterminant[0][0] +
                        matrixDeterminant[2][2] * matrixDeterminant[1][0] * matrixDeterminant[0][1]);

        return result;
    }
    //8. Печать элементов матриц в консоль (форматированный вывод)
    public void MatrixPrint(int[][] matrixPrint) {
        for (int i = 0; i < matrixPrint.length; i++) {
            for (int j = 0; j < matrixPrint[i].length; j++) {
                System.out.printf("%6d ", matrixPrint[i][j]);
            }
            System.out.println();
        }
    }
}
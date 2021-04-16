package ru.synergyitacademy.lesson5;

public class Solution {

    public static void main(String[] args){
        int number = 5; // умножение матрицы на число
        int degree = 3; // возведение в степень
        Matrix matrixA = new Matrix();  //конструктор - по умолчанию - создается массив 2 x 2
        int[][] userMatrixA = new int[2][2]; //массив 2 x 2 (квадратная матрица пользователя)
        completionMatrix(matrixA.getUserMatrix());
        completionMatrix(userMatrixA);

        Matrix matrixB = new Matrix(3,3); //конструктор перегруженный - произвольная матрица m x n
        int[][] userMatrixB = new int[3][3]; //массив m x n (пользователя)
        completionMatrix(matrixB.getUserMatrix());
        completionMatrix(userMatrixB);

        //Матрицы 2х2
        System.out.println("Размер матрицы А: " + matrixA.getM() + " х " + matrixA.getN());
        matrixA.MatrixPrint(matrixA.getUserMatrix());
        System.out.println("Размер матрицы В: " + userMatrixA.length + " х " + userMatrixA[0].length);
        matrixA.MatrixPrint(userMatrixA);
        System.out.println("--------------------------------------------------------");
        //1. Сложение матриц и вывод в консоль
        System.out.println("Сумма матриц А и В:");
        matrixA.MatrixPrint(matrixA.MatrixAdd(userMatrixA));
        System.out.println("--------------------------------------------------------");
        //2. Разница матриц и вывод в консоль
        System.out.println("Разность матриц А и В:");
        matrixA.MatrixPrint(matrixA.MatrixDelete(userMatrixA));
        System.out.println("--------------------------------------------------------");
        //3. Умножение матриц на число
        System.out.println("Умножение матрицы А на число: " + number);
        matrixA.MatrixPrint(matrixA.MatrixMultiplicationNumber(number, matrixA.getUserMatrix()));
        System.out.println("Умножение матрицы B на число: " + number);
        matrixA.MatrixPrint(matrixA.MatrixMultiplicationNumber(number, userMatrixA));
        System.out.println("--------------------------------------------------------");
        //4. Умножение матриц
        System.out.println("Умножение матрицы А на матрицу В:");
        try {
            matrixA.MatrixPrint(matrixA.MatrixMultiplication(userMatrixA));
        } catch (Exception e) {
            System.out.println("Ошибка! Число столбцов матрицы A:" + matrixA.getM() + " не равно числу строк матрицы B: " + userMatrixA[0].length);
        }
        System.out.println("--------------------------------------------------------");
        //5. Возведение матриц в степень
        System.out.println("Возведение в степень " + degree + " матрицы А:");
        matrixA.MatrixPrint(matrixA.MatrixSquaring(degree, matrixA.getUserMatrix()));
        System.out.println("Возведение в степень " + degree + " матрицы В:");
        matrixA.MatrixPrint(matrixA.MatrixSquaring(degree, userMatrixA));
        System.out.println("--------------------------------------------------------");

        //Матрицы m х n
        System.out.println("Размер матрицы А: " + matrixB.getM() + " х " + matrixB.getN());
        matrixB.MatrixPrint(matrixB.getUserMatrix());
        System.out.println("Размер матрицы В: " + userMatrixB.length + " х " + userMatrixB[0].length);
        matrixB.MatrixPrint(userMatrixB);
        System.out.println("--------------------------------------------------------");
        //1. Сложение матриц и вывод в консоль
        System.out.println("Сумма матриц А и В:");
        matrixB.MatrixPrint(matrixB.MatrixAdd(userMatrixB));
        System.out.println("--------------------------------------------------------");
        //2. Разница матриц и вывод в консоль
        System.out.println("Разность матриц А и В:");
        matrixB.MatrixPrint(matrixB.MatrixDelete(userMatrixB));
        System.out.println("--------------------------------------------------------");
        //3. Умножение матриц на число
        System.out.println("Умножение матрицы А на число: " + number);
        matrixB.MatrixPrint(matrixB.MatrixMultiplicationNumber(number, matrixB.getUserMatrix()));
        System.out.println("Умножение матрицы B на число: " + number);
        matrixB.MatrixPrint(matrixB.MatrixMultiplicationNumber(number, userMatrixB));
        System.out.println("--------------------------------------------------------");
        //4. Умножение матриц
        System.out.println("Умножение матрицы А на матрицу В:");
        try {
            matrixB.MatrixPrint(matrixB.MatrixMultiplication(userMatrixB));
        } catch (Exception e) {
            System.out.println("Ошибка! Число столбцов матрицы A:" + matrixB.getM() + " не равно числу строк матрицы B: " + userMatrixB[0].length);
        }
        System.out.println("--------------------------------------------------------");
        //5. Возведение матриц в степень
            System.out.println("Возведение в степень " + degree + " матрицы А:");
            matrixB.MatrixPrint(matrixB.MatrixSquaring(degree, matrixB.getUserMatrix()));
            System.out.println("Возведение в степень " + degree + " матрицы В:");
            matrixB.MatrixPrint(matrixB.MatrixSquaring(degree, userMatrixB));
        System.out.println("--------------------------------------------------------");
        //6. Возврат единичной матрицы (через статичное поле и метод)
        System.out.println("Возврат единичной матрицы (через статичное поле и метод)");
        matrixA.MatrixPrint(Matrix.getMatrixUnit());
        System.out.println("--------------------------------------------------------");
        //7. Вычисление определителя 2х2 или 3х3
        System.out.println("Вычисление определителя матрицы А - 2х2");
        System.out.println(matrixA.MatrixDeterminantA(matrixA.getUserMatrix()));
        System.out.println("Вычисление определителя матрицы B - 2х2");
        System.out.println(matrixA.MatrixDeterminantA(userMatrixA));
        if (matrixB.getN() == 3 & matrixB.getM() == 3) {
            System.out.println("Вычисление определителя матрицы А - 3х3");
            System.out.println(matrixB.MatrixDeterminantB(matrixB.getUserMatrix()));
        } else {
            System.out.println("Размер матрицы не 3 х 3");
        }
        if (userMatrixB.length == 3 & userMatrixB[0].length == 3) {
            System.out.println("Вычисление определителя матрицы B - 3х3");
            System.out.println(matrixB.MatrixDeterminantB(userMatrixB));
        } else {
            System.out.println("Размер матрицы не 3 х 3");
        }
    }

    //Рандомное заполнение матрицы от 0 до 10
    public static int[][] completionMatrix(int[][] inputM){
        for (int i = 0; i < inputM.length; i++) {
            for (int j = 0; j < inputM[i].length; j++) {
                inputM[i][j] = (int) (Math.random() * 10);
            }
        }
        return inputM;
    }
}
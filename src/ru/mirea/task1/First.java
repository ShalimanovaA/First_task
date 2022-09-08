package ru.mirea.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class First {
    public static int getFactorial(int n){//метод факториала, задание 7
        int k=1;
        for (int i=n;i>1;i--){
            k*=i;
        }
        return k;
    }
    public static void main(String[] args) {
        System.out.println("Task 3");//3 задание на подсчет суммыразными способами
        int[] arr = new int[10];
        int sum=0;
        for (int i = 0; i <arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.println("Array = " + Arrays.toString(arr));
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum(for) :" + sum);
        int i=0;sum=0;
        while(i<arr.length){
            sum+=arr[i];
            i++;
        }
        System.out.println("Sum(while) :" + sum);sum=0;i=0;
        do{
            sum+=arr[i];
            i++;
        }while(i<arr.length);
        System.out.println("Sum(do ... while) :" + sum);sum=0;
        System.out.println("Task 4");//4 задание на вывод аргументов командной строки
        System.out.println("Argument count: " + args.length);
        for (i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
        System.out.println("Task 5");//5 задание форматированный вывод первых10 чисел гармонического ряда
        for (i = 1; i < 11; i++) {
            System.out.format(" '%s' number: %.3f; ",i,1./i);
        }
        System.out.println("Task 6");//6 задание заполнение массива рандомными числами и сортировка

        for (i = 0; i <arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("Array(Math) = " + Arrays.toString(arr));

        java.util.Arrays.sort(arr);
        System.out.println("Array(Sorted) = " + Arrays.toString(arr));

        Random objGenerator = new Random();
        for (i = 0; i< arr.length; i++){
            arr[i] = objGenerator.nextInt(100);
        }
        System.out.println("Array(Random) = " + Arrays.toString(arr));
        java.util.Arrays.sort(arr);
        System.out.println("Array(Sorted) = " + Arrays.toString(arr));

        System.out.println("Task 7");//7 задание с помощью метода найти факториал числа
        Scanner scanner = new Scanner(System.in);
        System.out.println("Факториал какого числа найти?");
        int n = scanner.nextInt();
        System.out.println("Факториал числа "+n+ " = " + getFactorial(n));
    }
}


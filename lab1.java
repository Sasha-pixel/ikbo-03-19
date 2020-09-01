package ru.mirea.lab1;
import java.util.Arrays;
import java.util.Scanner;

public class lab1 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        int i = 0;
        //задание 1
        System.out.print("Задание 1 и 4:\n");
        int[] arr=new int[10];
        int summ1 = 0, summ2 = 0,summ3 = 0;
        for (i=0;i<10;i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
        lab1.sort(arr);
        for (i=0;i<10;i++)
            summ1+=arr[i];
        i=0;
        while(i<10) {
            summ2 += arr[i];
            i++;
        }
        i = 0;
        do {
            summ3+=arr[i];
            i++;
        }while(i<10);
        System.out.print("\n"+summ1+" "+summ2+" "+summ3+"\n");

        //задание 2
        System.out.print("\nЗадание 2:\n");
        for (i=0;i<args.length;i++)
            System.out.print(args[i]+" ");

        //Задание 3
        System.out.print("\nЗадание 3:\n");
        double garm = 0;
        for (i=1;i<=10;i++) {
            garm = (double)1 / i;
            System.out.print(garm + " ");
        }

        //Задание 5
        System.out.print("\nЗадание 5:\n");
        int a;
        a=scan.nextInt();
        lab1.fact(a);
    }

    public static void fact(int a){
        if (a==0)
            System.out.print(0);
        else {
            int fac=1;
            for (int j = 1; j <= a; j++)
                fac*=j;
            System.out.print(fac);
        }
    }

    public static void sort(int []arr){
        int buf;
        for (int i=0;i<10;i++){
            for (int j=i;j<10;j++){
                if (arr[i]>arr[j]) {
                    buf = arr[i];
                    arr[i]=arr[j];
                    arr[j]=buf;
                }
            }
        }
        for (int i=0;i<10;i++)
            System.out.print(arr[i]+" ");
    }
}



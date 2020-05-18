package com;

import java.util.Scanner;

/**
 * 判断一个整数是否为对称数
 */
public class SymNumber {
    public static Integer Num(Integer num) {
        int count = 0;
        while (num >= 1) {
            num = num / 10;
            count++;
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        Integer n = Num(i);
        if (n < 2) {
            System.out.println("yes");
        } else {
            int a[] = new int[n];
            int m = i;
            for (int x = 0; x < n; x++) {
                int z = (int) Math.pow(10, n - 1 - x);
                a[x] = m / z;
                m = m % z;
            }
            int j;
            for (j = 0; j < n; j++) {
                if (a[j] != a[n - j - 1]) {
                    System.out.println("NO");
                    break;
                } else if (j == n - 1 && a[j] == a[n - j - 1])
                    System.out.println("YES");
            }
        }


    }
}

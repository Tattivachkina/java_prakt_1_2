package ru.Tattivachkina.java.pr10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
        ex8();
        ex9();
        ex10();
        ex11();
        ex12();
        ex13();
        ex14();
        ex15();
        ex16();
        ex17();
    }

    public static void ex1() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = 0;
        for (int i = 1; i < n + 1; i++) {
            while (k < i) {
                System.out.print(i + " ");
                k++;
            }
            k = 0;
        }
        System.out.println();
    }

    public static void ex2() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void ex3() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a < b) {
            for (int i = a; i < b + 1; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = a; i > b - 1; i--) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void ex4() {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int s = scan.nextInt();
        int count = 0;
        for (int i = (int) Math.pow(10, k - 1); i < (int) Math.pow(10, k); i++) {
            int sum = 0;
            int a = i;
            while (a != 0) {
                sum += a % 10;
                a = a / 10;
            }
            if (sum == s)
                count++;
        }
        System.out.println(count);
        System.out.println();
    }

    public static void ex5() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(ex5rec(n));
    }

    public static int ex5rec(int n) {
        if (n < 10) return n;
        else return (n % 10) + ex5rec(n / 10);
    }
    public static void ex6() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(ex6rec(n,2));
    }
    public static int ex6rec(int n, int i){
        if (n < 2) {
            System.out.println("NO");
        } else if (n == 2) {
            System.out.println("YES");
        } else if (n % i == 0) {
            System.out.println("NO");
        } else if (i < Math.sqrt(n)) {
            return ex6rec(n, i + 1);
        } else {
            System.out.println("YES");
        }
        return 0;
    }
    public static void ex7() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ex7rec(n, 2);
    }
    public static int ex7rec(int n1, int n) {
        int a;
        a = ex7rec2(n, 2);
        if (a== 0) return 0;
        if (n1 % a == 0 || n1 == 1) {
            System.out.print(a + " ");
            n1 = n1 / a;
            if (n1 == 1) return 0;
            ex7rec(n1, 2);
        } else ex7rec(n1, a + 1);
        return 0;
    }
    public static int ex7rec2(int n, int k) {
        if ((n == 2) || (n % k != 0) && (k >= Math.sqrt(n))) return n;
        else if (k < Math.sqrt(n)) ex7rec2(n, k + 1);
        else ex7rec2(n + 1, 2);
        return n;
    }
    public static void ex8() {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringBuffer buffer = new StringBuffer(s);
        buffer.reverse();
        String string = buffer.toString();
        if (s.equals(string)) System.out.println("YES");
        else System.out.println("NO");
    }

    public static void  ex9() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(ex9rec(a, b));
    }
    public static int ex9rec(int a, int b) {
        if (a-1 > b) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return ex9rec(a, b - 1) + ex9rec(a - 1, b - 1);
    }
    public static void ex10() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(ex10rel(n, 0));
    }
    public static int ex10rel(int n, int i) {
        if (n == 0) return i;
        else return ex10rel(n / 10, i * 10 + n % 10);
    }

    public static void ex11() {
        Scanner in = new Scanner(System.in);
        int k = 0;
        int count = 0;
        int n = in.nextInt();
        if (n == 0) count++;
        while (count != 2) {
            if (n != 0) count = 0;
            if (n == 1) k++;
            n = in.nextInt();
            if (n == 0) count++;
        }
        System.out.println(k);
    }

    public static int ex12() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) return 0;
        else if (n % 2 != 0) System.out.println(n);
        return ex12();
    }

    public static int ex13() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) return 0;
        System.out.println(n);
        n = in.nextInt();
        if (n == 0) return 0;
        return ex13();
    }

    public static void ex14() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ex14rec(n);
    }
    public static int ex14rec(int n) {
        if (n >= 10) ex14rec(n / 10);
        System.out.print(n % 10 + " ");
        return 0;
    }


    public static void ex16() {
        int a = 0;
        System.out.println(ex16rec(a));
    }
    public static int ex16rec(int a) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = n;
        int k = 1;
        while (n != 0) {
            if (n == max) k++;
            if (n > max) {
                max = n;
                k = 1;
            }
            n = in.nextInt();
        }
        a = k;
        return a;
    }

    public static void ex15() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ex15rec(n);
    }
    public static int ex15rec(int n) {
        if (n == 0) return 0;
        System.out.print((n % 10) + " ");
        ex15rec(n / 10);
        return 0;
    }

    public static void ex17() {
        int a = 0;
        System.out.println(ex17rec(a));
    }
    public static int ex17rec(int a) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = n;
        while (n != 0) {
            if (n > max) max = n;
            n = in.nextInt();
        }
        a = max;
        return a;
    }
}

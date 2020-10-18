package ru.Tattivachkina.java.pr10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ex = scan.nextInt();
        if(ex==1) {
            ex1();
        }
        if(ex==2) {
            ex2();
        }
        if(ex==3) {
            ex3();
        }
        if(ex==4) {
            ex4();
        }
        if(ex==5) {
            int n = scan.nextInt();
            System.out.println(ex5(n));
        }
        if(ex==6) {
            int n = scan.nextInt();
            System.out.println(ex6(n,2));
        }
        if(ex==7) {
            int n = scan.nextInt();
            ex7(n, 2);
        }
        if(ex==8) {
            ex8();
        }
        if(ex==9) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(ex9(a, b));
        }
        if(ex==10) {
            int n = scan.nextInt();
            System.out.println(ex10(n, 0));
        }
        if(ex==11) {
            ex11();
        }
        if(ex==12) {
            ex12();
        }
        if(ex==13) {
            ex13();
        }
        if(ex==14) {
            int n = scan.nextInt();
            ex14(n);
        }
        if(ex==15) {
            int n = scan.nextInt();
            ex15(n);
        }
        if(ex==16) {
            int a = 0;
            System.out.println(ex16(a));
        }
        if(ex==17) {
            int a = 0;
            System.out.println(ex17(a));
        }
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

    public static int ex5(int n) {
        if (n < 10) return n;
        else return (n % 10) + ex5(n / 10);
    }

    public static int ex6(int n, int i){
        if (n < 2) {
            System.out.println("NO");
        } else if (n == 2) {
            System.out.println("YES");
        } else if (n % i == 0) {
            System.out.println("NO");
        } else if (i < Math.sqrt(n)) {
            return ex6(n, i + 1);
        } else {
            System.out.println("YES");
        }
        return 0;
    }

    public static int ex7(int n1, int n) {
        int a;
        a = ex7rec2(n, 2);
        if (a== 0) return 0;
        if (n1 % a == 0 || n1 == 1) {
            System.out.print(a + " ");
            n1 = n1 / a;
            if (n1 == 1) return 0;
            ex7(n1, 2);
        } else ex7(n1, a + 1);
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

    public static int ex9(int a, int b) {
        if (a-1 > b) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return ex9(a, b - 1) + ex9(a - 1, b - 1);
    }

    public static int ex10(int n, int i) {
        if (n > 0) {
            i = i * 10 + n % 10;
            return ex10(n / 10, i);
        } else return i;
    }

    public static void ex11() {
        Scanner scan = new Scanner(System.in);
        int k = 0;
        int count = 0;
        int n = scan.nextInt();
        if (n == 0) count++;
        while (count != 2) {
            if (n != 0) count = 0;
            if (n == 1) k++;
            n = scan.nextInt();
            if (n == 0) count++;
        }
        System.out.println(k);
    }

    public static int ex12() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n == 0) return 0;
        else if (n % 2 != 0) System.out.println(n);
        return ex12();
    }

    public static int ex13() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n == 0) return 0;
        System.out.println(n);
        n = scan.nextInt();
        if (n == 0) return 0;
        return ex13();
    }

    public static int ex14(int n) {
        if (n >= 10) ex14(n / 10);
        System.out.print(n % 10 + " ");
        return 0;
    }

    public static int ex16(int a) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int max = n;
        int k = 1;
        while (n != 0) {
            if (n == max) k++;
            if (n > max) {
                max = n;
                k = 1;
            }
            n = scan.nextInt();
        }
        a = k;
        return a;
    }

    public static int ex15(int n) {
        if (n == 0) return 0;
        System.out.print((n % 10) + " ");
        ex15(n / 10);
        return 0;
    }

    public static int ex17(int a) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int max = n;
        while (n != 0) {
            if (n > max) max = n;
            n = scan.nextInt();
        }
        a = max;
        return a;
    }
}

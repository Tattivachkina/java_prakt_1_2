package ru.Tattivachkina.java.pr27.ex1;

public class Operations {
    private int result;
    public void addNum(int a, int b, char action) {
        try {
            switch (action) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b != 0) {
                        result =  a /b;
                    } else {
                        System.out.println("бесконечность");
                    }
                    break;
                default:
                    throw new Exception();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public int getResult() {
        return result;
    }
}
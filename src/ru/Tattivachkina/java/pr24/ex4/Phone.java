package ru.Tattivachkina.java.pr24.ex4;


public class Phone {
    private String numb;
    private String finalNumber="";

    public Phone(String numb) {
        this.numb = numb;
    }

    public void Return(){
        char[] chars = numb.toCharArray();
        int k=0;
        if (!numb.contains("+")){
            finalNumber+="+7";
            for (int i=1;i<chars.length;i++){
                if (i==4 || i==7) {finalNumber+="-";}
                finalNumber+=String.valueOf(chars[i]);
            }
        }
        else {
            finalNumber+="+";
            for (int i=1; i<chars.length - 7; i++){
                finalNumber+=String.valueOf(chars[i]);
            }
            finalNumber+="-";
            for (int i=chars.length-7;i<chars.length;i++) {
                if (k == 3) { finalNumber+="-";}
                k++;
                finalNumber+=String.valueOf(chars[i]);
            }
        }
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "finalNumber=" + finalNumber +
                '}';
    }
}
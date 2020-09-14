package ru.Tattivachkina.java.pr3.ex2;

public class Human {
    public static void main(String[] args) {
        Leg leg= new Leg(37);
        Hand hand = new Hand("Apple watch");
        Head head= new Head("Black","Green");
        System.out.println("Leg: "+leg.getSizeLeg()+ "\nHand: "+ hand.getClock()+
                "\nHead:\n eyes: "+head.getEyes()+"\n hair: "+head.getHair());
    }
}

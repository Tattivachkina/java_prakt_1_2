package ru.Tattivachkina.java.pr21.ex1;

abstract class Factory implements ComplexFactory {
    public Complex create(){
        return new Complex();
    }

    @Override
    public Complex create(int re, int im) {
        return new Complex();
    }
}

package ru.Tattivachkina.java.pr20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conversion <T> {

    private List<T> list = new ArrayList<>();

    public Conversion(T[] array) {
        list.addAll(Arrays.asList(array));
    }

    public void showList() {
        for (Object ls : list) {
            System.out.print(ls + " ");
        }
        System.out.println();
    }

    public void add(T element) {
        list.add(element);
    }

    public List getList() {
        return list;
    }

    public T showIndex(int index){
        return list.get(index);
    }

    public void show(){
        int i=0;
        for (Object ls : list){
            if (i<5) {
                System.out.println(ls);
                i++;
            }
        }
    }
}

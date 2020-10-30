package ru.Tattivachkina.java.pr15;

public class List<T> {
    private final int initSize = 16;
    private final int drop = 4;
    private Object[] arr = new Object[initSize];
    private int count = 0;

    public void add(T item) {
        if (count == arr.length - 1)
            resize(arr.length * 2);
        arr[count++] = item;
    }

    public T get(int index) {
        return (T) arr[index];
    }

    public void remove(int index) {
        for (int i = index; i < count; i++)
            arr[i] = arr[i + 1];
        arr[count] = null;
        count--;
        if (arr.length > initSize && count < arr.length / drop)
            resize(arr.length / 2);
    }
    
    public int size() {
        return count;
    }
    private void resize(int newLength) {
        Object[] newarr = new Object[newLength];
        System.arraycopy(arr, 0, newarr, 0, count);
        arr = newarr;
    }
}

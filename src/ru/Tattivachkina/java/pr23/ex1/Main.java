package ru.Tattivachkina.java.pr23.ex1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("aaa", "bbb");
        dictionary.put("ccc", "ddd");
        dictionary.put("aad", "ddd");
        dictionary.put("fff", "sdf");
        dictionary.put("gfg", "sfs");
        dictionary.put("rty", "dse");
        dictionary.put("esg", "dse");
        dictionary.put("vsa", "hjk");
        dictionary.put("vcx", "hjk");

        Map<String, String> dictionary2 = new HashMap<>();
        for (Iterator<String> iterator = dictionary.keySet().iterator(); iterator.hasNext(); ) {
            String key = iterator.next();
            String value = dictionary.get(key);
            if (!dictionary2.containsValue(value))
                dictionary2.put(key, value);
        }
        System.out.println(dictionary2);
    }
}

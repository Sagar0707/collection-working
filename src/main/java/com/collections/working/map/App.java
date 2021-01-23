package com.collections.working.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Map<Key,String> data = new HashMap<>();
        data.put(new Key("test1"), "test1value");
        data.put(new Key("test2"), "test2value");
        data.put(new Key("test3"), "test3value");
        data.put(new Key("test4"), "test4value");
        data.put(new Key("test5"), "test5value");
        data.put(new Key("test6"), "test6value");
        data.put(new Key("test7"), "test7value");
        data.put(new Key("test8"), "test8value");
        data.put(new Key("test9"), "test9value");
        data.put(new Key("test10"), "test10value");
        data.put(new Key("test11"), "test11value");
        
        System.out.println(data.get(new Key("test16")));
        System.out.println(data.size());
        
    }
}

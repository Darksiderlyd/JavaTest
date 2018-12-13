package com.xiaoyu;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
//       Animal move = new People();

//        People people = new People();
//        Animal animal = new Animal();
//
//        if (animal.isAnimal()) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//        String s = "dasdasd\nasfjsngdajf\nsahfbdfbahsd\n";
//        System.out.println(s);
//        System.out.println(s.replace("\n", ""));
//        System.out.println(getSavePath("http://dasda.das.dasd/fajsd/fads.apk"));

//        System.out.println(String.format("https://%s/","a.xiaoqishen.com"));

//        Map<Integer, String> map = new HashMap<>();

//        map.put(1, "1212");
//        map.put(2, "dd");
//        map.put(3, "1asd212");
//        map.put(4, "1212dsa");
//        map.put(1, "asd");

//        Map<Integer, String> map2 = new HashMap<>();
//
//        map2.put(11, "1212");
//        map2.put(23, "dd");
//        map2.put(12, "1asd212");
//        map2.put(4, "1212dsa");
//        map2.put(1, "asd");
//
//        System.out.println(map.size());
//
//        Set<Map.Entry<Integer, String>> entries = map.entrySet();
//
//        for(Map.Entry<Integer, String> entry:entries){
//
//        }

//        System.out.println(map.size() + map.get(1));

//        List<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        list.add("4");
//        list.add("5");
//        removeSamePathFromPaths(list,"1");
//
//        String str1 = "2018092500";
//        String str2 = "2018092501";
//        System.out.println(str1.compareTo(str2));

//       String json = "";

        String url = "http://123/123";
        int i = url.indexOf(":");
        System.out.println(url.substring(i + 3));
    }

    public static String getSavePath(String url) {
        String fileName = "xqs_update.apk";
        if (url.contains(".") && url.contains("/")) {
            if (url.lastIndexOf("/") < url.lastIndexOf(".")) {
                fileName = url.substring(url.lastIndexOf("/") + 1, url.lastIndexOf("."));
            }
        }
        return fileName;
    }

    public static List<String> removeSamePathFromPaths(List<String> list, String y) {

        for (String pathGridModel : list) {
            if (pathGridModel.equals(y)) {
                list.remove(pathGridModel);
                break;
            }
        }
        for (String pathGridModel : list) {
            System.out.println(pathGridModel);
        }
        return list;
    }

}

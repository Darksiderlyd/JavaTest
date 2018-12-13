package com.xiaoyu;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] a = {444, 1313, 14232, 412354, 1234, 654, 654, 12, 1223, 1234, 555, 555, 444, 444};
        for (int i = 0; i < a.length; i++) {
            if (!list.contains(a[i])) {
                list.add(a[i]);
                System.out.println(a[i]);
            }
        }
    }

}

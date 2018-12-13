package com.xiaoyu;

public class Base implements Move{

    @Override
    public boolean isAnimal() {
        if (this instanceof Animal) {
            return true;
        } else {
            return false;
        }
    }
}

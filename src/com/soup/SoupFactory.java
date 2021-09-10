package com.soup;

public interface SoupFactory<T> {
     T makeSoup(String type);
}

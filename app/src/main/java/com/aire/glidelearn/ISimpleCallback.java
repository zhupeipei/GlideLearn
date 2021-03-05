package com.aire.glidelearn;

public interface ISimpleCallback extends ICallback {
    default void onError() {
        System.out.println("abcd");
    }
}

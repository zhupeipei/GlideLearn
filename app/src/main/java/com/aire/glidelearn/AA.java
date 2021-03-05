package com.aire.glidelearn;

public class AA {
    public static void  ma() {
        ICallback callback = new ISimpleCallback() {
            @Override
            public void onError() {
                System.out.println("asdasdsadsad");
            }
        };
        callback.onError();
    }
}

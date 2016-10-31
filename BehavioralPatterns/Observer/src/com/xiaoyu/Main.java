package com.xiaoyu;

import java.util.Observable;

/**
 * Created by gxytk on 2016/10/31.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Text: ");
        EventSource eventSource = new EventSource();
        eventSource.addObserver(
                (Observable obj, Object arg) -> System.out.println("Received response: " + arg)
        );
        new Thread(eventSource).start();
    }
}

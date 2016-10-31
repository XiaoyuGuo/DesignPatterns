package com.xiaoyu;

import java.util.Observable;
import java.util.Scanner;

/**
 * Created by gxytk on 2016/10/31.
 */
public class EventSource extends Observable implements Runnable {
    @Override
    public void run() {
        while(true) {
            String response = new Scanner(System.in).next();
            setChanged();
            notifyObservers(response);
        }
    }
}

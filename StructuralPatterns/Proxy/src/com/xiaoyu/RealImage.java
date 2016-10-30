package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 */
public class RealImage implements Image {
    private String filename = null;

    public RealImage(final String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    @Override
    public void displayImage() {
        System.out.println("Display   " + filename);
    }
}

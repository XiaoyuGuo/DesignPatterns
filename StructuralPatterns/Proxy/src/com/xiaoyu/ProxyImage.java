package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 */
public class ProxyImage implements Image {

    private RealImage image = null;
    private String filename = null;

    public ProxyImage(final String filename) {
        this.filename = filename;
    }
    @Override
    public void displayImage() {
        if(image == null) {
            image = new RealImage(filename);
        }
        image.displayImage();
    }
}

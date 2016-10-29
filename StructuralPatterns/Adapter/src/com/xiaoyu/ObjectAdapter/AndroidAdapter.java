package com.xiaoyu.ObjectAdapter;

/**
 * Created by gxytk on 2016/10/28.
 */
public class AndroidAdapter implements IphoneInterface {
    private Android android = new Android();

    @Override
    public void getIphoneInfo() {
        android.getAndroidInfo();
    }
}

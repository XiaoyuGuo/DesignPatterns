package com.xiaoyu.ClassAdapter;

/**
 * Created by gxytk on 2016/10/28.
 */
public class AndroidAdapter extends Android implements IphoneInterface {
    @Override
    public void getIphoneInfo() {
        getAndroidInfo();
    }
}

package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/30.
 */
public class VerticalScrollBarDecorator extends WindowDecorator {
    public VerticalScrollBarDecorator(Window windowToBeDecorated) {
        super(windowToBeDecorated);
    }

    @Override
    public void draw() {
        super.draw();
        drawVerticalScrollBar();
    }

    private void drawVerticalScrollBar() {

    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", and add vertical scroll bar";
    }
}

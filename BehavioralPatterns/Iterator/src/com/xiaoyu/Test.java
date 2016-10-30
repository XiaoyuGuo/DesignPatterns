package com.xiaoyu;

import java.util.Iterator;

/**
 * Created by gxytk on 2016/10/31.
 */
public class Test<T> implements Iterable<T> {
    private T[] array = null;

    public Test(T[] t){
        this.array = t;
    }
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            private Integer index = -1;
            @Override
            public boolean hasNext() {
                if(array.length < index + 2) {
                    return false;
                }
                return true;
            }

            @Override
            public T next() {
                index++;
                return array[index];
            }
        };
    }
}

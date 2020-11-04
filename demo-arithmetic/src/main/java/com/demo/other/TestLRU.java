package com.demo.other;

/**
 * @author wangzezhou
 * @create 2020-05-21 6:10 PM
 * @desc 手写Lru算法
 **/
public class TestLRU {
    //定义内存块数
    public static final int N = 5;

    Object[] array = new Object[N];

    private int size;

    public TestLRU() {
        size = 0;
    }

    public boolean isEmpty() {

        if(size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOutOfBoundary() {

        if(size >= N) {
            return true;
        } else {
            return false;
        }
    }

    public int indexOfElement(Object o) {

        for(int i = 0; i < N; i++) {
            if(array[i] == o) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 压入栈的数据
     * @param o
     * @return
     */
    public Object push(Object o) {

        int t = -1;


        if(!isOutOfBoundary() && indexOfElement(o) == -1) {
            //栈未满
            array[size] = o;
            size++;
        } else if(isOutOfBoundary() && indexOfElement(o) == -1) {
            //栈已满
            for(int i=0; i<size-1; i++) {
                array[i] = array[i+1];
            }

            array[size-1] = o;
        } else {
            //栈中有匹配的数据
            t = indexOfElement(o);
            //并不是栈尾弹出，而是将匹配到的数据弹出
            for(int i=t; i<size-1; i++) {
                array[i] = array[i+1];
            }

            array[size-1] = o;
        }

        if(t != -1) {
            return array[t];
        } else {
            return null;
        }
    }

    public void showMemoryBlock() {

        for(int i=0; i<size; i++) {
            System.out.print(array[i] + " \t");
        }
    }

    public static void main(String[] args) {
        Integer iter[] = {4,7,0,7,1,0,1,2,1,2,6};
        TestLRU lru = new TestLRU();
        for(int i=0; i<iter.length; i++) {
            lru.push(iter[i]);
            lru.showMemoryBlock();
            System.out.println();
        }
    }
}

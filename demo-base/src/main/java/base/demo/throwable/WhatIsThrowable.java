package base.demo.throwable;

import base.demo.reflection.clazz.pojo.SimpleClass;

/**
 * @author wangzezhou
 * @create 2020-05-09 1:55 PM
 * @desc Exception跟Error的测试
 **/
public class WhatIsThrowable extends SimpleClass {

    public WhatIsThrowable() {

        super.getId();
    }



    public static void main(String[] args) {
        throw new RuntimeException("看看实现");
    }
}

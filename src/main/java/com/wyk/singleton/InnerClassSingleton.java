package com.wyk.singleton;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/3/16 15:11
 * @Modified By:
 */
public class InnerClassSingleton {

    private InnerClassSingleton() {
    }

    private static class SingletonInstance{
        public static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance(){
        return SingletonInstance.INSTANCE;
    }

}

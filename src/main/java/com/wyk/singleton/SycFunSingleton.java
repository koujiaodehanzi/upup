package com.wyk.singleton;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/3/16 15:14
 * @Modified By:
 */
public class SycFunSingleton {

    private static SycFunSingleton sycSingleton = null;

    private SycFunSingleton() {
    }

    public synchronized static SycFunSingleton getInstance(){
        if (sycSingleton == null){
            sycSingleton = new SycFunSingleton();
        }
        return sycSingleton;
    }

}

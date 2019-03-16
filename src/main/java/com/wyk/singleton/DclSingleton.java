package com.wyk.singleton;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/3/16 15:06
 * @Modified By:
 */
public class DclSingleton {

    private static  DclSingleton dclSingleton = null;

    private DclSingleton() {
    }

    public static DclSingleton getInstance(){
        if (dclSingleton == null){
            synchronized (DclSingleton.class){
                if (dclSingleton == null){
                    dclSingleton = new DclSingleton();
                }
            }
        }
        return dclSingleton;
    }
}

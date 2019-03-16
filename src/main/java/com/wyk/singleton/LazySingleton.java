package com.wyk.singleton;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/3/16 15:02
 * @Modified By:
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
    }

    public static LazySingleton getLazySingleton() {
        lazySingleton = new LazySingleton();
        return lazySingleton;
    }
}

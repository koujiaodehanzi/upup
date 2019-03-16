package com.wyk.singleton;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/3/16 14:56
 * @Modified By:
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySinleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getHungrySinleton() {
        return hungrySinleton;
    }
}

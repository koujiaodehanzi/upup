package com.wyk.factory.entity;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/3/16 13:23
 * @Modified By:
 */
public class SaloonCar implements ICar {

    @Override
    public void run() {
        System.out.println("小轿车启动=======");
    }
}

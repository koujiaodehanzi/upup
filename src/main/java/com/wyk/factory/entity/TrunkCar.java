package com.wyk.factory.entity;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/3/16 13:22
 * @Modified By:
 */
public class TrunkCar implements ICar {

    @Override
    public void run() {
        System.out.println("大卡车启动  ，，，");
    }

}

package com.wyk.factory.entity;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/3/16 13:21
 * @Modified By:
 */
public class JeepCar implements ICar  {

    @Override
    public void run() {
        System.out.println("吉普车启动=======");
    }

}

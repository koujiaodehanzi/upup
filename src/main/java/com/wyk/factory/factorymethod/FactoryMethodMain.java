package com.wyk.factory.factorymethod;

import com.wyk.factory.entity.ICar;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/3/16 13:46
 * @Modified By:
 */
public class FactoryMethodMain {

    public static void main(String[] args) {

        ICarFactory factory = new JeepCarFactory();

        ICar car = factory.createCar();

        car.run();

    }

}

package com.wyk.factory.simplefactory;

import com.wyk.factory.entity.ICar;
import com.wyk.factory.enums.CarEnum;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/3/16 13:33
 * @Modified By:
 */
public class SimpleFactoryMain {

    public static void main(String[] args) {

        CarFactory factory = new CarFactory();

        ICar jeepCar = factory.createCar(CarEnum.JEEP);
        ICar trunkCar = factory.createCar(CarEnum.TRUNK);
        ICar saloonCar = factory.createCar(CarEnum.SALOON);

        jeepCar.run();
        trunkCar.run();
        saloonCar.run();
    }

}

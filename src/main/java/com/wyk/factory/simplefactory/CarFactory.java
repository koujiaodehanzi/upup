package com.wyk.factory.simplefactory;

import com.wyk.factory.entity.ICar;
import com.wyk.factory.enums.CarEnum;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/3/16 13:28
 * @Modified By:
 */
public  class CarFactory {

    public ICar createCar(CarEnum carEnum) {

        ICar car = null;

        try {
            switch (carEnum){
                case JEEP: car = (ICar) CarEnum.JEEP.getClazz().newInstance();break;

                case TRUNK: car = (ICar) CarEnum.TRUNK.getClazz().newInstance();break;

                case SALOON: car = (ICar) CarEnum.SALOON.getClazz().newInstance();break;

                default: throw new Exception("不存在！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return car;

    }

}

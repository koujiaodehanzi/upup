package com.wyk.factory.factorymethod;

import com.wyk.factory.entity.ICar;
import com.wyk.factory.entity.JeepCar;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/3/16 13:44
 * @Modified By:
 */
public class JeepCarFactory extends ICarFactory {

    @Override
    public ICar createCar() {
        return new JeepCar();
    }

}

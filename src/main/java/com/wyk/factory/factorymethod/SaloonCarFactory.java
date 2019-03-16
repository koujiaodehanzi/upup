package com.wyk.factory.factorymethod;

import com.wyk.factory.entity.ICar;
import com.wyk.factory.entity.SaloonCar;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/3/16 13:46
 * @Modified By:
 */
public class SaloonCarFactory extends ICarFactory {

    @Override
    public ICar createCar() {
        return new SaloonCar();
    }

}

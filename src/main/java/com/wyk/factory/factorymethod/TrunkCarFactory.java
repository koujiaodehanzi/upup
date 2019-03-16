package com.wyk.factory.factorymethod;

import com.wyk.factory.entity.ICar;
import com.wyk.factory.entity.TrunkCar;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/3/16 13:45
 * @Modified By:
 */
public class TrunkCarFactory extends ICarFactory {

    @Override
    public ICar createCar() {
        return new TrunkCar();
    }

}

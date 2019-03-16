package com.wyk.factory.abstractfactory;

import com.wyk.factory.abstractfactory.entity.CarB;
import com.wyk.factory.abstractfactory.entity.ComputerB;
import com.wyk.factory.abstractfactory.entity.TelevisionB;
import com.wyk.factory.entity.ICar;
import com.wyk.factory.entity.IComputer;
import com.wyk.factory.entity.ITelevision;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/3/16 14:00
 * @Modified By:
 */
public class BFactory implements IFactory {
    @Override
    public ICar createCar() {
        return new CarB();
    }

    @Override
    public ITelevision createTelevison() {
        return new TelevisionB();
    }

    @Override
    public IComputer createComputer() {
        return new ComputerB();
    }
}

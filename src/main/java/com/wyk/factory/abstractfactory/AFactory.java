package com.wyk.factory.abstractfactory;

import com.wyk.factory.abstractfactory.entity.CarA;
import com.wyk.factory.abstractfactory.entity.ComputerA;
import com.wyk.factory.abstractfactory.entity.TelevisionA;
import com.wyk.factory.entity.ICar;
import com.wyk.factory.entity.IComputer;
import com.wyk.factory.entity.ITelevision;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/3/16 14:00
 * @Modified By:
 */
public class AFactory implements IFactory {
    @Override
    public IComputer createComputer() {
        return new ComputerA();
    }

    @Override
    public ICar createCar() {
        return new CarA();
    }

    @Override
    public ITelevision createTelevison() {
        return new TelevisionA();
    }
}

package com.wyk.factory.abstractfactory;

import com.wyk.factory.entity.ICar;
import com.wyk.factory.entity.IComputer;
import com.wyk.factory.entity.ITelevision;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/3/16 13:52
 * @Modified By:
 */
public interface IFactory {

    ICar createCar();

    ITelevision createTelevison();

    IComputer createComputer();

}

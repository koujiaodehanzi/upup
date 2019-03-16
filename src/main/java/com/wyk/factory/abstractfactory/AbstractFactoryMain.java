package com.wyk.factory.abstractfactory;

import com.wyk.factory.entity.ICar;
import com.wyk.factory.entity.IComputer;
import com.wyk.factory.entity.ITelevision;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/3/16 14:06
 * @Modified By:
 */
public class AbstractFactoryMain {

    public static void main(String[] args) {

        IFactory factoryA = new AFactory();
        ICar carA = factoryA.createCar();
        IComputer computerA = factoryA.createComputer();
        ITelevision televisonA = factoryA.createTelevison();

        carA.run();
        computerA.net();
        televisonA.show();


        System.out.println("======================================================");

        IFactory factoryB = new BFactory();
        ICar carB = factoryB.createCar();
        IComputer computerB = factoryB.createComputer();
        ITelevision televisonB = factoryB.createTelevison();

        carB.run();
        computerB.net();
        televisonB.show();
    }

}

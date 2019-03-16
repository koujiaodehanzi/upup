package com.wyk.factory.enums;

import com.wyk.factory.entity.JeepCar;
import com.wyk.factory.entity.SaloonCar;
import com.wyk.factory.entity.TrunkCar;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/3/16 13:18
 * @Modified By:
 */
public enum CarEnum {

    JEEP(JeepCar.class),
    TRUNK(TrunkCar.class),
    SALOON(SaloonCar.class);

    private Class clazz;

    CarEnum(Class clazz) {
        this.clazz = clazz;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }
}

package com.wyk.proxy.staticproxy;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/3/18 19:48
 * @Modified By:
 */
public class OrderDaoImpl implements OrderDao {

    @Override
    public void save() {
        System.out.println("保存订单信息！");
    }
}

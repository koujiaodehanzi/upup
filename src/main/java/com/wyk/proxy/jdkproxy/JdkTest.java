package com.wyk.proxy.jdkproxy;

import com.wyk.proxy.staticproxy.OrderDao;
import com.wyk.proxy.staticproxy.OrderDaoImpl;

import java.lang.reflect.Proxy;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/3/18 20:02
 * @Modified By:
 */
public class JdkTest {

    public static void main(String[] args) {
        OrderDao orderDao = new OrderDaoImpl();

        OrderDao proxy = (OrderDao) Proxy.newProxyInstance(orderDao.getClass().getClassLoader(), orderDao.getClass().getInterfaces(), new OrderDaoJdkProxy(orderDao));

        proxy.save();
    }

}

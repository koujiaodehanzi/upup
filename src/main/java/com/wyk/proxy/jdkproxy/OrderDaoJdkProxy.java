package com.wyk.proxy.jdkproxy;

import com.wyk.proxy.staticproxy.OrderDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/3/18 19:53
 * @Modified By:
 */
public class OrderDaoJdkProxy implements InvocationHandler {

    private OrderDao orderDao;

    public OrderDaoJdkProxy(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开启事务！");
        Object o = method.invoke(orderDao, args);
        System.out.println("提交事务！");
        return o;
    }

}

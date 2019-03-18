package com.wyk.proxy.cglibproxy;

import com.wyk.proxy.staticproxy.OrderDao;
import com.wyk.proxy.staticproxy.OrderDaoImpl;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/3/18 20:00
 * @Modified By:
 */
public class CglibTest {

    public static void main(String[] args) {
        OrderDao orderDao = new OrderDaoImpl();
        OrderDao proxy = (OrderDao) new OrderDaoCglibProxy(orderDao).getInstance();
        proxy.save();
    }

}

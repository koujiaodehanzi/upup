package com.wyk.proxy.staticproxy;


/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/3/18 19:50
 * @Modified By:
 */
public class OrderDaoProxy implements OrderDao {

    private OrderDao orderDao;

    public OrderDaoProxy(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    public void save() {
        System.out.println("开启事务！");
        orderDao.save();
        System.out.println("提交事务！");
    }
}

package com.wyk.proxy.cglibproxy;

import com.wyk.proxy.staticproxy.OrderDao;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/3/18 19:56
 * @Modified By:
 */
public class OrderDaoCglibProxy implements MethodInterceptor {

    private Object target;

    public OrderDaoCglibProxy(Object target) {
        this.target = target;
    }

    public Object getInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开启事务！");
        Object returnValue = method.invoke(target, objects);
        System.out.println("提交事务！");
        return returnValue;
    }
}

package com.wyk.observer;

import com.google.common.eventbus.EventBus;

/**
 * Created by Tom on 2019/3/17.
 */
public class GuavaEventTest {

    public static void main(String[] args) {
        //消息总线
        EventBus eventBus = new EventBus();

        GPer gPer = GPer.getInstance();
        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者设计模式");

        Teacher teacher = new Teacher("tom");

        eventBus.register(gPer);
        eventBus.register(teacher);

        eventBus.post(question);

        //从Struts到SpringMVC的升级
        //因为Struts面向的类，而SpringMVC面向的是方法

        //前面两者面向的是类，Guava面向是方法

        //能够轻松落地观察模式的一种解决方案
        //MQ
    }
}

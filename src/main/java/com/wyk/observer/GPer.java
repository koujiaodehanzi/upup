package com.wyk.observer;

import com.google.common.eventbus.Subscribe;



public class GPer{

    private String name = "GPer生态圈";
    private static GPer gper = null;
    private GPer(){}

    public static GPer getInstance(){
        if(null == gper){
            gper = new GPer();
        }
        return gper;
    }

    public String getName() {
        return name;
    }

    @Subscribe
    public void publishQuestion(Question question){
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
        System.out.println("=============================================================");
    }
}

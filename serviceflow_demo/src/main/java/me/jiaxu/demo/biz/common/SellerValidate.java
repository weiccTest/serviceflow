package me.jiaxu.demo.biz.common;

import me.jiaxu.demo.model.BaseRequest;
import me.jiaxu.serviceflow.ServiceUnit;
import me.jiaxu.serviceflow.annotation.In;

/**
 * Created by jiaxu.zjx on 2019/3/18
 * Description:
 */
public class SellerValidate implements ServiceUnit {

    @In private BaseRequest request;

    @Override
    public void before() {

    }

    @Override
    public void after() {

    }

    @Override
    public void process() {
        System.out.println(this.getClass().getName());
    }
}

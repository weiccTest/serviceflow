package me.jiaxu.demo.biz.payment;

import me.jiaxu.serviceflow.ServiceUnit;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by jiaxu.zjx on 2019/3/18
 * Description:
 */
@Service(value = "me.jiaxu.demo.biz.payment.DiscountCalculate")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class DiscountCalculate implements ServiceUnit {


    @Override
    public void before() {

    }

    @Override
    public void after() {

    }

    @Override
    public void process() {

    }
}

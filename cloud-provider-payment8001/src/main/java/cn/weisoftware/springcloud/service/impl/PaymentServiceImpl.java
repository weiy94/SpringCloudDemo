package cn.weisoftware.springcloud.service.impl;

import cn.weisoftware.springcloud.dao.PaymentDao;
import cn.weisoftware.springcloud.entities.Payment;
import cn.weisoftware.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

//    @Autowired
    @Resource//java自带也可进行依赖注入
    PaymentDao dao;

    @Override
    public int create(Payment payment) {
        return dao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return dao.getPaymentById(id);
    }
}

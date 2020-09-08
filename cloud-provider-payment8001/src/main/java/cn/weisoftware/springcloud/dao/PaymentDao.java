package cn.weisoftware.springcloud.dao;

import cn.weisoftware.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    //CRUD
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}

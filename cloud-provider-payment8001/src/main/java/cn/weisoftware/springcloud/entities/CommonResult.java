package cn.weisoftware.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/***
 * 前端通用实体json串
 * @param <T>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    //404 notfound
    private Integer code;
    private String message;
    private T date;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}

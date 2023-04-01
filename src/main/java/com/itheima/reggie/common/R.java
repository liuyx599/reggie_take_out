package com.itheima.reggie.common;

import lombok.Data;
import java.util.HashMap;
import java.util.Map;

/**
 * 通用返回结果，服务端响应的数据最终都会封装成此对象
 * @param <T>
 * R是类的名称，T代表泛型
 */
@Data
public class R<T> {  // R<T> 表示这是一个泛型类，把R<T>当作一个整体

    private Integer code; //编码：1成功，0和其它数字为失败

    private String msg; //错误信息

    private T data; // 如果T=String , 那么R对象就是R<String>，那么data成员变量的类型是 String

    private Map map = new HashMap(); //动态数据


    // 第一个<T>是泛型参数，替代参数中的T，  第二个R<T>当作一个整体，即R对象，作为该方法的返回值

    // 成功success与失败error哦都会返回一个新的R对象
    // SpringMVC会将其转为json对象放于response中
    public static <T> R<T> success(T object) {
        R<T> r = new R<T>();
        r.data = object;
        r.code = 1;
        return r;
    }

    public static <T> R<T> error(String msg) {
        R r = new R();
        r.msg = msg;
        r.code = 0;
        return r;
    }

    public R<T> add(String key, Object value) {
        this.map.put(key, value);
        return this;
    }

}

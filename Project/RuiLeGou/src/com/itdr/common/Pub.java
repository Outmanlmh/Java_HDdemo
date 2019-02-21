package com.itdr.common;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LiMingHang
 * @date2019.02.19 18:51.
 */
public class Pub<T> {
//    private Map map = new HashMap();
    //通过泛型，来接收不同类型的数据
    private T t;
    private  int tock;


    //成功标记
   public static final int SUCCESS_CODE = 100;
   public static final int FAIL_CODE = 300;


    /*
     * 1.这里我使用方法的时候，应该返回这个类的对象，对象中的成员变量map封装了数据和状态码
     * 2.那数据只能通过方法传递参数的形式传进来，传参可能是各种类型的对象或者数据
     * 这里应该写成什么样的参数比较好呢？
     * 3.这些方法都应该返回Pub类的对象，把数据封装到对象的成员变量中
     * 4.怎么把数据封装到成员变量map中呢?
     * */

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public int getTock() {
        return tock;
    }

    public void setTock(int tock) {
        this.tock = tock;
    }

//    public Map getMap() {
//        return map;
//    }
//
//    public void setMap(Map map) {
//        this.map = map;
//    }

    //成功返回数据
    public static <E> Pub success(E e) {
        //创建对象
        Pub<E> p = new Pub();
     //   p.map.put(t, SUCCESS_CODE);
        p.setT(e);
        //设置状态码
        p.setTock(SUCCESS_CODE);
        //返回封装好数据的对象
        return p;
    }

    //失败返回数据
    public static Pub fail(String s) {
        //创建对象
        Pub<String> p = new Pub();
      //  p.map.put(s, FAIL_CODE);
        p.setT(s);
        p.setTock(FAIL_CODE);
        return p;
    }

}

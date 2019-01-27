package com.itdr.FirstProject.JDdemo.domain;

    //购物车数据库
public class ShopCar {
    //序号
    private int id;
    //用户名
    private  String uname;
    //商品id
    private int pid;
    //商品数量
    private  int pnum;
    //总价格
    private double sum;

    public ShopCar(int id,String uname,int pid,int pnum,double sum){
        this.id=id;
        this.uname=uname;
        this.pid=pid;
        this.pnum=pnum;
        this.sum=sum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getPnum() {
        return pnum;
    }

    public void setPnum(int pnum) {
        this.pnum = pnum;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "ShopCar{" +
                "id=" + id +
                ", uname=" + uname +
                ", pid=" + pid +
                ", pnum=" + pnum +
                ", sum=" + sum +
                '}';
    }
}

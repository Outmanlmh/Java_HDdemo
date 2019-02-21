package com.itdr.service.qiantai;


import com.itdr.common.Pub;
import com.itdr.data.ProductData;
import com.itdr.data.ProductDataImp;
import com.itdr.domain.Product;


import java.util.ArrayList;

/**
 * @作者：AirZhang
 * @日期：2019/1/30
 * @用知识武装头脑
 */
public class ProductServiceImp implements ProductService {

    //
    private ProductData pd = new ProductDataImp();


    //展示所有商品的信息
    @Override
    public ArrayList<Product> showAll() {
        ArrayList<Product> li = pd.selectAll();
        if (li != null || li.size() != 0) {
            return li;
        }
        return null;
    }

    @Override
    public Product showOne(int i) {
        Product pro = pd.selectOne(i);
        if(pro==null || pro.getSign()==0){
            return  null;
        }
        return pro;
    }

    @Override
    public Product searchOne(String str) {
        Product pro = pd.searchOne(str);
        if (pro.getPname().contains(str)) {
            return pro;
        }
        return null;
    }

    @Override
    public Pub selectMore(String str) {
        ArrayList<Product> li = pd.selectMore(str);
        Pub p=Pub.fail("您搜索的商品不存在");
        if (li != null && li.size() != 0) {
            p = Pub.success(li);
            return p;
        }
        return p;
    }
}

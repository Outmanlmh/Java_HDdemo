package com.neuedu.pojo;

import com.neuedu.utils.PageBean;
import lombok.Data;

/**
 * @author LiMingHang
 * @date2019.03.05 12:26.
 */
@Data
public class User  extends PageBean {
    private Integer id;
    private String uname;
    private String password;
    private String tele;
    private Integer sex;


}

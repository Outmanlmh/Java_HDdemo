package com.neuedu.dao;

import java.sql.ResultSet;

/**
 * @author LiMingHang
 * @date2019.03.04 19:09.
 */
public interface RowMap<T>  {
    public T RowMapping(ResultSet rs);
}

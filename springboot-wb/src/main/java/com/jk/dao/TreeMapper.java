package com.jk.dao;

import com.jk.model.Journal;
import com.jk.model.MenuTree;
import com.jk.model.Power;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * Created by Mr.wangbin on 2017/11/14.
 */
@Mapper
public interface TreeMapper {

    @Select("select * from t_menu")
    public List<Power> treelist();

    @Select("select * from t_journal")
    public List<Journal> jourList();


    @Select("select * from t_journal limit ${page},${rows}")
    List<Journal> pageList(Map map);
}

package com.jk.service.imp;

import com.jk.dao.TreeMapper;
import com.jk.model.Journal;
import com.jk.model.MenuTree;
import com.jk.model.Power;
import com.jk.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Mr.wangbin on 2017/11/14.
 */
@Service
public class TreeServiceImp implements TreeService {

    @Autowired
    private TreeMapper treeMapper;
    @Override
    public List<Power> treelist() {
        return treeMapper.treelist();
    }

    @Override
    public List<Journal> jourList() {

        return treeMapper.jourList();
    }

    @Override
    public List<Journal> pageList(Map map) {
        return treeMapper.pageList(map);
    }
}

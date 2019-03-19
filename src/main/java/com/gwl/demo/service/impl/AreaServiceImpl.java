package com.gwl.demo.service.impl;

import com.gwl.demo.mapper.AreaMapper;
import com.gwl.demo.pojo.Area;
import com.gwl.demo.pojo.AreaExample;
import com.gwl.demo.service.IAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangjunze on 2019/3/19.
 */
@Service
public class AreaServiceImpl implements IAreaService {
    @Autowired
    AreaMapper areaMapper;

    @Override
    public List<Area> selectAll() {
        return this.areaMapper.selectByExample(new AreaExample());
    }
}

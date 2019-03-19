package com.gwl.demo.controller;

import com.gwl.demo.pojo.Area;
import com.gwl.demo.service.IAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhangjunze on 2019/3/19.
 */
@RestController
public class IndexController {

    @Autowired
    IAreaService areaService;

    @RequestMapping("/")
    public List<Area> list(){
        return this.areaService.selectAll();
    }
}

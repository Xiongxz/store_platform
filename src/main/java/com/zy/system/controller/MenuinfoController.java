package com.zy.system.controller;

import com.zy.system.model.SysMenuinfo;
import com.zy.system.service.SystemService;
import com.zy.utils.SidWorker;
import com.zy.utils.ZYJSONResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by xxz on 2018/4/19 0019
 */
@RestController
public class MenuinfoController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SystemService systemService;

    @RequestMapping(value = {"/saveMenuInfo"})
    public ZYJSONResult saveMenuInfo() {
        logger.info("************添加菜单测试数据**************");
        List<SysMenuinfo> list = new ArrayList<>();
        Collection<SysMenuinfo> c = new ArrayList<>();
        SysMenuinfo sysMenuinfo = null;
        sysMenuinfo = new SysMenuinfo();
        sysMenuinfo.setMenuId(SidWorker.nextSid());
        sysMenuinfo.setMenuFatherid(0);
        sysMenuinfo.setMenuUrl("/url/index.html");
        sysMenuinfo.setMenuName("系统");
        list.add(sysMenuinfo);
        //c.addAll(list);
        //list.addAll(c);
        //this.systemService.saveSysMenuinfo();
        return ZYJSONResult.ok();
    }
}

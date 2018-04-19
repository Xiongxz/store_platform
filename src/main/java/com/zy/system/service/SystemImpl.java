package com.zy.system.service;

import com.zy.system.mapper.SysMenuinfoMapper;
import com.zy.system.model.SysMenuinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * Created by xxz on 2018/4/19 0019
 */
@Service
public class SystemImpl implements SystemService {

    @Autowired
    private SysMenuinfoMapper sysMenuinfoMapper;

    @Override
    public int saveSysMenuinfo(SysMenuinfo sysMenuinfo) {
        return sysMenuinfoMapper.insert(sysMenuinfo);
    }

    @Override
    public int saveListSysMenuinfo(List<SysMenuinfo> list) {
        return sysMenuinfoMapper.insertList(list);
    }
}

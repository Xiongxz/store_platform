package com.zy.system.service;

import com.zy.system.mapper.SysMenuinfoMapper;
import com.zy.system.mapper.SysUserinfoMapper;
import com.zy.system.model.SysMenuinfo;
import com.zy.system.model.SysUserinfo;
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
    private SysUserinfoMapper sysUserinfoMapper;

    @Autowired
    private SysMenuinfoMapper sysMenuinfoMapper;


    @Override
    public int saveSysUserinfo(SysUserinfo sysUserinfo) {
        return sysUserinfoMapper.insert(sysUserinfo);
    }

    @Override
    public int updateSysUserinfo(SysUserinfo sysUserinfo) {
        return sysUserinfoMapper.updateByPrimaryKey(sysUserinfo);
    }

    @Override
    public int deleteSysUserinfo(SysUserinfo sysUserinfo) {
        return sysUserinfoMapper.delete(sysUserinfo);
    }

    @Override
    public List<SysUserinfo> getAllSysUserinfo() {
        return sysUserinfoMapper.selectAll();
    }

    @Override
    public int saveSysMenuinfo(SysMenuinfo sysMenuinfo) {
        return sysMenuinfoMapper.insert(sysMenuinfo);
    }

    @Override
    public int saveListSysMenuinfo(List<SysMenuinfo> list) {
        return sysMenuinfoMapper.insertList(list);
    }
}

package com.zy.system.service;

import com.zy.system.model.SysMenuinfo;
import com.zy.system.model.SysUserinfo;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * Created by xxz on 2018/4/19 0019
 */
@Service
public interface SystemService {
    //添加用户
    int saveSysUserinfo(SysUserinfo sysUserinfo);

    //修改用户
    int updateSysUserinfo(SysUserinfo sysUserinfo);

    //删除用户
    int deleteSysUserinfo(SysUserinfo sysUserinfo);

    //查询所有用户
    List<SysUserinfo> getAllSysUserinfo();

    //添加菜单
    int saveSysMenuinfo(SysMenuinfo sysMenuinfo);

    //批量添加菜单
    int saveListSysMenuinfo(List<SysMenuinfo> t);
}

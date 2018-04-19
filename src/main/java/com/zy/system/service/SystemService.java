package com.zy.system.service;

import com.zy.system.model.SysMenuinfo;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * Created by xxz on 2018/4/19 0019
 */
@Service
public interface SystemService {
    int saveSysMenuinfo(SysMenuinfo sysMenuinfo);

    int saveListSysMenuinfo(List<SysMenuinfo> t);
}

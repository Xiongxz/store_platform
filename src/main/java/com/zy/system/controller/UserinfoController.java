package com.zy.system.controller;

import com.zy.system.model.SysUserinfo;
import com.zy.system.service.SystemService;
import com.zy.utils.SidWorker;
import com.zy.utils.ZYJSONResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by xxz on 2018/4/20 0020
 */
@RestController
public class UserinfoController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SystemService systemService;


    @RequestMapping(value = "/saveOrUpdateUser", method = RequestMethod.POST)
    public ZYJSONResult saveUserInfo(SysUserinfo sysUserinfo) {
        logger.info("************保存用户************** 用户名：", sysUserinfo.getUserName());
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        int returnRow = 0;
        String msgData = "";
        try {
            if (sysUserinfo != null) {
                msgData = (sysUserinfo == null || sysUserinfo.getUserId() == null) ? "保存用户成功" : "修改用户成功";
                if (sysUserinfo.getUserId() == null || sysUserinfo.getUserId().equals("")) {
                    sysUserinfo.setUserId(SidWorker.nextSid());
                    sysUserinfo.setStartDate(df.parse(new Date().toString()));
                    sysUserinfo.setState(0);
                    returnRow = systemService.saveSysUserinfo(sysUserinfo);
                } else {
                    returnRow = systemService.updateSysUserinfo(sysUserinfo);
                }
                if (returnRow == 1 && (sysUserinfo.getUserId() == null || sysUserinfo.getUserId().equals(""))) {
                    logger.info(msgData);
                } else {
                    logger.info(msgData);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("系统异常!");
            return ZYJSONResult.errorException("系统异常");
        }
        return ZYJSONResult.ok(msgData);
    }
}

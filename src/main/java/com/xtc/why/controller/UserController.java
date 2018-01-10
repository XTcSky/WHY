package com.xtc.why.controller;

import com.alibaba.fastjson.JSONObject;
import com.xtc.why.mapper.SysUserMapper;
import com.xtc.why.model.SysUser;
import com.xtc.why.model.SysUserExample;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private static final Logger log = Logger.getLogger(UserController.class);

    @Resource
    private SysUserMapper sysUserMapper;

    @RequestMapping("/login")
    public String login(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("/memberList")
    public JSONObject getMemberList(){
        JSONObject jsonObject = new JSONObject();
        List<SysUser> data = new ArrayList<SysUser>();
        jsonObject.put("code",0);
        jsonObject.put("msg",0);
        jsonObject.put("count",0);
        jsonObject.put("data",data);
        log.info("****测试");
        return jsonObject;
    }

    @ResponseBody
    @RequestMapping("/userList")
    public JSONObject getUserList(){
        JSONObject jsonObject = new JSONObject();
        List<SysUser> data = sysUserMapper.selectByExample(null);
        int count = data != null ? data.size() : 0;
        jsonObject.put("code",0);
        jsonObject.put("msg",0);
        jsonObject.put("count",count);
        jsonObject.put("data",data);
        log.info("****测试");
        return jsonObject;
    }
}

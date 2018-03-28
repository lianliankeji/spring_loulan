package com.lxg.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import com.lxg.springboot.mapper.UserMapper;

import com.lxg.springboot.model.Msg;

import com.lxg.springboot.model.Result;
import com.lxg.springboot.model.ResultUtil;

import com.lxg.springboot.model.User;
import com.lxg.springboot.service.HttpAPIService;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

/**
 * Created by zhenghong
 * on 2017/4/25.
 */
@RestController
@RequestMapping("loulan/user/")
public class UserController extends BaseController {
	
	@Resource
    private UserMapper userMapper;
	@Resource
    private HttpAPIService httpAPIService;

/*    @RequestMapping("save")
    public Result save(User user) {
    
    	userMapper.save(user);
    	return new Result();
    }    
    
    @RequestMapping("update")
    public Result update(User user) {
    	
    	// 用户数据存储
    	userMapper.update(user);
    	return new Result();
    }
    
    @RequestMapping("query")
    public User query(User user) {
    	
    	User userf = userMapper.query(user);
    	return userf;  	
    }  
    
    @RequestMapping("saveboss")
    public Result saveboss(User user) {
    
    	userMapper.saveboss(user);
    	return new Result();
    }    
    
    @RequestMapping("updateboss")
    public Result updateboss(User user) {
    	
    	// 用户数据存储
    	userMapper.updateboss(user);
    	return new Result();
    }
    
    @RequestMapping("queryboss")
    public User queryboss(User user) {
    	
    	User userf = userMapper.queryboss(user);
    	return userf;  	
    }  */
    
    @RequestMapping("login")
    public Msg login(User user) {    	
    	if(userMapper.count(user)>=1){
    		if(userMapper.validate(user)>=1){
    		return ResultUtil.success("登陆成功");	
    		}
    		else
    		{
    		return ResultUtil.fail("密码错误");
    		}
    	}
    	else{
    		userMapper.save(user);
    		return ResultUtil.success("注册成功");	
    	}
    }    
    
    
    @RequestMapping("update")
    public Msg update(User user) {
    	
    	// 用户数据存储
    	userMapper.update(user);
    	return ResultUtil.success();	
	}   
    
}

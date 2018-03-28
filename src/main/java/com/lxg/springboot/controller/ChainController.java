package com.lxg.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lxg.springboot.mapper.ChainMapper;
import com.lxg.springboot.mapper.ContractMapper;
import com.lxg.springboot.model.Contract;
import com.lxg.springboot.model.Msg;
import com.lxg.springboot.model.Result;
import com.lxg.springboot.model.ResultUtil;
import com.lxg.springboot.service.HttpAPIService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * Created by zhenghong
 * on 2017/4/25.
 */
@RestController
@RequestMapping("loulan/chain/")
public class ChainController extends BaseController {
	 private Logger logger =  LoggerFactory.getLogger(this.getClass());
	
	@Resource
    private ChainMapper chainMapper;
	@Resource
    private ContractMapper contractMapper;
	@Resource
	private HttpAPIService httpAPIService;
    
 
    
    @RequestMapping("queryall")
    public Msg queryall() {
    	return ResultUtil.success(chainMapper.queryall());	
    }  
    
    @RequestMapping("querycontract")
    public Msg querycontract(Contract contract) {
    	return ResultUtil.success(contractMapper.queryall(contract));	
    } 
	
	
}

package com.lxg.springboot.mapper;

import java.util.List;

import com.lxg.springboot.model.Chain;

public interface ChainMapper {

	int save(Chain order);
	
	int update(Chain order);
	
	List<Chain> queryall();
	
}
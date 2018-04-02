package com.lxg.springboot.mapper;

import java.util.List;

import com.lxg.springboot.model.Contract;

public interface ContractMapper {

	int save(Contract order);
	
	int update(Contract order);
	
	List<Contract> queryall(Contract contract);
	
	List<Contract> querycontract(Contract contract);
	
	List<Contract> querycontractpass(Contract contract);
	
	List<Contract> querycontractbyname(Contract contract);
	
}
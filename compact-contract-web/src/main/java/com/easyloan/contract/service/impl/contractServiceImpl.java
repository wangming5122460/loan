package com.easyloan.contract.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.easyloan.bean.NplmLoanContract;
import com.easyloan.contract.mapper.ContractMapper;
import com.easyloan.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;


@Service
public class contractServiceImpl implements ContractService {

    @Autowired
    private ContractMapper contractMapper;


    @Override
    public List<NplmLoanContract> getLoanInfo(Map<String,Object> paramMap) {
        List<NplmLoanContract> loanInfo = contractMapper.getLoanInfos(paramMap);
//        System.out.println(loanInfo);
        return loanInfo;
    }

    @Override
    public int selectTotalCount() {
        int totalCount = contractMapper.selectTotalCount();
        return totalCount;
    }

}

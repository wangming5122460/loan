package com.easyloan.service;

import com.easyloan.bean.NplmLoanContract;

import java.util.List;
import java.util.Map;

public interface ContractService {

    //查询所有数据集合
    public List<NplmLoanContract> getLoanInfo(Map<String,Object> paramMap);
    //查询总数量值
    public int selectTotalCount();
    //按照条件查询出符合条件得数据集合
//    public List<NplmLoanContract> selectForConditionList(Map<String,Object> paramMap);

}

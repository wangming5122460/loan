package com.easyloan.contract.mapper;


import com.easyloan.bean.NplmLoanContract;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface ContractMapper extends Mapper<NplmLoanContract> {
    //三表联查，查出初始化数据
    List<NplmLoanContract> getLoanInfos(Map<String,Object> paramMap);
    //查询数据总条数
    int selectTotalCount();
    //按照条件筛选查询语句
//    List<NplmLoanContract> selectForConditionList(Map<String,Object> paramMap);
}

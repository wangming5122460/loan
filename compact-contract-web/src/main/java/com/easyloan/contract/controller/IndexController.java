package com.easyloan.contract.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.easyloan.bean.NplmLoanContract;
import com.easyloan.service.ContractService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class IndexController {

    @Reference
    private ContractService contractService;

    /**
     * 跳转后台主页面
     * @return
     */
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    /**
     * 跳转合同页面
     * @return
     */
    @RequestMapping("contract")
    public String contract(){
        return "contract";
    }

    /**
     * 异步请求后台分页数据和列表集合
     * @param paramMap
     * @return
     */
    @RequestMapping(value = "loanInfoList")
    @ResponseBody
    public String getLoanList(@RequestParam Map<String,Object> paramMap){
        int pageNumber = (Integer.parseInt((String) paramMap.get("page"))-1)* Integer.parseInt((String) paramMap.get("rows"));
        int pageSize =Integer.parseInt((String) paramMap.get("rows"));
        paramMap.put("pageNumber",pageNumber);
        paramMap.put("pageSize",pageSize);
        List<NplmLoanContract> loanInfoList = contractService.getLoanInfo(paramMap);
//        String nplmLoanContracts = JSON.toJSONString(loanInfoList);
//        String loanContractNum = (String) paramMap.get("loanContractNum");
        Map<String,Object>  map = new HashMap<>();
        int total = contractService.selectTotalCount();
        map.put("total",total);
        map.put("rows",loanInfoList);

        String loanContractListJson = JSON.toJSONString(map);
        return loanContractListJson;

    }

}

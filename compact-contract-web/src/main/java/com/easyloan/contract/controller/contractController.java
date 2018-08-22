package com.easyloan.contract.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class contractController {


    @RequestMapping("selectRepayment")
    public String selectRepayment(){
        return "commen/selectRepayment";
    }

    @RequestMapping("updataRepayment")
    public String updataRepayment(){
        return "commen/updataRepayment";
    }


}

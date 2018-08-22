package com.easyloan.contract.utils;


import org.apache.log4j.Logger;

import static org.springframework.util.ObjectUtils.isEmpty;


/**
 * 工具类来判断是否是空值
 */
public class myUtils {
    private static final Logger LOGGER = Logger.getLogger(myUtils.class);
    public static boolean isNotEmpty(Object object){
        if (object == null){
            LOGGER.debug("object id null");
            return false;
        }
        if (object instanceof String){
            LOGGER.debug("object is obj");
            return ("".equals(object));
        }
        return !isEmpty(object);
    }
}

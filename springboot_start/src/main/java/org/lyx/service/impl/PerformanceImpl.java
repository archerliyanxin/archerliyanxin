package org.lyx.service.impl;

import org.lyx.service.Performance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class PerformanceImpl implements Performance {
    private Logger log = LoggerFactory.getLogger(PerformanceImpl.class);
    public void perform(){
        log.info("perform is good");
    }
    public void perform(String name){
        log.info("下面请"+name+"表演！");
    }
}

package org.lyx.service.impl;

import org.lyx.service.Jump;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class JumpImpl implements Jump {
    private Logger log = LoggerFactory.getLogger(JumpImpl.class);
    public void jump(){
        log.info("lyx 跳起来了");
    }
}

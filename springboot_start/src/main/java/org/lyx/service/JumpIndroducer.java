package org.lyx.service;

import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.DeclareParents;
import org.lyx.service.impl.JumpImpl;

@Aspect
public class JumpIndroducer {
    @DeclareParents(value = "org.lyx.service.Performance+",defaultImpl = JumpImpl.class)
    public static Jump jump;
}

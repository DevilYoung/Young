package com.xiaola.demo.test;

import com.xiaola.demo.Facade.consumer.UserFacade;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by xiaola on 16/9/19.
 */
public class DubboTest extends BaseTest {
    @Resource
    private UserFacade userFacade;

    @Test
    public void testDemo(){
        String result = userFacade.getUserName();
        System.out.println("demo=====" + result);
    }
}

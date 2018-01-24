package com.service.huawei.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestHuawei {

        HuaweiDelegate huaweiDelegate = new HuaweiDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = huaweiDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
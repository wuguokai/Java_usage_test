package com.pojo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by WUGUOKAI on 2017/12/11.
 */
public class TestPojo {
    Map<String,String> test = new HashMap<>();

    public Map<String, String> getTest() {
        return test;
    }

    public void setTest(Map<String, String> test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "TestPojo{" +
                "test=" + test +
                '}';
    }
}

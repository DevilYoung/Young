package com.xiaola.demo.test;

import com.xiaola.demo.dao.UserDto;
import org.junit.Test;

import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by xiaola on 16/9/12.
 */
public class BasicTest {

    @Test
    public void testEquals(){

        String str1 = new String("1234");
        String str2 = "1234";
        System.out.println("String.equals:" + str1.equals(str2));  //equals 比较的是 内容
        System.out.println("String.== :" + (str1 == str2));

        Integer integer1 = new Integer(2);
        Integer integer2 = 2;
        System.out.println("Integer.equals:" + integer1.equals(integer2)); //比较内容
        System.out.println("Integer.== :" + (integer1 == integer2));

        Long long1 = new Long(1l);
        Long long2 = 1l;
        System.out.println("Long.equals:" + (long1.equals(long2))); //比较内容
        System.out.println("Long.== :" + (long1 == long2));


        UserDto user1 = new UserDto();
        user1.setId(1l);
        user1.setPassword("123456");
        user1.setUserName("xiaola");

        UserDto user2 = new UserDto();
        user2.setId(1l);
        user2.setPassword("123456");
        user2.setUserName("xiaola");

        System.out.println("Object.equals : " + user1.equals(user2));  //与 == 相同 比较值
        System.out.println("Object.== : " + (user1 == user2));

    }


    @Test
    public void testMath(){
        Math.ceil(11.3);   //向上取整
        Math.ceil(-11.3);
        Math.floor(11.3);  //向下取整
        Math.floor(-11.3);
        Math.round(11.3); //四舍五入(加上0.5后再取整)
        Math.round(-11.3);
        getClass();

    }


    @Test
    public void testMap(){
        String[] str1 = {"1","2","3"};
        String[] str2 = {"value1","value2","value3"};
        String key = "";
        String value = "";
        Map<String,String> map = new HashMap();
        map.put("1","test1");
        map.put("2","test2");
        map.put("3","test3");
        for(Integer i =0 ;i < 3; i++ ){
            key = str1[i];
            value = str2[i];

            if(map.containsKey(key)){
                map.put(key,value);
            }
        }
        System.out.print(map);
    }


}

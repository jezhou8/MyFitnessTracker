package com.example.zhongweizhou.maptest;

/**
 * Created by zhongweizhou on 3/11/17.
 */

public class UserData {

    private static String userId = "";

    public static String getUserId(){
        return userId;
    }

    public static void setUserId(String newId){
        userId = newId;
    }
}

package com.wyh.exception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LoginDemo {
    private static List<String> USERS = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(USERS,"zhangjie", "wangyonghao", "xuguang");
        try {
            checkUser("wangyonghao111");
            System.out.println("注册成功...");
            System.out.println(USERS);
        } catch (RegisterException e) {
            e.printStackTrace();
        }

    }

    private static boolean checkUser(String username) throws RegisterException {
        for (String user_name : USERS) {
            if (username.equals(user_name)) {
                throw new RegisterException("注册失败");
            }else{
                USERS.add(username);
            }
        }
        return true;
    }
}

package com.example.demo.Dao;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = {"email"},of = {"s","userName"})
public class User {
//    @Getter(AccessLevel.PROTECTED)
//    @Setter
    static String s = "";
    final String a = "111";
    private Integer id;
    private String userName;
    private String password;
    private String phone;
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private String email;

    public static void main (String[] args){
        User user = new User();
        user.setId(10);
        user.setUserName("2312");
        System.out.println(user.toString());
    }
}

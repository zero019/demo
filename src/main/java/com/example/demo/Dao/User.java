package com.example.demo.Dao;

import lombok.*;

/**
 * 1. 可通过参数exclude排除一些属性
 * 2. 可通过参数of指定仅使用哪些属性
 * */
@Data
@Builder
/**使用@data 可以不对final对象进行赋值，
 * 除无参构造与全参构造外，之前所上传的知识点均拥有*/
public class User {
    static String s = "";
    //因为无参构造NoArgsConstructor，必须保证final有值，所以两者有冲突
    final String a ;
    @NonNull
    private Integer id;
    private String userName;
    private String password;
    private String phone;
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private String email;

    //NonNull是对s进行的一次非空判断
    public void test(@NonNull String s){
        System.out.println(s);
    }

    public static void main (String[] args){
//        User user = new User();
        User user = User.builder().password("1").email("2").id(1).userName("222").build();
//        user.setId(10);
//        user.setUserName("2312");
//        System.out.println(user.toString());
        user.test(null);
    }
}

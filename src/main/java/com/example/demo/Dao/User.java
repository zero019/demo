package com.example.demo.Dao;

import lombok.*;

@Getter
@Setter
@ToString(exclude = {"email"},of = {"s","userName"})
@EqualsAndHashCode(exclude = {"s"},of = {"userName"})
//RequiredArgsConstructor 未赋值的final变量和NonNull变量生效
@RequiredArgsConstructor
@AllArgsConstructor
//@NoArgsConstructor
/**
 * 1. 可通过参数exclude排除一些属性
 * 2. 可通过参数of指定仅使用哪些属性
 * */
public class User {
//    @Getter(AccessLevel.PROTECTED)
//    @Setter
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
        User user = new User("1",2);
        user.setId(10);
        user.setUserName("2312");
        System.out.println(user.toString());
        user.test(null);
    }
}

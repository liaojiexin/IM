package com.github.yuanrw.im.rest.spi.domain;

/**
 * Date: 2019-07-07
 * Time: 13:15
 *
 * @author yrw
 */
public class UserBase {

    //用户通行id
    private String id;
    //用户名称
    private String username;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

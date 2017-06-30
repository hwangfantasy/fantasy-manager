package com.fantasy.manager.dto;

/**
 * @作者 yunfeiyang
 * @创建时间: 2017/6/30 <br/>
 * @方法描述: UserDTO. <br/>
 */

public class UserDTO {
     private Integer id;
     private String name;
     private String role;
     private boolean status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

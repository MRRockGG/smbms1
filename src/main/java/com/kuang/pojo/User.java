package com.kuang.pojo;

import java.sql.Timestamp;
import java.util.Date;

public class User {
    private Integer id;
    private String userCode;//'用户编码'
    private String userName;//'用户名称'
    private String userPassword;//'用户密码'
    private Integer gender;//'性别（1:女、 2:男）'
    private Date birthday;//'出生日期'
    private String phone;//'手机'
    private String address;//'地址'
    private Integer userRole;//'用户角色（取自角色表-角色id）'
    private Integer createdBy;//'创建者（userId）'
    private Timestamp creationDate;//'创建时间'
    private Integer modifyBy;//'更新者（userId）'
    private Timestamp modifyDate;//'更新时间'

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public void setModifyDate(Timestamp modifyDate) {
        this.modifyDate = modifyDate;
    }

    private String userRoleName;    //用户角色名称


    //--------------------------------------------
    private Integer age;//年龄
    public  Integer getAge(){
        Date date = new Date();
        Integer age = date.getYear() - birthday.getYear();
        return age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getUserRole() {
        return userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }



    public Integer getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Integer modifyBy) {
        this.modifyBy = modifyBy;
    }



    public String getUserRoleName() {
        return userRoleName;
    }

    public void setUserRoleName(String userRoleName) {
        this.userRoleName = userRoleName;
    }
}

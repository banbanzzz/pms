package com.management.core.service.proprietor.proprietorAbout.service;

import com.alibaba.fastjson.JSONObject;

public interface proprietorService {

    /**
     * @Description: 获取业主的个人信息
     * @Param: id 业主的id
     */
    JSONObject getProprietor(long id);


    /**
     * @Description: 修改账户密码
     */

    boolean updateProprietor(long id, String password);


    /**
     * @Description: 修改账户信息
     */

    boolean updateAccount(long id, String name, String phone, String number, String address);


    /**
     * @Description: 获取投诉列表
     */

    JSONObject getComplaintList(long id);

}

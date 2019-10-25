package com.management.core.service.admin.park.service;

import com.management.core.service.admin.dto.param.CreateParkParam;
import com.management.core.service.admin.dto.param.ReadParkListParam;
import com.management.core.service.admin.dto.resp.ReadParkListResp;

import java.util.List;

/**
 * @description: 停车管理业务接口
 **/

public interface ParkAdminService {


    /**
     * @Description: 获取停车位列表
     */
    List<ReadParkListResp> getList(ReadParkListParam param);

    /**
     * @Description: 更新停车位信息
     * @Param: id 报修编号
     */
    boolean updateItem(Long id, String status);

    /**
     * @Description: 删除一个停车位
     * @Param:
     */
    boolean deleteItem(Long id);

    /**
     * @Description: 新增一个停车位
     * @Param:
     */
    boolean createItem(CreateParkParam param);
}
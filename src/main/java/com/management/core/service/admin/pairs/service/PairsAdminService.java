package com.management.core.service.admin.pairs.service;

import com.management.core.service.admin.dto.param.ReadRepairsListParam;
import com.management.core.service.admin.dto.param.UpdateRepairsListParam;
import com.management.core.service.admin.dto.resp.ReadRepairsListResp;

import java.util.List;

/**
 * @description: 报修管理业务接口
 **/

public interface PairsAdminService {
    /**
     * @Description: 获取报修列表
     * @Param:
     * @return:
     * @Author: stormbuf
     * @Date:
     */
    List<ReadRepairsListResp> getList(ReadRepairsListParam param);

    /**
     * @Description: 更新报修信息
     * @Param: id 报修编号
     * @return:
     * @Author: stormbuf
     * @Date:
     */
    boolean updateItem(Long id, UpdateRepairsListParam param);

    /**
     * @Description: 删除一个报修
     * @Param:
     * @return:
     * @Author: stormbuf
     * @Date:
     */
    boolean deleteItem(Long id);

}
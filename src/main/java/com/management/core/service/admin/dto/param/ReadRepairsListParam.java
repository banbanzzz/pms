package com.management.core.service.admin.dto.param;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 报修管理业务参数
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReadRepairsListParam {

    //业主id
    private Long id;
    //报修日期
    private String date;
    //报修状态
    private String status;
}
package com.management.core.service.admin.dto.param;

import lombok.Data;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@Data
public class CreateParkListParam {


    /**
     * id : 1
     * carNum : 粤ABCDEF
     * days : 111
     */

    private Integer id;
    private String carNum;
    private Integer days;
}
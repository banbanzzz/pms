package com.management.common.util;

/**
 * @Auther: liujincheng
 * @Date: 2019-07-01 13:12
 * @Description:
 */


import lombok.*;

import java.io.Serializable;

/**
 * @description:
 * @author: liujincheng
 **/

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestException extends RuntimeException implements Serializable {
    private Integer code;
    private String msg;
    private Exception e;

    public RequestException(ResponseCode statusEnum, Exception e) {
        this.code = statusEnum.getCode();
        this.msg = statusEnum.getMsg();
        this.e = e;
    }


    public RequestException(ResponseCode statusEnum) {
        this.code = statusEnum.getCode();
        this.msg = statusEnum.getMsg();
    }

    public synchronized static RequestException fail(String msg) {
        return RequestException.builder()
                .code(CommonResponseCode.FAIL.code)
                .msg(msg)
                .build();
    }

    public synchronized static RequestException fail(String msg, Exception e) {
        return RequestException.builder()
                .code(CommonResponseCode.FAIL.code)
                .msg(msg)
                .e(e)
                .build();
    }

    public synchronized static RequestException fail(Integer code, String msg, Exception e) {
        return RequestException.builder()
                .code(code)
                .msg(msg)
                .e(e)
                .build();
    }


}


package com.management.core.service.system;

import com.baomidou.mybatisplus.extension.service.IService;
import com.management.core.entity.SysUser;

/**
 * <p>
 * 用户个人信息-权限关联表 服务类
 * </p>
 *
 * @author liujincheng
 * @since 2019-05-27
 */
public interface SysUserService extends IService<SysUser> {
    /**
     * 用户登录
     */
    void login(String username, String password);

    void register(String username, String password, Integer type);

    void deleteUser(Long uid);
}

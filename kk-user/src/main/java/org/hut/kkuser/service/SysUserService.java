package org.hut.kkuser.service;

import org.hut.kkuser.entity.SysUser;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * Created by hutwanghui on 2018/9/21.
 * email:zjjhwanhui@163.com
 * qq:472860892
 */
@CacheConfig(cacheNames = "SysUser")
public interface SysUserService {
    @CachePut(key = "#p0.id")
    public int add(SysUser pojo);

    public int delete(Integer userid);

    @CachePut(key = "#p0.id")
    public int update(SysUser pojo);

    public List<SysUser> getAll();

    @Cacheable(key = "#p0")
    public SysUser getOne(Integer userid);
}

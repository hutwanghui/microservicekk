package org.hut.kkuser.service.impl;

import org.hut.kkuser.service.SysUserService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import org.hut.kkuser.entity.SysUser;
import org.hut.kkuser.dao.SysUserDao;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserDao sysUserDao;

    public int add(SysUser pojo) {
        return sysUserDao.insert(pojo);
    }

    public int delete(Integer userid) {
        return sysUserDao.delete(userid);
    }


    public int update(SysUser pojo) {
        return sysUserDao.update(pojo);
    }

    public List<SysUser> getAll() {
        return sysUserDao.selectAll();
    }

    public SysUser getOne(Integer userid) {
        return sysUserDao.selectById(userid);
    }
}

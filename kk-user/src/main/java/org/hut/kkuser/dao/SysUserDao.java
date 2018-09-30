package org.hut.kkuser.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

import org.hut.kkuser.entity.SysUser;

@Mapper
public interface SysUserDao {
    int insert(@Param("pojo") SysUser pojo);

    int insertSelective(@Param("pojo") SysUser pojo);

    int insertList(@Param("pojos") List<SysUser> pojo);

    int update(@Param("pojo") SysUser pojo);

    int delete(@Param("userid") Integer userid);

    SysUser selectById(@Param("userid") Integer userid);

    List<SysUser> selectAll();
}

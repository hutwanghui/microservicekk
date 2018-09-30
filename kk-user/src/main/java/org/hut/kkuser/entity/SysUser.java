package org.hut.kkuser.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by hutwanghui on 2018/9/21.
 * email:zjjhwanhui@163.com
 * qq:472860892
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SysUser implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private String birthday;
    private String address;
    private String mobile;
    private String email;
    private String sex;
    private String status;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
}

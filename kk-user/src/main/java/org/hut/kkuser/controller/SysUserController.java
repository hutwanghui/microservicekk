package org.hut.kkuser.controller;

import com.alibaba.fastjson.JSON;
import org.hut.kkuser.entity.SysUser;
import org.hut.kkuser.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hutwanghui on 2018/9/21.
 * email:zjjhwanhui@163.com
 * qq:472860892
 */
@RestController
public class SysUserController {

    @Autowired
    private SysUserService userService;

    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public ResponseEntity userList() {
        List<SysUser> userList = userService.getAll();
        return ResponseEntity.ok().body(JSON.toJSON(userList));
    }

    @RequestMapping(value = "/user/{id:\\d+}")
    public ResponseEntity getUser(@PathVariable String id) {
        System.out.println(id);
        return ResponseEntity.ok().body(JSON.toJSON(userService.getOne(Integer.valueOf(id))));
    }
}

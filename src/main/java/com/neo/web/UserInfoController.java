package com.neo.web;

import com.neo.entity.UserInfo;
import com.neo.sevice.UserInfoService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/userInfo")
public class UserInfoController {

    @Resource
    UserInfoService userInfoService;
    /**
     * 用户查询.
     * @return
     */
    @RequestMapping(value = {"/userList"},produces = "application/json; charset=UTF-8")
    @RequiresPermissions("userInfo:view")//权限管理;
    public String userInfo(Model model){
        List<UserInfo> users = userInfoService.getUserList();
        model.addAttribute("users",users);
        System.out.println("/userList/userInfo");
        return "index";
    }

    /**
     * 用户添加;
     * @return
     */
    @RequestMapping("/userAdd")
    @RequiresPermissions("userInfo:add")//权限管理;
    public String userInfoAdd(){
        return "userInfoAdd";
    }

    /**
     * 用户删除;
     * @return
     */
    @RequestMapping("/userDel")
    @RequiresPermissions("userInfo:del")//权限管理;
    public String userDel(){
        return "userInfoDel";
    }
}
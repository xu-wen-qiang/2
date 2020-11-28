package com.xwq.mall.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xwq.mall.commen.DataGridView;
import com.xwq.mall.commen.ResultObj;
import com.xwq.mall.commen.WebUtils;
import com.xwq.mall.entity.User;
import com.xwq.mall.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lx
 * @since 2020-11-25
 */
@RestController
@RequestMapping("user")
//@CrossOrigin
public class UserController {
    @Autowired
    IUserService iUserService;
    @GetMapping("/{account}/{password}")
    public ResultObj queryAll(@PathVariable("account") String account ,@PathVariable("password") String password){
        System.out.printf("---------------------");
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq(StringUtils.isNoneBlank(account),"account",account);
        queryWrapper.eq(StringUtils.isNoneBlank(password),"password",password);
        User user = iUserService.getOne(queryWrapper);
        if (null != user){
            WebUtils.getSession().setAttribute("user",new DataGridView(user));
            return ResultObj.LOGIN_SUCCESS;
        }
        return ResultObj.LOGIN_ERROR_PASS;
    }
    @GetMapping
    public DataGridView isLogin(){
        if (null != WebUtils.getSession().getAttribute("user")){
            System.out.printf(WebUtils.getSession().getAttribute("user").toString());
            return (DataGridView) WebUtils.getSession().getAttribute("user");
        }
        DataGridView dataGridView = new DataGridView();
        dataGridView.setCode(0);
        dataGridView.setMsg("还没有登录");
        return dataGridView;
    }
    @PostMapping
    public ResultObj register(@PathVariable User user){

        return ResultObj.ADD_SUCCESS;
    }
}

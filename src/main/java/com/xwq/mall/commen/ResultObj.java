package com.xwq.mall.commen;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultObj {

    public static final ResultObj LOGIN_SUCCESS = new ResultObj(Constast.OK,"登录成功");
    public static final ResultObj LOGIN_ERROR_PASS = new ResultObj(Constast.ERROR,"登录失败，用户名或密码错误");
    public static final ResultObj LOGIN_ERROR_CODE = new ResultObj(Constast.ERROR,"登录失败，验证码错误");

    public static final ResultObj UPDATE_SUCCESS = new ResultObj(Constast.OK,"更新成功");
    public static final ResultObj UPDATE_ERROR = new ResultObj(Constast.ERROR,"更新失败");

    public static final ResultObj ADD_SUCCESS = new ResultObj(Constast.OK,"添加成功");
    public static final ResultObj ADD_ERROR = new ResultObj(Constast.ERROR,"添加失败");

    public static final ResultObj DELETE_SUCCESS = new ResultObj(Constast.OK,"删除成功");
    public static final ResultObj DELETE_ERROR = new ResultObj(Constast.ERROR,"删除失败");

    public static final ResultObj RESET_SUCCESS = new ResultObj(Constast.OK,"重置成功");
    public static final ResultObj RESET_ERROR = new ResultObj(Constast.ERROR,"重置失败");

    private Integer code;
    private String msg;
}

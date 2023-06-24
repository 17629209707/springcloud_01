package com.xingyu.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("public.user")
public class User {
    @TableField("id")
    private long id;
    @TableField("userName")
    private String userName;
    @TableField("passWord")
    private String passWord;
    @TableField("mobile")
    private String mobile;
}

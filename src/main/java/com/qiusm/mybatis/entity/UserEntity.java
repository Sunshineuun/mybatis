package com.qiusm.mybatis.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <code>@Document</code>指定要对应的文档名(表名）
 *
 * @author qiushengming
 * @since 2022-04-17
 */
@Data
@TableName("user")
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    @TableField("`password`")
    private String password;

    @TableField("username")
    private String username;

    /**
     * <code>@Version</code>乐观锁 <br>
     * <code>update user set name = "wsk",version = version+1
     * where id = 1 and version = 1</code>
     */
    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;

}

package com.qiusm.mybatis.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

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
    private LocalDateTime createTime;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", password=" + password +
                ", username=" + username +
                "}";
    }
}

package com.zy.system.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "sys_user_role")
public class SysUserRole {
    /**
     * 用户角色关联ID
     */
    @Id
    @Column(name = "associated_id")
    private Integer associatedId;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 角色ID
     */
    @Column(name = "role_id")
    private Integer roleId;

    /**
     * 获取用户角色关联ID
     *
     * @return associated_id - 用户角色关联ID
     */
    public Integer getAssociatedId() {
        return associatedId;
    }

    /**
     * 设置用户角色关联ID
     *
     * @param associatedId 用户角色关联ID
     */
    public void setAssociatedId(Integer associatedId) {
        this.associatedId = associatedId;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取角色ID
     *
     * @return role_id - 角色ID
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置角色ID
     *
     * @param roleId 角色ID
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
package com.zy.system.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "sys_role_menu")
public class SysRoleMenu {
    /**
     * 角色权限菜单关联ID
     */
    @Id
    @Column(name = "associated_id")
    private Integer associatedId;

    /**
     * 角色ID
     */
    @Column(name = "role_id")
    private Integer roleId;

    /**
     * 权限菜单ID
     */
    @Column(name = "menu_id")
    private Integer menuId;

    /**
     * 获取角色权限菜单关联ID
     *
     * @return associated_id - 角色权限菜单关联ID
     */
    public Integer getAssociatedId() {
        return associatedId;
    }

    /**
     * 设置角色权限菜单关联ID
     *
     * @param associatedId 角色权限菜单关联ID
     */
    public void setAssociatedId(Integer associatedId) {
        this.associatedId = associatedId;
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

    /**
     * 获取权限菜单ID
     *
     * @return menu_id - 权限菜单ID
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * 设置权限菜单ID
     *
     * @param menuId 权限菜单ID
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
}
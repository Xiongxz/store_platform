package com.zy.system.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "sys_menuinfo")
public class SysMenuinfo {
    /**
     * 权限菜单ID
     */

    @Column(name = "menu_id")
    private Long menuId;

    /**
     * 权限菜单名称
     */
    @Column(name = "menu_name")
    private String menuName;

    /**
     * 权限菜单父ID（0为顶级菜单）
     */
    @Column(name = "menu_fatherid")
    private Integer menuFatherid;

    /**
     * 权限菜单路径URL
     */
    @Column(name = "menu_url")
    private String menuUrl;

    /**
     * 获取权限菜单ID
     *
     * @return menu_id - 权限菜单ID
     */
    public Long getMenuId() {
        return menuId;
    }

    /**
     * 设置权限菜单ID
     *
     * @param menuId 权限菜单ID
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    /**
     * 获取权限菜单名称
     *
     * @return menu_name - 权限菜单名称
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 设置权限菜单名称
     *
     * @param menuName 权限菜单名称
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * 获取权限菜单父ID（0为顶级菜单）
     *
     * @return menu_fatherid - 权限菜单父ID（0为顶级菜单）
     */
    public Integer getMenuFatherid() {
        return menuFatherid;
    }

    /**
     * 设置权限菜单父ID（0为顶级菜单）
     *
     * @param menuFatherid 权限菜单父ID（0为顶级菜单）
     */
    public void setMenuFatherid(Integer menuFatherid) {
        this.menuFatherid = menuFatherid;
    }

    /**
     * 获取权限菜单路径URL
     *
     * @return menu_url - 权限菜单路径URL
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * 设置权限菜单路径URL
     *
     * @param menuUrl 权限菜单路径URL
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }
}
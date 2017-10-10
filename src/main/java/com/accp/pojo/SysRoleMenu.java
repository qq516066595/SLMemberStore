package com.accp.pojo;

/**
 * <p>
 * 角色关联菜单表
 * </p>
 *
 * @author Gawain
 * @since 2017-10-10
 */
public class SysRoleMenu {

    /**
     * 角色菜单ID
     */
	private Integer rmId;
    /**
     * 角色id
     */
	private String roleId;
    /**
     * 菜单id
     */
	private String menuId;


	public Integer getRmId() {
		return rmId;
	}

	public void setRmId(Integer rmId) {
		this.rmId = rmId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

}

package com.accp.pojo;

/**
 * <p>
 * 角色关联功能表
 * </p>
 *
 * @author Gawain
 * @since 2017-10-10
 */
public class SysRoleFunction {

    /**
     * 角色功能ID
     */
	private Integer rfId;
    /**
     * 角色id
     */
	private String roleId;
    /**
     * 功能id
     */
	private String functionId;


	public Integer getRfId() {
		return rfId;
	}

	public void setRfId(Integer rfId) {
		this.rfId = rfId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getFunctionId() {
		return functionId;
	}

	public void setFunctionId(String functionId) {
		this.functionId = functionId;
	}

}

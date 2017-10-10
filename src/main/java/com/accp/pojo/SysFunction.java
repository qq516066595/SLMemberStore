package com.accp.pojo;

/**
 * <p>
 * 功能表
 * </p>
 *
 * @author Gawain
 * @since 2017-10-10
 */
public class SysFunction {

    /**
     * 编号
     */
	private Integer fId;
    /**
     * 所属菜单ID
     */
	private String fMenuId;
    /**
     * 功能
     */
	private String fType;


	public Integer getFId() {
		return fId;
	}

	public void setFId(Integer fId) {
		this.fId = fId;
	}

	public String getFMenuId() {
		return fMenuId;
	}

	public void setFMenuId(String fMenuId) {
		this.fMenuId = fMenuId;
	}

	public String getFType() {
		return fType;
	}

	public void setFType(String fType) {
		this.fType = fType;
	}

}

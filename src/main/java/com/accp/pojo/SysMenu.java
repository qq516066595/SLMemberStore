package com.accp.pojo;

/**
 * <p>
 * 菜单表
 * </p>
 *
 * @author Gawain
 * @since 2017-10-10
 */
public class SysMenu {

    /**
     * 菜单ID
     */
	private Integer mId;
    /**
     * 菜单名称
     */
	private String mName;
    /**
     * 菜单连接URL
     */
	private String mUrl;
    /**
     * 菜单描述
     */
	private String mDesc;
    /**
     * 菜单排序
     */
	private String mOrder;
    /**
     * 菜单关联action类不需要包名
     */
	private String mActionName;


	public Integer getMId() {
		return mId;
	}

	public void setMId(Integer mId) {
		this.mId = mId;
	}

	public String getMName() {
		return mName;
	}

	public void setMName(String mName) {
		this.mName = mName;
	}

	public String getMUrl() {
		return mUrl;
	}

	public void setMUrl(String mUrl) {
		this.mUrl = mUrl;
	}

	public String getMDesc() {
		return mDesc;
	}

	public void setMDesc(String mDesc) {
		this.mDesc = mDesc;
	}

	public String getMOrder() {
		return mOrder;
	}

	public void setMOrder(String mOrder) {
		this.mOrder = mOrder;
	}

	public String getMActionName() {
		return mActionName;
	}

	public void setMActionName(String mActionName) {
		this.mActionName = mActionName;
	}

}

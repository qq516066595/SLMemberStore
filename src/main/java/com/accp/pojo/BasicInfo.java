package com.accp.pojo;

/**
 * <p>
 * 基础信息
 * </p>
 *
 * @author Gawain
 * @since 2017-10-10
 */
public class BasicInfo {

    /**
     * 参数编码,唯一
     */
	private String pCode;
    /**
     * 参数名字
     */
	private String pName;
    /**
     * 参数值
     */
	private String pValue;
    /**
     * 参数详情
     */
	private String pDesc;


	public String getPCode() {
		return pCode;
	}

	public void setPCode(String pCode) {
		this.pCode = pCode;
	}

	public String getPName() {
		return pName;
	}

	public void setPName(String pName) {
		this.pName = pName;
	}

	public String getPValue() {
		return pValue;
	}

	public void setPValue(String pValue) {
		this.pValue = pValue;
	}

	public String getPDesc() {
		return pDesc;
	}

	public void setPDesc(String pDesc) {
		this.pDesc = pDesc;
	}

}

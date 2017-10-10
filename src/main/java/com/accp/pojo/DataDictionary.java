package com.accp.pojo;

/**
 * <p>
 * 数据字典
 * </p>
 *
 * @author Gawain
 * @since 2017-10-10
 */
public class DataDictionary {

    /**
     * 数据编码，唯一
     */
	private String dCode;
    /**
     * 数据类型
     */
	private String dType;
    /**
     * 数据名字
     */
	private String dName;
    /**
     * 数据值
     */
	private String dValue;
    /**
     * 数据描述
     */
	private String dDesc;


	public String getDCode() {
		return dCode;
	}

	public void setDCode(String dCode) {
		this.dCode = dCode;
	}

	public String getDType() {
		return dType;
	}

	public void setDType(String dType) {
		this.dType = dType;
	}

	public String getDName() {
		return dName;
	}

	public void setDName(String dName) {
		this.dName = dName;
	}

	public String getDValue() {
		return dValue;
	}

	public void setDValue(String dValue) {
		this.dValue = dValue;
	}

	public String getDDesc() {
		return dDesc;
	}

	public void setDDesc(String dDesc) {
		this.dDesc = dDesc;
	}

}

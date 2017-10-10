package com.accp.pojo;

/**
 * <p>
 * 用户收货地址表
 * </p>
 *
 * @author Gawain
 * @since 2017-10-10
 */
public class Shippingaddress {

    /**
     * 主键id
     */
	private Integer id;
    /**
     * 省
     */
	private String province;
    /**
     * 市
     */
	private String city;
    /**
     * 区
     */
	private String district;
    /**
     * 街道
     */
	private String street;
    /**
     * 邮编
     */
	private String postcode;
    /**
     * 详细地址
     */
	private String detailedAddress;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getDetailedAddress() {
		return detailedAddress;
	}

	public void setDetailedAddress(String detailedAddress) {
		this.detailedAddress = detailedAddress;
	}
}

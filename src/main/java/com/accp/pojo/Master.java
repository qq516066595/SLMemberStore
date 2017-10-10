package com.accp.pojo;

/**
 * <p>
 * 管理员
 * </p>
 *
 * @author Gawain
 * @since 2017-10-10
 */
public class Master {

    /**
     * 角色id
     */
	private Integer mRoleId;
    /**
     * 角色名称
     */
	private String mRoleName;
    /**
     * 会员id
     */
	private Integer vId;
    /**
     * 会员类型
     */
	private String vType;
    /**
     * 用户状态 1启用2禁用
     */
	private Integer mState;

	public Integer getmRoleId() {
		return mRoleId;
	}

	public void setmRoleId(Integer mRoleId) {
		this.mRoleId = mRoleId;
	}

	public String getmRoleName() {
		return mRoleName;
	}

	public void setmRoleName(String mRoleName) {
		this.mRoleName = mRoleName;
	}

	public Integer getvId() {
		return vId;
	}

	public void setvId(Integer vId) {
		this.vId = vId;
	}

	public String getvType() {
		return vType;
	}

	public void setvType(String vType) {
		this.vType = vType;
	}

	public Integer getmState() {
		return mState;
	}

	public void setmState(Integer mState) {
		this.mState = mState;
	}
}

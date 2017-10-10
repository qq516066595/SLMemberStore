package com.accp.pojo;

import java.util.Date;

/**
 * <p>
 * 留言表
 * </p>
 *
 * @author Gawain
 * @since 2017-10-10
 */
public class Message {

    /**
     * id,主键
     */
	private Integer mId;
    /**
     * 留言账户
     */
	private String mMesgccount;
    /**
     * 留言内容
     */
	private String mWords;
    /**
     * 留言状态,0为未回复,1为回复,默认未回复
     */
	private Integer mState;
    /**
     * 留言时间
     */
	private Date mDate;

	public Integer getmId() {
		return mId;
	}

	public void setmId(Integer mId) {
		this.mId = mId;
	}

	public String getmMesgccount() {
		return mMesgccount;
	}

	public void setmMesgccount(String mMesgccount) {
		this.mMesgccount = mMesgccount;
	}

	public String getmWords() {
		return mWords;
	}

	public void setmWords(String mWords) {
		this.mWords = mWords;
	}

	public Integer getmState() {
		return mState;
	}

	public void setmState(Integer mState) {
		this.mState = mState;
	}

	public Date getmDate() {
		return mDate;
	}

	public void setmDate(Date mDate) {
		this.mDate = mDate;
	}
}

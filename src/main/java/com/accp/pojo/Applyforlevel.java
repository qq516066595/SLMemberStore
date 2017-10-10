package com.accp.pojo;

/**
 * <p>
 * 申请级别表
 * </p>
 *
 * @author Gawain
 * @since 2017-10-10
 */
public class Applyforlevel {

    /**
     * 主键id
     */
	private Integer id;
    /**
     * 级别名称
     */
	private String levelName;
    /**
     * 消费金额
     */
	private Double expense;
    /**
     * pv
     */
	private Double pv;
    /**
     * 综合服务费
     */
	private Double server;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public Double getExpense() {
		return expense;
	}

	public void setExpense(Double expense) {
		this.expense = expense;
	}

	public Double getPv() {
		return pv;
	}

	public void setPv(Double pv) {
		this.pv = pv;
	}

	public Double getServer() {
		return server;
	}

	public void setServer(Double server) {
		this.server = server;
	}
}

package com.accp.pojo;

/**
 * <p>
 * 订单详情表(重消购物和辅消购物)
 * </p>
 *
 * @author Gawain
 * @since 2017-10-10
 */
public class Orderformdetail {

    /**
     * 主键id
     */
	private Integer id;
    /**
     * 订单id，订单表外键
     */
	private Integer orderFormId;
    /**
     * 商品id，辅消购物则查商品表，重消购物则查套餐表
     */
	private Integer commodityId;
    /**
     * 订单类型，0为辅消购物，1为重消购物
     */
	private Integer type;
    /**
     * 数量
     */
	private Integer quantity;
    /**
     * 金额
     */
	private Double cost;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderFormId() {
        return orderFormId;
    }

    public void setOrderFormId(Integer orderFormId) {
        this.orderFormId = orderFormId;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}

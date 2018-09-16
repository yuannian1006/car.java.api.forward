package com.jsxsdqc.vo;

import java.util.Date;

/**
 * Created by NianYuan on 2018/7/8.
 */
public class PpOrderAddVo {

    /**订单ID**/
    //@ApiModelProperty("订单ID")
    private String dcPpOrderId;

    /**单位/个人**/
    //@ApiModelProperty("单位/个人")
    private String tsSysUserId;

    /**订单编号**/
    //@ApiModelProperty("订单编号")
    private String orderNo;

    /**订单类型**/
    //@ApiModelProperty("订单类型")
    private String orderType;

    /**订单状态**/
    //@ApiModelProperty("订单状态")
    private String orderStatus;

    /**使用日期**/
    //@ApiModelProperty("使用日期")
    private String userDate;

    /**使用时间**/
    //@ApiModelProperty("使用时间")
    private String userTime;

    /**返车日期**/
    //@ApiModelProperty("返车日期")
    private String returnDate;

    /**返车时间**/
    //@ApiModelProperty("返车时间")
    private String returnTime;

    /**上车地方**/
    //@ApiModelProperty("上车地方")
    private String onLocation;

    /**途经地方**/
    //@ApiModelProperty("途经地方")
    private String tuLocation;

    /**下车地方(包含途经地方)**/
    //@ApiModelProperty("下车地方(包含途经地方)")
    private String offLocation;

    /**航班号**/
    //@ApiModelProperty("航班号")
    private String flightNumber;

    /**起降时间**/
    //@ApiModelProperty("起降时间")
    private Date flightDate;

    /**支付方式**/
    //@ApiModelProperty("支付方式")
    private String paymentMethod;

    /**乘客名称**/
    //@ApiModelProperty("乘客名称")
    private String byCustomerName;

    /**乘客电话**/
    //@ApiModelProperty("乘客电话")
    private String byCustomerPhone;

    /**车辆类型**/
    //@ApiModelProperty("车辆类型")
    private String carType;

    /**合同期限**/
    //@ApiModelProperty("合同期限")
    private String contractPeriod;

    /**订单属性**/
    //@ApiModelProperty("订单属性")
    private String orderProperty;

    /**订单来源**/
    //@ApiModelProperty("订单来源")
    private String orderSource;


    /**业务类型（L-临包业务，C-长包业务）**/
    //@ApiModelProperty("业务类型（L-临包业务，C-长包业务）")
    private String serviceType;

    /**备注**/
    //@ApiModelProperty("备注")
    private String remark;

    /**订单来源**/
    //@ApiModelProperty("车费单价")
    private String carPrice;

    /**订单来源**/
    //@ApiModelProperty("车主结算")
    private String carOwnerFee;



    public String getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(String carPrice) {
        this.carPrice = carPrice;
    }

    public String getCarOwnerFee() {
        return carOwnerFee;
    }

    public void setCarOwnerFee(String carOwnerFee) {
        this.carOwnerFee = carOwnerFee;
    }

    public void setDcPpOrderId(String dcPpOrderId){
        this.dcPpOrderId = dcPpOrderId;
    }

    public String getDcPpOrderId(){
        return this.dcPpOrderId;
    }

    public void setTsSysUserId(String tsSysUserId){
        this.tsSysUserId = tsSysUserId;
    }

    public String getTsSysUserId(){
        return this.tsSysUserId;
    }

    public void setOrderNo(String orderNo){
        this.orderNo = orderNo;
    }

    public String getOrderNo(){
        return this.orderNo;
    }

    public void setOrderType(String orderType){
        this.orderType = orderType;
    }

    public String getOrderType(){
        return this.orderType;
    }

    public void setOrderStatus(String orderStatus){
        this.orderStatus = orderStatus;
    }

    public String getOrderStatus(){
        return this.orderStatus;
    }

    public void setUserDate(String userDate){
        this.userDate = userDate;
    }

    public String getUserDate(){
        return this.userDate;
    }

    public void setUserTime(String userTime){
        this.userTime = userTime;
    }

    public String getUserTime(){
        return this.userTime;
    }

    public void setReturnDate(String returnDate){
        this.returnDate = returnDate;
    }

    public String getReturnDate(){
        return this.returnDate;
    }

    public void setReturnTime(String returnTime){
        this.returnTime = returnTime;
    }

    public String getReturnTime(){
        return this.returnTime;
    }

    public void setOnLocation(String onLocation){
        this.onLocation = onLocation;
    }

    public String getOnLocation(){
        return this.onLocation;
    }

    public void setTuLocation(String tuLocation){
        this.tuLocation = tuLocation;
    }

    public String getTuLocation(){
        return this.tuLocation;
    }

    public void setOffLocation(String offLocation){
        this.offLocation = offLocation;
    }

    public String getOffLocation(){
        return this.offLocation;
    }

    public void setFlightNumber(String flightNumber){
        this.flightNumber = flightNumber;
    }

    public String getFlightNumber(){
        return this.flightNumber;
    }

    public void setFlightDate(Date flightDate){
        this.flightDate = flightDate;
    }

    public Date getFlightDate(){
        return this.flightDate;
    }

    public void setPaymentMethod(String paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod(){
        return this.paymentMethod;
    }

    public void setByCustomerName(String byCustomerName){
        this.byCustomerName = byCustomerName;
    }

    public String getByCustomerName(){
        return this.byCustomerName;
    }

    public void setByCustomerPhone(String byCustomerPhone){
        this.byCustomerPhone = byCustomerPhone;
    }

    public String getByCustomerPhone(){
        return this.byCustomerPhone;
    }

    public void setCarType(String carType){
        this.carType = carType;
    }

    public String getCarType(){
        return this.carType;
    }

    public void setContractPeriod(String contractPeriod){
        this.contractPeriod = contractPeriod;
    }

    public String getContractPeriod(){
        return this.contractPeriod;
    }

    public void setOrderProperty(String orderProperty){
        this.orderProperty = orderProperty;
    }

    public String getOrderProperty(){
        return this.orderProperty;
    }

    public void setOrderSource(String orderSource){
        this.orderSource = orderSource;
    }

    public String getOrderSource(){
        return this.orderSource;
    }

    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    public String getServiceType(){
        return this.serviceType;
    }

    public void setRemark(String remark){
        this.remark = remark;
    }

    public String getRemark(){
        return this.remark;
    }

}

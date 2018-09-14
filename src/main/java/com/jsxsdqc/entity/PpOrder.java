package com.jsxsdqc.entity;

import java.io.Serializable;

/**
 * Created by NianYuan on 2018/7/8.
 */
public class PpOrder implements Serializable{

    /**订单ID**/
    private String dcPpOrderId;

    /**单位/个人**/
    private String tsSysUserId;

    /**客户人员**/
    private String servicePersonId;

    /**订单编号**/
    private String orderNo;

    /**订单类型**/
    private String orderType;

    /**订单状态**/
    private String orderStatus;

    /**使用日期**/
    private String userDate;

    /**使用时间**/
    private String userTime;

    /**返车日期**/
    private String returnDate;

    /**返车时间**/
    private String returnTime;

    /**上车地方**/
    private String onLocation;

    /**下车地方(包含途经地方)**/
    private String offLocation;

    /**里程(公里)**/
    private String mileage;

    /**超出里程**/
    private String exceedMileage;

    /**车费单价**/
    private String allCost;

    /**车主结算费用**/
    private String advanceCost;

    /**航班号**/
    private String flightNumber;

    /**起降时间**/
    private String flightDate;

    /**付款方式**/
    private String paymentMethod;

    /**乘客名称**/
    private String byCustomerName;

    /**乘客电话**/
    private String byCustomerPhone;

    /**总共行驶时间**/
    private String totalDrivingTime;

    /**租车数量**/
    private String rentedNumber;

    /**租用天数**/
    private String rentedDays;

    /**订单来源**/
    private String orderSource;

    /**备注**/
    private String remark;

    /**车辆类型**/
    private String carType;

    /**途径地方**/
    private String tuLocation;


    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getTuLocation() {
        return tuLocation;
    }

    public void setTuLocation(String tuLocation) {
        this.tuLocation = tuLocation;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
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
    public void setServicePersonId(String servicePersonId){
        this.servicePersonId = servicePersonId;
    }

    public String getServicePersonId(){
        return this.servicePersonId;
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
    public void setOffLocation(String offLocation){
        this.offLocation = offLocation;
    }

    public String getOffLocation(){
        return this.offLocation;
    }
    public void setMileage(String mileage){
        this.mileage = mileage;
    }

    public String getMileage(){
        return this.mileage;
    }
    public void setExceedMileage(String exceedMileage){
        this.exceedMileage = exceedMileage;
    }

    public String getExceedMileage(){
        return this.exceedMileage;
    }
    public void setAllCost(String allCost){
        this.allCost = allCost;
    }

    public String getAllCost(){
        return this.allCost;
    }
    public void setAdvanceCost(String advanceCost){
        this.advanceCost = advanceCost;
    }

    public String getAdvanceCost(){
        return this.advanceCost;
    }
    public void setFlightNumber(String flightNumber){
        this.flightNumber = flightNumber;
    }

    public String getFlightNumber(){
        return this.flightNumber;
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
    public void setTotalDrivingTime(String totalDrivingTime){
        this.totalDrivingTime = totalDrivingTime;
    }

    public String getTotalDrivingTime(){
        return this.totalDrivingTime;
    }
    public void setRentedNumber(String rentedNumber){
        this.rentedNumber = rentedNumber;
    }

    public String getRentedNumber(){
        return this.rentedNumber;
    }
    public void setRentedDays(String rentedDays){
        this.rentedDays = rentedDays;
    }

    public String getRentedDays(){
        return this.rentedDays;
    }
    public void setOrderSource(String orderSource){
        this.orderSource = orderSource;
    }

    public String getOrderSource(){
        return this.orderSource;
    }
    public void setRemark(String remark){
        this.remark = remark;
    }

    public String getRemark(){
        return this.remark;
    }

}
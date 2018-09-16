package com.jsxsdqc.vo;

/**
 *
 * 查询VO
 * <p style="display:none">modifyRecord</p>
 * <p style="display:none">version:V1.0,author:xuxuelei,date:2018-08-03 12:32:34, </p>
 * @author xuxuelei
 * @date 2018-08-03 12:32:34
 * @since
 * @version
 *
 *	此代码由xxl开发内部使用
 *	外部使用该代码将付相应的法律责任
 *	更多信息请查询
 *	http://www.xlxu.com
 */

public class PpOrderDetailXVo {

	/** 当前页码，默认是第一页 **/
	//@ApiModelProperty("当前页码 ")
	private int pageIndex;

	/** 每页显示的记录数，默认是10 ，设置为“-1”表示不进行分页（分页无效） **/
	//@ApiModelProperty("每页记录数 ")
	private int pageSize;

	/** 开始时间 **/
	private String planStartDate;

	/** 结束时间 **/
	private String planEndDate;

	/** 智能文本框名称 **/
	private String noOrName;

	/**订单明细ID**/
	//@ApiModelProperty("订单明细ID")
	private String dcPpOrderDetailId;

	/**订单ID**/
	//@ApiModelProperty("订单ID")
	private String dcPpOrderId;

	/**单位/个人**/
	//@ApiModelProperty("单位/个人")
	private String tsSysUserId;

	/**司机ID**/
	//@ApiModelProperty("司机ID")
	private String driverPersonId;


	/**司机类型**/
	private String driverType;

	/**司机名称**/
	private String driverName;

	/**司机电话**/
	private String driverPhone;

	/**车主电话**/
	private String carOwnerPhone;

	/**乘客上车时间**/
	//@ApiModelProperty("乘客上车时间")
	private String byCustomerOnTime;

	/**乘客下车时间**/
	//@ApiModelProperty("乘客下车时间")
	private String byCustomerOffTime;

	/**司机到达起点时间**/
	//@ApiModelProperty("司机到达起点时间")
	private String driverStartTime;

	/**等待时间**/
	//@ApiModelProperty("等待时间")
	private String driverWaitTime;

	/**司机结束时间**/
	//@ApiModelProperty("司机结束时间")
	private String driverEndTime;

	/**总共行驶时间**/
	//@ApiModelProperty("总共行驶时间")
	private String drivingTime;

	/**超时数**/
	//@ApiModelProperty("超时数")
	private String exceedTimeNumber;

	/**超时单价**/
	//@ApiModelProperty("超时单价")
	private String exceedTimePrice;

	/**超时费**/
	//@ApiModelProperty("超时费")
	private String exceedTimeCost;

	/**使用里程(公里)**/
	//@ApiModelProperty("使用里程(公里)")
	private String mileage;

	/**超出公里**/
	//@ApiModelProperty("超出公里")
	private String exceedMileage;

	/**超公里单价**/
	//@ApiModelProperty("超公里单价")
	private String exceedMileagePrice;

	/**超公里费**/
	//@ApiModelProperty("超公里费")
	private String exceedMileageCost;

	/**增加点数**/
	//@ApiModelProperty("增加点数")
	private String addPoints;

	/**超出点数**/
	//@ApiModelProperty("超出点数")
	private String exceedPoints;

	/**增加点单价**/
	//@ApiModelProperty("增加点单价")
	private String addPointsPrice;

	/**增加点费**/
	//@ApiModelProperty("增加点费")
	private String addPointsCost;

	/**加班时间**/
	//@ApiModelProperty("加班时间")
	private String overtime;

	/**加班单价**/
	//@ApiModelProperty("加班单价")
	private String overtimePrice;

	/**加班费**/
	//@ApiModelProperty("加班费")
	private String overtimeCost;

	/**预付费**/
	//@ApiModelProperty("预付费")
	private String advanceCost;

	/**举牌费**/
	//@ApiModelProperty("举牌费")
	private String liftingCost;

	/**油费**/
	//@ApiModelProperty("油费")
	private String oilCost;

	/**等待费**/
	//@ApiModelProperty("等待费")
	private String waitCost;

	/**过路费**/
	//@ApiModelProperty("过路费")
	private String roadCost;

	/**过桥费**/
	//@ApiModelProperty("过桥费")
	private String bridgeCost;

	/**轮渡费**/
	//@ApiModelProperty("轮渡费")
	private String ferryCost;

	/**停车费**/
	//@ApiModelProperty("停车费")
	private String parkingCost;

	/**修理费**/
	//@ApiModelProperty("修理费")
	private String repairCost;

	/**房费**/
	//@ApiModelProperty("房费")
	private String roomCost;

	/**餐费**/
	//@ApiModelProperty("餐费")
	private String mealCost;

	/**ETC费用**/
	//@ApiModelProperty("ETC费用")
	private String etcCost;

	/**洗车费**/
	//@ApiModelProperty("洗车费")
	private String washCarCost;

	/**加点费**/
	//@ApiModelProperty("加点费")
	private String littleCost;

	/**其它费用**/
	//@ApiModelProperty("其它费用")
	private String otherCost;

	/**小费**/
	//@ApiModelProperty("小费")
	private String tipCost;

	/**劳务费**/
	//@ApiModelProperty("劳务费")
	private String laborServiceCost;

	/**月租金**/
	//@ApiModelProperty("月租金")
	private String mouthRentsCost;

	/**月限公里数**/
	//@ApiModelProperty("月限公里数")
	private String mouthRentsMileage;

	/**应收财务类型**/
	private String financeTypeAr;

	/**应收结算状态**/
	private String financeStatusAr;

	/**应收财务日期**/
	private String financeDateAr;

	/**应收财务备注**/
	private String financeRemarkAr;

	/**应付财务类型**/
	private String financeTypeAp;

	/**应付结算状态**/
	private String financeStatusAp;

	/**应付财务日期**/
	private String financeDateAp;

	/**应付财务备注**/
	private String financeRemarkAp;

	/**税点**/
	//@ApiModelProperty("税点")
	private String dutyPoints;

	/**税费**/
	//@ApiModelProperty("税费")
	private String dutyFee;

	/**车主单价**/
	//@ApiModelProperty("车主单价")
	private String carPrice;

	/**车主总费用**/
	//@ApiModelProperty("车主总费用")
	private String carOwnerFee;

	/**总支出**/
	//@ApiModelProperty("总支出")
	private String totalExpendFee;

	/**总收入**/
	//@ApiModelProperty("总收入")
	private String totalIncomeFee;

	/**净收入(毛利润）**/
	//@ApiModelProperty("净收入(毛利润）")
	private String totalNetIncomeFee;

	/**业务类型（L-临包业务，C-长包业务）**/
	//@ApiModelProperty("业务类型（L-临包业务，C-长包业务）")
	private String serviceType;

	/**备注**/
	//@ApiModelProperty("备注")
	private String remark;

	/**创建人**/
	//@ApiModelProperty("创建人")
	private String createBy;

	/**创建时间**/
	//@ApiModelProperty("创建时间")
	private String createDate;

	/**更新人**/
	//@ApiModelProperty("更新人")
	private String updateBy;

	/**更新时间**/
	//@ApiModelProperty("更新时间")
	private String updateDate;

	/**客户名称**/
	//@ApiModelProperty("客户名称")
	private String suName;

	/**车牌**/
	//@ApiModelProperty("车牌")
	private String carLicense;

	/**司机**/
	//@ApiModelProperty("司机")
	private String driver;

	/**车主**/
	//@ApiModelProperty("车主")
	private String carOwner;

	/**客户编号**/
	//@ApiModelProperty("客户编号")
	private String suNo;

	/**手机**/
	//@ApiModelProperty("手机")
	private String mobile;

	/**司机编号**/
	//@ApiModelProperty("司机编号")
	private String sudNo;

	/**司机手机号**/
	//@ApiModelProperty("司机手机号")
	private String sudMobile;

	/**司机车主**/
	//@ApiModelProperty("司机车主")
	private String sudCarOwner;


	/**临租应付结算类型**/
	//@ApiModelProperty("临租应付结算类型")
	private String financeTypeLzAp;

	/**临租应付结算状态**/
	//@ApiModelProperty("临租应付结算状态")
	private String financeStatusLzAp;

	/**临租应付结算日期**/
	//@ApiModelProperty("临租应付结算日期")
	private String financeDateLzAp;

	/**临租应付结算备注**/
	//@ApiModelProperty("临租应付结算备注")
	private String financeRemarkLzAp;

	/**长租应收结算类型**/
	//@ApiModelProperty("长租应收结算类型")
	private String financeTypeCzAr;

	/**长租应收结算状态**/
	//@ApiModelProperty("长租应收结算状态")
	private String financeStatusCzAr;

	/**长租应收结算日期**/
	//@ApiModelProperty("长租应收结算日期")
	private String financeDateCzAr;

	/**长租应收结算备注**/
	//@ApiModelProperty("长租应收结算备注")
	private String financeRemarkCzAr;

	/**长租应付结算类型**/
	//@ApiModelProperty("长租应付结算类型")
	private String financeTypeCzAp;

	/**长租应付结算状态**/
	//@ApiModelProperty("长租应付结算状态")
	private String financeStatusCzAp;

	/**长租应付结算日期**/
	//@ApiModelProperty("长租应付结算日期")
	private String financeDateCzAp;

	/**长租应付结算备注**/
	//@ApiModelProperty("长租应付结算备注")
	private String financeRemarkCzAp;

	private String orderNo;
	private String orderStatus;
	private String orderType;

	private String carType;

	private String byCustomerName;

	private String userType;

	private String contractPeriod;

	private String planEndDateXy;


	public String getPlanEndDateXy() {
		return planEndDateXy;
	}

	public void setPlanEndDateXy(String planEndDateXy) {
		this.planEndDateXy = planEndDateXy;
	}

	public String getContractPeriod() {
		return contractPeriod;
	}

	public void setContractPeriod(String contractPeriod) {
		this.contractPeriod = contractPeriod;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getByCustomerName() {
		return byCustomerName;
	}

	public void setByCustomerName(String byCustomerName) {
		this.byCustomerName = byCustomerName;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getDriverType() {
		return driverType;
	}

	public void setDriverType(String driverType) {
		this.driverType = driverType;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverPhone() {
		return driverPhone;
	}

	public void setDriverPhone(String driverPhone) {
		this.driverPhone = driverPhone;
	}

	public String getCarOwnerPhone() {
		return carOwnerPhone;
	}

	public void setCarOwnerPhone(String carOwnerPhone) {
		this.carOwnerPhone = carOwnerPhone;
	}

	public String getFinanceTypeLzAp() {
		return financeTypeLzAp;
	}

	public void setFinanceTypeLzAp(String financeTypeLzAp) {
		this.financeTypeLzAp = financeTypeLzAp;
	}

	public String getFinanceStatusLzAp() {
		return financeStatusLzAp;
	}

	public void setFinanceStatusLzAp(String financeStatusLzAp) {
		this.financeStatusLzAp = financeStatusLzAp;
	}

	public String getFinanceDateLzAp() {
		return financeDateLzAp;
	}

	public void setFinanceDateLzAp(String financeDateLzAp) {
		this.financeDateLzAp = financeDateLzAp;
	}

	public String getFinanceRemarkLzAp() {
		return financeRemarkLzAp;
	}

	public void setFinanceRemarkLzAp(String financeRemarkLzAp) {
		this.financeRemarkLzAp = financeRemarkLzAp;
	}

	public String getFinanceTypeCzAr() {
		return financeTypeCzAr;
	}

	public void setFinanceTypeCzAr(String financeTypeCzAr) {
		this.financeTypeCzAr = financeTypeCzAr;
	}

	public String getFinanceStatusCzAr() {
		return financeStatusCzAr;
	}

	public void setFinanceStatusCzAr(String financeStatusCzAr) {
		this.financeStatusCzAr = financeStatusCzAr;
	}

	public String getFinanceDateCzAr() {
		return financeDateCzAr;
	}

	public void setFinanceDateCzAr(String financeDateCzAr) {
		this.financeDateCzAr = financeDateCzAr;
	}

	public String getFinanceRemarkCzAr() {
		return financeRemarkCzAr;
	}

	public void setFinanceRemarkCzAr(String financeRemarkCzAr) {
		this.financeRemarkCzAr = financeRemarkCzAr;
	}

	public String getFinanceTypeCzAp() {
		return financeTypeCzAp;
	}

	public void setFinanceTypeCzAp(String financeTypeCzAp) {
		this.financeTypeCzAp = financeTypeCzAp;
	}

	public String getFinanceStatusCzAp() {
		return financeStatusCzAp;
	}

	public void setFinanceStatusCzAp(String financeStatusCzAp) {
		this.financeStatusCzAp = financeStatusCzAp;
	}

	public String getFinanceDateCzAp() {
		return financeDateCzAp;
	}

	public void setFinanceDateCzAp(String financeDateCzAp) {
		this.financeDateCzAp = financeDateCzAp;
	}

	public String getFinanceRemarkCzAp() {
		return financeRemarkCzAp;
	}

	public void setFinanceRemarkCzAp(String financeRemarkCzAp) {
		this.financeRemarkCzAp = financeRemarkCzAp;
	}

	public String getExceedPoints() {
		return exceedPoints;
	}

	public void setExceedPoints(String exceedPoints) {
		this.exceedPoints = exceedPoints;
	}

	public String getSudNo() {
		return sudNo;
	}

	public void setSudNo(String sudNo) {
		this.sudNo = sudNo;
	}

	public String getSudMobile() {
		return sudMobile;
	}

	public void setSudMobile(String sudMobile) {
		this.sudMobile = sudMobile;
	}

	public String getSudCarOwner() {
		return sudCarOwner;
	}

	public void setSudCarOwner(String sudCarOwner) {
		this.sudCarOwner = sudCarOwner;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSuNo() {
		return suNo;
	}

	public void setSuNo(String suNo) {
		this.suNo = suNo;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getCarOwner() {
		return carOwner;
	}

	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
	}

	public String getCarLicense() {
		return carLicense;
	}

	public void setCarLicense(String carLicense) {
		this.carLicense = carLicense;
	}

	public String getSuName() {
		return suName;
	}

	public void setSuName(String suName) {
		this.suName = suName;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public void setDcPpOrderDetailId(String dcPpOrderDetailId){
		this.dcPpOrderDetailId = dcPpOrderDetailId;
	}

	public String getDcPpOrderDetailId(){
		return this.dcPpOrderDetailId;
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

	public void setDriverPersonId(String driverPersonId){
		this.driverPersonId = driverPersonId;
	}

	public String getDriverPersonId(){
		return this.driverPersonId;
	}
	public void setByCustomerOnTime(String byCustomerOnTime){
		this.byCustomerOnTime = byCustomerOnTime;
	}

	public String getByCustomerOnTime(){
		return this.byCustomerOnTime;
	}
	public void setByCustomerOffTime(String byCustomerOffTime){
		this.byCustomerOffTime = byCustomerOffTime;
	}

	public String getByCustomerOffTime(){
		return this.byCustomerOffTime;
	}
	public void setDriverStartTime(String driverStartTime){
		this.driverStartTime = driverStartTime;
	}

	public String getDriverStartTime(){
		return this.driverStartTime;
	}
	public void setDriverWaitTime(String driverWaitTime){
		this.driverWaitTime = driverWaitTime;
	}

	public String getDriverWaitTime(){
		return this.driverWaitTime;
	}
	public void setDriverEndTime(String driverEndTime){
		this.driverEndTime = driverEndTime;
	}

	public String getDriverEndTime(){
		return this.driverEndTime;
	}
	public void setDrivingTime(String drivingTime){
		this.drivingTime = drivingTime;
	}

	public String getDrivingTime(){
		return this.drivingTime;
	}
	public void setExceedTimeNumber(String exceedTimeNumber){
		this.exceedTimeNumber = exceedTimeNumber;
	}

	public String getExceedTimeNumber(){
		return this.exceedTimeNumber;
	}
	public void setExceedTimePrice(String exceedTimePrice){
		this.exceedTimePrice = exceedTimePrice;
	}

	public String getExceedTimePrice(){
		return this.exceedTimePrice;
	}
	public void setExceedTimeCost(String exceedTimeCost){
		this.exceedTimeCost = exceedTimeCost;
	}

	public String getExceedTimeCost(){
		return this.exceedTimeCost;
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
	public void setExceedMileagePrice(String exceedMileagePrice){
		this.exceedMileagePrice = exceedMileagePrice;
	}

	public String getExceedMileagePrice(){
		return this.exceedMileagePrice;
	}
	public void setExceedMileageCost(String exceedMileageCost){
		this.exceedMileageCost = exceedMileageCost;
	}

	public String getExceedMileageCost(){
		return this.exceedMileageCost;
	}
	public void setAddPoints(String addPoints){
		this.addPoints = addPoints;
	}

	public String getAddPoints(){
		return this.addPoints;
	}
	public void setAddPointsPrice(String addPointsPrice){
		this.addPointsPrice = addPointsPrice;
	}

	public String getAddPointsPrice(){
		return this.addPointsPrice;
	}
	public void setAddPointsCost(String addPointsCost){
		this.addPointsCost = addPointsCost;
	}

	public String getAddPointsCost(){
		return this.addPointsCost;
	}
	public void setOvertime(String overtime){
		this.overtime = overtime;
	}

	public String getOvertime(){
		return this.overtime;
	}
	public void setOvertimePrice(String overtimePrice){
		this.overtimePrice = overtimePrice;
	}

	public String getOvertimePrice(){
		return this.overtimePrice;
	}
	public void setOvertimeCost(String overtimeCost){
		this.overtimeCost = overtimeCost;
	}

	public String getOvertimeCost(){
		return this.overtimeCost;
	}
	public void setAdvanceCost(String advanceCost){
		this.advanceCost = advanceCost;
	}

	public String getAdvanceCost(){
		return this.advanceCost;
	}
	public void setLiftingCost(String liftingCost){
		this.liftingCost = liftingCost;
	}

	public String getLiftingCost(){
		return this.liftingCost;
	}
	public void setOilCost(String oilCost){
		this.oilCost = oilCost;
	}

	public String getOilCost(){
		return this.oilCost;
	}
	public void setWaitCost(String waitCost){
		this.waitCost = waitCost;
	}

	public String getWaitCost(){
		return this.waitCost;
	}
	public void setRoadCost(String roadCost){
		this.roadCost = roadCost;
	}

	public String getRoadCost(){
		return this.roadCost;
	}
	public void setBridgeCost(String bridgeCost){
		this.bridgeCost = bridgeCost;
	}

	public String getBridgeCost(){
		return this.bridgeCost;
	}
	public void setFerryCost(String ferryCost){
		this.ferryCost = ferryCost;
	}

	public String getFerryCost(){
		return this.ferryCost;
	}
	public void setParkingCost(String parkingCost){
		this.parkingCost = parkingCost;
	}

	public String getParkingCost(){
		return this.parkingCost;
	}
	public void setRepairCost(String repairCost){
		this.repairCost = repairCost;
	}

	public String getRepairCost(){
		return this.repairCost;
	}
	public void setRoomCost(String roomCost){
		this.roomCost = roomCost;
	}

	public String getRoomCost(){
		return this.roomCost;
	}
	public void setMealCost(String mealCost){
		this.mealCost = mealCost;
	}

	public String getMealCost(){
		return this.mealCost;
	}
	public void setEtcCost(String etcCost){
		this.etcCost = etcCost;
	}

	public String getEtcCost(){
		return this.etcCost;
	}
	public void setWashCarCost(String washCarCost){
		this.washCarCost = washCarCost;
	}

	public String getWashCarCost(){
		return this.washCarCost;
	}
	public void setLittleCost(String littleCost){
		this.littleCost = littleCost;
	}

	public String getLittleCost(){
		return this.littleCost;
	}
	public void setOtherCost(String otherCost){
		this.otherCost = otherCost;
	}

	public String getOtherCost(){
		return this.otherCost;
	}
	public void setTipCost(String tipCost){
		this.tipCost = tipCost;
	}

	public String getTipCost(){
		return this.tipCost;
	}
	public void setLaborServiceCost(String laborServiceCost){
		this.laborServiceCost = laborServiceCost;
	}

	public String getLaborServiceCost(){
		return this.laborServiceCost;
	}
	public void setMouthRentsCost(String mouthRentsCost){
		this.mouthRentsCost = mouthRentsCost;
	}

	public String getMouthRentsCost(){
		return this.mouthRentsCost;
	}
	public void setMouthRentsMileage(String mouthRentsMileage){
		this.mouthRentsMileage = mouthRentsMileage;
	}

	public String getMouthRentsMileage(){
		return this.mouthRentsMileage;
	}


	public String getFinanceTypeAr() {
		return financeTypeAr;
	}

	public void setFinanceTypeAr(String financeTypeAr) {
		this.financeTypeAr = financeTypeAr;
	}

	public String getFinanceStatusAr() {
		return financeStatusAr;
	}

	public void setFinanceStatusAr(String financeStatusAr) {
		this.financeStatusAr = financeStatusAr;
	}

	public String getFinanceDateAr() {
		return financeDateAr;
	}

	public void setFinanceDateAr(String financeDateAr) {
		this.financeDateAr = financeDateAr;
	}

	public String getFinanceRemarkAr() {
		return financeRemarkAr;
	}

	public void setFinanceRemarkAr(String financeRemarkAr) {
		this.financeRemarkAr = financeRemarkAr;
	}

	public String getFinanceTypeAp() {
		return financeTypeAp;
	}

	public void setFinanceTypeAp(String financeTypeAp) {
		this.financeTypeAp = financeTypeAp;
	}

	public String getFinanceStatusAp() {
		return financeStatusAp;
	}

	public void setFinanceStatusAp(String financeStatusAp) {
		this.financeStatusAp = financeStatusAp;
	}

	public String getFinanceDateAp() {
		return financeDateAp;
	}

	public void setFinanceDateAp(String financeDateAp) {
		this.financeDateAp = financeDateAp;
	}

	public String getFinanceRemarkAp() {
		return financeRemarkAp;
	}

	public void setFinanceRemarkAp(String financeRemarkAp) {
		this.financeRemarkAp = financeRemarkAp;
	}

	public void setDutyPoints(String dutyPoints){
		this.dutyPoints = dutyPoints;
	}

	public String getDutyPoints(){
		return this.dutyPoints;
	}
	public void setDutyFee(String dutyFee){
		this.dutyFee = dutyFee;
	}

	public String getDutyFee(){
		return this.dutyFee;
	}
	public void setCarPrice(String carPrice){
		this.carPrice = carPrice;
	}

	public String getCarPrice(){
		return this.carPrice;
	}
	public void setCarOwnerFee(String carOwnerFee){
		this.carOwnerFee = carOwnerFee;
	}

	public String getCarOwnerFee(){
		return this.carOwnerFee;
	}
	public void setTotalExpendFee(String totalExpendFee){
		this.totalExpendFee = totalExpendFee;
	}

	public String getTotalExpendFee(){
		return this.totalExpendFee;
	}
	public void setTotalIncomeFee(String totalIncomeFee){
		this.totalIncomeFee = totalIncomeFee;
	}

	public String getTotalIncomeFee(){
		return this.totalIncomeFee;
	}
	public void setTotalNetIncomeFee(String totalNetIncomeFee){
		this.totalNetIncomeFee = totalNetIncomeFee;
	}

	public String getTotalNetIncomeFee(){
		return this.totalNetIncomeFee;
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
	public void setCreateBy(String createBy){
		this.createBy = createBy;
	}

	public String getCreateBy(){
		return this.createBy;
	}
	public void setCreateDate(String createDate){
		this.createDate = createDate;
	}

	public String getCreateDate(){
		return this.createDate;
	}
	public void setUpdateBy(String updateBy){
		this.updateBy = updateBy;
	}

	public String getUpdateBy(){
		return this.updateBy;
	}
	public void setUpdateDate(String updateDate){
		this.updateDate = updateDate;
	}

	public String getUpdateDate(){
		return this.updateDate;
	}

	public String getPlanStartDate() {
		return planStartDate;
	}

	public void setPlanStartDate(String planStartDate) {
		this.planStartDate = planStartDate;
	}

	public String getPlanEndDate() {
		return planEndDate;
	}

	public void setPlanEndDate(String planEndDate) {
		this.planEndDate = planEndDate;
	}

	public String getNoOrName() {
		return noOrName;
	}

	public void setNoOrName(String noOrName) {
		this.noOrName = noOrName;
	}

}

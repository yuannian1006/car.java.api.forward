package com.jsxsdqc.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 实体类基类
 * <p style="display:none">modifyRecord</p>
 * <p style="display:none">version:V1.0,author:yantao,date:2017年5月17日 下午3:51:33, </p>
 * @author yantao
 * @date 2017年5月17日 下午3:51:33
 * @since
 * @version
 */

public abstract class BaseEntity implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5041285197378894216L;
	
	/**
	 * 版本号
	 */
	private Integer version;
	
	/**
	 * 创建人
	 */
	private String createBy;
	/**
	 * 创建时间
	 */
	private Date createDate;
    /**
     * 修改人
     */
    private String updateBy;
    /**
     * 修改时间
     */
    private Date updateDate;
    
	/**排序**/
	private String sortOrder;
	
	/**排序字段**/
	private String sortName;
	
	/**关键字**/
	private String keyword;
	
	public String getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}
	public String getSortName() {
		return sortName;
	}
	public void setSortName(String sortName) {
		this.sortName = sortName;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	/**
	  * @return  the version
	 */
	public Integer getVersion() {
		return version;
	}
	/**
	 * @param version the version to set
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}
	/**
	  * @return  the createBy
	 */
	public String getCreateBy() {
		return createBy;
	}
	/**
	 * @param createBy the createBy to set
	 */
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	/**
	  * @return  the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	/**
	  * @return  the updateBy
	 */
	public String getUpdateBy() {
		return updateBy;
	}
	/**
	 * @param updateBy the updateBy to set
	 */
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	/**
	  * @return  the updateDate
	 */
	public Date getUpdateDate() {
		return updateDate;
	}
	/**
	 * @param updateDate the updateDate to set
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
    
    

}

package com.jsxsdqc.entity;

import java.util.HashMap;

/**
 * 响应结果集实体类
 * <p style="display:none">modifyRecord</p>
 * <p style="display:none">version:V1.0,author:yantao,date:2017年5月17日 下午2:24:19, </p>
 * @author yantao
 * @date 2017年5月17日 下午2:24:19
 * @since
 * @version
 *
 */

@SuppressWarnings({ "serial", "rawtypes","unchecked" })
public class ResponseBean extends HashMap {
	/** 
	 * 执行操作结果的代码编号,
	 * 如果成功,值为10000,
	 * 如果失败, 值为错误编号.
	 */
	private String code = "10000";
	/** 
	 * 成功或错误消息. 
	 */
	private String message;
	/** 
	 * 查询结果的总记录数;如果结果不是List,则为0. 
	 */
	private long count;
	/**
	 * 列表分页的总页数
	 */
	private int totalPage;
	/** 
	 * 返回结果,以下接口中的Reponse内容均简写为Detail内容.
	 */
	private Object results;
	
	public ResponseBean() {
		setMessage("success");
		setCode("10000");
		setCount(0);
		setResults("");
	}
	
	/**
	 * @return  the totalPage
	 */
	public int getTotalPage() {
		return totalPage;
	}

	/**
	 * @param totalPage the totalPage to set
	 */
	public void setTotalPage(int totalPage) {
		put("totalPage", totalPage);
		this.totalPage = totalPage;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		put("message", message);
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		put("code", code);
		this.code = code;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		put("count", count);
		this.count = count;
	}
	
	/**
	 * @return  the results
	 */
	public Object getResults() {
		return results;
	}
	/**
	 * @param results the results to set
	 */
	public void setResults(Object results) {
		put("results", results);
		this.results = results;
	}
	public void put(String key,Object value) {
		super.put(key, value);
	}
}

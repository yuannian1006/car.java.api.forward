package com.jsxsdqc.vo;

/**
 * Created by NianYuan on 2018/7/8.
 */
public class SysCodeListParamVo {
    /**
     * 当前页码，默认是第一页
     */
    private int pageIndex;
    /**
     * 每页显示的记录数，默认是10 ，设置为“-1”表示不进行分页（分页无效）
     */
    private int pageSize;

    /**编码类型id**/
    private String tsSysCodeTypeId;

    /**编码值**/
    private String no;

    /**编码值名称**/
    private String name;
    /**顺序号**/
    private int listSeq;
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
    public String getTsSysCodeTypeId() {
        return tsSysCodeTypeId;
    }
    public void setTsSysCodeTypeId(String tsSysCodeTypeId) {
        this.tsSysCodeTypeId = tsSysCodeTypeId;
    }
    public String getNo() {
        return no;
    }
    public void setNo(String no) {
        this.no = no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getListSeq() {
        return listSeq;
    }
    public void setListSeq(int listSeq) {
        this.listSeq = listSeq;
    }

}

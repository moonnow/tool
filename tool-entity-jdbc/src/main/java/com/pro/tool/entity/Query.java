package com.pro.tool.entity;

/**
 * [查询]实体类, 表名[PRO_QUERY].
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "PRO_QUERY")
@org.hibernate.annotations.GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class Query implements java.io.Serializable {

  private static final long serialVersionUID = 1L;

  @javax.persistence.Id
  @javax.persistence.GeneratedValue(generator = "jpa-uuid")
  protected java.lang.String queryId; // 查询编号

  protected java.lang.String queryType; // 查询类型

  protected java.lang.String dtId; // 数据库表编号

  protected java.lang.String columnsId; // 列编号

  protected java.lang.Integer weightOrder; // 排序权重

  public java.lang.String getQueryId() {
    return queryId;
  }

  public void setQueryId(java.lang.String queryId) {
    this.queryId = queryId;
  }

  public java.lang.String getQueryType() {
    return queryType;
  }

  public void setQueryType(java.lang.String queryType) {
    this.queryType = queryType;
  }

  public java.lang.String getDtId() {
    return dtId;
  }

  public void setDtId(java.lang.String dtId) {
    this.dtId = dtId;
  }

  public java.lang.String getColumnsId() {
    return columnsId;
  }

  public void setColumnsId(java.lang.String columnsId) {
    this.columnsId = columnsId;
  }

  public java.lang.Integer getWeightOrder() {
    return weightOrder;
  }

  public void setWeightOrder(java.lang.Integer weightOrder) {
    this.weightOrder = weightOrder;
  }

  @Override
  public String toString() {
    return org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(this);
  }

  @Override
  public boolean equals(Object object) {
    return org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(this, object);
  }

  @Override
  public int hashCode() {
    return org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(this);
  }

}

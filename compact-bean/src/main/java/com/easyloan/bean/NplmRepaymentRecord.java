package com.easyloan.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class NplmRepaymentRecord implements Serializable{

  @Column
  @Id
  private Long id;
  @Column
  private Long businessRequestId;
  @Column
  private Long loanContractNum;
  @Column
  private Date repaymentDate;
  @Column
  private Long overdueDays;
  @Column
  private Long overdueAmount;
  @Column
  private Long repaymentAmount;
  @Column
  private Long successAmount;
  @Column
  private String status;
  @Column
  private String remark;
  @Column
  private String specialCode;
  @Column
  private Long sort;
  @Column
  private String dataCreateType;
  @Column
  private Timestamp reserveTime;
  @Column
  private String creator;
  @Column
  private Timestamp createTime;
  @Column
  private String updater;
  @Column
  private Timestamp updateTime;
  @Column
  private String accountName;
  @Column
  private String acctIdenType;
  @Column
  private String acctIdenNum;
  @Column
  private String accountNo;
  @Column
  private String accountType;
  @Column
  private String accountBankid;
  @Column
  private String accountBranchNo;
  @Column
  private String accountBankName;
  @Column
  private String publicPrivate;
  @Column
  private String actProvince;
  @Column
  private String accountCity;
  @Column
  private String updateType;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getBusinessRequestId() {
    return businessRequestId;
  }

  public void setBusinessRequestId(Long businessRequestId) {
    this.businessRequestId = businessRequestId;
  }

  public Long getLoanContractNum() {
    return loanContractNum;
  }

  public void setLoanContractNum(Long loanContractNum) {
    this.loanContractNum = loanContractNum;
  }

  public Date getRepaymentDate() {
    return repaymentDate;
  }

  public void setRepaymentDate(Date repaymentDate) {
    this.repaymentDate = repaymentDate;
  }

  public Long getOverdueDays() {
    return overdueDays;
  }

  public void setOverdueDays(Long overdueDays) {
    this.overdueDays = overdueDays;
  }

  public Long getOverdueAmount() {
    return overdueAmount;
  }

  public void setOverdueAmount(Long overdueAmount) {
    this.overdueAmount = overdueAmount;
  }

  public Long getRepaymentAmount() {
    return repaymentAmount;
  }

  public void setRepaymentAmount(Long repaymentAmount) {
    this.repaymentAmount = repaymentAmount;
  }

  public Long getSuccessAmount() {
    return successAmount;
  }

  public void setSuccessAmount(Long successAmount) {
    this.successAmount = successAmount;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public String getSpecialCode() {
    return specialCode;
  }

  public void setSpecialCode(String specialCode) {
    this.specialCode = specialCode;
  }

  public Long getSort() {
    return sort;
  }

  public void setSort(Long sort) {
    this.sort = sort;
  }

  public String getDataCreateType() {
    return dataCreateType;
  }

  public void setDataCreateType(String dataCreateType) {
    this.dataCreateType = dataCreateType;
  }

  public Timestamp getReserveTime() {
    return reserveTime;
  }

  public void setReserveTime(Timestamp reserveTime) {
    this.reserveTime = reserveTime;
  }

  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
  }

  public String getUpdater() {
    return updater;
  }

  public void setUpdater(String updater) {
    this.updater = updater;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
  }

  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public String getAcctIdenType() {
    return acctIdenType;
  }

  public void setAcctIdenType(String acctIdenType) {
    this.acctIdenType = acctIdenType;
  }

  public String getAcctIdenNum() {
    return acctIdenNum;
  }

  public void setAcctIdenNum(String acctIdenNum) {
    this.acctIdenNum = acctIdenNum;
  }

  public String getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }

  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public String getAccountBankid() {
    return accountBankid;
  }

  public void setAccountBankid(String accountBankid) {
    this.accountBankid = accountBankid;
  }

  public String getAccountBranchNo() {
    return accountBranchNo;
  }

  public void setAccountBranchNo(String accountBranchNo) {
    this.accountBranchNo = accountBranchNo;
  }

  public String getAccountBankName() {
    return accountBankName;
  }

  public void setAccountBankName(String accountBankName) {
    this.accountBankName = accountBankName;
  }

  public String getPublicPrivate() {
    return publicPrivate;
  }

  public void setPublicPrivate(String publicPrivate) {
    this.publicPrivate = publicPrivate;
  }

  public String getActProvince() {
    return actProvince;
  }

  public void setActProvince(String actProvince) {
    this.actProvince = actProvince;
  }

  public String getAccountCity() {
    return accountCity;
  }

  public void setAccountCity(String accountCity) {
    this.accountCity = accountCity;
  }

  public String getUpdateType() {
    return updateType;
  }

  public void setUpdateType(String updateType) {
    this.updateType = updateType;
  }
}

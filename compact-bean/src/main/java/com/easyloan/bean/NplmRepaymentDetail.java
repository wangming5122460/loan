package com.easyloan.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class NplmRepaymentDetail implements Serializable{

  @Column
  @Id
  private Long id;
  @Column
  private Long repaymentPlanId;
  @Column
  private Long repaymentRecordId;
  @Column
  private Long businessRequestId;
  @Column
  private Long loanContractNum;
  @Column
  private Date repaymentDate;
  @Column
  private Long instalment;
  @Column
  private Long shouldCapital;
  @Column
  private Long shouldInterest;
  @Column
  private Long shouldInstFee;
  @Column
  private Long shouldAmerce;
  @Column
  private Long shouldForfeit;
  @Column
  private Long shouldPenalty;
  @Column
  private Long shouldChangeFee;
  @Column
  private Long shouldOtherFee;
  @Column
  private Long shouldAmount;
  @Column
  private Long indeedCapital;
  @Column
  private Long indeedInterest;
  @Column
  private Long indeedInstFee;
  @Column
  private Long indeedAmerce;
  @Column
  private Long indeedForfeit;
  @Column
  private Long indeedPenalty;
  @Column
  private Long indeedChangeFee;
  @Column
  private Long indeedOtherFee;
  @Column
  private Long indeedAmount;
  @Column
  private String status;
  @Column
  private Long reduceCapital;
  @Column
  private Long reduceInterest;
  @Column
  private Long reduceAmerce;
  @Column
  private Long reduceForfeit;
  @Column
  private Long reducePenalty;
  @Column
  private Long reduceInstFee;
  @Column
  private Long reducePreFee;
  @Column
  private Long reduceOtherFee;
  @Column
  private String dataCreateType;
  @Column
  private String remark;
  @Column
  private String specialCode;
  @Column
  private Long sort;
  @Column
  private String creator;
  @Column
  private Timestamp createTime;
  @Column
  private String updater;
  @Column
  private Timestamp updateTime;
  @Column
  private String updateType;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getRepaymentPlanId() {
    return repaymentPlanId;
  }

  public void setRepaymentPlanId(Long repaymentPlanId) {
    this.repaymentPlanId = repaymentPlanId;
  }

  public Long getRepaymentRecordId() {
    return repaymentRecordId;
  }

  public void setRepaymentRecordId(Long repaymentRecordId) {
    this.repaymentRecordId = repaymentRecordId;
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

  public Long getInstalment() {
    return instalment;
  }

  public void setInstalment(Long instalment) {
    this.instalment = instalment;
  }

  public Long getShouldCapital() {
    return shouldCapital;
  }

  public void setShouldCapital(Long shouldCapital) {
    this.shouldCapital = shouldCapital;
  }

  public Long getShouldInterest() {
    return shouldInterest;
  }

  public void setShouldInterest(Long shouldInterest) {
    this.shouldInterest = shouldInterest;
  }

  public Long getShouldInstFee() {
    return shouldInstFee;
  }

  public void setShouldInstFee(Long shouldInstFee) {
    this.shouldInstFee = shouldInstFee;
  }

  public Long getShouldAmerce() {
    return shouldAmerce;
  }

  public void setShouldAmerce(Long shouldAmerce) {
    this.shouldAmerce = shouldAmerce;
  }

  public Long getShouldForfeit() {
    return shouldForfeit;
  }

  public void setShouldForfeit(Long shouldForfeit) {
    this.shouldForfeit = shouldForfeit;
  }

  public Long getShouldPenalty() {
    return shouldPenalty;
  }

  public void setShouldPenalty(Long shouldPenalty) {
    this.shouldPenalty = shouldPenalty;
  }

  public Long getShouldChangeFee() {
    return shouldChangeFee;
  }

  public void setShouldChangeFee(Long shouldChangeFee) {
    this.shouldChangeFee = shouldChangeFee;
  }

  public Long getShouldOtherFee() {
    return shouldOtherFee;
  }

  public void setShouldOtherFee(Long shouldOtherFee) {
    this.shouldOtherFee = shouldOtherFee;
  }

  public Long getShouldAmount() {
    return shouldAmount;
  }

  public void setShouldAmount(Long shouldAmount) {
    this.shouldAmount = shouldAmount;
  }

  public Long getIndeedCapital() {
    return indeedCapital;
  }

  public void setIndeedCapital(Long indeedCapital) {
    this.indeedCapital = indeedCapital;
  }

  public Long getIndeedInterest() {
    return indeedInterest;
  }

  public void setIndeedInterest(Long indeedInterest) {
    this.indeedInterest = indeedInterest;
  }

  public Long getIndeedInstFee() {
    return indeedInstFee;
  }

  public void setIndeedInstFee(Long indeedInstFee) {
    this.indeedInstFee = indeedInstFee;
  }

  public Long getIndeedAmerce() {
    return indeedAmerce;
  }

  public void setIndeedAmerce(Long indeedAmerce) {
    this.indeedAmerce = indeedAmerce;
  }

  public Long getIndeedForfeit() {
    return indeedForfeit;
  }

  public void setIndeedForfeit(Long indeedForfeit) {
    this.indeedForfeit = indeedForfeit;
  }

  public Long getIndeedPenalty() {
    return indeedPenalty;
  }

  public void setIndeedPenalty(Long indeedPenalty) {
    this.indeedPenalty = indeedPenalty;
  }

  public Long getIndeedChangeFee() {
    return indeedChangeFee;
  }

  public void setIndeedChangeFee(Long indeedChangeFee) {
    this.indeedChangeFee = indeedChangeFee;
  }

  public Long getIndeedOtherFee() {
    return indeedOtherFee;
  }

  public void setIndeedOtherFee(Long indeedOtherFee) {
    this.indeedOtherFee = indeedOtherFee;
  }

  public Long getIndeedAmount() {
    return indeedAmount;
  }

  public void setIndeedAmount(Long indeedAmount) {
    this.indeedAmount = indeedAmount;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Long getReduceCapital() {
    return reduceCapital;
  }

  public void setReduceCapital(Long reduceCapital) {
    this.reduceCapital = reduceCapital;
  }

  public Long getReduceInterest() {
    return reduceInterest;
  }

  public void setReduceInterest(Long reduceInterest) {
    this.reduceInterest = reduceInterest;
  }

  public Long getReduceAmerce() {
    return reduceAmerce;
  }

  public void setReduceAmerce(Long reduceAmerce) {
    this.reduceAmerce = reduceAmerce;
  }

  public Long getReduceForfeit() {
    return reduceForfeit;
  }

  public void setReduceForfeit(Long reduceForfeit) {
    this.reduceForfeit = reduceForfeit;
  }

  public Long getReducePenalty() {
    return reducePenalty;
  }

  public void setReducePenalty(Long reducePenalty) {
    this.reducePenalty = reducePenalty;
  }

  public Long getReduceInstFee() {
    return reduceInstFee;
  }

  public void setReduceInstFee(Long reduceInstFee) {
    this.reduceInstFee = reduceInstFee;
  }

  public Long getReducePreFee() {
    return reducePreFee;
  }

  public void setReducePreFee(Long reducePreFee) {
    this.reducePreFee = reducePreFee;
  }

  public Long getReduceOtherFee() {
    return reduceOtherFee;
  }

  public void setReduceOtherFee(Long reduceOtherFee) {
    this.reduceOtherFee = reduceOtherFee;
  }

  public String getDataCreateType() {
    return dataCreateType;
  }

  public void setDataCreateType(String dataCreateType) {
    this.dataCreateType = dataCreateType;
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

  public String getUpdateType() {
    return updateType;
  }

  public void setUpdateType(String updateType) {
    this.updateType = updateType;
  }
}

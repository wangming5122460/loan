package com.easyloan.bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

public class NplmOverdueContract implements Serializable{

  @Column
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;
  @Column
  private String loanContractNum;
  @Column
  private String overdueStatus;
  @Column
  private Long overdueDays;
  @Column
  private Long instalmentCnt;
  @Column
  private Long allDays;
  @Column
  private Long allInstalmentCnt;
  @Column
  private Long allNumber;
  @Column
  private Long principalInterest;
  @Column
  private Long allForfeit;
  @Column
  private Long allAmerce;
  @Column
  private Long allShould;
  @Column
  private Long allIndeed;
  @Column
  private Long currentRepay;
  @Column
  private Long allRepaymentAmount;
  @Column
  private String firstDate;
  @Column
  private String startDate;
  @Column
  private String serialStartDate;
  @Column
  private String overdueHistory;
  @Column
  private String computeDate;
  @Column
  private String creator;
  @Column
  private java.sql.Timestamp createTime;
  @Column
  private String updater;
  @Column
  private java.sql.Timestamp updateTime;
  @Column
  private String updateType;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getLoanContractNum() {
    return loanContractNum;
  }

  public void setLoanContractNum(String loanContractNum) {
    this.loanContractNum = loanContractNum;
  }

  public String getOverdueStatus() {
    return overdueStatus;
  }

  public void setOverdueStatus(String overdueStatus) {
    this.overdueStatus = overdueStatus;
  }

  public Long getOverdueDays() {
    return overdueDays;
  }

  public void setOverdueDays(Long overdueDays) {
    this.overdueDays = overdueDays;
  }

  public Long getInstalmentCnt() {
    return instalmentCnt;
  }

  public void setInstalmentCnt(Long instalmentCnt) {
    this.instalmentCnt = instalmentCnt;
  }

  public Long getAllDays() {
    return allDays;
  }

  public void setAllDays(Long allDays) {
    this.allDays = allDays;
  }

  public Long getAllInstalmentCnt() {
    return allInstalmentCnt;
  }

  public void setAllInstalmentCnt(Long allInstalmentCnt) {
    this.allInstalmentCnt = allInstalmentCnt;
  }

  public Long getAllNumber() {
    return allNumber;
  }

  public void setAllNumber(Long allNumber) {
    this.allNumber = allNumber;
  }

  public Long getPrincipalInterest() {
    return principalInterest;
  }

  public void setPrincipalInterest(Long principalInterest) {
    this.principalInterest = principalInterest;
  }

  public Long getAllForfeit() {
    return allForfeit;
  }

  public void setAllForfeit(Long allForfeit) {
    this.allForfeit = allForfeit;
  }

  public Long getAllAmerce() {
    return allAmerce;
  }

  public void setAllAmerce(Long allAmerce) {
    this.allAmerce = allAmerce;
  }

  public Long getAllShould() {
    return allShould;
  }

  public void setAllShould(Long allShould) {
    this.allShould = allShould;
  }

  public Long getAllIndeed() {
    return allIndeed;
  }

  public void setAllIndeed(Long allIndeed) {
    this.allIndeed = allIndeed;
  }

  public Long getCurrentRepay() {
    return currentRepay;
  }

  public void setCurrentRepay(Long currentRepay) {
    this.currentRepay = currentRepay;
  }

  public Long getAllRepaymentAmount() {
    return allRepaymentAmount;
  }

  public void setAllRepaymentAmount(Long allRepaymentAmount) {
    this.allRepaymentAmount = allRepaymentAmount;
  }

  public String getFirstDate() {
    return firstDate;
  }

  public void setFirstDate(String firstDate) {
    this.firstDate = firstDate;
  }

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public String getSerialStartDate() {
    return serialStartDate;
  }

  public void setSerialStartDate(String serialStartDate) {
    this.serialStartDate = serialStartDate;
  }

  public String getOverdueHistory() {
    return overdueHistory;
  }

  public void setOverdueHistory(String overdueHistory) {
    this.overdueHistory = overdueHistory;
  }

  public String getComputeDate() {
    return computeDate;
  }

  public void setComputeDate(String computeDate) {
    this.computeDate = computeDate;
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

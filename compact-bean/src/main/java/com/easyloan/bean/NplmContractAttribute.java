package com.easyloan.bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

public class NplmContractAttribute implements Serializable{

  @Column
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column
  private Long loanContractid;
  @Column
  private Long loanContractNum;
  @Column
  private String businessType;
  @Column
  private String isExpedited;
  @Column
  private Timestamp signDate;
  @Column
  private Long signType;
  @Column
  private String approveDate;
  @Column
  private String firstRepayDate;
  @Column
  private Long feeFlag;
  @Column
  private String interestFlag;
  @Column
  private Long interestType;
  @Column
  private Long graceDays;
  @Column
  private Long irr;
  @Column
  private Long lnsRate;
  @Column
  private String channelCode;
  @Column
  private String channelName;
  @Column
  private String loanOfficerId;
  @Column
  private String cityId;
  @Column
  private String city;
  @Column
  private String isModify;
  @Column
  private String isSchemeModify;
  @Column
  private Long recycleWay;
  @Column
  private String isRecycleLoad;
  @Column
  private Long recycleLoanCnt;
  @Column
  private String oldContractNum;
  @Column
  private Long settleAmount;
  @Column
  private String newContractNum;
  @Column
  private String isShorten;
  @Column
  private String isExtend;
  @Column
  private String isChangeProduce;
  @Column
  private String isOverdue;
  @Column
  private String isPayAhead;
  @Column
  private String isPayPart;
  @Column
  private String purpose;
  @Column
  private String purposeSon;
  @Column
  private String purposeDetail;
  @Column
  private String isDivAccount;
  @Column
  private String systemType;
  @Column
  private String highRisk;
  @Column
  private String isBuyout;
  @Column
  private String feeProcessType;
  @Column
  private String studentCorpName;
  @Column
  private String settleDate;
  @Column
  private String habitTime;
  @Column
  private String repayDay;
  @Column
  private String applyId;
  @Column
  private String oldApplyId;
  @Column
  private String deptId;
  @Column
  private String deptName;
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
  @Column
  private Long frontChargeDiscount;
  @Column
  private Long monthMRate;
  @Column
  private Long handleChargeRate;
  @Column
  private Long loanTimes;
  @Column
  private String pawn;
  @Column
  private Long handleCharge;
  @Column
  private Long monthChargeDiscount;
  @Column
  private Long guaranteeFee;
  @Column
  private String guaranteeCompany;
  @Column
  private String loanType;
  @Column
  private String trustCompany;
  @Column
  private String trustProduct;
  @Column
  private String trustPlan;
  @Column
  private String changeType;
  @Column
  private String changeAmount;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getLoanContractid() {
    return loanContractid;
  }

  public void setLoanContractid(Long loanContractid) {
    this.loanContractid = loanContractid;
  }

  public Long getLoanContractNum() {
    return loanContractNum;
  }

  public void setLoanContractNum(Long loanContractNum) {
    this.loanContractNum = loanContractNum;
  }

  public String getBusinessType() {
    return businessType;
  }

  public void setBusinessType(String businessType) {
    this.businessType = businessType;
  }

  public String getIsExpedited() {
    return isExpedited;
  }

  public void setIsExpedited(String isExpedited) {
    this.isExpedited = isExpedited;
  }

  public Timestamp getSignDate() {
    return signDate;
  }

  public void setSignDate(Timestamp signDate) {
    this.signDate = signDate;
  }

  public Long getSignType() {
    return signType;
  }

  public void setSignType(Long signType) {
    this.signType = signType;
  }

  public String getApproveDate() {
    return approveDate;
  }

  public void setApproveDate(String approveDate) {
    this.approveDate = approveDate;
  }

  public String getFirstRepayDate() {
    return firstRepayDate;
  }

  public void setFirstRepayDate(String firstRepayDate) {
    this.firstRepayDate = firstRepayDate;
  }

  public Long getFeeFlag() {
    return feeFlag;
  }

  public void setFeeFlag(Long feeFlag) {
    this.feeFlag = feeFlag;
  }

  public String getInterestFlag() {
    return interestFlag;
  }

  public void setInterestFlag(String interestFlag) {
    this.interestFlag = interestFlag;
  }

  public Long getInterestType() {
    return interestType;
  }

  public void setInterestType(Long interestType) {
    this.interestType = interestType;
  }

  public Long getGraceDays() {
    return graceDays;
  }

  public void setGraceDays(Long graceDays) {
    this.graceDays = graceDays;
  }

  public Long getIrr() {
    return irr;
  }

  public void setIrr(Long irr) {
    this.irr = irr;
  }

  public Long getLnsRate() {
    return lnsRate;
  }

  public void setLnsRate(Long lnsRate) {
    this.lnsRate = lnsRate;
  }

  public String getChannelCode() {
    return channelCode;
  }

  public void setChannelCode(String channelCode) {
    this.channelCode = channelCode;
  }

  public String getChannelName() {
    return channelName;
  }

  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }

  public String getLoanOfficerId() {
    return loanOfficerId;
  }

  public void setLoanOfficerId(String loanOfficerId) {
    this.loanOfficerId = loanOfficerId;
  }

  public String getCityId() {
    return cityId;
  }

  public void setCityId(String cityId) {
    this.cityId = cityId;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getIsModify() {
    return isModify;
  }

  public void setIsModify(String isModify) {
    this.isModify = isModify;
  }

  public String getIsSchemeModify() {
    return isSchemeModify;
  }

  public void setIsSchemeModify(String isSchemeModify) {
    this.isSchemeModify = isSchemeModify;
  }

  public Long getRecycleWay() {
    return recycleWay;
  }

  public void setRecycleWay(Long recycleWay) {
    this.recycleWay = recycleWay;
  }

  public String getIsRecycleLoad() {
    return isRecycleLoad;
  }

  public void setIsRecycleLoad(String isRecycleLoad) {
    this.isRecycleLoad = isRecycleLoad;
  }

  public Long getRecycleLoanCnt() {
    return recycleLoanCnt;
  }

  public void setRecycleLoanCnt(Long recycleLoanCnt) {
    this.recycleLoanCnt = recycleLoanCnt;
  }

  public String getOldContractNum() {
    return oldContractNum;
  }

  public void setOldContractNum(String oldContractNum) {
    this.oldContractNum = oldContractNum;
  }

  public Long getSettleAmount() {
    return settleAmount;
  }

  public void setSettleAmount(Long settleAmount) {
    this.settleAmount = settleAmount;
  }

  public String getNewContractNum() {
    return newContractNum;
  }

  public void setNewContractNum(String newContractNum) {
    this.newContractNum = newContractNum;
  }

  public String getIsShorten() {
    return isShorten;
  }

  public void setIsShorten(String isShorten) {
    this.isShorten = isShorten;
  }

  public String getIsExtend() {
    return isExtend;
  }

  public void setIsExtend(String isExtend) {
    this.isExtend = isExtend;
  }

  public String getIsChangeProduce() {
    return isChangeProduce;
  }

  public void setIsChangeProduce(String isChangeProduce) {
    this.isChangeProduce = isChangeProduce;
  }

  public String getIsOverdue() {
    return isOverdue;
  }

  public void setIsOverdue(String isOverdue) {
    this.isOverdue = isOverdue;
  }

  public String getIsPayAhead() {
    return isPayAhead;
  }

  public void setIsPayAhead(String isPayAhead) {
    this.isPayAhead = isPayAhead;
  }

  public String getIsPayPart() {
    return isPayPart;
  }

  public void setIsPayPart(String isPayPart) {
    this.isPayPart = isPayPart;
  }

  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public String getPurposeSon() {
    return purposeSon;
  }

  public void setPurposeSon(String purposeSon) {
    this.purposeSon = purposeSon;
  }

  public String getPurposeDetail() {
    return purposeDetail;
  }

  public void setPurposeDetail(String purposeDetail) {
    this.purposeDetail = purposeDetail;
  }

  public String getIsDivAccount() {
    return isDivAccount;
  }

  public void setIsDivAccount(String isDivAccount) {
    this.isDivAccount = isDivAccount;
  }

  public String getSystemType() {
    return systemType;
  }

  public void setSystemType(String systemType) {
    this.systemType = systemType;
  }

  public String getHighRisk() {
    return highRisk;
  }

  public void setHighRisk(String highRisk) {
    this.highRisk = highRisk;
  }

  public String getIsBuyout() {
    return isBuyout;
  }

  public void setIsBuyout(String isBuyout) {
    this.isBuyout = isBuyout;
  }

  public String getFeeProcessType() {
    return feeProcessType;
  }

  public void setFeeProcessType(String feeProcessType) {
    this.feeProcessType = feeProcessType;
  }

  public String getStudentCorpName() {
    return studentCorpName;
  }

  public void setStudentCorpName(String studentCorpName) {
    this.studentCorpName = studentCorpName;
  }

  public String getSettleDate() {
    return settleDate;
  }

  public void setSettleDate(String settleDate) {
    this.settleDate = settleDate;
  }

  public String getHabitTime() {
    return habitTime;
  }

  public void setHabitTime(String habitTime) {
    this.habitTime = habitTime;
  }

  public String getRepayDay() {
    return repayDay;
  }

  public void setRepayDay(String repayDay) {
    this.repayDay = repayDay;
  }

  public String getApplyId() {
    return applyId;
  }

  public void setApplyId(String applyId) {
    this.applyId = applyId;
  }

  public String getOldApplyId() {
    return oldApplyId;
  }

  public void setOldApplyId(String oldApplyId) {
    this.oldApplyId = oldApplyId;
  }

  public String getDeptId() {
    return deptId;
  }

  public void setDeptId(String deptId) {
    this.deptId = deptId;
  }

  public String getDeptName() {
    return deptName;
  }

  public void setDeptName(String deptName) {
    this.deptName = deptName;
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

  public Long getFrontChargeDiscount() {
    return frontChargeDiscount;
  }

  public void setFrontChargeDiscount(Long frontChargeDiscount) {
    this.frontChargeDiscount = frontChargeDiscount;
  }

  public Long getMonthMRate() {
    return monthMRate;
  }

  public void setMonthMRate(Long monthMRate) {
    this.monthMRate = monthMRate;
  }

  public Long getHandleChargeRate() {
    return handleChargeRate;
  }

  public void setHandleChargeRate(Long handleChargeRate) {
    this.handleChargeRate = handleChargeRate;
  }

  public Long getLoanTimes() {
    return loanTimes;
  }

  public void setLoanTimes(Long loanTimes) {
    this.loanTimes = loanTimes;
  }

  public String getPawn() {
    return pawn;
  }

  public void setPawn(String pawn) {
    this.pawn = pawn;
  }

  public Long getHandleCharge() {
    return handleCharge;
  }

  public void setHandleCharge(Long handleCharge) {
    this.handleCharge = handleCharge;
  }

  public Long getMonthChargeDiscount() {
    return monthChargeDiscount;
  }

  public void setMonthChargeDiscount(Long monthChargeDiscount) {
    this.monthChargeDiscount = monthChargeDiscount;
  }

  public Long getGuaranteeFee() {
    return guaranteeFee;
  }

  public void setGuaranteeFee(Long guaranteeFee) {
    this.guaranteeFee = guaranteeFee;
  }

  public String getGuaranteeCompany() {
    return guaranteeCompany;
  }

  public void setGuaranteeCompany(String guaranteeCompany) {
    this.guaranteeCompany = guaranteeCompany;
  }

  public String getLoanType() {
    return loanType;
  }

  public void setLoanType(String loanType) {
    this.loanType = loanType;
  }

  public String getTrustCompany() {
    return trustCompany;
  }

  public void setTrustCompany(String trustCompany) {
    this.trustCompany = trustCompany;
  }

  public String getTrustProduct() {
    return trustProduct;
  }

  public void setTrustProduct(String trustProduct) {
    this.trustProduct = trustProduct;
  }

  public String getTrustPlan() {
    return trustPlan;
  }

  public void setTrustPlan(String trustPlan) {
    this.trustPlan = trustPlan;
  }

  public String getChangeType() {
    return changeType;
  }

  public void setChangeType(String changeType) {
    this.changeType = changeType;
  }

  public String getChangeAmount() {
    return changeAmount;
  }

  public void setChangeAmount(String changeAmount) {
    this.changeAmount = changeAmount;
  }
}

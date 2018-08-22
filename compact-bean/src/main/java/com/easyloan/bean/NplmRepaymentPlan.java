package com.easyloan.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;

public class NplmRepaymentPlan {

  @Column
  @Id
  private Long id;
  @Column
  private Long loanContractNum;
  @Column
  private Long instalment;
  @Column
  private Date preRepaymentDate;
  @Column
  private Date repaymentDate;
  @Column
  private Long capital;
  @Column
  private Long interest;
  @Column
  private Long installmentFee;
  @Column
  private Long amerce;
  @Column
  private Long forfeit;
  @Column
  private Long penalty;
  @Column
  private Long changeFee;
  @Column
  private Long otherFee;
  @Column
  private Long repaymentAmount;
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
  private Long reduceCapital;
  @Column
  private Long reduceInterest;
  @Column
  private Long reduceAmerce;
  @Column
  private Long reduceForfeit;
  @Column
  private Long reduceInstFee;
  @Column
  private Long reducePenalty;
  @Column
  private Long reducePreFee;
  @Column
  private Long reduceOtherFee;
  @Column
  private Long remainCapital;
  @Column
  private Long npvRemainCapital;
  @Column
  private Long allRepaymentAmount;
  @Column
  private String repaymentState;
  @Column
  private String remark;
  @Column
  private String creator;
  @Column
  private Timestamp createTime;
  @Column
  private String updater;
  @Column
  private Timestamp updateTime;
  @Column
  private String isOperating;
  @Column
  private String updateType;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getLoanContractNum() {
    return loanContractNum;
  }

  public void setLoanContractNum(Long loanContractNum) {
    this.loanContractNum = loanContractNum;
  }

  public Long getInstalment() {
    return instalment;
  }

  public void setInstalment(Long instalment) {
    this.instalment = instalment;
  }

  public Date getPreRepaymentDate() {
    return preRepaymentDate;
  }

  public void setPreRepaymentDate(Date preRepaymentDate) {
    this.preRepaymentDate = preRepaymentDate;
  }

  public Date getRepaymentDate() {
    return repaymentDate;
  }

  public void setRepaymentDate(Date repaymentDate) {
    this.repaymentDate = repaymentDate;
  }

  public Long getCapital() {
    return capital;
  }

  public void setCapital(Long capital) {
    this.capital = capital;
  }

  public Long getInterest() {
    return interest;
  }

  public void setInterest(Long interest) {
    this.interest = interest;
  }

  public Long getInstallmentFee() {
    return installmentFee;
  }

  public void setInstallmentFee(Long installmentFee) {
    this.installmentFee = installmentFee;
  }

  public Long getAmerce() {
    return amerce;
  }

  public void setAmerce(Long amerce) {
    this.amerce = amerce;
  }

  public Long getForfeit() {
    return forfeit;
  }

  public void setForfeit(Long forfeit) {
    this.forfeit = forfeit;
  }

  public Long getPenalty() {
    return penalty;
  }

  public void setPenalty(Long penalty) {
    this.penalty = penalty;
  }

  public Long getChangeFee() {
    return changeFee;
  }

  public void setChangeFee(Long changeFee) {
    this.changeFee = changeFee;
  }

  public Long getOtherFee() {
    return otherFee;
  }

  public void setOtherFee(Long otherFee) {
    this.otherFee = otherFee;
  }

  public Long getRepaymentAmount() {
    return repaymentAmount;
  }

  public void setRepaymentAmount(Long repaymentAmount) {
    this.repaymentAmount = repaymentAmount;
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

  public Long getReduceInstFee() {
    return reduceInstFee;
  }

  public void setReduceInstFee(Long reduceInstFee) {
    this.reduceInstFee = reduceInstFee;
  }

  public Long getReducePenalty() {
    return reducePenalty;
  }

  public void setReducePenalty(Long reducePenalty) {
    this.reducePenalty = reducePenalty;
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

  public Long getRemainCapital() {
    return remainCapital;
  }

  public void setRemainCapital(Long remainCapital) {
    this.remainCapital = remainCapital;
  }

  public Long getNpvRemainCapital() {
    return npvRemainCapital;
  }

  public void setNpvRemainCapital(Long npvRemainCapital) {
    this.npvRemainCapital = npvRemainCapital;
  }

  public Long getAllRepaymentAmount() {
    return allRepaymentAmount;
  }

  public void setAllRepaymentAmount(Long allRepaymentAmount) {
    this.allRepaymentAmount = allRepaymentAmount;
  }

  public String getRepaymentState() {
    return repaymentState;
  }

  public void setRepaymentState(String repaymentState) {
    this.repaymentState = repaymentState;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
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

  public String getIsOperating() {
    return isOperating;
  }

  public void setIsOperating(String isOperating) {
    this.isOperating = isOperating;
  }

  public String getUpdateType() {
    return updateType;
  }

  public void setUpdateType(String updateType) {
    this.updateType = updateType;
  }
}

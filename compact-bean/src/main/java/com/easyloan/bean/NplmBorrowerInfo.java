package com.easyloan.bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

public class NplmBorrowerInfo implements Serializable {
  @Id
  @Column
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column
  private Long applyClientId;
  @Column
  private Long ecifId;
  @Column
  private String clientName;
  @Column
  private String mobile;
  @Column
  private String oldName;
  @Column
  private String sex;
  @Column
  private String nation;
  @Column
  private String birthday;
  @Column
  private String marital;
  @Column
  private Long haveChildren;
  @Column
  private Long childrenCount;
  @Column
  private String nationality;
  @Column
  private String hProvince;
  @Column
  private String hCity;
  @Column
  private String hDress;
  @Column
  private String identityType;
  @Column
  private String identityNum;
  @Column
  private String identityValidDate;
  @Column
  private String haveCar;
  @Column
  private String houseExplain;
  @Column
  private String resideExplain;
  @Column
  private String resideYear;
  @Column
  private String degree;
  @Column
  private String diploma;
  @Column
  private Long yearIncome;
  @Column
  private String industry;
  @Column
  private String job;
  @Column
  private String company;
  @Column
  private String companyType;
  @Column
  private String department;
  @Column
  private String position;
  @Column
  private Long workTime;
  @Column
  private String workTimeUnit;
  @Column
  private String clientArea;
  @Column
  private String clientType;
  @Column
  private String fNation;
  @Column
  private String fProvince;
  @Column
  private String fCity;
  @Column
  private String fArea;
  @Column
  private String fStreet;
  @Column
  private String fZipcode;
  @Column
  private String cNation;
  @Column
  private String cProvince;
  @Column
  private String cCity;
  @Column
  private String cArea;
  @Column
  private String cStreet;
  @Column
  private String cZipcode;
  @Column
  private String mobile1;
  @Column
  private String mobile2;
  @Column
  private String mobile3;
  @Column
  private String fTel1;
  @Column
  private String fTel2;
  @Column
  private String fTel3;
  @Column
  private String cTel1;
  @Column
  private String cTel2;
  @Column
  private String cTel3;
  @Column
  private String email1;
  @Column
  private String email2;
  @Column
  private String email3;
  @Column
  private Long creditAmount;
  @Column
  private String sociallSecurity;
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

  public Long getApplyClientId() {
    return applyClientId;
  }

  public void setApplyClientId(Long applyClientId) {
    this.applyClientId = applyClientId;
  }

  public Long getEcifId() {
    return ecifId;
  }

  public void setEcifId(Long ecifId) {
    this.ecifId = ecifId;
  }

  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getOldName() {
    return oldName;
  }

  public void setOldName(String oldName) {
    this.oldName = oldName;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getNation() {
    return nation;
  }

  public void setNation(String nation) {
    this.nation = nation;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public String getMarital() {
    return marital;
  }

  public void setMarital(String marital) {
    this.marital = marital;
  }

  public Long getHaveChildren() {
    return haveChildren;
  }

  public void setHaveChildren(Long haveChildren) {
    this.haveChildren = haveChildren;
  }

  public Long getChildrenCount() {
    return childrenCount;
  }

  public void setChildrenCount(Long childrenCount) {
    this.childrenCount = childrenCount;
  }

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public String gethProvince() {
    return hProvince;
  }

  public void sethProvince(String hProvince) {
    this.hProvince = hProvince;
  }

  public String gethCity() {
    return hCity;
  }

  public void sethCity(String hCity) {
    this.hCity = hCity;
  }

  public String gethDress() {
    return hDress;
  }

  public void sethDress(String hDress) {
    this.hDress = hDress;
  }

  public String getIdentityType() {
    return identityType;
  }

  public void setIdentityType(String identityType) {
    this.identityType = identityType;
  }

  public String getIdentityNum() {
    return identityNum;
  }

  public void setIdentityNum(String identityNum) {
    this.identityNum = identityNum;
  }

  public String getIdentityValidDate() {
    return identityValidDate;
  }

  public void setIdentityValidDate(String identityValidDate) {
    this.identityValidDate = identityValidDate;
  }

  public String getHaveCar() {
    return haveCar;
  }

  public void setHaveCar(String haveCar) {
    this.haveCar = haveCar;
  }

  public String getHouseExplain() {
    return houseExplain;
  }

  public void setHouseExplain(String houseExplain) {
    this.houseExplain = houseExplain;
  }

  public String getResideExplain() {
    return resideExplain;
  }

  public void setResideExplain(String resideExplain) {
    this.resideExplain = resideExplain;
  }

  public String getResideYear() {
    return resideYear;
  }

  public void setResideYear(String resideYear) {
    this.resideYear = resideYear;
  }

  public String getDegree() {
    return degree;
  }

  public void setDegree(String degree) {
    this.degree = degree;
  }

  public String getDiploma() {
    return diploma;
  }

  public void setDiploma(String diploma) {
    this.diploma = diploma;
  }

  public Long getYearIncome() {
    return yearIncome;
  }

  public void setYearIncome(Long yearIncome) {
    this.yearIncome = yearIncome;
  }

  public String getIndustry() {
    return industry;
  }

  public void setIndustry(String industry) {
    this.industry = industry;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getCompanyType() {
    return companyType;
  }

  public void setCompanyType(String companyType) {
    this.companyType = companyType;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public Long getWorkTime() {
    return workTime;
  }

  public void setWorkTime(Long workTime) {
    this.workTime = workTime;
  }

  public String getWorkTimeUnit() {
    return workTimeUnit;
  }

  public void setWorkTimeUnit(String workTimeUnit) {
    this.workTimeUnit = workTimeUnit;
  }

  public String getClientArea() {
    return clientArea;
  }

  public void setClientArea(String clientArea) {
    this.clientArea = clientArea;
  }

  public String getClientType() {
    return clientType;
  }

  public void setClientType(String clientType) {
    this.clientType = clientType;
  }

  public String getfNation() {
    return fNation;
  }

  public void setfNation(String fNation) {
    this.fNation = fNation;
  }

  public String getfProvince() {
    return fProvince;
  }

  public void setfProvince(String fProvince) {
    this.fProvince = fProvince;
  }

  public String getfCity() {
    return fCity;
  }

  public void setfCity(String fCity) {
    this.fCity = fCity;
  }

  public String getfArea() {
    return fArea;
  }

  public void setfArea(String fArea) {
    this.fArea = fArea;
  }

  public String getfStreet() {
    return fStreet;
  }

  public void setfStreet(String fStreet) {
    this.fStreet = fStreet;
  }

  public String getfZipcode() {
    return fZipcode;
  }

  public void setfZipcode(String fZipcode) {
    this.fZipcode = fZipcode;
  }

  public String getcNation() {
    return cNation;
  }

  public void setcNation(String cNation) {
    this.cNation = cNation;
  }

  public String getcProvince() {
    return cProvince;
  }

  public void setcProvince(String cProvince) {
    this.cProvince = cProvince;
  }

  public String getcCity() {
    return cCity;
  }

  public void setcCity(String cCity) {
    this.cCity = cCity;
  }

  public String getcArea() {
    return cArea;
  }

  public void setcArea(String cArea) {
    this.cArea = cArea;
  }

  public String getcStreet() {
    return cStreet;
  }

  public void setcStreet(String cStreet) {
    this.cStreet = cStreet;
  }

  public String getcZipcode() {
    return cZipcode;
  }

  public void setcZipcode(String cZipcode) {
    this.cZipcode = cZipcode;
  }

  public String getMobile1() {
    return mobile1;
  }

  public void setMobile1(String mobile1) {
    this.mobile1 = mobile1;
  }

  public String getMobile2() {
    return mobile2;
  }

  public void setMobile2(String mobile2) {
    this.mobile2 = mobile2;
  }

  public String getMobile3() {
    return mobile3;
  }

  public void setMobile3(String mobile3) {
    this.mobile3 = mobile3;
  }

  public String getfTel1() {
    return fTel1;
  }

  public void setfTel1(String fTel1) {
    this.fTel1 = fTel1;
  }

  public String getfTel2() {
    return fTel2;
  }

  public void setfTel2(String fTel2) {
    this.fTel2 = fTel2;
  }

  public String getfTel3() {
    return fTel3;
  }

  public void setfTel3(String fTel3) {
    this.fTel3 = fTel3;
  }

  public String getcTel1() {
    return cTel1;
  }

  public void setcTel1(String cTel1) {
    this.cTel1 = cTel1;
  }

  public String getcTel2() {
    return cTel2;
  }

  public void setcTel2(String cTel2) {
    this.cTel2 = cTel2;
  }

  public String getcTel3() {
    return cTel3;
  }

  public void setcTel3(String cTel3) {
    this.cTel3 = cTel3;
  }

  public String getEmail1() {
    return email1;
  }

  public void setEmail1(String email1) {
    this.email1 = email1;
  }

  public String getEmail2() {
    return email2;
  }

  public void setEmail2(String email2) {
    this.email2 = email2;
  }

  public String getEmail3() {
    return email3;
  }

  public void setEmail3(String email3) {
    this.email3 = email3;
  }

  public Long getCreditAmount() {
    return creditAmount;
  }

  public void setCreditAmount(Long creditAmount) {
    this.creditAmount = creditAmount;
  }

  public String getSociallSecurity() {
    return sociallSecurity;
  }

  public void setSociallSecurity(String sociallSecurity) {
    this.sociallSecurity = sociallSecurity;
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

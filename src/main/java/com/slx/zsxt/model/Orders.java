package com.slx.zsxt.model;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    private String orderId;

    private String prescnId;

    private String orgId;

    private String regId;

    private String patientIndexNo;

    private BigDecimal age;

    private String ageUnit;

    private String orderCategory;

    private String enterBatchNumber;

    private String orderGroupNo;

    private String orderGroupNoUuid;

    private String orderType;

    private String orderText;

    private String orderName;

    private String objective;

    private String enterDeptId;

    private String enterDeptName;

    private String enterAreaId;

    private String enterAreaName;

    private String enterDocId;

    private String enterDocName;

    private Date enterDate;

    private Date orderStartDate;

    private String executiveDeptId;

    private String executiveDeptName;

    private String executiveAreaId;

    private String executiveAreaName;

    private String checkNurseId;

    private String checkNurseName;

    private Date nurseCheckDate;

    private String nurseCheckResult;

    private Date stopSysDate;

    private Date orderEndDate;

    private String stopOrderDocId;

    private String stopOrderDocName;

    private Date stopCheckDate;

    private String stopCheckNurseId;

    private String stopCheckNurseName;

    private Date lastPerformDate;

    private String orderStatus;

    private String orderClassify;

    private String itemId;

    private String priceUnit;

    private BigDecimal dosage;

    private String doseUnitId;

    private String doseUnitName;

    private String dropNumber;

    private BigDecimal quantity;

    private String unit;

    private String unitName;

    private String usageId;

    private String usageName;

    private String freqId;

    private String freqName;

    private String cnMedOrderUsage;

    private String cnMedDecoctionMethod;

    private BigDecimal cnMedDoseDecoctTimes;

    private BigDecimal cnMedDecoctNumOneTime;

    private BigDecimal cnMedDosage;

    private BigDecimal cnMedFreq;

    private String skinTest;

    private String skinTestResult;

    private String noDrug;

    private String noCharge;

    private String urgent;

    private String dischargeMed;

    private String freqTimesId;

    private String specType;

    private BigDecimal price;

    private String prescnNo;

    private String formId;

    private String formNo;

    private String outHostatilType;

    private String isAutoAccount;

    private String outOutcom;

    private BigDecimal course;

    private String chargeStatus;

    private Date transBoodDate;

    private String areaType;

    private String remark;

    private String createBy;

    private Date createDate;

    private String modifyBy;

    private Date modifyDate;

    private String status;

    private BigDecimal amount;

    private String skinMinusDrug;

    private BigDecimal inpExeTimes;

    private String isRows;

    private Short groupSort;

    private String orderUnifyId;

    private String ownedDrug;

    private String dispensDeptId;

    private String dispensDeptName;

    private String guideDeptId;

    private String guideDeptName;

    private String isSpecial;

    private String drugType;

    private BigDecimal actualDrugUseDays;

    private String avoidSkinTest;

    private String storageUnitCode;

    private String storageUnitName;

    private BigDecimal salesPrices;

    private BigDecimal revealQuantity;

    private BigDecimal specificValue;

    private String storageBatch;

    private String inventoryQuantity;

    public Orders(String orderId, String prescnId, String orgId, String regId, String patientIndexNo, BigDecimal age, String ageUnit, String orderCategory, String enterBatchNumber, String orderGroupNo, String orderGroupNoUuid, String orderType, String orderText, String orderName, String objective, String enterDeptId, String enterDeptName, String enterAreaId, String enterAreaName, String enterDocId, String enterDocName, Date enterDate, Date orderStartDate, String executiveDeptId, String executiveDeptName, String executiveAreaId, String executiveAreaName, String checkNurseId, String checkNurseName, Date nurseCheckDate, String nurseCheckResult, Date stopSysDate, Date orderEndDate, String stopOrderDocId, String stopOrderDocName, Date stopCheckDate, String stopCheckNurseId, String stopCheckNurseName, Date lastPerformDate, String orderStatus, String orderClassify, String itemId, String priceUnit, BigDecimal dosage, String doseUnitId, String doseUnitName, String dropNumber, BigDecimal quantity, String unit, String unitName, String usageId, String usageName, String freqId, String freqName, String cnMedOrderUsage, String cnMedDecoctionMethod, BigDecimal cnMedDoseDecoctTimes, BigDecimal cnMedDecoctNumOneTime, BigDecimal cnMedDosage, BigDecimal cnMedFreq, String skinTest, String skinTestResult, String noDrug, String noCharge, String urgent, String dischargeMed, String freqTimesId, String specType, BigDecimal price, String prescnNo, String formId, String formNo, String outHostatilType, String isAutoAccount, String outOutcom, BigDecimal course, String chargeStatus, Date transBoodDate, String areaType, String remark, String createBy, Date createDate, String modifyBy, Date modifyDate, String status, BigDecimal amount, String skinMinusDrug, BigDecimal inpExeTimes, String isRows, Short groupSort, String orderUnifyId, String ownedDrug, String dispensDeptId, String dispensDeptName, String guideDeptId, String guideDeptName, String isSpecial, String drugType, BigDecimal actualDrugUseDays, String avoidSkinTest, String storageUnitCode, String storageUnitName, BigDecimal salesPrices, BigDecimal revealQuantity, BigDecimal specificValue, String storageBatch, String inventoryQuantity) {
        this.orderId = orderId;
        this.prescnId = prescnId;
        this.orgId = orgId;
        this.regId = regId;
        this.patientIndexNo = patientIndexNo;
        this.age = age;
        this.ageUnit = ageUnit;
        this.orderCategory = orderCategory;
        this.enterBatchNumber = enterBatchNumber;
        this.orderGroupNo = orderGroupNo;
        this.orderGroupNoUuid = orderGroupNoUuid;
        this.orderType = orderType;
        this.orderText = orderText;
        this.orderName = orderName;
        this.objective = objective;
        this.enterDeptId = enterDeptId;
        this.enterDeptName = enterDeptName;
        this.enterAreaId = enterAreaId;
        this.enterAreaName = enterAreaName;
        this.enterDocId = enterDocId;
        this.enterDocName = enterDocName;
        this.enterDate = enterDate;
        this.orderStartDate = orderStartDate;
        this.executiveDeptId = executiveDeptId;
        this.executiveDeptName = executiveDeptName;
        this.executiveAreaId = executiveAreaId;
        this.executiveAreaName = executiveAreaName;
        this.checkNurseId = checkNurseId;
        this.checkNurseName = checkNurseName;
        this.nurseCheckDate = nurseCheckDate;
        this.nurseCheckResult = nurseCheckResult;
        this.stopSysDate = stopSysDate;
        this.orderEndDate = orderEndDate;
        this.stopOrderDocId = stopOrderDocId;
        this.stopOrderDocName = stopOrderDocName;
        this.stopCheckDate = stopCheckDate;
        this.stopCheckNurseId = stopCheckNurseId;
        this.stopCheckNurseName = stopCheckNurseName;
        this.lastPerformDate = lastPerformDate;
        this.orderStatus = orderStatus;
        this.orderClassify = orderClassify;
        this.itemId = itemId;
        this.priceUnit = priceUnit;
        this.dosage = dosage;
        this.doseUnitId = doseUnitId;
        this.doseUnitName = doseUnitName;
        this.dropNumber = dropNumber;
        this.quantity = quantity;
        this.unit = unit;
        this.unitName = unitName;
        this.usageId = usageId;
        this.usageName = usageName;
        this.freqId = freqId;
        this.freqName = freqName;
        this.cnMedOrderUsage = cnMedOrderUsage;
        this.cnMedDecoctionMethod = cnMedDecoctionMethod;
        this.cnMedDoseDecoctTimes = cnMedDoseDecoctTimes;
        this.cnMedDecoctNumOneTime = cnMedDecoctNumOneTime;
        this.cnMedDosage = cnMedDosage;
        this.cnMedFreq = cnMedFreq;
        this.skinTest = skinTest;
        this.skinTestResult = skinTestResult;
        this.noDrug = noDrug;
        this.noCharge = noCharge;
        this.urgent = urgent;
        this.dischargeMed = dischargeMed;
        this.freqTimesId = freqTimesId;
        this.specType = specType;
        this.price = price;
        this.prescnNo = prescnNo;
        this.formId = formId;
        this.formNo = formNo;
        this.outHostatilType = outHostatilType;
        this.isAutoAccount = isAutoAccount;
        this.outOutcom = outOutcom;
        this.course = course;
        this.chargeStatus = chargeStatus;
        this.transBoodDate = transBoodDate;
        this.areaType = areaType;
        this.remark = remark;
        this.createBy = createBy;
        this.createDate = createDate;
        this.modifyBy = modifyBy;
        this.modifyDate = modifyDate;
        this.status = status;
        this.amount = amount;
        this.skinMinusDrug = skinMinusDrug;
        this.inpExeTimes = inpExeTimes;
        this.isRows = isRows;
        this.groupSort = groupSort;
        this.orderUnifyId = orderUnifyId;
        this.ownedDrug = ownedDrug;
        this.dispensDeptId = dispensDeptId;
        this.dispensDeptName = dispensDeptName;
        this.guideDeptId = guideDeptId;
        this.guideDeptName = guideDeptName;
        this.isSpecial = isSpecial;
        this.drugType = drugType;
        this.actualDrugUseDays = actualDrugUseDays;
        this.avoidSkinTest = avoidSkinTest;
        this.storageUnitCode = storageUnitCode;
        this.storageUnitName = storageUnitName;
        this.salesPrices = salesPrices;
        this.revealQuantity = revealQuantity;
        this.specificValue = specificValue;
        this.storageBatch = storageBatch;
        this.inventoryQuantity = inventoryQuantity;
    }

    public Orders() {
        super();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getPrescnId() {
        return prescnId;
    }

    public void setPrescnId(String prescnId) {
        this.prescnId = prescnId == null ? null : prescnId.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId == null ? null : regId.trim();
    }

    public String getPatientIndexNo() {
        return patientIndexNo;
    }

    public void setPatientIndexNo(String patientIndexNo) {
        this.patientIndexNo = patientIndexNo == null ? null : patientIndexNo.trim();
    }

    public BigDecimal getAge() {
        return age;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }

    public String getAgeUnit() {
        return ageUnit;
    }

    public void setAgeUnit(String ageUnit) {
        this.ageUnit = ageUnit == null ? null : ageUnit.trim();
    }

    public String getOrderCategory() {
        return orderCategory;
    }

    public void setOrderCategory(String orderCategory) {
        this.orderCategory = orderCategory == null ? null : orderCategory.trim();
    }

    public String getEnterBatchNumber() {
        return enterBatchNumber;
    }

    public void setEnterBatchNumber(String enterBatchNumber) {
        this.enterBatchNumber = enterBatchNumber == null ? null : enterBatchNumber.trim();
    }

    public String getOrderGroupNo() {
        return orderGroupNo;
    }

    public void setOrderGroupNo(String orderGroupNo) {
        this.orderGroupNo = orderGroupNo == null ? null : orderGroupNo.trim();
    }

    public String getOrderGroupNoUuid() {
        return orderGroupNoUuid;
    }

    public void setOrderGroupNoUuid(String orderGroupNoUuid) {
        this.orderGroupNoUuid = orderGroupNoUuid == null ? null : orderGroupNoUuid.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getOrderText() {
        return orderText;
    }

    public void setOrderText(String orderText) {
        this.orderText = orderText == null ? null : orderText.trim();
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName == null ? null : orderName.trim();
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective == null ? null : objective.trim();
    }

    public String getEnterDeptId() {
        return enterDeptId;
    }

    public void setEnterDeptId(String enterDeptId) {
        this.enterDeptId = enterDeptId == null ? null : enterDeptId.trim();
    }

    public String getEnterDeptName() {
        return enterDeptName;
    }

    public void setEnterDeptName(String enterDeptName) {
        this.enterDeptName = enterDeptName == null ? null : enterDeptName.trim();
    }

    public String getEnterAreaId() {
        return enterAreaId;
    }

    public void setEnterAreaId(String enterAreaId) {
        this.enterAreaId = enterAreaId == null ? null : enterAreaId.trim();
    }

    public String getEnterAreaName() {
        return enterAreaName;
    }

    public void setEnterAreaName(String enterAreaName) {
        this.enterAreaName = enterAreaName == null ? null : enterAreaName.trim();
    }

    public String getEnterDocId() {
        return enterDocId;
    }

    public void setEnterDocId(String enterDocId) {
        this.enterDocId = enterDocId == null ? null : enterDocId.trim();
    }

    public String getEnterDocName() {
        return enterDocName;
    }

    public void setEnterDocName(String enterDocName) {
        this.enterDocName = enterDocName == null ? null : enterDocName.trim();
    }

    public Date getEnterDate() {
        return enterDate;
    }

    public void setEnterDate(Date enterDate) {
        this.enterDate = enterDate;
    }

    public Date getOrderStartDate() {
        return orderStartDate;
    }

    public void setOrderStartDate(Date orderStartDate) {
        this.orderStartDate = orderStartDate;
    }

    public String getExecutiveDeptId() {
        return executiveDeptId;
    }

    public void setExecutiveDeptId(String executiveDeptId) {
        this.executiveDeptId = executiveDeptId == null ? null : executiveDeptId.trim();
    }

    public String getExecutiveDeptName() {
        return executiveDeptName;
    }

    public void setExecutiveDeptName(String executiveDeptName) {
        this.executiveDeptName = executiveDeptName == null ? null : executiveDeptName.trim();
    }

    public String getExecutiveAreaId() {
        return executiveAreaId;
    }

    public void setExecutiveAreaId(String executiveAreaId) {
        this.executiveAreaId = executiveAreaId == null ? null : executiveAreaId.trim();
    }

    public String getExecutiveAreaName() {
        return executiveAreaName;
    }

    public void setExecutiveAreaName(String executiveAreaName) {
        this.executiveAreaName = executiveAreaName == null ? null : executiveAreaName.trim();
    }

    public String getCheckNurseId() {
        return checkNurseId;
    }

    public void setCheckNurseId(String checkNurseId) {
        this.checkNurseId = checkNurseId == null ? null : checkNurseId.trim();
    }

    public String getCheckNurseName() {
        return checkNurseName;
    }

    public void setCheckNurseName(String checkNurseName) {
        this.checkNurseName = checkNurseName == null ? null : checkNurseName.trim();
    }

    public Date getNurseCheckDate() {
        return nurseCheckDate;
    }

    public void setNurseCheckDate(Date nurseCheckDate) {
        this.nurseCheckDate = nurseCheckDate;
    }

    public String getNurseCheckResult() {
        return nurseCheckResult;
    }

    public void setNurseCheckResult(String nurseCheckResult) {
        this.nurseCheckResult = nurseCheckResult == null ? null : nurseCheckResult.trim();
    }

    public Date getStopSysDate() {
        return stopSysDate;
    }

    public void setStopSysDate(Date stopSysDate) {
        this.stopSysDate = stopSysDate;
    }

    public Date getOrderEndDate() {
        return orderEndDate;
    }

    public void setOrderEndDate(Date orderEndDate) {
        this.orderEndDate = orderEndDate;
    }

    public String getStopOrderDocId() {
        return stopOrderDocId;
    }

    public void setStopOrderDocId(String stopOrderDocId) {
        this.stopOrderDocId = stopOrderDocId == null ? null : stopOrderDocId.trim();
    }

    public String getStopOrderDocName() {
        return stopOrderDocName;
    }

    public void setStopOrderDocName(String stopOrderDocName) {
        this.stopOrderDocName = stopOrderDocName == null ? null : stopOrderDocName.trim();
    }

    public Date getStopCheckDate() {
        return stopCheckDate;
    }

    public void setStopCheckDate(Date stopCheckDate) {
        this.stopCheckDate = stopCheckDate;
    }

    public String getStopCheckNurseId() {
        return stopCheckNurseId;
    }

    public void setStopCheckNurseId(String stopCheckNurseId) {
        this.stopCheckNurseId = stopCheckNurseId == null ? null : stopCheckNurseId.trim();
    }

    public String getStopCheckNurseName() {
        return stopCheckNurseName;
    }

    public void setStopCheckNurseName(String stopCheckNurseName) {
        this.stopCheckNurseName = stopCheckNurseName == null ? null : stopCheckNurseName.trim();
    }

    public Date getLastPerformDate() {
        return lastPerformDate;
    }

    public void setLastPerformDate(Date lastPerformDate) {
        this.lastPerformDate = lastPerformDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getOrderClassify() {
        return orderClassify;
    }

    public void setOrderClassify(String orderClassify) {
        this.orderClassify = orderClassify == null ? null : orderClassify.trim();
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    public String getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit == null ? null : priceUnit.trim();
    }

    public BigDecimal getDosage() {
        return dosage;
    }

    public void setDosage(BigDecimal dosage) {
        this.dosage = dosage;
    }

    public String getDoseUnitId() {
        return doseUnitId;
    }

    public void setDoseUnitId(String doseUnitId) {
        this.doseUnitId = doseUnitId == null ? null : doseUnitId.trim();
    }

    public String getDoseUnitName() {
        return doseUnitName;
    }

    public void setDoseUnitName(String doseUnitName) {
        this.doseUnitName = doseUnitName == null ? null : doseUnitName.trim();
    }

    public String getDropNumber() {
        return dropNumber;
    }

    public void setDropNumber(String dropNumber) {
        this.dropNumber = dropNumber == null ? null : dropNumber.trim();
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }

    public String getUsageId() {
        return usageId;
    }

    public void setUsageId(String usageId) {
        this.usageId = usageId == null ? null : usageId.trim();
    }

    public String getUsageName() {
        return usageName;
    }

    public void setUsageName(String usageName) {
        this.usageName = usageName == null ? null : usageName.trim();
    }

    public String getFreqId() {
        return freqId;
    }

    public void setFreqId(String freqId) {
        this.freqId = freqId == null ? null : freqId.trim();
    }

    public String getFreqName() {
        return freqName;
    }

    public void setFreqName(String freqName) {
        this.freqName = freqName == null ? null : freqName.trim();
    }

    public String getCnMedOrderUsage() {
        return cnMedOrderUsage;
    }

    public void setCnMedOrderUsage(String cnMedOrderUsage) {
        this.cnMedOrderUsage = cnMedOrderUsage == null ? null : cnMedOrderUsage.trim();
    }

    public String getCnMedDecoctionMethod() {
        return cnMedDecoctionMethod;
    }

    public void setCnMedDecoctionMethod(String cnMedDecoctionMethod) {
        this.cnMedDecoctionMethod = cnMedDecoctionMethod == null ? null : cnMedDecoctionMethod.trim();
    }

    public BigDecimal getCnMedDoseDecoctTimes() {
        return cnMedDoseDecoctTimes;
    }

    public void setCnMedDoseDecoctTimes(BigDecimal cnMedDoseDecoctTimes) {
        this.cnMedDoseDecoctTimes = cnMedDoseDecoctTimes;
    }

    public BigDecimal getCnMedDecoctNumOneTime() {
        return cnMedDecoctNumOneTime;
    }

    public void setCnMedDecoctNumOneTime(BigDecimal cnMedDecoctNumOneTime) {
        this.cnMedDecoctNumOneTime = cnMedDecoctNumOneTime;
    }

    public BigDecimal getCnMedDosage() {
        return cnMedDosage;
    }

    public void setCnMedDosage(BigDecimal cnMedDosage) {
        this.cnMedDosage = cnMedDosage;
    }

    public BigDecimal getCnMedFreq() {
        return cnMedFreq;
    }

    public void setCnMedFreq(BigDecimal cnMedFreq) {
        this.cnMedFreq = cnMedFreq;
    }

    public String getSkinTest() {
        return skinTest;
    }

    public void setSkinTest(String skinTest) {
        this.skinTest = skinTest == null ? null : skinTest.trim();
    }

    public String getSkinTestResult() {
        return skinTestResult;
    }

    public void setSkinTestResult(String skinTestResult) {
        this.skinTestResult = skinTestResult == null ? null : skinTestResult.trim();
    }

    public String getNoDrug() {
        return noDrug;
    }

    public void setNoDrug(String noDrug) {
        this.noDrug = noDrug == null ? null : noDrug.trim();
    }

    public String getNoCharge() {
        return noCharge;
    }

    public void setNoCharge(String noCharge) {
        this.noCharge = noCharge == null ? null : noCharge.trim();
    }

    public String getUrgent() {
        return urgent;
    }

    public void setUrgent(String urgent) {
        this.urgent = urgent == null ? null : urgent.trim();
    }

    public String getDischargeMed() {
        return dischargeMed;
    }

    public void setDischargeMed(String dischargeMed) {
        this.dischargeMed = dischargeMed == null ? null : dischargeMed.trim();
    }

    public String getFreqTimesId() {
        return freqTimesId;
    }

    public void setFreqTimesId(String freqTimesId) {
        this.freqTimesId = freqTimesId == null ? null : freqTimesId.trim();
    }

    public String getSpecType() {
        return specType;
    }

    public void setSpecType(String specType) {
        this.specType = specType == null ? null : specType.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPrescnNo() {
        return prescnNo;
    }

    public void setPrescnNo(String prescnNo) {
        this.prescnNo = prescnNo == null ? null : prescnNo.trim();
    }

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId == null ? null : formId.trim();
    }

    public String getFormNo() {
        return formNo;
    }

    public void setFormNo(String formNo) {
        this.formNo = formNo == null ? null : formNo.trim();
    }

    public String getOutHostatilType() {
        return outHostatilType;
    }

    public void setOutHostatilType(String outHostatilType) {
        this.outHostatilType = outHostatilType == null ? null : outHostatilType.trim();
    }

    public String getIsAutoAccount() {
        return isAutoAccount;
    }

    public void setIsAutoAccount(String isAutoAccount) {
        this.isAutoAccount = isAutoAccount == null ? null : isAutoAccount.trim();
    }

    public String getOutOutcom() {
        return outOutcom;
    }

    public void setOutOutcom(String outOutcom) {
        this.outOutcom = outOutcom == null ? null : outOutcom.trim();
    }

    public BigDecimal getCourse() {
        return course;
    }

    public void setCourse(BigDecimal course) {
        this.course = course;
    }

    public String getChargeStatus() {
        return chargeStatus;
    }

    public void setChargeStatus(String chargeStatus) {
        this.chargeStatus = chargeStatus == null ? null : chargeStatus.trim();
    }

    public Date getTransBoodDate() {
        return transBoodDate;
    }

    public void setTransBoodDate(Date transBoodDate) {
        this.transBoodDate = transBoodDate;
    }

    public String getAreaType() {
        return areaType;
    }

    public void setAreaType(String areaType) {
        this.areaType = areaType == null ? null : areaType.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy == null ? null : modifyBy.trim();
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getSkinMinusDrug() {
        return skinMinusDrug;
    }

    public void setSkinMinusDrug(String skinMinusDrug) {
        this.skinMinusDrug = skinMinusDrug == null ? null : skinMinusDrug.trim();
    }

    public BigDecimal getInpExeTimes() {
        return inpExeTimes;
    }

    public void setInpExeTimes(BigDecimal inpExeTimes) {
        this.inpExeTimes = inpExeTimes;
    }

    public String getIsRows() {
        return isRows;
    }

    public void setIsRows(String isRows) {
        this.isRows = isRows == null ? null : isRows.trim();
    }

    public Short getGroupSort() {
        return groupSort;
    }

    public void setGroupSort(Short groupSort) {
        this.groupSort = groupSort;
    }

    public String getOrderUnifyId() {
        return orderUnifyId;
    }

    public void setOrderUnifyId(String orderUnifyId) {
        this.orderUnifyId = orderUnifyId == null ? null : orderUnifyId.trim();
    }

    public String getOwnedDrug() {
        return ownedDrug;
    }

    public void setOwnedDrug(String ownedDrug) {
        this.ownedDrug = ownedDrug == null ? null : ownedDrug.trim();
    }

    public String getDispensDeptId() {
        return dispensDeptId;
    }

    public void setDispensDeptId(String dispensDeptId) {
        this.dispensDeptId = dispensDeptId == null ? null : dispensDeptId.trim();
    }

    public String getDispensDeptName() {
        return dispensDeptName;
    }

    public void setDispensDeptName(String dispensDeptName) {
        this.dispensDeptName = dispensDeptName == null ? null : dispensDeptName.trim();
    }

    public String getGuideDeptId() {
        return guideDeptId;
    }

    public void setGuideDeptId(String guideDeptId) {
        this.guideDeptId = guideDeptId == null ? null : guideDeptId.trim();
    }

    public String getGuideDeptName() {
        return guideDeptName;
    }

    public void setGuideDeptName(String guideDeptName) {
        this.guideDeptName = guideDeptName == null ? null : guideDeptName.trim();
    }

    public String getIsSpecial() {
        return isSpecial;
    }

    public void setIsSpecial(String isSpecial) {
        this.isSpecial = isSpecial == null ? null : isSpecial.trim();
    }

    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType == null ? null : drugType.trim();
    }

    public BigDecimal getActualDrugUseDays() {
        return actualDrugUseDays;
    }

    public void setActualDrugUseDays(BigDecimal actualDrugUseDays) {
        this.actualDrugUseDays = actualDrugUseDays;
    }

    public String getAvoidSkinTest() {
        return avoidSkinTest;
    }

    public void setAvoidSkinTest(String avoidSkinTest) {
        this.avoidSkinTest = avoidSkinTest == null ? null : avoidSkinTest.trim();
    }

    public String getStorageUnitCode() {
        return storageUnitCode;
    }

    public void setStorageUnitCode(String storageUnitCode) {
        this.storageUnitCode = storageUnitCode == null ? null : storageUnitCode.trim();
    }

    public String getStorageUnitName() {
        return storageUnitName;
    }

    public void setStorageUnitName(String storageUnitName) {
        this.storageUnitName = storageUnitName == null ? null : storageUnitName.trim();
    }

    public BigDecimal getSalesPrices() {
        return salesPrices;
    }

    public void setSalesPrices(BigDecimal salesPrices) {
        this.salesPrices = salesPrices;
    }

    public BigDecimal getRevealQuantity() {
        return revealQuantity;
    }

    public void setRevealQuantity(BigDecimal revealQuantity) {
        this.revealQuantity = revealQuantity;
    }

    public BigDecimal getSpecificValue() {
        return specificValue;
    }

    public void setSpecificValue(BigDecimal specificValue) {
        this.specificValue = specificValue;
    }

    public String getStorageBatch() {
        return storageBatch;
    }

    public void setStorageBatch(String storageBatch) {
        this.storageBatch = storageBatch == null ? null : storageBatch.trim();
    }

    public String getInventoryQuantity() {
        return inventoryQuantity;
    }

    public void setInventoryQuantity(String inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity == null ? null : inventoryQuantity.trim();
    }
}
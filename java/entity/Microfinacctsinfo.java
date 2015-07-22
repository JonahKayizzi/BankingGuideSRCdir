/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Xcelsia
 */
@Entity
@Table(catalog = "bankingguide", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Microfinacctsinfo.findAll", query = "SELECT m FROM Microfinacctsinfo m"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoId", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoId = :mFAcctsInfoId"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoAcctType", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoAcctType = :mFAcctsInfoAcctType"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoAppProc", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoAppProc = :mFAcctsInfoAppProc"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoOnlineLink", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoOnlineLink = :mFAcctsInfoOnlineLink"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoEligibility", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoEligibility = :mFAcctsInfoEligibility"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoOvrDrwnPenRate", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoOvrDrwnPenRate = :mFAcctsInfoOvrDrwnPenRate"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoMinCurrAcctRate", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoMinCurrAcctRate = :mFAcctsInfoMinCurrAcctRate"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoMaxCurrAcctRate", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoMaxCurrAcctRate = :mFAcctsInfoMaxCurrAcctRate"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoMinSavAcctRate", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoMinSavAcctRate = :mFAcctsInfoMinSavAcctRate"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoMaxSavAcctRate", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoMaxSavAcctRate = :mFAcctsInfoMaxSavAcctRate"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoMinFixDepRate", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoMinFixDepRate = :mFAcctsInfoMinFixDepRate"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoMaxFixDepRate", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoMaxFixDepRate = :mFAcctsInfoMaxFixDepRate"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoMinBalCurAccts", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoMinBalCurAccts = :mFAcctsInfoMinBalCurAccts"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoMinBalSavAccts", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoMinBalSavAccts = :mFAcctsInfoMinBalSavAccts"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoMinBalFixAccts", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoMinBalFixAccts = :mFAcctsInfoMinBalFixAccts"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoPenBelMinCurrAccts", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoPenBelMinCurrAccts = :mFAcctsInfoPenBelMinCurrAccts"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoPenBelMinSavAccts", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoPenBelMinSavAccts = :mFAcctsInfoPenBelMinSavAccts"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoPenBelMinFixAccts", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoPenBelMinFixAccts = :mFAcctsInfoPenBelMinFixAccts"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoLedgerFee", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoLedgerFee = :mFAcctsInfoLedgerFee"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoMinLedgFeePerMon", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoMinLedgFeePerMon = :mFAcctsInfoMinLedgFeePerMon"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoInterimStatmnt", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoInterimStatmnt = :mFAcctsInfoInterimStatmnt"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoDupStatmnt", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoDupStatmnt = :mFAcctsInfoDupStatmnt"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoClosingAcct", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoClosingAcct = :mFAcctsInfoClosingAcct"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoDormAcctReactiv", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoDormAcctReactiv = :mFAcctsInfoDormAcctReactiv"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoSavCardPassBk", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoSavCardPassBk = :mFAcctsInfoSavCardPassBk"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoEFT", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoEFT = :mFAcctsInfoEFT"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoTT", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoTT = :mFAcctsInfoTT"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoRTGS", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoRTGS = :mFAcctsInfoRTGS"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoStandOrdinBank", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoStandOrdinBank = :mFAcctsInfoStandOrdinBank"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoStandOrdoutBank", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoStandOrdoutBank = :mFAcctsInfoStandOrdoutBank"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoStandOrdUnpaid", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoStandOrdUnpaid = :mFAcctsInfoStandOrdUnpaid"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoCertOfBal", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoCertOfBal = :mFAcctsInfoCertOfBal"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoAudConfirm", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoAudConfirm = :mFAcctsInfoAudConfirm"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoLetOfIntro", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoLetOfIntro = :mFAcctsInfoLetOfIntro"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoSalary", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoSalary = :mFAcctsInfoSalary"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoSchFees", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoSchFees = :mFAcctsInfoSchFees"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoURAColl", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoURAColl = :mFAcctsInfoURAColl"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoUtilColl", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoUtilColl = :mFAcctsInfoUtilColl"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoSafeCust", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoSafeCust = :mFAcctsInfoSafeCust"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoSafeCustAccess", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoSafeCustAccess = :mFAcctsInfoSafeCustAccess"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoCheqBkPerLf", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoCheqBkPerLf = :mFAcctsInfoCheqBkPerLf"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoCntCheqLf", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoCntCheqLf = :mFAcctsInfoCntCheqLf"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoRetCheqInsfFnds", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoRetCheqInsfFnds = :mFAcctsInfoRetCheqInsfFnds"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoRetCheqEffNtClrd", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoRetCheqEffNtClrd = :mFAcctsInfoRetCheqEffNtClrd"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoRetCheqTech", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoRetCheqTech = :mFAcctsInfoRetCheqTech"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoRetCheqOthrBank", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoRetCheqOthrBank = :mFAcctsInfoRetCheqOthrBank"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoStopPayOrdl", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoStopPayOrdl = :mFAcctsInfoStopPayOrdl"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoPostDateCheq", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoPostDateCheq = :mFAcctsInfoPostDateCheq"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoCheqColl", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoCheqColl = :mFAcctsInfoCheqColl"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoDraftCus", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoDraftCus = :mFAcctsInfoDraftCus"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoDraftCancel", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoDraftCancel = :mFAcctsInfoDraftCancel"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoCashWith", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoCashWith = :mFAcctsInfoCashWith"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoCashDep", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoCashDep = :mFAcctsInfoCashDep"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoCoinDep", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoCoinDep = :mFAcctsInfoCoinDep"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoBulkCashWith", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoBulkCashWith = :mFAcctsInfoBulkCashWith"),
    @NamedQuery(name = "Microfinacctsinfo.findByMFAcctsInfoBulkCashDep", query = "SELECT m FROM Microfinacctsinfo m WHERE m.mFAcctsInfoBulkCashDep = :mFAcctsInfoBulkCashDep"),
    @NamedQuery(name = "Microfinacctsinfo.findByMicroFinAcctsInfoTime", query = "SELECT m FROM Microfinacctsinfo m WHERE m.microFinAcctsInfoTime = :microFinAcctsInfoTime")})
public class Microfinacctsinfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer mFAcctsInfoId;
    @Size(max = 100)
    @Column(name = "MFAcctsInfo_AcctType", length = 100)
    private String mFAcctsInfoAcctType;
    @Size(max = 500)
    @Column(name = "MFAcctsInfo_AppProc", length = 500)
    private String mFAcctsInfoAppProc;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_OnlineLink", length = 45)
    private String mFAcctsInfoOnlineLink;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_Eligibility", length = 45)
    private String mFAcctsInfoEligibility;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_OvrDrwnPenRate", length = 45)
    private String mFAcctsInfoOvrDrwnPenRate;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_MinCurrAcctRate", length = 45)
    private String mFAcctsInfoMinCurrAcctRate;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_MaxCurrAcctRate", length = 45)
    private String mFAcctsInfoMaxCurrAcctRate;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_MinSavAcctRate", length = 45)
    private String mFAcctsInfoMinSavAcctRate;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_MaxSavAcctRate", length = 45)
    private String mFAcctsInfoMaxSavAcctRate;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_MinFixDepRate", length = 45)
    private String mFAcctsInfoMinFixDepRate;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_MaxFixDepRate", length = 45)
    private String mFAcctsInfoMaxFixDepRate;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_MinBalCurAccts", length = 45)
    private String mFAcctsInfoMinBalCurAccts;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_MinBalSavAccts", length = 45)
    private String mFAcctsInfoMinBalSavAccts;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_MinBalFixAccts", length = 45)
    private String mFAcctsInfoMinBalFixAccts;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_PenBelMinCurrAccts", length = 45)
    private String mFAcctsInfoPenBelMinCurrAccts;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_PenBelMinSavAccts", length = 45)
    private String mFAcctsInfoPenBelMinSavAccts;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_PenBelMinFixAccts", length = 45)
    private String mFAcctsInfoPenBelMinFixAccts;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_LedgerFee", length = 45)
    private String mFAcctsInfoLedgerFee;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_MinLedgFeePerMon", length = 45)
    private String mFAcctsInfoMinLedgFeePerMon;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_InterimStatmnt", length = 45)
    private String mFAcctsInfoInterimStatmnt;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_DupStatmnt", length = 45)
    private String mFAcctsInfoDupStatmnt;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_ClosingAcct", length = 45)
    private String mFAcctsInfoClosingAcct;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_DormAcctReactiv", length = 45)
    private String mFAcctsInfoDormAcctReactiv;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_SavCardPassBk", length = 45)
    private String mFAcctsInfoSavCardPassBk;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_EFT", length = 45)
    private String mFAcctsInfoEFT;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_TT", length = 45)
    private String mFAcctsInfoTT;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_RTGS", length = 45)
    private String mFAcctsInfoRTGS;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_StandOrdinBank", length = 45)
    private String mFAcctsInfoStandOrdinBank;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_StandOrdoutBank", length = 45)
    private String mFAcctsInfoStandOrdoutBank;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_StandOrdUnpaid", length = 45)
    private String mFAcctsInfoStandOrdUnpaid;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_CertOfBal", length = 45)
    private String mFAcctsInfoCertOfBal;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_AudConfirm", length = 45)
    private String mFAcctsInfoAudConfirm;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_LetOfIntro", length = 45)
    private String mFAcctsInfoLetOfIntro;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_Salary", length = 45)
    private String mFAcctsInfoSalary;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_SchFees", length = 45)
    private String mFAcctsInfoSchFees;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_URAColl", length = 45)
    private String mFAcctsInfoURAColl;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_UtilColl", length = 45)
    private String mFAcctsInfoUtilColl;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_SafeCust", length = 45)
    private String mFAcctsInfoSafeCust;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_SafeCustAccess", length = 45)
    private String mFAcctsInfoSafeCustAccess;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_CheqBkPerLf", length = 45)
    private String mFAcctsInfoCheqBkPerLf;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_CntCheqLf", length = 45)
    private String mFAcctsInfoCntCheqLf;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_RetCheqInsfFnds", length = 45)
    private String mFAcctsInfoRetCheqInsfFnds;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_RetCheqEffNtClrd", length = 45)
    private String mFAcctsInfoRetCheqEffNtClrd;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_RetCheqTech", length = 45)
    private String mFAcctsInfoRetCheqTech;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_RetCheqOthrBank", length = 45)
    private String mFAcctsInfoRetCheqOthrBank;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_StopPayOrdl", length = 45)
    private String mFAcctsInfoStopPayOrdl;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_PostDateCheq", length = 45)
    private String mFAcctsInfoPostDateCheq;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_CheqColl", length = 45)
    private String mFAcctsInfoCheqColl;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_DraftCus", length = 45)
    private String mFAcctsInfoDraftCus;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_DraftCancel", length = 45)
    private String mFAcctsInfoDraftCancel;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_CashWith", length = 45)
    private String mFAcctsInfoCashWith;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_CashDep", length = 45)
    private String mFAcctsInfoCashDep;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_CoinDep", length = 45)
    private String mFAcctsInfoCoinDep;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_BulkCashWith", length = 45)
    private String mFAcctsInfoBulkCashWith;
    @Size(max = 45)
    @Column(name = "MFAcctsInfo_BulkCashDep", length = 45)
    private String mFAcctsInfoBulkCashDep;
    @Column(name = "MicroFinAcctsInfo_Time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date microFinAcctsInfoTime;
    @JoinColumn(name = "MFAcctsInfo_MicroFinId", referencedColumnName = "MicroFinId")
    @ManyToOne
    private Microfinances mFAcctsInfoMicroFinId;

    public Microfinacctsinfo() {
    }

    public Microfinacctsinfo(Integer mFAcctsInfoId) {
        this.mFAcctsInfoId = mFAcctsInfoId;
    }

    public Integer getMFAcctsInfoId() {
        return mFAcctsInfoId;
    }

    public void setMFAcctsInfoId(Integer mFAcctsInfoId) {
        this.mFAcctsInfoId = mFAcctsInfoId;
    }

    public String getMFAcctsInfoAcctType() {
        return mFAcctsInfoAcctType;
    }

    public void setMFAcctsInfoAcctType(String mFAcctsInfoAcctType) {
        this.mFAcctsInfoAcctType = mFAcctsInfoAcctType;
    }

    public String getMFAcctsInfoAppProc() {
        return mFAcctsInfoAppProc;
    }

    public void setMFAcctsInfoAppProc(String mFAcctsInfoAppProc) {
        this.mFAcctsInfoAppProc = mFAcctsInfoAppProc;
    }

    public String getMFAcctsInfoOnlineLink() {
        return mFAcctsInfoOnlineLink;
    }

    public void setMFAcctsInfoOnlineLink(String mFAcctsInfoOnlineLink) {
        this.mFAcctsInfoOnlineLink = mFAcctsInfoOnlineLink;
    }

    public String getMFAcctsInfoEligibility() {
        return mFAcctsInfoEligibility;
    }

    public void setMFAcctsInfoEligibility(String mFAcctsInfoEligibility) {
        this.mFAcctsInfoEligibility = mFAcctsInfoEligibility;
    }

    public String getMFAcctsInfoOvrDrwnPenRate() {
        return mFAcctsInfoOvrDrwnPenRate;
    }

    public void setMFAcctsInfoOvrDrwnPenRate(String mFAcctsInfoOvrDrwnPenRate) {
        this.mFAcctsInfoOvrDrwnPenRate = mFAcctsInfoOvrDrwnPenRate;
    }

    public String getMFAcctsInfoMinCurrAcctRate() {
        return mFAcctsInfoMinCurrAcctRate;
    }

    public void setMFAcctsInfoMinCurrAcctRate(String mFAcctsInfoMinCurrAcctRate) {
        this.mFAcctsInfoMinCurrAcctRate = mFAcctsInfoMinCurrAcctRate;
    }

    public String getMFAcctsInfoMaxCurrAcctRate() {
        return mFAcctsInfoMaxCurrAcctRate;
    }

    public void setMFAcctsInfoMaxCurrAcctRate(String mFAcctsInfoMaxCurrAcctRate) {
        this.mFAcctsInfoMaxCurrAcctRate = mFAcctsInfoMaxCurrAcctRate;
    }

    public String getMFAcctsInfoMinSavAcctRate() {
        return mFAcctsInfoMinSavAcctRate;
    }

    public void setMFAcctsInfoMinSavAcctRate(String mFAcctsInfoMinSavAcctRate) {
        this.mFAcctsInfoMinSavAcctRate = mFAcctsInfoMinSavAcctRate;
    }

    public String getMFAcctsInfoMaxSavAcctRate() {
        return mFAcctsInfoMaxSavAcctRate;
    }

    public void setMFAcctsInfoMaxSavAcctRate(String mFAcctsInfoMaxSavAcctRate) {
        this.mFAcctsInfoMaxSavAcctRate = mFAcctsInfoMaxSavAcctRate;
    }

    public String getMFAcctsInfoMinFixDepRate() {
        return mFAcctsInfoMinFixDepRate;
    }

    public void setMFAcctsInfoMinFixDepRate(String mFAcctsInfoMinFixDepRate) {
        this.mFAcctsInfoMinFixDepRate = mFAcctsInfoMinFixDepRate;
    }

    public String getMFAcctsInfoMaxFixDepRate() {
        return mFAcctsInfoMaxFixDepRate;
    }

    public void setMFAcctsInfoMaxFixDepRate(String mFAcctsInfoMaxFixDepRate) {
        this.mFAcctsInfoMaxFixDepRate = mFAcctsInfoMaxFixDepRate;
    }

    public String getMFAcctsInfoMinBalCurAccts() {
        return mFAcctsInfoMinBalCurAccts;
    }

    public void setMFAcctsInfoMinBalCurAccts(String mFAcctsInfoMinBalCurAccts) {
        this.mFAcctsInfoMinBalCurAccts = mFAcctsInfoMinBalCurAccts;
    }

    public String getMFAcctsInfoMinBalSavAccts() {
        return mFAcctsInfoMinBalSavAccts;
    }

    public void setMFAcctsInfoMinBalSavAccts(String mFAcctsInfoMinBalSavAccts) {
        this.mFAcctsInfoMinBalSavAccts = mFAcctsInfoMinBalSavAccts;
    }

    public String getMFAcctsInfoMinBalFixAccts() {
        return mFAcctsInfoMinBalFixAccts;
    }

    public void setMFAcctsInfoMinBalFixAccts(String mFAcctsInfoMinBalFixAccts) {
        this.mFAcctsInfoMinBalFixAccts = mFAcctsInfoMinBalFixAccts;
    }

    public String getMFAcctsInfoPenBelMinCurrAccts() {
        return mFAcctsInfoPenBelMinCurrAccts;
    }

    public void setMFAcctsInfoPenBelMinCurrAccts(String mFAcctsInfoPenBelMinCurrAccts) {
        this.mFAcctsInfoPenBelMinCurrAccts = mFAcctsInfoPenBelMinCurrAccts;
    }

    public String getMFAcctsInfoPenBelMinSavAccts() {
        return mFAcctsInfoPenBelMinSavAccts;
    }

    public void setMFAcctsInfoPenBelMinSavAccts(String mFAcctsInfoPenBelMinSavAccts) {
        this.mFAcctsInfoPenBelMinSavAccts = mFAcctsInfoPenBelMinSavAccts;
    }

    public String getMFAcctsInfoPenBelMinFixAccts() {
        return mFAcctsInfoPenBelMinFixAccts;
    }

    public void setMFAcctsInfoPenBelMinFixAccts(String mFAcctsInfoPenBelMinFixAccts) {
        this.mFAcctsInfoPenBelMinFixAccts = mFAcctsInfoPenBelMinFixAccts;
    }

    public String getMFAcctsInfoLedgerFee() {
        return mFAcctsInfoLedgerFee;
    }

    public void setMFAcctsInfoLedgerFee(String mFAcctsInfoLedgerFee) {
        this.mFAcctsInfoLedgerFee = mFAcctsInfoLedgerFee;
    }

    public String getMFAcctsInfoMinLedgFeePerMon() {
        return mFAcctsInfoMinLedgFeePerMon;
    }

    public void setMFAcctsInfoMinLedgFeePerMon(String mFAcctsInfoMinLedgFeePerMon) {
        this.mFAcctsInfoMinLedgFeePerMon = mFAcctsInfoMinLedgFeePerMon;
    }

    public String getMFAcctsInfoInterimStatmnt() {
        return mFAcctsInfoInterimStatmnt;
    }

    public void setMFAcctsInfoInterimStatmnt(String mFAcctsInfoInterimStatmnt) {
        this.mFAcctsInfoInterimStatmnt = mFAcctsInfoInterimStatmnt;
    }

    public String getMFAcctsInfoDupStatmnt() {
        return mFAcctsInfoDupStatmnt;
    }

    public void setMFAcctsInfoDupStatmnt(String mFAcctsInfoDupStatmnt) {
        this.mFAcctsInfoDupStatmnt = mFAcctsInfoDupStatmnt;
    }

    public String getMFAcctsInfoClosingAcct() {
        return mFAcctsInfoClosingAcct;
    }

    public void setMFAcctsInfoClosingAcct(String mFAcctsInfoClosingAcct) {
        this.mFAcctsInfoClosingAcct = mFAcctsInfoClosingAcct;
    }

    public String getMFAcctsInfoDormAcctReactiv() {
        return mFAcctsInfoDormAcctReactiv;
    }

    public void setMFAcctsInfoDormAcctReactiv(String mFAcctsInfoDormAcctReactiv) {
        this.mFAcctsInfoDormAcctReactiv = mFAcctsInfoDormAcctReactiv;
    }

    public String getMFAcctsInfoSavCardPassBk() {
        return mFAcctsInfoSavCardPassBk;
    }

    public void setMFAcctsInfoSavCardPassBk(String mFAcctsInfoSavCardPassBk) {
        this.mFAcctsInfoSavCardPassBk = mFAcctsInfoSavCardPassBk;
    }

    public String getMFAcctsInfoEFT() {
        return mFAcctsInfoEFT;
    }

    public void setMFAcctsInfoEFT(String mFAcctsInfoEFT) {
        this.mFAcctsInfoEFT = mFAcctsInfoEFT;
    }

    public String getMFAcctsInfoTT() {
        return mFAcctsInfoTT;
    }

    public void setMFAcctsInfoTT(String mFAcctsInfoTT) {
        this.mFAcctsInfoTT = mFAcctsInfoTT;
    }

    public String getMFAcctsInfoRTGS() {
        return mFAcctsInfoRTGS;
    }

    public void setMFAcctsInfoRTGS(String mFAcctsInfoRTGS) {
        this.mFAcctsInfoRTGS = mFAcctsInfoRTGS;
    }

    public String getMFAcctsInfoStandOrdinBank() {
        return mFAcctsInfoStandOrdinBank;
    }

    public void setMFAcctsInfoStandOrdinBank(String mFAcctsInfoStandOrdinBank) {
        this.mFAcctsInfoStandOrdinBank = mFAcctsInfoStandOrdinBank;
    }

    public String getMFAcctsInfoStandOrdoutBank() {
        return mFAcctsInfoStandOrdoutBank;
    }

    public void setMFAcctsInfoStandOrdoutBank(String mFAcctsInfoStandOrdoutBank) {
        this.mFAcctsInfoStandOrdoutBank = mFAcctsInfoStandOrdoutBank;
    }

    public String getMFAcctsInfoStandOrdUnpaid() {
        return mFAcctsInfoStandOrdUnpaid;
    }

    public void setMFAcctsInfoStandOrdUnpaid(String mFAcctsInfoStandOrdUnpaid) {
        this.mFAcctsInfoStandOrdUnpaid = mFAcctsInfoStandOrdUnpaid;
    }

    public String getMFAcctsInfoCertOfBal() {
        return mFAcctsInfoCertOfBal;
    }

    public void setMFAcctsInfoCertOfBal(String mFAcctsInfoCertOfBal) {
        this.mFAcctsInfoCertOfBal = mFAcctsInfoCertOfBal;
    }

    public String getMFAcctsInfoAudConfirm() {
        return mFAcctsInfoAudConfirm;
    }

    public void setMFAcctsInfoAudConfirm(String mFAcctsInfoAudConfirm) {
        this.mFAcctsInfoAudConfirm = mFAcctsInfoAudConfirm;
    }

    public String getMFAcctsInfoLetOfIntro() {
        return mFAcctsInfoLetOfIntro;
    }

    public void setMFAcctsInfoLetOfIntro(String mFAcctsInfoLetOfIntro) {
        this.mFAcctsInfoLetOfIntro = mFAcctsInfoLetOfIntro;
    }

    public String getMFAcctsInfoSalary() {
        return mFAcctsInfoSalary;
    }

    public void setMFAcctsInfoSalary(String mFAcctsInfoSalary) {
        this.mFAcctsInfoSalary = mFAcctsInfoSalary;
    }

    public String getMFAcctsInfoSchFees() {
        return mFAcctsInfoSchFees;
    }

    public void setMFAcctsInfoSchFees(String mFAcctsInfoSchFees) {
        this.mFAcctsInfoSchFees = mFAcctsInfoSchFees;
    }

    public String getMFAcctsInfoURAColl() {
        return mFAcctsInfoURAColl;
    }

    public void setMFAcctsInfoURAColl(String mFAcctsInfoURAColl) {
        this.mFAcctsInfoURAColl = mFAcctsInfoURAColl;
    }

    public String getMFAcctsInfoUtilColl() {
        return mFAcctsInfoUtilColl;
    }

    public void setMFAcctsInfoUtilColl(String mFAcctsInfoUtilColl) {
        this.mFAcctsInfoUtilColl = mFAcctsInfoUtilColl;
    }

    public String getMFAcctsInfoSafeCust() {
        return mFAcctsInfoSafeCust;
    }

    public void setMFAcctsInfoSafeCust(String mFAcctsInfoSafeCust) {
        this.mFAcctsInfoSafeCust = mFAcctsInfoSafeCust;
    }

    public String getMFAcctsInfoSafeCustAccess() {
        return mFAcctsInfoSafeCustAccess;
    }

    public void setMFAcctsInfoSafeCustAccess(String mFAcctsInfoSafeCustAccess) {
        this.mFAcctsInfoSafeCustAccess = mFAcctsInfoSafeCustAccess;
    }

    public String getMFAcctsInfoCheqBkPerLf() {
        return mFAcctsInfoCheqBkPerLf;
    }

    public void setMFAcctsInfoCheqBkPerLf(String mFAcctsInfoCheqBkPerLf) {
        this.mFAcctsInfoCheqBkPerLf = mFAcctsInfoCheqBkPerLf;
    }

    public String getMFAcctsInfoCntCheqLf() {
        return mFAcctsInfoCntCheqLf;
    }

    public void setMFAcctsInfoCntCheqLf(String mFAcctsInfoCntCheqLf) {
        this.mFAcctsInfoCntCheqLf = mFAcctsInfoCntCheqLf;
    }

    public String getMFAcctsInfoRetCheqInsfFnds() {
        return mFAcctsInfoRetCheqInsfFnds;
    }

    public void setMFAcctsInfoRetCheqInsfFnds(String mFAcctsInfoRetCheqInsfFnds) {
        this.mFAcctsInfoRetCheqInsfFnds = mFAcctsInfoRetCheqInsfFnds;
    }

    public String getMFAcctsInfoRetCheqEffNtClrd() {
        return mFAcctsInfoRetCheqEffNtClrd;
    }

    public void setMFAcctsInfoRetCheqEffNtClrd(String mFAcctsInfoRetCheqEffNtClrd) {
        this.mFAcctsInfoRetCheqEffNtClrd = mFAcctsInfoRetCheqEffNtClrd;
    }

    public String getMFAcctsInfoRetCheqTech() {
        return mFAcctsInfoRetCheqTech;
    }

    public void setMFAcctsInfoRetCheqTech(String mFAcctsInfoRetCheqTech) {
        this.mFAcctsInfoRetCheqTech = mFAcctsInfoRetCheqTech;
    }

    public String getMFAcctsInfoRetCheqOthrBank() {
        return mFAcctsInfoRetCheqOthrBank;
    }

    public void setMFAcctsInfoRetCheqOthrBank(String mFAcctsInfoRetCheqOthrBank) {
        this.mFAcctsInfoRetCheqOthrBank = mFAcctsInfoRetCheqOthrBank;
    }

    public String getMFAcctsInfoStopPayOrdl() {
        return mFAcctsInfoStopPayOrdl;
    }

    public void setMFAcctsInfoStopPayOrdl(String mFAcctsInfoStopPayOrdl) {
        this.mFAcctsInfoStopPayOrdl = mFAcctsInfoStopPayOrdl;
    }

    public String getMFAcctsInfoPostDateCheq() {
        return mFAcctsInfoPostDateCheq;
    }

    public void setMFAcctsInfoPostDateCheq(String mFAcctsInfoPostDateCheq) {
        this.mFAcctsInfoPostDateCheq = mFAcctsInfoPostDateCheq;
    }

    public String getMFAcctsInfoCheqColl() {
        return mFAcctsInfoCheqColl;
    }

    public void setMFAcctsInfoCheqColl(String mFAcctsInfoCheqColl) {
        this.mFAcctsInfoCheqColl = mFAcctsInfoCheqColl;
    }

    public String getMFAcctsInfoDraftCus() {
        return mFAcctsInfoDraftCus;
    }

    public void setMFAcctsInfoDraftCus(String mFAcctsInfoDraftCus) {
        this.mFAcctsInfoDraftCus = mFAcctsInfoDraftCus;
    }

    public String getMFAcctsInfoDraftCancel() {
        return mFAcctsInfoDraftCancel;
    }

    public void setMFAcctsInfoDraftCancel(String mFAcctsInfoDraftCancel) {
        this.mFAcctsInfoDraftCancel = mFAcctsInfoDraftCancel;
    }

    public String getMFAcctsInfoCashWith() {
        return mFAcctsInfoCashWith;
    }

    public void setMFAcctsInfoCashWith(String mFAcctsInfoCashWith) {
        this.mFAcctsInfoCashWith = mFAcctsInfoCashWith;
    }

    public String getMFAcctsInfoCashDep() {
        return mFAcctsInfoCashDep;
    }

    public void setMFAcctsInfoCashDep(String mFAcctsInfoCashDep) {
        this.mFAcctsInfoCashDep = mFAcctsInfoCashDep;
    }

    public String getMFAcctsInfoCoinDep() {
        return mFAcctsInfoCoinDep;
    }

    public void setMFAcctsInfoCoinDep(String mFAcctsInfoCoinDep) {
        this.mFAcctsInfoCoinDep = mFAcctsInfoCoinDep;
    }

    public String getMFAcctsInfoBulkCashWith() {
        return mFAcctsInfoBulkCashWith;
    }

    public void setMFAcctsInfoBulkCashWith(String mFAcctsInfoBulkCashWith) {
        this.mFAcctsInfoBulkCashWith = mFAcctsInfoBulkCashWith;
    }

    public String getMFAcctsInfoBulkCashDep() {
        return mFAcctsInfoBulkCashDep;
    }

    public void setMFAcctsInfoBulkCashDep(String mFAcctsInfoBulkCashDep) {
        this.mFAcctsInfoBulkCashDep = mFAcctsInfoBulkCashDep;
    }

    public Date getMicroFinAcctsInfoTime() {
        return microFinAcctsInfoTime;
    }

    public void setMicroFinAcctsInfoTime(Date microFinAcctsInfoTime) {
        this.microFinAcctsInfoTime = microFinAcctsInfoTime;
    }

    public Microfinances getMFAcctsInfoMicroFinId() {
        return mFAcctsInfoMicroFinId;
    }

    public void setMFAcctsInfoMicroFinId(Microfinances mFAcctsInfoMicroFinId) {
        this.mFAcctsInfoMicroFinId = mFAcctsInfoMicroFinId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mFAcctsInfoId != null ? mFAcctsInfoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Microfinacctsinfo)) {
            return false;
        }
        Microfinacctsinfo other = (Microfinacctsinfo) object;
        if ((this.mFAcctsInfoId == null && other.mFAcctsInfoId != null) || (this.mFAcctsInfoId != null && !this.mFAcctsInfoId.equals(other.mFAcctsInfoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Microfinacctsinfo[ mFAcctsInfoId=" + mFAcctsInfoId + " ]";
    }
    
}

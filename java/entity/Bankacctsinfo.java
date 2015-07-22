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
    @NamedQuery(name = "Bankacctsinfo.findAll", query = "SELECT b FROM Bankacctsinfo b"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoId", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoId = :bankAcctsInfoId"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoAcctType", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoAcctType = :bankAcctsInfoAcctType"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoAppProc", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoAppProc = :bankAcctsInfoAppProc"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoOnlineLink", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoOnlineLink = :bankAcctsInfoOnlineLink"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoEligibility", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoEligibility = :bankAcctsInfoEligibility"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoOvrDrwnPenRate", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoOvrDrwnPenRate = :bankAcctsInfoOvrDrwnPenRate"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoMinCurrAcctRate", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoMinCurrAcctRate = :bankAcctsInfoMinCurrAcctRate"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoMaxCurrAcctRate", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoMaxCurrAcctRate = :bankAcctsInfoMaxCurrAcctRate"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoMinSavAcctRate", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoMinSavAcctRate = :bankAcctsInfoMinSavAcctRate"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoMaxSavAcctRate", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoMaxSavAcctRate = :bankAcctsInfoMaxSavAcctRate"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoMinFixDepRate", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoMinFixDepRate = :bankAcctsInfoMinFixDepRate"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoMaxFixDepRate", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoMaxFixDepRate = :bankAcctsInfoMaxFixDepRate"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoMinBalCurAccts", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoMinBalCurAccts = :bankAcctsInfoMinBalCurAccts"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoMinBalSavAccts", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoMinBalSavAccts = :bankAcctsInfoMinBalSavAccts"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoMinBalFixAccts", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoMinBalFixAccts = :bankAcctsInfoMinBalFixAccts"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoPenBelMinCurrAccts", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoPenBelMinCurrAccts = :bankAcctsInfoPenBelMinCurrAccts"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoPenBelMinSavAccts", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoPenBelMinSavAccts = :bankAcctsInfoPenBelMinSavAccts"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoPenBelMinFixAccts", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoPenBelMinFixAccts = :bankAcctsInfoPenBelMinFixAccts"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoLedgerFee", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoLedgerFee = :bankAcctsInfoLedgerFee"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoMinLedgFeePerMon", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoMinLedgFeePerMon = :bankAcctsInfoMinLedgFeePerMon"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoInterimStatmnt", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoInterimStatmnt = :bankAcctsInfoInterimStatmnt"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoDupStatmnt", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoDupStatmnt = :bankAcctsInfoDupStatmnt"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoClosingAcct", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoClosingAcct = :bankAcctsInfoClosingAcct"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoDormAcctReactiv", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoDormAcctReactiv = :bankAcctsInfoDormAcctReactiv"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoSavCardPassBk", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoSavCardPassBk = :bankAcctsInfoSavCardPassBk"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoEFT", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoEFT = :bankAcctsInfoEFT"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoTT", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoTT = :bankAcctsInfoTT"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoRTGS", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoRTGS = :bankAcctsInfoRTGS"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoStandOrdinBank", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoStandOrdinBank = :bankAcctsInfoStandOrdinBank"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoStandOrdoutBank", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoStandOrdoutBank = :bankAcctsInfoStandOrdoutBank"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoStandOrdUnpaid", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoStandOrdUnpaid = :bankAcctsInfoStandOrdUnpaid"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoCertOfBal", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoCertOfBal = :bankAcctsInfoCertOfBal"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoAudConfirm", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoAudConfirm = :bankAcctsInfoAudConfirm"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoLetOfIntro", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoLetOfIntro = :bankAcctsInfoLetOfIntro"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoSalary", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoSalary = :bankAcctsInfoSalary"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoSchFees", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoSchFees = :bankAcctsInfoSchFees"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoURAColl", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoURAColl = :bankAcctsInfoURAColl"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoUtilColl", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoUtilColl = :bankAcctsInfoUtilColl"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoSafeCust", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoSafeCust = :bankAcctsInfoSafeCust"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoSafeCustAccess", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoSafeCustAccess = :bankAcctsInfoSafeCustAccess"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoCheqBkPerLf", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoCheqBkPerLf = :bankAcctsInfoCheqBkPerLf"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoCntCheqLf", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoCntCheqLf = :bankAcctsInfoCntCheqLf"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoRetCheqInsfFnds", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoRetCheqInsfFnds = :bankAcctsInfoRetCheqInsfFnds"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoRetCheqEffNtClrd", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoRetCheqEffNtClrd = :bankAcctsInfoRetCheqEffNtClrd"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoRetCheqTech", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoRetCheqTech = :bankAcctsInfoRetCheqTech"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoRetCheqOthrBank", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoRetCheqOthrBank = :bankAcctsInfoRetCheqOthrBank"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoStopPayOrdl", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoStopPayOrdl = :bankAcctsInfoStopPayOrdl"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoPostDateCheq", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoPostDateCheq = :bankAcctsInfoPostDateCheq"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoCheqColl", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoCheqColl = :bankAcctsInfoCheqColl"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoDraftCus", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoDraftCus = :bankAcctsInfoDraftCus"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoDraftCancel", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoDraftCancel = :bankAcctsInfoDraftCancel"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoCashWith", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoCashWith = :bankAcctsInfoCashWith"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoCashDep", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoCashDep = :bankAcctsInfoCashDep"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoCoinDep", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoCoinDep = :bankAcctsInfoCoinDep"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoBulkCashWith", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoBulkCashWith = :bankAcctsInfoBulkCashWith"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoBulkCashDep", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoBulkCashDep = :bankAcctsInfoBulkCashDep"),
    @NamedQuery(name = "Bankacctsinfo.findByBankAcctsInfoTime", query = "SELECT b FROM Bankacctsinfo b WHERE b.bankAcctsInfoTime = :bankAcctsInfoTime")})
public class Bankacctsinfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer bankAcctsInfoId;
    @Size(max = 100)
    @Column(name = "BankAcctsInfo_AcctType", length = 100)
    private String bankAcctsInfoAcctType;
    @Size(max = 500)
    @Column(name = "BankAcctsInfo_AppProc", length = 500)
    private String bankAcctsInfoAppProc;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_OnlineLink", length = 45)
    private String bankAcctsInfoOnlineLink;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_Eligibility", length = 45)
    private String bankAcctsInfoEligibility;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_OvrDrwnPenRate", length = 45)
    private String bankAcctsInfoOvrDrwnPenRate;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_MinCurrAcctRate", length = 45)
    private String bankAcctsInfoMinCurrAcctRate;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_MaxCurrAcctRate", length = 45)
    private String bankAcctsInfoMaxCurrAcctRate;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_MinSavAcctRate", length = 45)
    private String bankAcctsInfoMinSavAcctRate;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_MaxSavAcctRate", length = 45)
    private String bankAcctsInfoMaxSavAcctRate;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_MinFixDepRate", length = 45)
    private String bankAcctsInfoMinFixDepRate;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_MaxFixDepRate", length = 45)
    private String bankAcctsInfoMaxFixDepRate;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_MinBalCurAccts", length = 45)
    private String bankAcctsInfoMinBalCurAccts;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_MinBalSavAccts", length = 45)
    private String bankAcctsInfoMinBalSavAccts;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_MinBalFixAccts", length = 45)
    private String bankAcctsInfoMinBalFixAccts;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_PenBelMinCurrAccts", length = 45)
    private String bankAcctsInfoPenBelMinCurrAccts;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_PenBelMinSavAccts", length = 45)
    private String bankAcctsInfoPenBelMinSavAccts;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_PenBelMinFixAccts", length = 45)
    private String bankAcctsInfoPenBelMinFixAccts;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_LedgerFee", length = 45)
    private String bankAcctsInfoLedgerFee;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_MinLedgFeePerMon", length = 45)
    private String bankAcctsInfoMinLedgFeePerMon;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_InterimStatmnt", length = 45)
    private String bankAcctsInfoInterimStatmnt;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_DupStatmnt", length = 45)
    private String bankAcctsInfoDupStatmnt;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_ClosingAcct", length = 45)
    private String bankAcctsInfoClosingAcct;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_DormAcctReactiv", length = 45)
    private String bankAcctsInfoDormAcctReactiv;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_SavCardPassBk", length = 45)
    private String bankAcctsInfoSavCardPassBk;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_EFT", length = 45)
    private String bankAcctsInfoEFT;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_TT", length = 45)
    private String bankAcctsInfoTT;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_RTGS", length = 45)
    private String bankAcctsInfoRTGS;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_StandOrdinBank", length = 45)
    private String bankAcctsInfoStandOrdinBank;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_StandOrdoutBank", length = 45)
    private String bankAcctsInfoStandOrdoutBank;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_StandOrdUnpaid", length = 45)
    private String bankAcctsInfoStandOrdUnpaid;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_CertOfBal", length = 45)
    private String bankAcctsInfoCertOfBal;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_AudConfirm", length = 45)
    private String bankAcctsInfoAudConfirm;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_LetOfIntro", length = 45)
    private String bankAcctsInfoLetOfIntro;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_Salary", length = 45)
    private String bankAcctsInfoSalary;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_SchFees", length = 45)
    private String bankAcctsInfoSchFees;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_URAColl", length = 45)
    private String bankAcctsInfoURAColl;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_UtilColl", length = 45)
    private String bankAcctsInfoUtilColl;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_SafeCust", length = 45)
    private String bankAcctsInfoSafeCust;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_SafeCustAccess", length = 45)
    private String bankAcctsInfoSafeCustAccess;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_CheqBkPerLf", length = 45)
    private String bankAcctsInfoCheqBkPerLf;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_CntCheqLf", length = 45)
    private String bankAcctsInfoCntCheqLf;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_RetCheqInsfFnds", length = 45)
    private String bankAcctsInfoRetCheqInsfFnds;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_RetCheqEffNtClrd", length = 45)
    private String bankAcctsInfoRetCheqEffNtClrd;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_RetCheqTech", length = 45)
    private String bankAcctsInfoRetCheqTech;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_RetCheqOthrBank", length = 45)
    private String bankAcctsInfoRetCheqOthrBank;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_StopPayOrdl", length = 45)
    private String bankAcctsInfoStopPayOrdl;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_PostDateCheq", length = 45)
    private String bankAcctsInfoPostDateCheq;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_CheqColl", length = 45)
    private String bankAcctsInfoCheqColl;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_DraftCus", length = 45)
    private String bankAcctsInfoDraftCus;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_DraftCancel", length = 45)
    private String bankAcctsInfoDraftCancel;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_CashWith", length = 45)
    private String bankAcctsInfoCashWith;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_CashDep", length = 45)
    private String bankAcctsInfoCashDep;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_CoinDep", length = 45)
    private String bankAcctsInfoCoinDep;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_BulkCashWith", length = 45)
    private String bankAcctsInfoBulkCashWith;
    @Size(max = 45)
    @Column(name = "BankAcctsInfo_BulkCashDep", length = 45)
    private String bankAcctsInfoBulkCashDep;
    @Temporal(TemporalType.TIMESTAMP)
    private Date bankAcctsInfoTime;
    @JoinColumn(name = "BankAcctsInfo_BankId", referencedColumnName = "BankId")
    @ManyToOne
    private Banks bankAcctsInfoBankId;

    public Bankacctsinfo() {
    }

    public Bankacctsinfo(Integer bankAcctsInfoId) {
        this.bankAcctsInfoId = bankAcctsInfoId;
    }

    public Integer getBankAcctsInfoId() {
        return bankAcctsInfoId;
    }

    public void setBankAcctsInfoId(Integer bankAcctsInfoId) {
        this.bankAcctsInfoId = bankAcctsInfoId;
    }

    public String getBankAcctsInfoAcctType() {
        return bankAcctsInfoAcctType;
    }

    public void setBankAcctsInfoAcctType(String bankAcctsInfoAcctType) {
        this.bankAcctsInfoAcctType = bankAcctsInfoAcctType;
    }

    public String getBankAcctsInfoAppProc() {
        return bankAcctsInfoAppProc;
    }

    public void setBankAcctsInfoAppProc(String bankAcctsInfoAppProc) {
        this.bankAcctsInfoAppProc = bankAcctsInfoAppProc;
    }

    public String getBankAcctsInfoOnlineLink() {
        return bankAcctsInfoOnlineLink;
    }

    public void setBankAcctsInfoOnlineLink(String bankAcctsInfoOnlineLink) {
        this.bankAcctsInfoOnlineLink = bankAcctsInfoOnlineLink;
    }

    public String getBankAcctsInfoEligibility() {
        return bankAcctsInfoEligibility;
    }

    public void setBankAcctsInfoEligibility(String bankAcctsInfoEligibility) {
        this.bankAcctsInfoEligibility = bankAcctsInfoEligibility;
    }

    public String getBankAcctsInfoOvrDrwnPenRate() {
        return bankAcctsInfoOvrDrwnPenRate;
    }

    public void setBankAcctsInfoOvrDrwnPenRate(String bankAcctsInfoOvrDrwnPenRate) {
        this.bankAcctsInfoOvrDrwnPenRate = bankAcctsInfoOvrDrwnPenRate;
    }

    public String getBankAcctsInfoMinCurrAcctRate() {
        return bankAcctsInfoMinCurrAcctRate;
    }

    public void setBankAcctsInfoMinCurrAcctRate(String bankAcctsInfoMinCurrAcctRate) {
        this.bankAcctsInfoMinCurrAcctRate = bankAcctsInfoMinCurrAcctRate;
    }

    public String getBankAcctsInfoMaxCurrAcctRate() {
        return bankAcctsInfoMaxCurrAcctRate;
    }

    public void setBankAcctsInfoMaxCurrAcctRate(String bankAcctsInfoMaxCurrAcctRate) {
        this.bankAcctsInfoMaxCurrAcctRate = bankAcctsInfoMaxCurrAcctRate;
    }

    public String getBankAcctsInfoMinSavAcctRate() {
        return bankAcctsInfoMinSavAcctRate;
    }

    public void setBankAcctsInfoMinSavAcctRate(String bankAcctsInfoMinSavAcctRate) {
        this.bankAcctsInfoMinSavAcctRate = bankAcctsInfoMinSavAcctRate;
    }

    public String getBankAcctsInfoMaxSavAcctRate() {
        return bankAcctsInfoMaxSavAcctRate;
    }

    public void setBankAcctsInfoMaxSavAcctRate(String bankAcctsInfoMaxSavAcctRate) {
        this.bankAcctsInfoMaxSavAcctRate = bankAcctsInfoMaxSavAcctRate;
    }

    public String getBankAcctsInfoMinFixDepRate() {
        return bankAcctsInfoMinFixDepRate;
    }

    public void setBankAcctsInfoMinFixDepRate(String bankAcctsInfoMinFixDepRate) {
        this.bankAcctsInfoMinFixDepRate = bankAcctsInfoMinFixDepRate;
    }

    public String getBankAcctsInfoMaxFixDepRate() {
        return bankAcctsInfoMaxFixDepRate;
    }

    public void setBankAcctsInfoMaxFixDepRate(String bankAcctsInfoMaxFixDepRate) {
        this.bankAcctsInfoMaxFixDepRate = bankAcctsInfoMaxFixDepRate;
    }

    public String getBankAcctsInfoMinBalCurAccts() {
        return bankAcctsInfoMinBalCurAccts;
    }

    public void setBankAcctsInfoMinBalCurAccts(String bankAcctsInfoMinBalCurAccts) {
        this.bankAcctsInfoMinBalCurAccts = bankAcctsInfoMinBalCurAccts;
    }

    public String getBankAcctsInfoMinBalSavAccts() {
        return bankAcctsInfoMinBalSavAccts;
    }

    public void setBankAcctsInfoMinBalSavAccts(String bankAcctsInfoMinBalSavAccts) {
        this.bankAcctsInfoMinBalSavAccts = bankAcctsInfoMinBalSavAccts;
    }

    public String getBankAcctsInfoMinBalFixAccts() {
        return bankAcctsInfoMinBalFixAccts;
    }

    public void setBankAcctsInfoMinBalFixAccts(String bankAcctsInfoMinBalFixAccts) {
        this.bankAcctsInfoMinBalFixAccts = bankAcctsInfoMinBalFixAccts;
    }

    public String getBankAcctsInfoPenBelMinCurrAccts() {
        return bankAcctsInfoPenBelMinCurrAccts;
    }

    public void setBankAcctsInfoPenBelMinCurrAccts(String bankAcctsInfoPenBelMinCurrAccts) {
        this.bankAcctsInfoPenBelMinCurrAccts = bankAcctsInfoPenBelMinCurrAccts;
    }

    public String getBankAcctsInfoPenBelMinSavAccts() {
        return bankAcctsInfoPenBelMinSavAccts;
    }

    public void setBankAcctsInfoPenBelMinSavAccts(String bankAcctsInfoPenBelMinSavAccts) {
        this.bankAcctsInfoPenBelMinSavAccts = bankAcctsInfoPenBelMinSavAccts;
    }

    public String getBankAcctsInfoPenBelMinFixAccts() {
        return bankAcctsInfoPenBelMinFixAccts;
    }

    public void setBankAcctsInfoPenBelMinFixAccts(String bankAcctsInfoPenBelMinFixAccts) {
        this.bankAcctsInfoPenBelMinFixAccts = bankAcctsInfoPenBelMinFixAccts;
    }

    public String getBankAcctsInfoLedgerFee() {
        return bankAcctsInfoLedgerFee;
    }

    public void setBankAcctsInfoLedgerFee(String bankAcctsInfoLedgerFee) {
        this.bankAcctsInfoLedgerFee = bankAcctsInfoLedgerFee;
    }

    public String getBankAcctsInfoMinLedgFeePerMon() {
        return bankAcctsInfoMinLedgFeePerMon;
    }

    public void setBankAcctsInfoMinLedgFeePerMon(String bankAcctsInfoMinLedgFeePerMon) {
        this.bankAcctsInfoMinLedgFeePerMon = bankAcctsInfoMinLedgFeePerMon;
    }

    public String getBankAcctsInfoInterimStatmnt() {
        return bankAcctsInfoInterimStatmnt;
    }

    public void setBankAcctsInfoInterimStatmnt(String bankAcctsInfoInterimStatmnt) {
        this.bankAcctsInfoInterimStatmnt = bankAcctsInfoInterimStatmnt;
    }

    public String getBankAcctsInfoDupStatmnt() {
        return bankAcctsInfoDupStatmnt;
    }

    public void setBankAcctsInfoDupStatmnt(String bankAcctsInfoDupStatmnt) {
        this.bankAcctsInfoDupStatmnt = bankAcctsInfoDupStatmnt;
    }

    public String getBankAcctsInfoClosingAcct() {
        return bankAcctsInfoClosingAcct;
    }

    public void setBankAcctsInfoClosingAcct(String bankAcctsInfoClosingAcct) {
        this.bankAcctsInfoClosingAcct = bankAcctsInfoClosingAcct;
    }

    public String getBankAcctsInfoDormAcctReactiv() {
        return bankAcctsInfoDormAcctReactiv;
    }

    public void setBankAcctsInfoDormAcctReactiv(String bankAcctsInfoDormAcctReactiv) {
        this.bankAcctsInfoDormAcctReactiv = bankAcctsInfoDormAcctReactiv;
    }

    public String getBankAcctsInfoSavCardPassBk() {
        return bankAcctsInfoSavCardPassBk;
    }

    public void setBankAcctsInfoSavCardPassBk(String bankAcctsInfoSavCardPassBk) {
        this.bankAcctsInfoSavCardPassBk = bankAcctsInfoSavCardPassBk;
    }

    public String getBankAcctsInfoEFT() {
        return bankAcctsInfoEFT;
    }

    public void setBankAcctsInfoEFT(String bankAcctsInfoEFT) {
        this.bankAcctsInfoEFT = bankAcctsInfoEFT;
    }

    public String getBankAcctsInfoTT() {
        return bankAcctsInfoTT;
    }

    public void setBankAcctsInfoTT(String bankAcctsInfoTT) {
        this.bankAcctsInfoTT = bankAcctsInfoTT;
    }

    public String getBankAcctsInfoRTGS() {
        return bankAcctsInfoRTGS;
    }

    public void setBankAcctsInfoRTGS(String bankAcctsInfoRTGS) {
        this.bankAcctsInfoRTGS = bankAcctsInfoRTGS;
    }

    public String getBankAcctsInfoStandOrdinBank() {
        return bankAcctsInfoStandOrdinBank;
    }

    public void setBankAcctsInfoStandOrdinBank(String bankAcctsInfoStandOrdinBank) {
        this.bankAcctsInfoStandOrdinBank = bankAcctsInfoStandOrdinBank;
    }

    public String getBankAcctsInfoStandOrdoutBank() {
        return bankAcctsInfoStandOrdoutBank;
    }

    public void setBankAcctsInfoStandOrdoutBank(String bankAcctsInfoStandOrdoutBank) {
        this.bankAcctsInfoStandOrdoutBank = bankAcctsInfoStandOrdoutBank;
    }

    public String getBankAcctsInfoStandOrdUnpaid() {
        return bankAcctsInfoStandOrdUnpaid;
    }

    public void setBankAcctsInfoStandOrdUnpaid(String bankAcctsInfoStandOrdUnpaid) {
        this.bankAcctsInfoStandOrdUnpaid = bankAcctsInfoStandOrdUnpaid;
    }

    public String getBankAcctsInfoCertOfBal() {
        return bankAcctsInfoCertOfBal;
    }

    public void setBankAcctsInfoCertOfBal(String bankAcctsInfoCertOfBal) {
        this.bankAcctsInfoCertOfBal = bankAcctsInfoCertOfBal;
    }

    public String getBankAcctsInfoAudConfirm() {
        return bankAcctsInfoAudConfirm;
    }

    public void setBankAcctsInfoAudConfirm(String bankAcctsInfoAudConfirm) {
        this.bankAcctsInfoAudConfirm = bankAcctsInfoAudConfirm;
    }

    public String getBankAcctsInfoLetOfIntro() {
        return bankAcctsInfoLetOfIntro;
    }

    public void setBankAcctsInfoLetOfIntro(String bankAcctsInfoLetOfIntro) {
        this.bankAcctsInfoLetOfIntro = bankAcctsInfoLetOfIntro;
    }

    public String getBankAcctsInfoSalary() {
        return bankAcctsInfoSalary;
    }

    public void setBankAcctsInfoSalary(String bankAcctsInfoSalary) {
        this.bankAcctsInfoSalary = bankAcctsInfoSalary;
    }

    public String getBankAcctsInfoSchFees() {
        return bankAcctsInfoSchFees;
    }

    public void setBankAcctsInfoSchFees(String bankAcctsInfoSchFees) {
        this.bankAcctsInfoSchFees = bankAcctsInfoSchFees;
    }

    public String getBankAcctsInfoURAColl() {
        return bankAcctsInfoURAColl;
    }

    public void setBankAcctsInfoURAColl(String bankAcctsInfoURAColl) {
        this.bankAcctsInfoURAColl = bankAcctsInfoURAColl;
    }

    public String getBankAcctsInfoUtilColl() {
        return bankAcctsInfoUtilColl;
    }

    public void setBankAcctsInfoUtilColl(String bankAcctsInfoUtilColl) {
        this.bankAcctsInfoUtilColl = bankAcctsInfoUtilColl;
    }

    public String getBankAcctsInfoSafeCust() {
        return bankAcctsInfoSafeCust;
    }

    public void setBankAcctsInfoSafeCust(String bankAcctsInfoSafeCust) {
        this.bankAcctsInfoSafeCust = bankAcctsInfoSafeCust;
    }

    public String getBankAcctsInfoSafeCustAccess() {
        return bankAcctsInfoSafeCustAccess;
    }

    public void setBankAcctsInfoSafeCustAccess(String bankAcctsInfoSafeCustAccess) {
        this.bankAcctsInfoSafeCustAccess = bankAcctsInfoSafeCustAccess;
    }

    public String getBankAcctsInfoCheqBkPerLf() {
        return bankAcctsInfoCheqBkPerLf;
    }

    public void setBankAcctsInfoCheqBkPerLf(String bankAcctsInfoCheqBkPerLf) {
        this.bankAcctsInfoCheqBkPerLf = bankAcctsInfoCheqBkPerLf;
    }

    public String getBankAcctsInfoCntCheqLf() {
        return bankAcctsInfoCntCheqLf;
    }

    public void setBankAcctsInfoCntCheqLf(String bankAcctsInfoCntCheqLf) {
        this.bankAcctsInfoCntCheqLf = bankAcctsInfoCntCheqLf;
    }

    public String getBankAcctsInfoRetCheqInsfFnds() {
        return bankAcctsInfoRetCheqInsfFnds;
    }

    public void setBankAcctsInfoRetCheqInsfFnds(String bankAcctsInfoRetCheqInsfFnds) {
        this.bankAcctsInfoRetCheqInsfFnds = bankAcctsInfoRetCheqInsfFnds;
    }

    public String getBankAcctsInfoRetCheqEffNtClrd() {
        return bankAcctsInfoRetCheqEffNtClrd;
    }

    public void setBankAcctsInfoRetCheqEffNtClrd(String bankAcctsInfoRetCheqEffNtClrd) {
        this.bankAcctsInfoRetCheqEffNtClrd = bankAcctsInfoRetCheqEffNtClrd;
    }

    public String getBankAcctsInfoRetCheqTech() {
        return bankAcctsInfoRetCheqTech;
    }

    public void setBankAcctsInfoRetCheqTech(String bankAcctsInfoRetCheqTech) {
        this.bankAcctsInfoRetCheqTech = bankAcctsInfoRetCheqTech;
    }

    public String getBankAcctsInfoRetCheqOthrBank() {
        return bankAcctsInfoRetCheqOthrBank;
    }

    public void setBankAcctsInfoRetCheqOthrBank(String bankAcctsInfoRetCheqOthrBank) {
        this.bankAcctsInfoRetCheqOthrBank = bankAcctsInfoRetCheqOthrBank;
    }

    public String getBankAcctsInfoStopPayOrdl() {
        return bankAcctsInfoStopPayOrdl;
    }

    public void setBankAcctsInfoStopPayOrdl(String bankAcctsInfoStopPayOrdl) {
        this.bankAcctsInfoStopPayOrdl = bankAcctsInfoStopPayOrdl;
    }

    public String getBankAcctsInfoPostDateCheq() {
        return bankAcctsInfoPostDateCheq;
    }

    public void setBankAcctsInfoPostDateCheq(String bankAcctsInfoPostDateCheq) {
        this.bankAcctsInfoPostDateCheq = bankAcctsInfoPostDateCheq;
    }

    public String getBankAcctsInfoCheqColl() {
        return bankAcctsInfoCheqColl;
    }

    public void setBankAcctsInfoCheqColl(String bankAcctsInfoCheqColl) {
        this.bankAcctsInfoCheqColl = bankAcctsInfoCheqColl;
    }

    public String getBankAcctsInfoDraftCus() {
        return bankAcctsInfoDraftCus;
    }

    public void setBankAcctsInfoDraftCus(String bankAcctsInfoDraftCus) {
        this.bankAcctsInfoDraftCus = bankAcctsInfoDraftCus;
    }

    public String getBankAcctsInfoDraftCancel() {
        return bankAcctsInfoDraftCancel;
    }

    public void setBankAcctsInfoDraftCancel(String bankAcctsInfoDraftCancel) {
        this.bankAcctsInfoDraftCancel = bankAcctsInfoDraftCancel;
    }

    public String getBankAcctsInfoCashWith() {
        return bankAcctsInfoCashWith;
    }

    public void setBankAcctsInfoCashWith(String bankAcctsInfoCashWith) {
        this.bankAcctsInfoCashWith = bankAcctsInfoCashWith;
    }

    public String getBankAcctsInfoCashDep() {
        return bankAcctsInfoCashDep;
    }

    public void setBankAcctsInfoCashDep(String bankAcctsInfoCashDep) {
        this.bankAcctsInfoCashDep = bankAcctsInfoCashDep;
    }

    public String getBankAcctsInfoCoinDep() {
        return bankAcctsInfoCoinDep;
    }

    public void setBankAcctsInfoCoinDep(String bankAcctsInfoCoinDep) {
        this.bankAcctsInfoCoinDep = bankAcctsInfoCoinDep;
    }

    public String getBankAcctsInfoBulkCashWith() {
        return bankAcctsInfoBulkCashWith;
    }

    public void setBankAcctsInfoBulkCashWith(String bankAcctsInfoBulkCashWith) {
        this.bankAcctsInfoBulkCashWith = bankAcctsInfoBulkCashWith;
    }

    public String getBankAcctsInfoBulkCashDep() {
        return bankAcctsInfoBulkCashDep;
    }

    public void setBankAcctsInfoBulkCashDep(String bankAcctsInfoBulkCashDep) {
        this.bankAcctsInfoBulkCashDep = bankAcctsInfoBulkCashDep;
    }

    public Date getBankAcctsInfoTime() {
        return bankAcctsInfoTime;
    }

    public void setBankAcctsInfoTime(Date bankAcctsInfoTime) {
        this.bankAcctsInfoTime = bankAcctsInfoTime;
    }

    public Banks getBankAcctsInfoBankId() {
        return bankAcctsInfoBankId;
    }

    public void setBankAcctsInfoBankId(Banks bankAcctsInfoBankId) {
        this.bankAcctsInfoBankId = bankAcctsInfoBankId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bankAcctsInfoId != null ? bankAcctsInfoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bankacctsinfo)) {
            return false;
        }
        Bankacctsinfo other = (Bankacctsinfo) object;
        if ((this.bankAcctsInfoId == null && other.bankAcctsInfoId != null) || (this.bankAcctsInfoId != null && !this.bankAcctsInfoId.equals(other.bankAcctsInfoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Bankacctsinfo[ bankAcctsInfoId=" + bankAcctsInfoId + " ]";
    }
    
}

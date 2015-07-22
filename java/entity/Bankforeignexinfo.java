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
    @NamedQuery(name = "Bankforeignexinfo.findAll", query = "SELECT b FROM Bankforeignexinfo b"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExInfoId", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExInfoId = :bankFnExInfoId"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExInfoCurrTypes", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExInfoCurrTypes = :bankFnExInfoCurrTypes"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExInfoAppProc", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExInfoAppProc = :bankFnExInfoAppProc"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExInfoOnlineLink", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExInfoOnlineLink = :bankFnExInfoOnlineLink"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExInfoEligibility", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExInfoEligibility = :bankFnExInfoEligibility"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExInfoMinBal", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExInfoMinBal = :bankFnExInfoMinBal"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExInfoPenBelMin", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExInfoPenBelMin = :bankFnExInfoPenBelMin"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExInfoLedFeePerEnt", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExInfoLedFeePerEnt = :bankFnExInfoLedFeePerEnt"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExchInfoMinLedFeePerMon", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExchInfoMinLedFeePerMon = :bankFnExchInfoMinLedFeePerMon"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExInfoAcctMgtServFee", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExInfoAcctMgtServFee = :bankFnExInfoAcctMgtServFee"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExInfoCashDep", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExInfoCashDep = :bankFnExInfoCashDep"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExInfoWithdraw", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExInfoWithdraw = :bankFnExInfoWithdraw"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExInfoStat", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExInfoStat = :bankFnExInfoStat"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExInfoAddStat", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExInfoAddStat = :bankFnExInfoAddStat"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExInfoOutFnTxCus", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExInfoOutFnTxCus = :bankFnExInfoOutFnTxCus"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExInfoOutFnTxNCus", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExInfoOutFnTxNCus = :bankFnExInfoOutFnTxNCus"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExInfoInFnTxCus", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExInfoInFnTxCus = :bankFnExInfoInFnTxCus"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExInfoInFnTxNCus", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExInfoInFnTxNCus = :bankFnExInfoInFnTxNCus"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExInfoSaleTrvCheq", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExInfoSaleTrvCheq = :bankFnExInfoSaleTrvCheq"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExInfoLCOACCC", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExInfoLCOACCC = :bankFnExInfoLCOACCC"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExInfoLCOACNCC", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExInfoLCOACNCC = :bankFnExInfoLCOACNCC"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExInfoLCArrgmtFee", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExInfoLCArrgmtFee = :bankFnExInfoLCArrgmtFee"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExInfoLCPaySetCom", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExInfoLCPaySetCom = :bankFnExInfoLCPaySetCom"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExInfoLCAmmndts", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExInfoLCAmmndts = :bankFnExInfoLCAmmndts"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExInfoFnDrafts", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExInfoFnDrafts = :bankFnExInfoFnDrafts"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExInfoLetOfGrantArrngtFee", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExInfoLetOfGrantArrngtFee = :bankFnExInfoLetOfGrantArrngtFee"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExInfoLGSOTC", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExInfoLGSOTC = :bankFnExInfoLGSOTC"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExInfoLGCWCM", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExInfoLGCWCM = :bankFnExInfoLGCWCM"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExInfoLGUnSec", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExInfoLGUnSec = :bankFnExInfoLGUnSec"),
    @NamedQuery(name = "Bankforeignexinfo.findByBankFnExInfoTime", query = "SELECT b FROM Bankforeignexinfo b WHERE b.bankFnExInfoTime = :bankFnExInfoTime")})
public class Bankforeignexinfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer bankFnExInfoId;
    @Size(max = 100)
    @Column(name = "BankFnExInfo_CurrTypes", length = 100)
    private String bankFnExInfoCurrTypes;
    @Size(max = 500)
    @Column(name = "BankFnExInfo_AppProc", length = 500)
    private String bankFnExInfoAppProc;
    @Size(max = 45)
    @Column(name = "BankFnExInfo_OnlineLink", length = 45)
    private String bankFnExInfoOnlineLink;
    @Size(max = 45)
    @Column(name = "BankFnExInfo_Eligibility", length = 45)
    private String bankFnExInfoEligibility;
    @Size(max = 45)
    @Column(name = "BankFnExInfo_MinBal", length = 45)
    private String bankFnExInfoMinBal;
    @Size(max = 45)
    @Column(name = "BankFnExInfo_PenBelMin", length = 45)
    private String bankFnExInfoPenBelMin;
    @Size(max = 45)
    @Column(name = "BankFnExInfo_LedFeePerEnt", length = 45)
    private String bankFnExInfoLedFeePerEnt;
    @Size(max = 45)
    @Column(name = "BankFnExchInfo_MinLedFeePerMon", length = 45)
    private String bankFnExchInfoMinLedFeePerMon;
    @Size(max = 45)
    @Column(name = "BankFnExInfo_AcctMgtServFee", length = 45)
    private String bankFnExInfoAcctMgtServFee;
    @Size(max = 45)
    @Column(name = "BankFnExInfo_CashDep", length = 45)
    private String bankFnExInfoCashDep;
    @Size(max = 45)
    @Column(name = "BankFnExInfo_Withdraw", length = 45)
    private String bankFnExInfoWithdraw;
    @Size(max = 45)
    @Column(name = "BankFnExInfo_Stat", length = 45)
    private String bankFnExInfoStat;
    @Size(max = 45)
    @Column(name = "BankFnExInfo_AddStat", length = 45)
    private String bankFnExInfoAddStat;
    @Size(max = 45)
    @Column(name = "BankFnExInfo_OutFnTxCus", length = 45)
    private String bankFnExInfoOutFnTxCus;
    @Size(max = 45)
    @Column(name = "BankFnExInfo_OutFnTxNCus", length = 45)
    private String bankFnExInfoOutFnTxNCus;
    @Size(max = 45)
    @Column(name = "BankFnExInfo_InFnTxCus", length = 45)
    private String bankFnExInfoInFnTxCus;
    @Size(max = 45)
    @Column(name = "BankFnExInfo_InFnTxNCus", length = 45)
    private String bankFnExInfoInFnTxNCus;
    @Size(max = 45)
    @Column(name = "BankFnExInfo_SaleTrvCheq", length = 45)
    private String bankFnExInfoSaleTrvCheq;
    @Size(max = 45)
    @Column(name = "BankFnExInfo_LCOACCC", length = 45)
    private String bankFnExInfoLCOACCC;
    @Size(max = 45)
    @Column(name = "BankFnExInfo_LCOACNCC", length = 45)
    private String bankFnExInfoLCOACNCC;
    @Size(max = 45)
    @Column(name = "BankFnExInfo_LCArrgmtFee", length = 45)
    private String bankFnExInfoLCArrgmtFee;
    @Size(max = 45)
    @Column(name = "BankFnExInfo_LCPaySetCom", length = 45)
    private String bankFnExInfoLCPaySetCom;
    @Size(max = 45)
    @Column(name = "BankFnExInfo_LCAmmndts", length = 45)
    private String bankFnExInfoLCAmmndts;
    @Size(max = 45)
    @Column(name = "BankFnExInfo_FnDrafts", length = 45)
    private String bankFnExInfoFnDrafts;
    @Size(max = 45)
    @Column(name = "BankFnExInfo_LetOfGrantArrngtFee", length = 45)
    private String bankFnExInfoLetOfGrantArrngtFee;
    @Size(max = 45)
    @Column(name = "BankFnExInfo_LGSOTC", length = 45)
    private String bankFnExInfoLGSOTC;
    @Size(max = 45)
    @Column(name = "BankFnExInfo_LGCWCM", length = 45)
    private String bankFnExInfoLGCWCM;
    @Size(max = 45)
    @Column(name = "BankFnExInfo_LGUnSec", length = 45)
    private String bankFnExInfoLGUnSec;
    @Column(name = "BankFnExInfo_Time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bankFnExInfoTime;
    @JoinColumn(name = "BankFnExInfo_BankId", referencedColumnName = "BankId")
    @ManyToOne
    private Banks bankFnExInfoBankId;

    public Bankforeignexinfo() {
    }

    public Bankforeignexinfo(Integer bankFnExInfoId) {
        this.bankFnExInfoId = bankFnExInfoId;
    }

    public Integer getBankFnExInfoId() {
        return bankFnExInfoId;
    }

    public void setBankFnExInfoId(Integer bankFnExInfoId) {
        this.bankFnExInfoId = bankFnExInfoId;
    }

    public String getBankFnExInfoCurrTypes() {
        return bankFnExInfoCurrTypes;
    }

    public void setBankFnExInfoCurrTypes(String bankFnExInfoCurrTypes) {
        this.bankFnExInfoCurrTypes = bankFnExInfoCurrTypes;
    }

    public String getBankFnExInfoAppProc() {
        return bankFnExInfoAppProc;
    }

    public void setBankFnExInfoAppProc(String bankFnExInfoAppProc) {
        this.bankFnExInfoAppProc = bankFnExInfoAppProc;
    }

    public String getBankFnExInfoOnlineLink() {
        return bankFnExInfoOnlineLink;
    }

    public void setBankFnExInfoOnlineLink(String bankFnExInfoOnlineLink) {
        this.bankFnExInfoOnlineLink = bankFnExInfoOnlineLink;
    }

    public String getBankFnExInfoEligibility() {
        return bankFnExInfoEligibility;
    }

    public void setBankFnExInfoEligibility(String bankFnExInfoEligibility) {
        this.bankFnExInfoEligibility = bankFnExInfoEligibility;
    }

    public String getBankFnExInfoMinBal() {
        return bankFnExInfoMinBal;
    }

    public void setBankFnExInfoMinBal(String bankFnExInfoMinBal) {
        this.bankFnExInfoMinBal = bankFnExInfoMinBal;
    }

    public String getBankFnExInfoPenBelMin() {
        return bankFnExInfoPenBelMin;
    }

    public void setBankFnExInfoPenBelMin(String bankFnExInfoPenBelMin) {
        this.bankFnExInfoPenBelMin = bankFnExInfoPenBelMin;
    }

    public String getBankFnExInfoLedFeePerEnt() {
        return bankFnExInfoLedFeePerEnt;
    }

    public void setBankFnExInfoLedFeePerEnt(String bankFnExInfoLedFeePerEnt) {
        this.bankFnExInfoLedFeePerEnt = bankFnExInfoLedFeePerEnt;
    }

    public String getBankFnExchInfoMinLedFeePerMon() {
        return bankFnExchInfoMinLedFeePerMon;
    }

    public void setBankFnExchInfoMinLedFeePerMon(String bankFnExchInfoMinLedFeePerMon) {
        this.bankFnExchInfoMinLedFeePerMon = bankFnExchInfoMinLedFeePerMon;
    }

    public String getBankFnExInfoAcctMgtServFee() {
        return bankFnExInfoAcctMgtServFee;
    }

    public void setBankFnExInfoAcctMgtServFee(String bankFnExInfoAcctMgtServFee) {
        this.bankFnExInfoAcctMgtServFee = bankFnExInfoAcctMgtServFee;
    }

    public String getBankFnExInfoCashDep() {
        return bankFnExInfoCashDep;
    }

    public void setBankFnExInfoCashDep(String bankFnExInfoCashDep) {
        this.bankFnExInfoCashDep = bankFnExInfoCashDep;
    }

    public String getBankFnExInfoWithdraw() {
        return bankFnExInfoWithdraw;
    }

    public void setBankFnExInfoWithdraw(String bankFnExInfoWithdraw) {
        this.bankFnExInfoWithdraw = bankFnExInfoWithdraw;
    }

    public String getBankFnExInfoStat() {
        return bankFnExInfoStat;
    }

    public void setBankFnExInfoStat(String bankFnExInfoStat) {
        this.bankFnExInfoStat = bankFnExInfoStat;
    }

    public String getBankFnExInfoAddStat() {
        return bankFnExInfoAddStat;
    }

    public void setBankFnExInfoAddStat(String bankFnExInfoAddStat) {
        this.bankFnExInfoAddStat = bankFnExInfoAddStat;
    }

    public String getBankFnExInfoOutFnTxCus() {
        return bankFnExInfoOutFnTxCus;
    }

    public void setBankFnExInfoOutFnTxCus(String bankFnExInfoOutFnTxCus) {
        this.bankFnExInfoOutFnTxCus = bankFnExInfoOutFnTxCus;
    }

    public String getBankFnExInfoOutFnTxNCus() {
        return bankFnExInfoOutFnTxNCus;
    }

    public void setBankFnExInfoOutFnTxNCus(String bankFnExInfoOutFnTxNCus) {
        this.bankFnExInfoOutFnTxNCus = bankFnExInfoOutFnTxNCus;
    }

    public String getBankFnExInfoInFnTxCus() {
        return bankFnExInfoInFnTxCus;
    }

    public void setBankFnExInfoInFnTxCus(String bankFnExInfoInFnTxCus) {
        this.bankFnExInfoInFnTxCus = bankFnExInfoInFnTxCus;
    }

    public String getBankFnExInfoInFnTxNCus() {
        return bankFnExInfoInFnTxNCus;
    }

    public void setBankFnExInfoInFnTxNCus(String bankFnExInfoInFnTxNCus) {
        this.bankFnExInfoInFnTxNCus = bankFnExInfoInFnTxNCus;
    }

    public String getBankFnExInfoSaleTrvCheq() {
        return bankFnExInfoSaleTrvCheq;
    }

    public void setBankFnExInfoSaleTrvCheq(String bankFnExInfoSaleTrvCheq) {
        this.bankFnExInfoSaleTrvCheq = bankFnExInfoSaleTrvCheq;
    }

    public String getBankFnExInfoLCOACCC() {
        return bankFnExInfoLCOACCC;
    }

    public void setBankFnExInfoLCOACCC(String bankFnExInfoLCOACCC) {
        this.bankFnExInfoLCOACCC = bankFnExInfoLCOACCC;
    }

    public String getBankFnExInfoLCOACNCC() {
        return bankFnExInfoLCOACNCC;
    }

    public void setBankFnExInfoLCOACNCC(String bankFnExInfoLCOACNCC) {
        this.bankFnExInfoLCOACNCC = bankFnExInfoLCOACNCC;
    }

    public String getBankFnExInfoLCArrgmtFee() {
        return bankFnExInfoLCArrgmtFee;
    }

    public void setBankFnExInfoLCArrgmtFee(String bankFnExInfoLCArrgmtFee) {
        this.bankFnExInfoLCArrgmtFee = bankFnExInfoLCArrgmtFee;
    }

    public String getBankFnExInfoLCPaySetCom() {
        return bankFnExInfoLCPaySetCom;
    }

    public void setBankFnExInfoLCPaySetCom(String bankFnExInfoLCPaySetCom) {
        this.bankFnExInfoLCPaySetCom = bankFnExInfoLCPaySetCom;
    }

    public String getBankFnExInfoLCAmmndts() {
        return bankFnExInfoLCAmmndts;
    }

    public void setBankFnExInfoLCAmmndts(String bankFnExInfoLCAmmndts) {
        this.bankFnExInfoLCAmmndts = bankFnExInfoLCAmmndts;
    }

    public String getBankFnExInfoFnDrafts() {
        return bankFnExInfoFnDrafts;
    }

    public void setBankFnExInfoFnDrafts(String bankFnExInfoFnDrafts) {
        this.bankFnExInfoFnDrafts = bankFnExInfoFnDrafts;
    }

    public String getBankFnExInfoLetOfGrantArrngtFee() {
        return bankFnExInfoLetOfGrantArrngtFee;
    }

    public void setBankFnExInfoLetOfGrantArrngtFee(String bankFnExInfoLetOfGrantArrngtFee) {
        this.bankFnExInfoLetOfGrantArrngtFee = bankFnExInfoLetOfGrantArrngtFee;
    }

    public String getBankFnExInfoLGSOTC() {
        return bankFnExInfoLGSOTC;
    }

    public void setBankFnExInfoLGSOTC(String bankFnExInfoLGSOTC) {
        this.bankFnExInfoLGSOTC = bankFnExInfoLGSOTC;
    }

    public String getBankFnExInfoLGCWCM() {
        return bankFnExInfoLGCWCM;
    }

    public void setBankFnExInfoLGCWCM(String bankFnExInfoLGCWCM) {
        this.bankFnExInfoLGCWCM = bankFnExInfoLGCWCM;
    }

    public String getBankFnExInfoLGUnSec() {
        return bankFnExInfoLGUnSec;
    }

    public void setBankFnExInfoLGUnSec(String bankFnExInfoLGUnSec) {
        this.bankFnExInfoLGUnSec = bankFnExInfoLGUnSec;
    }

    public Date getBankFnExInfoTime() {
        return bankFnExInfoTime;
    }

    public void setBankFnExInfoTime(Date bankFnExInfoTime) {
        this.bankFnExInfoTime = bankFnExInfoTime;
    }

    public Banks getBankFnExInfoBankId() {
        return bankFnExInfoBankId;
    }

    public void setBankFnExInfoBankId(Banks bankFnExInfoBankId) {
        this.bankFnExInfoBankId = bankFnExInfoBankId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bankFnExInfoId != null ? bankFnExInfoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bankforeignexinfo)) {
            return false;
        }
        Bankforeignexinfo other = (Bankforeignexinfo) object;
        if ((this.bankFnExInfoId == null && other.bankFnExInfoId != null) || (this.bankFnExInfoId != null && !this.bankFnExInfoId.equals(other.bankFnExInfoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Bankforeignexinfo[ bankFnExInfoId=" + bankFnExInfoId + " ]";
    }
    
}

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
    @NamedQuery(name = "Microfinforeignexinfo.findAll", query = "SELECT m FROM Microfinforeignexinfo m"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMFFnExInfoId", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mFFnExInfoId = :mFFnExInfoId"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMFFnExInfoCurrTypes", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mFFnExInfoCurrTypes = :mFFnExInfoCurrTypes"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMFFnExInfoAppProc", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mFFnExInfoAppProc = :mFFnExInfoAppProc"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMFFnExInfoOnlineLink", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mFFnExInfoOnlineLink = :mFFnExInfoOnlineLink"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMFFnExInfoEligibility", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mFFnExInfoEligibility = :mFFnExInfoEligibility"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMFFnExInfoMinBal", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mFFnExInfoMinBal = :mFFnExInfoMinBal"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMFFnExInfoPenBelMin", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mFFnExInfoPenBelMin = :mFFnExInfoPenBelMin"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMFFnExInfoLedFeePerEnt", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mFFnExInfoLedFeePerEnt = :mFFnExInfoLedFeePerEnt"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMFFnExchInfoMinLedFeePerMon", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mFFnExchInfoMinLedFeePerMon = :mFFnExchInfoMinLedFeePerMon"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMFFnExInfoAcctMgtServFee", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mFFnExInfoAcctMgtServFee = :mFFnExInfoAcctMgtServFee"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMFFnExInfoCashDep", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mFFnExInfoCashDep = :mFFnExInfoCashDep"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMFFnExInfoWithdraw", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mFFnExInfoWithdraw = :mFFnExInfoWithdraw"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMFFnExInfoStat", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mFFnExInfoStat = :mFFnExInfoStat"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMFFnExInfoAddStat", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mFFnExInfoAddStat = :mFFnExInfoAddStat"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMFFnExInfoOutFnTxCus", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mFFnExInfoOutFnTxCus = :mFFnExInfoOutFnTxCus"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMFFnExInfoOutFnTxNCus", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mFFnExInfoOutFnTxNCus = :mFFnExInfoOutFnTxNCus"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMFFnExInfoInFnTxCus", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mFFnExInfoInFnTxCus = :mFFnExInfoInFnTxCus"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMFFnExInfoInFnTxNCus", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mFFnExInfoInFnTxNCus = :mFFnExInfoInFnTxNCus"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMFFnExInfoSaleTrvCheq", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mFFnExInfoSaleTrvCheq = :mFFnExInfoSaleTrvCheq"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMFFnExInfoLCOACCC", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mFFnExInfoLCOACCC = :mFFnExInfoLCOACCC"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMFFnExInfoLCOACNCC", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mFFnExInfoLCOACNCC = :mFFnExInfoLCOACNCC"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMfFnExInfoLCArrgmtFee", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mfFnExInfoLCArrgmtFee = :mfFnExInfoLCArrgmtFee"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMFFnExInfoLCPaySetCom", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mFFnExInfoLCPaySetCom = :mFFnExInfoLCPaySetCom"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMFFnExInfoLCAmmndts", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mFFnExInfoLCAmmndts = :mFFnExInfoLCAmmndts"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMFFnExInfoFnDrafts", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mFFnExInfoFnDrafts = :mFFnExInfoFnDrafts"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMFFnExInfoLetOfGrantArrngtFee", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mFFnExInfoLetOfGrantArrngtFee = :mFFnExInfoLetOfGrantArrngtFee"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMFFnExInfoLGSOTC", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mFFnExInfoLGSOTC = :mFFnExInfoLGSOTC"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMFFnExInfoLGCWCM", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mFFnExInfoLGCWCM = :mFFnExInfoLGCWCM"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMFFnExInfoLGUnSec", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mFFnExInfoLGUnSec = :mFFnExInfoLGUnSec"),
    @NamedQuery(name = "Microfinforeignexinfo.findByMFFnExInfoTime", query = "SELECT m FROM Microfinforeignexinfo m WHERE m.mFFnExInfoTime = :mFFnExInfoTime")})
public class Microfinforeignexinfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer mFFnExInfoId;
    @Size(max = 100)
    @Column(name = "MFFnExInfo_CurrTypes", length = 100)
    private String mFFnExInfoCurrTypes;
    @Size(max = 500)
    @Column(name = "MFFnExInfo_AppProc", length = 500)
    private String mFFnExInfoAppProc;
    @Size(max = 45)
    @Column(name = "MFFnExInfo_OnlineLink", length = 45)
    private String mFFnExInfoOnlineLink;
    @Size(max = 45)
    @Column(name = "MFFnExInfo_Eligibility", length = 45)
    private String mFFnExInfoEligibility;
    @Size(max = 45)
    @Column(name = "MFFnExInfo_MinBal", length = 45)
    private String mFFnExInfoMinBal;
    @Size(max = 45)
    @Column(name = "MFFnExInfo_PenBelMin", length = 45)
    private String mFFnExInfoPenBelMin;
    @Size(max = 45)
    @Column(name = "MFFnExInfo_LedFeePerEnt", length = 45)
    private String mFFnExInfoLedFeePerEnt;
    @Size(max = 45)
    @Column(name = "MFFnExchInfo_MinLedFeePerMon", length = 45)
    private String mFFnExchInfoMinLedFeePerMon;
    @Size(max = 45)
    @Column(name = "MFFnExInfo_AcctMgtServFee", length = 45)
    private String mFFnExInfoAcctMgtServFee;
    @Size(max = 45)
    @Column(name = "MFFnExInfo_CashDep", length = 45)
    private String mFFnExInfoCashDep;
    @Size(max = 45)
    @Column(name = "MFFnExInfo_Withdraw", length = 45)
    private String mFFnExInfoWithdraw;
    @Size(max = 45)
    @Column(name = "MFFnExInfo_Stat", length = 45)
    private String mFFnExInfoStat;
    @Size(max = 45)
    @Column(name = "MFFnExInfo_AddStat", length = 45)
    private String mFFnExInfoAddStat;
    @Size(max = 45)
    @Column(name = "MFFnExInfo_OutFnTxCus", length = 45)
    private String mFFnExInfoOutFnTxCus;
    @Size(max = 45)
    @Column(name = "MFFnExInfo_OutFnTxNCus", length = 45)
    private String mFFnExInfoOutFnTxNCus;
    @Size(max = 45)
    @Column(name = "MFFnExInfo_InFnTxCus", length = 45)
    private String mFFnExInfoInFnTxCus;
    @Size(max = 45)
    @Column(name = "MFFnExInfo_InFnTxNCus", length = 45)
    private String mFFnExInfoInFnTxNCus;
    @Size(max = 45)
    @Column(name = "MFFnExInfo_SaleTrvCheq", length = 45)
    private String mFFnExInfoSaleTrvCheq;
    @Size(max = 45)
    @Column(name = "MFFnExInfo_LCOACCC", length = 45)
    private String mFFnExInfoLCOACCC;
    @Size(max = 45)
    @Column(name = "MFFnExInfo_LCOACNCC", length = 45)
    private String mFFnExInfoLCOACNCC;
    @Size(max = 45)
    @Column(name = "MfFnExInfo_LCArrgmtFee", length = 45)
    private String mfFnExInfoLCArrgmtFee;
    @Size(max = 45)
    @Column(name = "MFFnExInfo_LCPaySetCom", length = 45)
    private String mFFnExInfoLCPaySetCom;
    @Size(max = 45)
    @Column(name = "MFFnExInfo_LCAmmndts", length = 45)
    private String mFFnExInfoLCAmmndts;
    @Size(max = 45)
    @Column(name = "MFFnExInfo_FnDrafts", length = 45)
    private String mFFnExInfoFnDrafts;
    @Size(max = 45)
    @Column(name = "MFFnExInfo_LetOfGrantArrngtFee", length = 45)
    private String mFFnExInfoLetOfGrantArrngtFee;
    @Size(max = 45)
    @Column(name = "MFFnExInfo_LGSOTC", length = 45)
    private String mFFnExInfoLGSOTC;
    @Size(max = 45)
    @Column(name = "MFFnExInfo_LGCWCM", length = 45)
    private String mFFnExInfoLGCWCM;
    @Size(max = 45)
    @Column(name = "MFFnExInfo_LGUnSec", length = 45)
    private String mFFnExInfoLGUnSec;
    @Column(name = "MFFnExInfo_Time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mFFnExInfoTime;
    @JoinColumn(name = "MFFnExInfo_MicroFinId", referencedColumnName = "MicroFinId")
    @ManyToOne
    private Microfinances mFFnExInfoMicroFinId;

    public Microfinforeignexinfo() {
    }

    public Microfinforeignexinfo(Integer mFFnExInfoId) {
        this.mFFnExInfoId = mFFnExInfoId;
    }

    public Integer getMFFnExInfoId() {
        return mFFnExInfoId;
    }

    public void setMFFnExInfoId(Integer mFFnExInfoId) {
        this.mFFnExInfoId = mFFnExInfoId;
    }

    public String getMFFnExInfoCurrTypes() {
        return mFFnExInfoCurrTypes;
    }

    public void setMFFnExInfoCurrTypes(String mFFnExInfoCurrTypes) {
        this.mFFnExInfoCurrTypes = mFFnExInfoCurrTypes;
    }

    public String getMFFnExInfoAppProc() {
        return mFFnExInfoAppProc;
    }

    public void setMFFnExInfoAppProc(String mFFnExInfoAppProc) {
        this.mFFnExInfoAppProc = mFFnExInfoAppProc;
    }

    public String getMFFnExInfoOnlineLink() {
        return mFFnExInfoOnlineLink;
    }

    public void setMFFnExInfoOnlineLink(String mFFnExInfoOnlineLink) {
        this.mFFnExInfoOnlineLink = mFFnExInfoOnlineLink;
    }

    public String getMFFnExInfoEligibility() {
        return mFFnExInfoEligibility;
    }

    public void setMFFnExInfoEligibility(String mFFnExInfoEligibility) {
        this.mFFnExInfoEligibility = mFFnExInfoEligibility;
    }

    public String getMFFnExInfoMinBal() {
        return mFFnExInfoMinBal;
    }

    public void setMFFnExInfoMinBal(String mFFnExInfoMinBal) {
        this.mFFnExInfoMinBal = mFFnExInfoMinBal;
    }

    public String getMFFnExInfoPenBelMin() {
        return mFFnExInfoPenBelMin;
    }

    public void setMFFnExInfoPenBelMin(String mFFnExInfoPenBelMin) {
        this.mFFnExInfoPenBelMin = mFFnExInfoPenBelMin;
    }

    public String getMFFnExInfoLedFeePerEnt() {
        return mFFnExInfoLedFeePerEnt;
    }

    public void setMFFnExInfoLedFeePerEnt(String mFFnExInfoLedFeePerEnt) {
        this.mFFnExInfoLedFeePerEnt = mFFnExInfoLedFeePerEnt;
    }

    public String getMFFnExchInfoMinLedFeePerMon() {
        return mFFnExchInfoMinLedFeePerMon;
    }

    public void setMFFnExchInfoMinLedFeePerMon(String mFFnExchInfoMinLedFeePerMon) {
        this.mFFnExchInfoMinLedFeePerMon = mFFnExchInfoMinLedFeePerMon;
    }

    public String getMFFnExInfoAcctMgtServFee() {
        return mFFnExInfoAcctMgtServFee;
    }

    public void setMFFnExInfoAcctMgtServFee(String mFFnExInfoAcctMgtServFee) {
        this.mFFnExInfoAcctMgtServFee = mFFnExInfoAcctMgtServFee;
    }

    public String getMFFnExInfoCashDep() {
        return mFFnExInfoCashDep;
    }

    public void setMFFnExInfoCashDep(String mFFnExInfoCashDep) {
        this.mFFnExInfoCashDep = mFFnExInfoCashDep;
    }

    public String getMFFnExInfoWithdraw() {
        return mFFnExInfoWithdraw;
    }

    public void setMFFnExInfoWithdraw(String mFFnExInfoWithdraw) {
        this.mFFnExInfoWithdraw = mFFnExInfoWithdraw;
    }

    public String getMFFnExInfoStat() {
        return mFFnExInfoStat;
    }

    public void setMFFnExInfoStat(String mFFnExInfoStat) {
        this.mFFnExInfoStat = mFFnExInfoStat;
    }

    public String getMFFnExInfoAddStat() {
        return mFFnExInfoAddStat;
    }

    public void setMFFnExInfoAddStat(String mFFnExInfoAddStat) {
        this.mFFnExInfoAddStat = mFFnExInfoAddStat;
    }

    public String getMFFnExInfoOutFnTxCus() {
        return mFFnExInfoOutFnTxCus;
    }

    public void setMFFnExInfoOutFnTxCus(String mFFnExInfoOutFnTxCus) {
        this.mFFnExInfoOutFnTxCus = mFFnExInfoOutFnTxCus;
    }

    public String getMFFnExInfoOutFnTxNCus() {
        return mFFnExInfoOutFnTxNCus;
    }

    public void setMFFnExInfoOutFnTxNCus(String mFFnExInfoOutFnTxNCus) {
        this.mFFnExInfoOutFnTxNCus = mFFnExInfoOutFnTxNCus;
    }

    public String getMFFnExInfoInFnTxCus() {
        return mFFnExInfoInFnTxCus;
    }

    public void setMFFnExInfoInFnTxCus(String mFFnExInfoInFnTxCus) {
        this.mFFnExInfoInFnTxCus = mFFnExInfoInFnTxCus;
    }

    public String getMFFnExInfoInFnTxNCus() {
        return mFFnExInfoInFnTxNCus;
    }

    public void setMFFnExInfoInFnTxNCus(String mFFnExInfoInFnTxNCus) {
        this.mFFnExInfoInFnTxNCus = mFFnExInfoInFnTxNCus;
    }

    public String getMFFnExInfoSaleTrvCheq() {
        return mFFnExInfoSaleTrvCheq;
    }

    public void setMFFnExInfoSaleTrvCheq(String mFFnExInfoSaleTrvCheq) {
        this.mFFnExInfoSaleTrvCheq = mFFnExInfoSaleTrvCheq;
    }

    public String getMFFnExInfoLCOACCC() {
        return mFFnExInfoLCOACCC;
    }

    public void setMFFnExInfoLCOACCC(String mFFnExInfoLCOACCC) {
        this.mFFnExInfoLCOACCC = mFFnExInfoLCOACCC;
    }

    public String getMFFnExInfoLCOACNCC() {
        return mFFnExInfoLCOACNCC;
    }

    public void setMFFnExInfoLCOACNCC(String mFFnExInfoLCOACNCC) {
        this.mFFnExInfoLCOACNCC = mFFnExInfoLCOACNCC;
    }

    public String getMfFnExInfoLCArrgmtFee() {
        return mfFnExInfoLCArrgmtFee;
    }

    public void setMfFnExInfoLCArrgmtFee(String mfFnExInfoLCArrgmtFee) {
        this.mfFnExInfoLCArrgmtFee = mfFnExInfoLCArrgmtFee;
    }

    public String getMFFnExInfoLCPaySetCom() {
        return mFFnExInfoLCPaySetCom;
    }

    public void setMFFnExInfoLCPaySetCom(String mFFnExInfoLCPaySetCom) {
        this.mFFnExInfoLCPaySetCom = mFFnExInfoLCPaySetCom;
    }

    public String getMFFnExInfoLCAmmndts() {
        return mFFnExInfoLCAmmndts;
    }

    public void setMFFnExInfoLCAmmndts(String mFFnExInfoLCAmmndts) {
        this.mFFnExInfoLCAmmndts = mFFnExInfoLCAmmndts;
    }

    public String getMFFnExInfoFnDrafts() {
        return mFFnExInfoFnDrafts;
    }

    public void setMFFnExInfoFnDrafts(String mFFnExInfoFnDrafts) {
        this.mFFnExInfoFnDrafts = mFFnExInfoFnDrafts;
    }

    public String getMFFnExInfoLetOfGrantArrngtFee() {
        return mFFnExInfoLetOfGrantArrngtFee;
    }

    public void setMFFnExInfoLetOfGrantArrngtFee(String mFFnExInfoLetOfGrantArrngtFee) {
        this.mFFnExInfoLetOfGrantArrngtFee = mFFnExInfoLetOfGrantArrngtFee;
    }

    public String getMFFnExInfoLGSOTC() {
        return mFFnExInfoLGSOTC;
    }

    public void setMFFnExInfoLGSOTC(String mFFnExInfoLGSOTC) {
        this.mFFnExInfoLGSOTC = mFFnExInfoLGSOTC;
    }

    public String getMFFnExInfoLGCWCM() {
        return mFFnExInfoLGCWCM;
    }

    public void setMFFnExInfoLGCWCM(String mFFnExInfoLGCWCM) {
        this.mFFnExInfoLGCWCM = mFFnExInfoLGCWCM;
    }

    public String getMFFnExInfoLGUnSec() {
        return mFFnExInfoLGUnSec;
    }

    public void setMFFnExInfoLGUnSec(String mFFnExInfoLGUnSec) {
        this.mFFnExInfoLGUnSec = mFFnExInfoLGUnSec;
    }

    public Date getMFFnExInfoTime() {
        return mFFnExInfoTime;
    }

    public void setMFFnExInfoTime(Date mFFnExInfoTime) {
        this.mFFnExInfoTime = mFFnExInfoTime;
    }

    public Microfinances getMFFnExInfoMicroFinId() {
        return mFFnExInfoMicroFinId;
    }

    public void setMFFnExInfoMicroFinId(Microfinances mFFnExInfoMicroFinId) {
        this.mFFnExInfoMicroFinId = mFFnExInfoMicroFinId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mFFnExInfoId != null ? mFFnExInfoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Microfinforeignexinfo)) {
            return false;
        }
        Microfinforeignexinfo other = (Microfinforeignexinfo) object;
        if ((this.mFFnExInfoId == null && other.mFFnExInfoId != null) || (this.mFFnExInfoId != null && !this.mFFnExInfoId.equals(other.mFFnExInfoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Microfinforeignexinfo[ mFFnExInfoId=" + mFFnExInfoId + " ]";
    }
    
}

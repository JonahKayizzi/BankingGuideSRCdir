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
    @NamedQuery(name = "Microfinloaninfo.findAll", query = "SELECT m FROM Microfinloaninfo m"),
    @NamedQuery(name = "Microfinloaninfo.findByMFLoanInfoId", query = "SELECT m FROM Microfinloaninfo m WHERE m.mFLoanInfoId = :mFLoanInfoId"),
    @NamedQuery(name = "Microfinloaninfo.findByMFLoanInfoLoanTypes", query = "SELECT m FROM Microfinloaninfo m WHERE m.mFLoanInfoLoanTypes = :mFLoanInfoLoanTypes"),
    @NamedQuery(name = "Microfinloaninfo.findByMFLoanInfoLoanAppProc", query = "SELECT m FROM Microfinloaninfo m WHERE m.mFLoanInfoLoanAppProc = :mFLoanInfoLoanAppProc"),
    @NamedQuery(name = "Microfinloaninfo.findByMFLoanInfoOnlineLink", query = "SELECT m FROM Microfinloaninfo m WHERE m.mFLoanInfoOnlineLink = :mFLoanInfoOnlineLink"),
    @NamedQuery(name = "Microfinloaninfo.findByMFLoanInfoLoanEligibility", query = "SELECT m FROM Microfinloaninfo m WHERE m.mFLoanInfoLoanEligibility = :mFLoanInfoLoanEligibility"),
    @NamedQuery(name = "Microfinloaninfo.findByMFLoanInfoLoanOffers", query = "SELECT m FROM Microfinloaninfo m WHERE m.mFLoanInfoLoanOffers = :mFLoanInfoLoanOffers"),
    @NamedQuery(name = "Microfinloaninfo.findByMFLoanInfoPrimeLendRate", query = "SELECT m FROM Microfinloaninfo m WHERE m.mFLoanInfoPrimeLendRate = :mFLoanInfoPrimeLendRate"),
    @NamedQuery(name = "Microfinloaninfo.findByMFLoanInfoMaxLendRate", query = "SELECT m FROM Microfinloaninfo m WHERE m.mFLoanInfoMaxLendRate = :mFLoanInfoMaxLendRate"),
    @NamedQuery(name = "Microfinloaninfo.findByMFLoanInfoMinLendRate", query = "SELECT m FROM Microfinloaninfo m WHERE m.mFLoanInfoMinLendRate = :mFLoanInfoMinLendRate"),
    @NamedQuery(name = "Microfinloaninfo.findByMFLoanInfoLoanAdvAppFee", query = "SELECT m FROM Microfinloaninfo m WHERE m.mFLoanInfoLoanAdvAppFee = :mFLoanInfoLoanAdvAppFee"),
    @NamedQuery(name = "Microfinloaninfo.findByMFLoanInfoLoanAdvComitFee", query = "SELECT m FROM Microfinloaninfo m WHERE m.mFLoanInfoLoanAdvComitFee = :mFLoanInfoLoanAdvComitFee"),
    @NamedQuery(name = "Microfinloaninfo.findByMFLoanInfoLoanAdvArrgmtFee", query = "SELECT m FROM Microfinloaninfo m WHERE m.mFLoanInfoLoanAdvArrgmtFee = :mFLoanInfoLoanAdvArrgmtFee"),
    @NamedQuery(name = "Microfinloaninfo.findByMFLoanInfoLoanAdvProcesFee", query = "SELECT m FROM Microfinloaninfo m WHERE m.mFLoanInfoLoanAdvProcesFee = :mFLoanInfoLoanAdvProcesFee"),
    @NamedQuery(name = "Microfinloaninfo.findByMFLoanInfoLoanAdvMonFee", query = "SELECT m FROM Microfinloaninfo m WHERE m.mFLoanInfoLoanAdvMonFee = :mFLoanInfoLoanAdvMonFee"),
    @NamedQuery(name = "Microfinloaninfo.findByMFLoanInfoInsuranceFee", query = "SELECT m FROM Microfinloaninfo m WHERE m.mFLoanInfoInsuranceFee = :mFLoanInfoInsuranceFee"),
    @NamedQuery(name = "Microfinloaninfo.findByMFLoanInfoLegalFee", query = "SELECT m FROM Microfinloaninfo m WHERE m.mFLoanInfoLegalFee = :mFLoanInfoLegalFee"),
    @NamedQuery(name = "Microfinloaninfo.findByMFLoanInfoLoanAdvFacRenw", query = "SELECT m FROM Microfinloaninfo m WHERE m.mFLoanInfoLoanAdvFacRenw = :mFLoanInfoLoanAdvFacRenw"),
    @NamedQuery(name = "Microfinloaninfo.findByMFLoanInfoLoanAdvFacRest", query = "SELECT m FROM Microfinloaninfo m WHERE m.mFLoanInfoLoanAdvFacRest = :mFLoanInfoLoanAdvFacRest"),
    @NamedQuery(name = "Microfinloaninfo.findByMFLoanInfoDisSecDos", query = "SELECT m FROM Microfinloaninfo m WHERE m.mFLoanInfoDisSecDos = :mFLoanInfoDisSecDos"),
    @NamedQuery(name = "Microfinloaninfo.findByMicroFinLoanInfoTime", query = "SELECT m FROM Microfinloaninfo m WHERE m.microFinLoanInfoTime = :microFinLoanInfoTime")})
public class Microfinloaninfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer mFLoanInfoId;
    @Size(max = 60)
    @Column(name = "MFLoanInfo_LoanTypes", length = 60)
    private String mFLoanInfoLoanTypes;
    @Size(max = 500)
    @Column(name = "MFLoanInfo_LoanAppProc", length = 500)
    private String mFLoanInfoLoanAppProc;
    @Size(max = 45)
    @Column(name = "MFLoanInfo_OnlineLink", length = 45)
    private String mFLoanInfoOnlineLink;
    @Size(max = 100)
    @Column(name = "MFLoanInfo_LoanEligibility", length = 100)
    private String mFLoanInfoLoanEligibility;
    @Size(max = 100)
    @Column(name = "MFLoanInfo_LoanOffers", length = 100)
    private String mFLoanInfoLoanOffers;
    @Size(max = 45)
    @Column(name = "MFLoanInfo_PrimeLendRate", length = 45)
    private String mFLoanInfoPrimeLendRate;
    @Size(max = 45)
    @Column(name = "MFLoanInfo_MaxLendRate", length = 45)
    private String mFLoanInfoMaxLendRate;
    @Size(max = 45)
    @Column(name = "MFLoanInfo_MinLendRate", length = 45)
    private String mFLoanInfoMinLendRate;
    @Size(max = 45)
    @Column(name = "MFLoanInfo_LoanAdvAppFee", length = 45)
    private String mFLoanInfoLoanAdvAppFee;
    @Size(max = 45)
    @Column(name = "MFLoanInfo_LoanAdvComitFee", length = 45)
    private String mFLoanInfoLoanAdvComitFee;
    @Size(max = 45)
    @Column(name = "MFLoanInfo_LoanAdvArrgmtFee", length = 45)
    private String mFLoanInfoLoanAdvArrgmtFee;
    @Size(max = 45)
    @Column(name = "MFLoanInfo_LoanAdvProcesFee", length = 45)
    private String mFLoanInfoLoanAdvProcesFee;
    @Size(max = 45)
    @Column(name = "MFLoanInfo_LoanAdvMonFee", length = 45)
    private String mFLoanInfoLoanAdvMonFee;
    @Size(max = 45)
    @Column(name = "MFLoanInfo_InsuranceFee", length = 45)
    private String mFLoanInfoInsuranceFee;
    @Size(max = 45)
    @Column(name = "MFLoanInfo_LegalFee", length = 45)
    private String mFLoanInfoLegalFee;
    @Size(max = 45)
    @Column(name = "MFLoanInfo_LoanAdvFacRenw", length = 45)
    private String mFLoanInfoLoanAdvFacRenw;
    @Size(max = 45)
    @Column(name = "MFLoanInfo_LoanAdvFacRest", length = 45)
    private String mFLoanInfoLoanAdvFacRest;
    @Size(max = 45)
    @Column(name = "MFLoanInfo_DisSecDos", length = 45)
    private String mFLoanInfoDisSecDos;
    @Column(name = "MicroFinLoanInfo_Time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date microFinLoanInfoTime;
    @JoinColumn(name = "MFLoanInfo_MicroFinId", referencedColumnName = "MicroFinId")
    @ManyToOne
    private Microfinances mFLoanInfoMicroFinId;

    public Microfinloaninfo() {
    }

    public Microfinloaninfo(Integer mFLoanInfoId) {
        this.mFLoanInfoId = mFLoanInfoId;
    }

    public Integer getMFLoanInfoId() {
        return mFLoanInfoId;
    }

    public void setMFLoanInfoId(Integer mFLoanInfoId) {
        this.mFLoanInfoId = mFLoanInfoId;
    }

    public String getMFLoanInfoLoanTypes() {
        return mFLoanInfoLoanTypes;
    }

    public void setMFLoanInfoLoanTypes(String mFLoanInfoLoanTypes) {
        this.mFLoanInfoLoanTypes = mFLoanInfoLoanTypes;
    }

    public String getMFLoanInfoLoanAppProc() {
        return mFLoanInfoLoanAppProc;
    }

    public void setMFLoanInfoLoanAppProc(String mFLoanInfoLoanAppProc) {
        this.mFLoanInfoLoanAppProc = mFLoanInfoLoanAppProc;
    }

    public String getMFLoanInfoOnlineLink() {
        return mFLoanInfoOnlineLink;
    }

    public void setMFLoanInfoOnlineLink(String mFLoanInfoOnlineLink) {
        this.mFLoanInfoOnlineLink = mFLoanInfoOnlineLink;
    }

    public String getMFLoanInfoLoanEligibility() {
        return mFLoanInfoLoanEligibility;
    }

    public void setMFLoanInfoLoanEligibility(String mFLoanInfoLoanEligibility) {
        this.mFLoanInfoLoanEligibility = mFLoanInfoLoanEligibility;
    }

    public String getMFLoanInfoLoanOffers() {
        return mFLoanInfoLoanOffers;
    }

    public void setMFLoanInfoLoanOffers(String mFLoanInfoLoanOffers) {
        this.mFLoanInfoLoanOffers = mFLoanInfoLoanOffers;
    }

    public String getMFLoanInfoPrimeLendRate() {
        return mFLoanInfoPrimeLendRate;
    }

    public void setMFLoanInfoPrimeLendRate(String mFLoanInfoPrimeLendRate) {
        this.mFLoanInfoPrimeLendRate = mFLoanInfoPrimeLendRate;
    }

    public String getMFLoanInfoMaxLendRate() {
        return mFLoanInfoMaxLendRate;
    }

    public void setMFLoanInfoMaxLendRate(String mFLoanInfoMaxLendRate) {
        this.mFLoanInfoMaxLendRate = mFLoanInfoMaxLendRate;
    }

    public String getMFLoanInfoMinLendRate() {
        return mFLoanInfoMinLendRate;
    }

    public void setMFLoanInfoMinLendRate(String mFLoanInfoMinLendRate) {
        this.mFLoanInfoMinLendRate = mFLoanInfoMinLendRate;
    }

    public String getMFLoanInfoLoanAdvAppFee() {
        return mFLoanInfoLoanAdvAppFee;
    }

    public void setMFLoanInfoLoanAdvAppFee(String mFLoanInfoLoanAdvAppFee) {
        this.mFLoanInfoLoanAdvAppFee = mFLoanInfoLoanAdvAppFee;
    }

    public String getMFLoanInfoLoanAdvComitFee() {
        return mFLoanInfoLoanAdvComitFee;
    }

    public void setMFLoanInfoLoanAdvComitFee(String mFLoanInfoLoanAdvComitFee) {
        this.mFLoanInfoLoanAdvComitFee = mFLoanInfoLoanAdvComitFee;
    }

    public String getMFLoanInfoLoanAdvArrgmtFee() {
        return mFLoanInfoLoanAdvArrgmtFee;
    }

    public void setMFLoanInfoLoanAdvArrgmtFee(String mFLoanInfoLoanAdvArrgmtFee) {
        this.mFLoanInfoLoanAdvArrgmtFee = mFLoanInfoLoanAdvArrgmtFee;
    }

    public String getMFLoanInfoLoanAdvProcesFee() {
        return mFLoanInfoLoanAdvProcesFee;
    }

    public void setMFLoanInfoLoanAdvProcesFee(String mFLoanInfoLoanAdvProcesFee) {
        this.mFLoanInfoLoanAdvProcesFee = mFLoanInfoLoanAdvProcesFee;
    }

    public String getMFLoanInfoLoanAdvMonFee() {
        return mFLoanInfoLoanAdvMonFee;
    }

    public void setMFLoanInfoLoanAdvMonFee(String mFLoanInfoLoanAdvMonFee) {
        this.mFLoanInfoLoanAdvMonFee = mFLoanInfoLoanAdvMonFee;
    }

    public String getMFLoanInfoInsuranceFee() {
        return mFLoanInfoInsuranceFee;
    }

    public void setMFLoanInfoInsuranceFee(String mFLoanInfoInsuranceFee) {
        this.mFLoanInfoInsuranceFee = mFLoanInfoInsuranceFee;
    }

    public String getMFLoanInfoLegalFee() {
        return mFLoanInfoLegalFee;
    }

    public void setMFLoanInfoLegalFee(String mFLoanInfoLegalFee) {
        this.mFLoanInfoLegalFee = mFLoanInfoLegalFee;
    }

    public String getMFLoanInfoLoanAdvFacRenw() {
        return mFLoanInfoLoanAdvFacRenw;
    }

    public void setMFLoanInfoLoanAdvFacRenw(String mFLoanInfoLoanAdvFacRenw) {
        this.mFLoanInfoLoanAdvFacRenw = mFLoanInfoLoanAdvFacRenw;
    }

    public String getMFLoanInfoLoanAdvFacRest() {
        return mFLoanInfoLoanAdvFacRest;
    }

    public void setMFLoanInfoLoanAdvFacRest(String mFLoanInfoLoanAdvFacRest) {
        this.mFLoanInfoLoanAdvFacRest = mFLoanInfoLoanAdvFacRest;
    }

    public String getMFLoanInfoDisSecDos() {
        return mFLoanInfoDisSecDos;
    }

    public void setMFLoanInfoDisSecDos(String mFLoanInfoDisSecDos) {
        this.mFLoanInfoDisSecDos = mFLoanInfoDisSecDos;
    }

    public Date getMicroFinLoanInfoTime() {
        return microFinLoanInfoTime;
    }

    public void setMicroFinLoanInfoTime(Date microFinLoanInfoTime) {
        this.microFinLoanInfoTime = microFinLoanInfoTime;
    }

    public Microfinances getMFLoanInfoMicroFinId() {
        return mFLoanInfoMicroFinId;
    }

    public void setMFLoanInfoMicroFinId(Microfinances mFLoanInfoMicroFinId) {
        this.mFLoanInfoMicroFinId = mFLoanInfoMicroFinId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mFLoanInfoId != null ? mFLoanInfoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Microfinloaninfo)) {
            return false;
        }
        Microfinloaninfo other = (Microfinloaninfo) object;
        if ((this.mFLoanInfoId == null && other.mFLoanInfoId != null) || (this.mFLoanInfoId != null && !this.mFLoanInfoId.equals(other.mFLoanInfoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Microfinloaninfo[ mFLoanInfoId=" + mFLoanInfoId + " ]";
    }
    
}

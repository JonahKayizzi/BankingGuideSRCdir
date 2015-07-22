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
    @NamedQuery(name = "Saccoloaninfo.findAll", query = "SELECT s FROM Saccoloaninfo s"),
    @NamedQuery(name = "Saccoloaninfo.findBySACCOLoanInfoId", query = "SELECT s FROM Saccoloaninfo s WHERE s.sACCOLoanInfoId = :sACCOLoanInfoId"),
    @NamedQuery(name = "Saccoloaninfo.findBySACCOLoanInfoLoanTypes", query = "SELECT s FROM Saccoloaninfo s WHERE s.sACCOLoanInfoLoanTypes = :sACCOLoanInfoLoanTypes"),
    @NamedQuery(name = "Saccoloaninfo.findBySACCOLoanInfoLoanAppProc", query = "SELECT s FROM Saccoloaninfo s WHERE s.sACCOLoanInfoLoanAppProc = :sACCOLoanInfoLoanAppProc"),
    @NamedQuery(name = "Saccoloaninfo.findBySACCOLoanInfoOnlineLink", query = "SELECT s FROM Saccoloaninfo s WHERE s.sACCOLoanInfoOnlineLink = :sACCOLoanInfoOnlineLink"),
    @NamedQuery(name = "Saccoloaninfo.findBySACCOLoanInfoLoanEligibility", query = "SELECT s FROM Saccoloaninfo s WHERE s.sACCOLoanInfoLoanEligibility = :sACCOLoanInfoLoanEligibility"),
    @NamedQuery(name = "Saccoloaninfo.findBySACCOLoanInfoLoanOffers", query = "SELECT s FROM Saccoloaninfo s WHERE s.sACCOLoanInfoLoanOffers = :sACCOLoanInfoLoanOffers"),
    @NamedQuery(name = "Saccoloaninfo.findBySACCOLoanInfoPrimeLendRate", query = "SELECT s FROM Saccoloaninfo s WHERE s.sACCOLoanInfoPrimeLendRate = :sACCOLoanInfoPrimeLendRate"),
    @NamedQuery(name = "Saccoloaninfo.findBySACCOLoanInfoMaxLendRate", query = "SELECT s FROM Saccoloaninfo s WHERE s.sACCOLoanInfoMaxLendRate = :sACCOLoanInfoMaxLendRate"),
    @NamedQuery(name = "Saccoloaninfo.findBySACCOLoanInfoMinLendRate", query = "SELECT s FROM Saccoloaninfo s WHERE s.sACCOLoanInfoMinLendRate = :sACCOLoanInfoMinLendRate"),
    @NamedQuery(name = "Saccoloaninfo.findBySACCOLoanInfoLoanAdvAppFee", query = "SELECT s FROM Saccoloaninfo s WHERE s.sACCOLoanInfoLoanAdvAppFee = :sACCOLoanInfoLoanAdvAppFee"),
    @NamedQuery(name = "Saccoloaninfo.findBySACCOLoanInfoLoanAdvComitFee", query = "SELECT s FROM Saccoloaninfo s WHERE s.sACCOLoanInfoLoanAdvComitFee = :sACCOLoanInfoLoanAdvComitFee"),
    @NamedQuery(name = "Saccoloaninfo.findBySACCOLoanInfoLoanAdvArrgmtFee", query = "SELECT s FROM Saccoloaninfo s WHERE s.sACCOLoanInfoLoanAdvArrgmtFee = :sACCOLoanInfoLoanAdvArrgmtFee"),
    @NamedQuery(name = "Saccoloaninfo.findBySACCOLoanInfoLoanAdvProcesFee", query = "SELECT s FROM Saccoloaninfo s WHERE s.sACCOLoanInfoLoanAdvProcesFee = :sACCOLoanInfoLoanAdvProcesFee"),
    @NamedQuery(name = "Saccoloaninfo.findBySACCOLoanInfoLoanAdvMonFee", query = "SELECT s FROM Saccoloaninfo s WHERE s.sACCOLoanInfoLoanAdvMonFee = :sACCOLoanInfoLoanAdvMonFee"),
    @NamedQuery(name = "Saccoloaninfo.findBySACCOLoanInfoInsuranceFee", query = "SELECT s FROM Saccoloaninfo s WHERE s.sACCOLoanInfoInsuranceFee = :sACCOLoanInfoInsuranceFee"),
    @NamedQuery(name = "Saccoloaninfo.findBySACCOLoanInfoLegalFee", query = "SELECT s FROM Saccoloaninfo s WHERE s.sACCOLoanInfoLegalFee = :sACCOLoanInfoLegalFee"),
    @NamedQuery(name = "Saccoloaninfo.findBySACCOLoanInfoLoanAdvFacRenw", query = "SELECT s FROM Saccoloaninfo s WHERE s.sACCOLoanInfoLoanAdvFacRenw = :sACCOLoanInfoLoanAdvFacRenw"),
    @NamedQuery(name = "Saccoloaninfo.findBySACCOLoanInfoLoanAdvFacRest", query = "SELECT s FROM Saccoloaninfo s WHERE s.sACCOLoanInfoLoanAdvFacRest = :sACCOLoanInfoLoanAdvFacRest"),
    @NamedQuery(name = "Saccoloaninfo.findBySACCOLoanInfoDisSecDos", query = "SELECT s FROM Saccoloaninfo s WHERE s.sACCOLoanInfoDisSecDos = :sACCOLoanInfoDisSecDos"),
    @NamedQuery(name = "Saccoloaninfo.findBySACCOLoanInfoTime", query = "SELECT s FROM Saccoloaninfo s WHERE s.sACCOLoanInfoTime = :sACCOLoanInfoTime")})
public class Saccoloaninfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer sACCOLoanInfoId;
    @Size(max = 60)
    @Column(name = "SACCOLoanInfo_LoanTypes", length = 60)
    private String sACCOLoanInfoLoanTypes;
    @Size(max = 500)
    @Column(name = "SACCOLoanInfo_LoanAppProc", length = 500)
    private String sACCOLoanInfoLoanAppProc;
    @Size(max = 45)
    @Column(name = "SACCOLoanInfo_OnlineLink", length = 45)
    private String sACCOLoanInfoOnlineLink;
    @Size(max = 100)
    @Column(name = "SACCOLoanInfo_LoanEligibility", length = 100)
    private String sACCOLoanInfoLoanEligibility;
    @Size(max = 100)
    @Column(name = "SACCOLoanInfo_LoanOffers", length = 100)
    private String sACCOLoanInfoLoanOffers;
    @Size(max = 45)
    @Column(name = "SACCOLoanInfo_PrimeLendRate", length = 45)
    private String sACCOLoanInfoPrimeLendRate;
    @Size(max = 45)
    @Column(name = "SACCOLoanInfo_MaxLendRate", length = 45)
    private String sACCOLoanInfoMaxLendRate;
    @Size(max = 45)
    @Column(name = "SACCOLoanInfo_MinLendRate", length = 45)
    private String sACCOLoanInfoMinLendRate;
    @Size(max = 45)
    @Column(name = "SACCOLoanInfo_LoanAdvAppFee", length = 45)
    private String sACCOLoanInfoLoanAdvAppFee;
    @Size(max = 45)
    @Column(name = "SACCOLoanInfo_LoanAdvComitFee", length = 45)
    private String sACCOLoanInfoLoanAdvComitFee;
    @Size(max = 45)
    @Column(name = "SACCOLoanInfo_LoanAdvArrgmtFee", length = 45)
    private String sACCOLoanInfoLoanAdvArrgmtFee;
    @Size(max = 45)
    @Column(name = "SACCOLoanInfo_LoanAdvProcesFee", length = 45)
    private String sACCOLoanInfoLoanAdvProcesFee;
    @Size(max = 45)
    @Column(name = "SACCOLoanInfo_LoanAdvMonFee", length = 45)
    private String sACCOLoanInfoLoanAdvMonFee;
    @Size(max = 45)
    @Column(name = "SACCOLoanInfo_InsuranceFee", length = 45)
    private String sACCOLoanInfoInsuranceFee;
    @Size(max = 45)
    @Column(name = "SACCOLoanInfo_LegalFee", length = 45)
    private String sACCOLoanInfoLegalFee;
    @Size(max = 45)
    @Column(name = "SACCOLoanInfo_LoanAdvFacRenw", length = 45)
    private String sACCOLoanInfoLoanAdvFacRenw;
    @Size(max = 45)
    @Column(name = "SACCOLoanInfo_LoanAdvFacRest", length = 45)
    private String sACCOLoanInfoLoanAdvFacRest;
    @Size(max = 45)
    @Column(name = "SACCOLoanInfo_DisSecDos", length = 45)
    private String sACCOLoanInfoDisSecDos;
    @Column(name = "SACCOLoanInfo_Time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sACCOLoanInfoTime;
    @JoinColumn(name = "SACCOLoanInfo_SACCOId", referencedColumnName = "SACCOId")
    @ManyToOne
    private Saccos sACCOLoanInfoSACCOId;

    public Saccoloaninfo() {
    }

    public Saccoloaninfo(Integer sACCOLoanInfoId) {
        this.sACCOLoanInfoId = sACCOLoanInfoId;
    }

    public Integer getSACCOLoanInfoId() {
        return sACCOLoanInfoId;
    }

    public void setSACCOLoanInfoId(Integer sACCOLoanInfoId) {
        this.sACCOLoanInfoId = sACCOLoanInfoId;
    }

    public String getSACCOLoanInfoLoanTypes() {
        return sACCOLoanInfoLoanTypes;
    }

    public void setSACCOLoanInfoLoanTypes(String sACCOLoanInfoLoanTypes) {
        this.sACCOLoanInfoLoanTypes = sACCOLoanInfoLoanTypes;
    }

    public String getSACCOLoanInfoLoanAppProc() {
        return sACCOLoanInfoLoanAppProc;
    }

    public void setSACCOLoanInfoLoanAppProc(String sACCOLoanInfoLoanAppProc) {
        this.sACCOLoanInfoLoanAppProc = sACCOLoanInfoLoanAppProc;
    }

    public String getSACCOLoanInfoOnlineLink() {
        return sACCOLoanInfoOnlineLink;
    }

    public void setSACCOLoanInfoOnlineLink(String sACCOLoanInfoOnlineLink) {
        this.sACCOLoanInfoOnlineLink = sACCOLoanInfoOnlineLink;
    }

    public String getSACCOLoanInfoLoanEligibility() {
        return sACCOLoanInfoLoanEligibility;
    }

    public void setSACCOLoanInfoLoanEligibility(String sACCOLoanInfoLoanEligibility) {
        this.sACCOLoanInfoLoanEligibility = sACCOLoanInfoLoanEligibility;
    }

    public String getSACCOLoanInfoLoanOffers() {
        return sACCOLoanInfoLoanOffers;
    }

    public void setSACCOLoanInfoLoanOffers(String sACCOLoanInfoLoanOffers) {
        this.sACCOLoanInfoLoanOffers = sACCOLoanInfoLoanOffers;
    }

    public String getSACCOLoanInfoPrimeLendRate() {
        return sACCOLoanInfoPrimeLendRate;
    }

    public void setSACCOLoanInfoPrimeLendRate(String sACCOLoanInfoPrimeLendRate) {
        this.sACCOLoanInfoPrimeLendRate = sACCOLoanInfoPrimeLendRate;
    }

    public String getSACCOLoanInfoMaxLendRate() {
        return sACCOLoanInfoMaxLendRate;
    }

    public void setSACCOLoanInfoMaxLendRate(String sACCOLoanInfoMaxLendRate) {
        this.sACCOLoanInfoMaxLendRate = sACCOLoanInfoMaxLendRate;
    }

    public String getSACCOLoanInfoMinLendRate() {
        return sACCOLoanInfoMinLendRate;
    }

    public void setSACCOLoanInfoMinLendRate(String sACCOLoanInfoMinLendRate) {
        this.sACCOLoanInfoMinLendRate = sACCOLoanInfoMinLendRate;
    }

    public String getSACCOLoanInfoLoanAdvAppFee() {
        return sACCOLoanInfoLoanAdvAppFee;
    }

    public void setSACCOLoanInfoLoanAdvAppFee(String sACCOLoanInfoLoanAdvAppFee) {
        this.sACCOLoanInfoLoanAdvAppFee = sACCOLoanInfoLoanAdvAppFee;
    }

    public String getSACCOLoanInfoLoanAdvComitFee() {
        return sACCOLoanInfoLoanAdvComitFee;
    }

    public void setSACCOLoanInfoLoanAdvComitFee(String sACCOLoanInfoLoanAdvComitFee) {
        this.sACCOLoanInfoLoanAdvComitFee = sACCOLoanInfoLoanAdvComitFee;
    }

    public String getSACCOLoanInfoLoanAdvArrgmtFee() {
        return sACCOLoanInfoLoanAdvArrgmtFee;
    }

    public void setSACCOLoanInfoLoanAdvArrgmtFee(String sACCOLoanInfoLoanAdvArrgmtFee) {
        this.sACCOLoanInfoLoanAdvArrgmtFee = sACCOLoanInfoLoanAdvArrgmtFee;
    }

    public String getSACCOLoanInfoLoanAdvProcesFee() {
        return sACCOLoanInfoLoanAdvProcesFee;
    }

    public void setSACCOLoanInfoLoanAdvProcesFee(String sACCOLoanInfoLoanAdvProcesFee) {
        this.sACCOLoanInfoLoanAdvProcesFee = sACCOLoanInfoLoanAdvProcesFee;
    }

    public String getSACCOLoanInfoLoanAdvMonFee() {
        return sACCOLoanInfoLoanAdvMonFee;
    }

    public void setSACCOLoanInfoLoanAdvMonFee(String sACCOLoanInfoLoanAdvMonFee) {
        this.sACCOLoanInfoLoanAdvMonFee = sACCOLoanInfoLoanAdvMonFee;
    }

    public String getSACCOLoanInfoInsuranceFee() {
        return sACCOLoanInfoInsuranceFee;
    }

    public void setSACCOLoanInfoInsuranceFee(String sACCOLoanInfoInsuranceFee) {
        this.sACCOLoanInfoInsuranceFee = sACCOLoanInfoInsuranceFee;
    }

    public String getSACCOLoanInfoLegalFee() {
        return sACCOLoanInfoLegalFee;
    }

    public void setSACCOLoanInfoLegalFee(String sACCOLoanInfoLegalFee) {
        this.sACCOLoanInfoLegalFee = sACCOLoanInfoLegalFee;
    }

    public String getSACCOLoanInfoLoanAdvFacRenw() {
        return sACCOLoanInfoLoanAdvFacRenw;
    }

    public void setSACCOLoanInfoLoanAdvFacRenw(String sACCOLoanInfoLoanAdvFacRenw) {
        this.sACCOLoanInfoLoanAdvFacRenw = sACCOLoanInfoLoanAdvFacRenw;
    }

    public String getSACCOLoanInfoLoanAdvFacRest() {
        return sACCOLoanInfoLoanAdvFacRest;
    }

    public void setSACCOLoanInfoLoanAdvFacRest(String sACCOLoanInfoLoanAdvFacRest) {
        this.sACCOLoanInfoLoanAdvFacRest = sACCOLoanInfoLoanAdvFacRest;
    }

    public String getSACCOLoanInfoDisSecDos() {
        return sACCOLoanInfoDisSecDos;
    }

    public void setSACCOLoanInfoDisSecDos(String sACCOLoanInfoDisSecDos) {
        this.sACCOLoanInfoDisSecDos = sACCOLoanInfoDisSecDos;
    }

    public Date getSACCOLoanInfoTime() {
        return sACCOLoanInfoTime;
    }

    public void setSACCOLoanInfoTime(Date sACCOLoanInfoTime) {
        this.sACCOLoanInfoTime = sACCOLoanInfoTime;
    }

    public Saccos getSACCOLoanInfoSACCOId() {
        return sACCOLoanInfoSACCOId;
    }

    public void setSACCOLoanInfoSACCOId(Saccos sACCOLoanInfoSACCOId) {
        this.sACCOLoanInfoSACCOId = sACCOLoanInfoSACCOId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sACCOLoanInfoId != null ? sACCOLoanInfoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Saccoloaninfo)) {
            return false;
        }
        Saccoloaninfo other = (Saccoloaninfo) object;
        if ((this.sACCOLoanInfoId == null && other.sACCOLoanInfoId != null) || (this.sACCOLoanInfoId != null && !this.sACCOLoanInfoId.equals(other.sACCOLoanInfoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Saccoloaninfo[ sACCOLoanInfoId=" + sACCOLoanInfoId + " ]";
    }
    
}

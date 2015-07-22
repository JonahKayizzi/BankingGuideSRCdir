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
    @NamedQuery(name = "Bankloaninfo.findAll", query = "SELECT b FROM Bankloaninfo b"),
    @NamedQuery(name = "Bankloaninfo.findByBankLoanInfoId", query = "SELECT b FROM Bankloaninfo b WHERE b.bankLoanInfoId = :bankLoanInfoId"),
    @NamedQuery(name = "Bankloaninfo.findByBankLoanInfoLoanTypes", query = "SELECT b FROM Bankloaninfo b WHERE b.bankLoanInfoLoanTypes = :bankLoanInfoLoanTypes"),
    @NamedQuery(name = "Bankloaninfo.findByBankLoanInfoLoanAppProc", query = "SELECT b FROM Bankloaninfo b WHERE b.bankLoanInfoLoanAppProc = :bankLoanInfoLoanAppProc"),
    @NamedQuery(name = "Bankloaninfo.findByBankLoanInfoOnlineLink", query = "SELECT b FROM Bankloaninfo b WHERE b.bankLoanInfoOnlineLink = :bankLoanInfoOnlineLink"),
    @NamedQuery(name = "Bankloaninfo.findByBankLoanInfoLoanEligibility", query = "SELECT b FROM Bankloaninfo b WHERE b.bankLoanInfoLoanEligibility = :bankLoanInfoLoanEligibility"),
    @NamedQuery(name = "Bankloaninfo.findByBankLoanInfoLoanOffers", query = "SELECT b FROM Bankloaninfo b WHERE b.bankLoanInfoLoanOffers = :bankLoanInfoLoanOffers"),
    @NamedQuery(name = "Bankloaninfo.findByBankLoanInfoPrimeLendRate", query = "SELECT b FROM Bankloaninfo b WHERE b.bankLoanInfoPrimeLendRate = :bankLoanInfoPrimeLendRate"),
    @NamedQuery(name = "Bankloaninfo.findByBankLoanInfoMaxLendRate", query = "SELECT b FROM Bankloaninfo b WHERE b.bankLoanInfoMaxLendRate = :bankLoanInfoMaxLendRate"),
    @NamedQuery(name = "Bankloaninfo.findByBankLoanInfoMinLendRate", query = "SELECT b FROM Bankloaninfo b WHERE b.bankLoanInfoMinLendRate = :bankLoanInfoMinLendRate"),
    @NamedQuery(name = "Bankloaninfo.findByBankLoanInfoLoanAdvAppFee", query = "SELECT b FROM Bankloaninfo b WHERE b.bankLoanInfoLoanAdvAppFee = :bankLoanInfoLoanAdvAppFee"),
    @NamedQuery(name = "Bankloaninfo.findByBankLoanInfoLoanAdvComitFee", query = "SELECT b FROM Bankloaninfo b WHERE b.bankLoanInfoLoanAdvComitFee = :bankLoanInfoLoanAdvComitFee"),
    @NamedQuery(name = "Bankloaninfo.findByBankLoanInfoLoanAdvArrgmtFee", query = "SELECT b FROM Bankloaninfo b WHERE b.bankLoanInfoLoanAdvArrgmtFee = :bankLoanInfoLoanAdvArrgmtFee"),
    @NamedQuery(name = "Bankloaninfo.findByBankLoanInfoLoanAdvProcesFee", query = "SELECT b FROM Bankloaninfo b WHERE b.bankLoanInfoLoanAdvProcesFee = :bankLoanInfoLoanAdvProcesFee"),
    @NamedQuery(name = "Bankloaninfo.findByBankLoanInfoLoanAdvMonFee", query = "SELECT b FROM Bankloaninfo b WHERE b.bankLoanInfoLoanAdvMonFee = :bankLoanInfoLoanAdvMonFee"),
    @NamedQuery(name = "Bankloaninfo.findByBankLoanInfoInsuranceFee", query = "SELECT b FROM Bankloaninfo b WHERE b.bankLoanInfoInsuranceFee = :bankLoanInfoInsuranceFee"),
    @NamedQuery(name = "Bankloaninfo.findByBankLoanInfoLegalFee", query = "SELECT b FROM Bankloaninfo b WHERE b.bankLoanInfoLegalFee = :bankLoanInfoLegalFee"),
    @NamedQuery(name = "Bankloaninfo.findByBankLoanInfoLoanAdvFacRenw", query = "SELECT b FROM Bankloaninfo b WHERE b.bankLoanInfoLoanAdvFacRenw = :bankLoanInfoLoanAdvFacRenw"),
    @NamedQuery(name = "Bankloaninfo.findByBankLoanInfoLoanAdvFacRest", query = "SELECT b FROM Bankloaninfo b WHERE b.bankLoanInfoLoanAdvFacRest = :bankLoanInfoLoanAdvFacRest"),
    @NamedQuery(name = "Bankloaninfo.findByBankLoanInfoDisSecDos", query = "SELECT b FROM Bankloaninfo b WHERE b.bankLoanInfoDisSecDos = :bankLoanInfoDisSecDos"),
    @NamedQuery(name = "Bankloaninfo.findByBankLoanInfoTime", query = "SELECT b FROM Bankloaninfo b WHERE b.bankLoanInfoTime = :bankLoanInfoTime")})
public class Bankloaninfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer bankLoanInfoId;
    @Size(max = 60)
    @Column(name = "BankLoanInfo_LoanTypes", length = 60)
    private String bankLoanInfoLoanTypes;
    @Size(max = 500)
    @Column(name = "BankLoanInfo_LoanAppProc", length = 500)
    private String bankLoanInfoLoanAppProc;
    @Size(max = 45)
    @Column(name = "BankLoanInfo_OnlineLink", length = 45)
    private String bankLoanInfoOnlineLink;
    @Size(max = 100)
    @Column(name = "BankLoanInfo_LoanEligibility", length = 100)
    private String bankLoanInfoLoanEligibility;
    @Size(max = 100)
    @Column(name = "BankLoanInfo_LoanOffers", length = 100)
    private String bankLoanInfoLoanOffers;
    @Size(max = 45)
    @Column(name = "BankLoanInfo_PrimeLendRate", length = 45)
    private String bankLoanInfoPrimeLendRate;
    @Size(max = 45)
    @Column(name = "BankLoanInfo_MaxLendRate", length = 45)
    private String bankLoanInfoMaxLendRate;
    @Size(max = 45)
    @Column(name = "BankLoanInfo_MinLendRate", length = 45)
    private String bankLoanInfoMinLendRate;
    @Size(max = 45)
    @Column(name = "BankLoanInfo_LoanAdvAppFee", length = 45)
    private String bankLoanInfoLoanAdvAppFee;
    @Size(max = 45)
    @Column(name = "BankLoanInfo_LoanAdvComitFee", length = 45)
    private String bankLoanInfoLoanAdvComitFee;
    @Size(max = 45)
    @Column(name = "BankLoanInfo_LoanAdvArrgmtFee", length = 45)
    private String bankLoanInfoLoanAdvArrgmtFee;
    @Size(max = 45)
    @Column(name = "BankLoanInfo_LoanAdvProcesFee", length = 45)
    private String bankLoanInfoLoanAdvProcesFee;
    @Size(max = 45)
    @Column(name = "BankLoanInfo_LoanAdvMonFee", length = 45)
    private String bankLoanInfoLoanAdvMonFee;
    @Size(max = 45)
    @Column(name = "BankLoanInfo_InsuranceFee", length = 45)
    private String bankLoanInfoInsuranceFee;
    @Size(max = 45)
    @Column(name = "BankLoanInfo_LegalFee", length = 45)
    private String bankLoanInfoLegalFee;
    @Size(max = 45)
    @Column(name = "BankLoanInfo_LoanAdvFacRenw", length = 45)
    private String bankLoanInfoLoanAdvFacRenw;
    @Size(max = 45)
    @Column(name = "BankLoanInfo_LoanAdvFacRest", length = 45)
    private String bankLoanInfoLoanAdvFacRest;
    @Size(max = 45)
    @Column(name = "BankLoanInfo_DisSecDos", length = 45)
    private String bankLoanInfoDisSecDos;
    @Temporal(TemporalType.TIMESTAMP)
    private Date bankLoanInfoTime;
    @JoinColumn(name = "BankLoanInfo_BankId", referencedColumnName = "BankId")
    @ManyToOne
    private Banks bankLoanInfoBankId;

    public Bankloaninfo() {
    }

    public Bankloaninfo(Integer bankLoanInfoId) {
        this.bankLoanInfoId = bankLoanInfoId;
    }

    public Integer getBankLoanInfoId() {
        return bankLoanInfoId;
    }

    public void setBankLoanInfoId(Integer bankLoanInfoId) {
        this.bankLoanInfoId = bankLoanInfoId;
    }

    public String getBankLoanInfoLoanTypes() {
        return bankLoanInfoLoanTypes;
    }

    public void setBankLoanInfoLoanTypes(String bankLoanInfoLoanTypes) {
        this.bankLoanInfoLoanTypes = bankLoanInfoLoanTypes;
    }

    public String getBankLoanInfoLoanAppProc() {
        return bankLoanInfoLoanAppProc;
    }

    public void setBankLoanInfoLoanAppProc(String bankLoanInfoLoanAppProc) {
        this.bankLoanInfoLoanAppProc = bankLoanInfoLoanAppProc;
    }

    public String getBankLoanInfoOnlineLink() {
        return bankLoanInfoOnlineLink;
    }

    public void setBankLoanInfoOnlineLink(String bankLoanInfoOnlineLink) {
        this.bankLoanInfoOnlineLink = bankLoanInfoOnlineLink;
    }

    public String getBankLoanInfoLoanEligibility() {
        return bankLoanInfoLoanEligibility;
    }

    public void setBankLoanInfoLoanEligibility(String bankLoanInfoLoanEligibility) {
        this.bankLoanInfoLoanEligibility = bankLoanInfoLoanEligibility;
    }

    public String getBankLoanInfoLoanOffers() {
        return bankLoanInfoLoanOffers;
    }

    public void setBankLoanInfoLoanOffers(String bankLoanInfoLoanOffers) {
        this.bankLoanInfoLoanOffers = bankLoanInfoLoanOffers;
    }

    public String getBankLoanInfoPrimeLendRate() {
        return bankLoanInfoPrimeLendRate;
    }

    public void setBankLoanInfoPrimeLendRate(String bankLoanInfoPrimeLendRate) {
        this.bankLoanInfoPrimeLendRate = bankLoanInfoPrimeLendRate;
    }

    public String getBankLoanInfoMaxLendRate() {
        return bankLoanInfoMaxLendRate;
    }

    public void setBankLoanInfoMaxLendRate(String bankLoanInfoMaxLendRate) {
        this.bankLoanInfoMaxLendRate = bankLoanInfoMaxLendRate;
    }

    public String getBankLoanInfoMinLendRate() {
        return bankLoanInfoMinLendRate;
    }

    public void setBankLoanInfoMinLendRate(String bankLoanInfoMinLendRate) {
        this.bankLoanInfoMinLendRate = bankLoanInfoMinLendRate;
    }

    public String getBankLoanInfoLoanAdvAppFee() {
        return bankLoanInfoLoanAdvAppFee;
    }

    public void setBankLoanInfoLoanAdvAppFee(String bankLoanInfoLoanAdvAppFee) {
        this.bankLoanInfoLoanAdvAppFee = bankLoanInfoLoanAdvAppFee;
    }

    public String getBankLoanInfoLoanAdvComitFee() {
        return bankLoanInfoLoanAdvComitFee;
    }

    public void setBankLoanInfoLoanAdvComitFee(String bankLoanInfoLoanAdvComitFee) {
        this.bankLoanInfoLoanAdvComitFee = bankLoanInfoLoanAdvComitFee;
    }

    public String getBankLoanInfoLoanAdvArrgmtFee() {
        return bankLoanInfoLoanAdvArrgmtFee;
    }

    public void setBankLoanInfoLoanAdvArrgmtFee(String bankLoanInfoLoanAdvArrgmtFee) {
        this.bankLoanInfoLoanAdvArrgmtFee = bankLoanInfoLoanAdvArrgmtFee;
    }

    public String getBankLoanInfoLoanAdvProcesFee() {
        return bankLoanInfoLoanAdvProcesFee;
    }

    public void setBankLoanInfoLoanAdvProcesFee(String bankLoanInfoLoanAdvProcesFee) {
        this.bankLoanInfoLoanAdvProcesFee = bankLoanInfoLoanAdvProcesFee;
    }

    public String getBankLoanInfoLoanAdvMonFee() {
        return bankLoanInfoLoanAdvMonFee;
    }

    public void setBankLoanInfoLoanAdvMonFee(String bankLoanInfoLoanAdvMonFee) {
        this.bankLoanInfoLoanAdvMonFee = bankLoanInfoLoanAdvMonFee;
    }

    public String getBankLoanInfoInsuranceFee() {
        return bankLoanInfoInsuranceFee;
    }

    public void setBankLoanInfoInsuranceFee(String bankLoanInfoInsuranceFee) {
        this.bankLoanInfoInsuranceFee = bankLoanInfoInsuranceFee;
    }

    public String getBankLoanInfoLegalFee() {
        return bankLoanInfoLegalFee;
    }

    public void setBankLoanInfoLegalFee(String bankLoanInfoLegalFee) {
        this.bankLoanInfoLegalFee = bankLoanInfoLegalFee;
    }

    public String getBankLoanInfoLoanAdvFacRenw() {
        return bankLoanInfoLoanAdvFacRenw;
    }

    public void setBankLoanInfoLoanAdvFacRenw(String bankLoanInfoLoanAdvFacRenw) {
        this.bankLoanInfoLoanAdvFacRenw = bankLoanInfoLoanAdvFacRenw;
    }

    public String getBankLoanInfoLoanAdvFacRest() {
        return bankLoanInfoLoanAdvFacRest;
    }

    public void setBankLoanInfoLoanAdvFacRest(String bankLoanInfoLoanAdvFacRest) {
        this.bankLoanInfoLoanAdvFacRest = bankLoanInfoLoanAdvFacRest;
    }

    public String getBankLoanInfoDisSecDos() {
        return bankLoanInfoDisSecDos;
    }

    public void setBankLoanInfoDisSecDos(String bankLoanInfoDisSecDos) {
        this.bankLoanInfoDisSecDos = bankLoanInfoDisSecDos;
    }

    public Date getBankLoanInfoTime() {
        return bankLoanInfoTime;
    }

    public void setBankLoanInfoTime(Date bankLoanInfoTime) {
        this.bankLoanInfoTime = bankLoanInfoTime;
    }

    public Banks getBankLoanInfoBankId() {
        return bankLoanInfoBankId;
    }

    public void setBankLoanInfoBankId(Banks bankLoanInfoBankId) {
        this.bankLoanInfoBankId = bankLoanInfoBankId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bankLoanInfoId != null ? bankLoanInfoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bankloaninfo)) {
            return false;
        }
        Bankloaninfo other = (Bankloaninfo) object;
        if ((this.bankLoanInfoId == null && other.bankLoanInfoId != null) || (this.bankLoanInfoId != null && !this.bankLoanInfoId.equals(other.bankLoanInfoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Bankloaninfo[ bankLoanInfoId=" + bankLoanInfoId + " ]";
    }
    
}

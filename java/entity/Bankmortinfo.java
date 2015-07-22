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
    @NamedQuery(name = "Bankmortinfo.findAll", query = "SELECT b FROM Bankmortinfo b"),
    @NamedQuery(name = "Bankmortinfo.findByBankMortInfoId", query = "SELECT b FROM Bankmortinfo b WHERE b.bankMortInfoId = :bankMortInfoId"),
    @NamedQuery(name = "Bankmortinfo.findByBankMortInfoMortTypes", query = "SELECT b FROM Bankmortinfo b WHERE b.bankMortInfoMortTypes = :bankMortInfoMortTypes"),
    @NamedQuery(name = "Bankmortinfo.findByBankMortInfoAppProc", query = "SELECT b FROM Bankmortinfo b WHERE b.bankMortInfoAppProc = :bankMortInfoAppProc"),
    @NamedQuery(name = "Bankmortinfo.findByBankMortInfoOnlineLink", query = "SELECT b FROM Bankmortinfo b WHERE b.bankMortInfoOnlineLink = :bankMortInfoOnlineLink"),
    @NamedQuery(name = "Bankmortinfo.findByBankMortInfoIntRate", query = "SELECT b FROM Bankmortinfo b WHERE b.bankMortInfoIntRate = :bankMortInfoIntRate"),
    @NamedQuery(name = "Bankmortinfo.findByBankMortInfoLVP", query = "SELECT b FROM Bankmortinfo b WHERE b.bankMortInfoLVP = :bankMortInfoLVP"),
    @NamedQuery(name = "Bankmortinfo.findByBankMortInfoRepayFee", query = "SELECT b FROM Bankmortinfo b WHERE b.bankMortInfoRepayFee = :bankMortInfoRepayFee"),
    @NamedQuery(name = "Bankmortinfo.findByBankMortInfoMortFeat", query = "SELECT b FROM Bankmortinfo b WHERE b.bankMortInfoMortFeat = :bankMortInfoMortFeat"),
    @NamedQuery(name = "Bankmortinfo.findByBankMortInfoMaxLoan", query = "SELECT b FROM Bankmortinfo b WHERE b.bankMortInfoMaxLoan = :bankMortInfoMaxLoan"),
    @NamedQuery(name = "Bankmortinfo.findByBankMortInfoMinLoan", query = "SELECT b FROM Bankmortinfo b WHERE b.bankMortInfoMinLoan = :bankMortInfoMinLoan"),
    @NamedQuery(name = "Bankmortinfo.findByBankMortInfoOtherPay", query = "SELECT b FROM Bankmortinfo b WHERE b.bankMortInfoOtherPay = :bankMortInfoOtherPay"),
    @NamedQuery(name = "Bankmortinfo.findByBankMortInfoTime", query = "SELECT b FROM Bankmortinfo b WHERE b.bankMortInfoTime = :bankMortInfoTime")})
public class Bankmortinfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer bankMortInfoId;
    @Size(max = 100)
    @Column(name = "BankMortInfo_MortTypes", length = 100)
    private String bankMortInfoMortTypes;
    @Size(max = 500)
    @Column(name = "BankMortInfo_AppProc", length = 500)
    private String bankMortInfoAppProc;
    @Size(max = 45)
    @Column(name = "BankMortInfo_OnlineLink", length = 45)
    private String bankMortInfoOnlineLink;
    @Size(max = 45)
    @Column(name = "BankMortInfo_IntRate", length = 45)
    private String bankMortInfoIntRate;
    @Size(max = 45)
    @Column(name = "BankMortInfo_LVP", length = 45)
    private String bankMortInfoLVP;
    @Size(max = 45)
    @Column(name = "BankMortInfo_RepayFee", length = 45)
    private String bankMortInfoRepayFee;
    @Size(max = 100)
    @Column(name = "BankMortInfo_MortFeat", length = 100)
    private String bankMortInfoMortFeat;
    @Size(max = 45)
    @Column(name = "BankMortInfo_MaxLoan", length = 45)
    private String bankMortInfoMaxLoan;
    @Size(max = 45)
    @Column(name = "BankMortInfo_MinLoan", length = 45)
    private String bankMortInfoMinLoan;
    @Size(max = 100)
    @Column(name = "BankMortInfo_OtherPay", length = 100)
    private String bankMortInfoOtherPay;
    @Column(name = "BankMortInfo_Time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bankMortInfoTime;
    @JoinColumn(name = "BankMortInfo_BankId", referencedColumnName = "BankId")
    @ManyToOne
    private Banks bankMortInfoBankId;

    public Bankmortinfo() {
    }

    public Bankmortinfo(Integer bankMortInfoId) {
        this.bankMortInfoId = bankMortInfoId;
    }

    public Integer getBankMortInfoId() {
        return bankMortInfoId;
    }

    public void setBankMortInfoId(Integer bankMortInfoId) {
        this.bankMortInfoId = bankMortInfoId;
    }

    public String getBankMortInfoMortTypes() {
        return bankMortInfoMortTypes;
    }

    public void setBankMortInfoMortTypes(String bankMortInfoMortTypes) {
        this.bankMortInfoMortTypes = bankMortInfoMortTypes;
    }

    public String getBankMortInfoAppProc() {
        return bankMortInfoAppProc;
    }

    public void setBankMortInfoAppProc(String bankMortInfoAppProc) {
        this.bankMortInfoAppProc = bankMortInfoAppProc;
    }

    public String getBankMortInfoOnlineLink() {
        return bankMortInfoOnlineLink;
    }

    public void setBankMortInfoOnlineLink(String bankMortInfoOnlineLink) {
        this.bankMortInfoOnlineLink = bankMortInfoOnlineLink;
    }

    public String getBankMortInfoIntRate() {
        return bankMortInfoIntRate;
    }

    public void setBankMortInfoIntRate(String bankMortInfoIntRate) {
        this.bankMortInfoIntRate = bankMortInfoIntRate;
    }

    public String getBankMortInfoLVP() {
        return bankMortInfoLVP;
    }

    public void setBankMortInfoLVP(String bankMortInfoLVP) {
        this.bankMortInfoLVP = bankMortInfoLVP;
    }

    public String getBankMortInfoRepayFee() {
        return bankMortInfoRepayFee;
    }

    public void setBankMortInfoRepayFee(String bankMortInfoRepayFee) {
        this.bankMortInfoRepayFee = bankMortInfoRepayFee;
    }

    public String getBankMortInfoMortFeat() {
        return bankMortInfoMortFeat;
    }

    public void setBankMortInfoMortFeat(String bankMortInfoMortFeat) {
        this.bankMortInfoMortFeat = bankMortInfoMortFeat;
    }

    public String getBankMortInfoMaxLoan() {
        return bankMortInfoMaxLoan;
    }

    public void setBankMortInfoMaxLoan(String bankMortInfoMaxLoan) {
        this.bankMortInfoMaxLoan = bankMortInfoMaxLoan;
    }

    public String getBankMortInfoMinLoan() {
        return bankMortInfoMinLoan;
    }

    public void setBankMortInfoMinLoan(String bankMortInfoMinLoan) {
        this.bankMortInfoMinLoan = bankMortInfoMinLoan;
    }

    public String getBankMortInfoOtherPay() {
        return bankMortInfoOtherPay;
    }

    public void setBankMortInfoOtherPay(String bankMortInfoOtherPay) {
        this.bankMortInfoOtherPay = bankMortInfoOtherPay;
    }

    public Date getBankMortInfoTime() {
        return bankMortInfoTime;
    }

    public void setBankMortInfoTime(Date bankMortInfoTime) {
        this.bankMortInfoTime = bankMortInfoTime;
    }

    public Banks getBankMortInfoBankId() {
        return bankMortInfoBankId;
    }

    public void setBankMortInfoBankId(Banks bankMortInfoBankId) {
        this.bankMortInfoBankId = bankMortInfoBankId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bankMortInfoId != null ? bankMortInfoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bankmortinfo)) {
            return false;
        }
        Bankmortinfo other = (Bankmortinfo) object;
        if ((this.bankMortInfoId == null && other.bankMortInfoId != null) || (this.bankMortInfoId != null && !this.bankMortInfoId.equals(other.bankMortInfoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Bankmortinfo[ bankMortInfoId=" + bankMortInfoId + " ]";
    }
    
}

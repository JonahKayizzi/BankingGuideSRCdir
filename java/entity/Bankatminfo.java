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
import javax.persistence.Lob;
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
    @NamedQuery(name = "Bankatminfo.findAll", query = "SELECT b FROM Bankatminfo b"),
    @NamedQuery(name = "Bankatminfo.findByBankATMInfoid", query = "SELECT b FROM Bankatminfo b WHERE b.bankATMInfoid = :bankATMInfoid"),
    @NamedQuery(name = "Bankatminfo.findByBankATMInfoATMAppProc", query = "SELECT b FROM Bankatminfo b WHERE b.bankATMInfoATMAppProc = :bankATMInfoATMAppProc"),
    @NamedQuery(name = "Bankatminfo.findByBankATMInfoOnlineLink", query = "SELECT b FROM Bankatminfo b WHERE b.bankATMInfoOnlineLink = :bankATMInfoOnlineLink"),
    @NamedQuery(name = "Bankatminfo.findByBankATMInfoATMReplacProc", query = "SELECT b FROM Bankatminfo b WHERE b.bankATMInfoATMReplacProc = :bankATMInfoATMReplacProc"),
    @NamedQuery(name = "Bankatminfo.findByBankATMInfoOffers", query = "SELECT b FROM Bankatminfo b WHERE b.bankATMInfoOffers = :bankATMInfoOffers"),
    @NamedQuery(name = "Bankatminfo.findByBankATMInfoRestrict", query = "SELECT b FROM Bankatminfo b WHERE b.bankATMInfoRestrict = :bankATMInfoRestrict"),
    @NamedQuery(name = "Bankatminfo.findByBankATMInfoIssCharge", query = "SELECT b FROM Bankatminfo b WHERE b.bankATMInfoIssCharge = :bankATMInfoIssCharge"),
    @NamedQuery(name = "Bankatminfo.findByBankATMInfoWithCharge", query = "SELECT b FROM Bankatminfo b WHERE b.bankATMInfoWithCharge = :bankATMInfoWithCharge"),
    @NamedQuery(name = "Bankatminfo.findByBankATMInfoDepoCharge", query = "SELECT b FROM Bankatminfo b WHERE b.bankATMInfoDepoCharge = :bankATMInfoDepoCharge"),
    @NamedQuery(name = "Bankatminfo.findByBankATMInfoAddServ", query = "SELECT b FROM Bankatminfo b WHERE b.bankATMInfoAddServ = :bankATMInfoAddServ"),
    @NamedQuery(name = "Bankatminfo.findByBankATMInfoImg", query = "SELECT b FROM Bankatminfo b WHERE b.bankATMInfoImg = :bankATMInfoImg"),
    @NamedQuery(name = "Bankatminfo.findByBankATMInfoExpePrd", query = "SELECT b FROM Bankatminfo b WHERE b.bankATMInfoExpePrd = :bankATMInfoExpePrd"),
    @NamedQuery(name = "Bankatminfo.findByBankATMInfoAppDur", query = "SELECT b FROM Bankatminfo b WHERE b.bankATMInfoAppDur = :bankATMInfoAppDur"),
    @NamedQuery(name = "Bankatminfo.findByBankATMInfoLctns", query = "SELECT b FROM Bankatminfo b WHERE b.bankATMInfoLctns = :bankATMInfoLctns"),
    @NamedQuery(name = "Bankatminfo.findByBankATMInfoUncollectDest", query = "SELECT b FROM Bankatminfo b WHERE b.bankATMInfoUncollectDest = :bankATMInfoUncollectDest"),
    @NamedQuery(name = "Bankatminfo.findByBankATMInfoTime", query = "SELECT b FROM Bankatminfo b WHERE b.bankATMInfoTime = :bankATMInfoTime")})
public class Bankatminfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer bankATMInfoid;
    @Size(max = 500)
    @Column(name = "BankATMInfo_ATMAppProc", length = 500)
    private String bankATMInfoATMAppProc;
    @Size(max = 45)
    @Column(name = "BankATMInfo_OnlineLink", length = 45)
    private String bankATMInfoOnlineLink;
    @Size(max = 500)
    @Column(name = "BankATMInfo_ATMReplacProc", length = 500)
    private String bankATMInfoATMReplacProc;
    @Size(max = 100)
    @Column(name = "BankATMInfo_Offers", length = 100)
    private String bankATMInfoOffers;
    @Size(max = 100)
    @Column(name = "BankATMInfo_Restrict", length = 100)
    private String bankATMInfoRestrict;
    @Column(name = "BankATMInfo_IssCharge")
    private Integer bankATMInfoIssCharge;
    @Column(name = "BankATMInfo_WithCharge")
    private Integer bankATMInfoWithCharge;
    @Column(name = "BankATMInfo_DepoCharge")
    private Integer bankATMInfoDepoCharge;
    @Lob
    @Column(name = "BankATMInfo_VISAsupp")
    private byte[] bankATMInfoVISAsupp;
    @Size(max = 100)
    @Column(name = "BankATMInfo_AddServ", length = 100)
    private String bankATMInfoAddServ;
    @Size(max = 45)
    @Column(name = "BankATMInfo_Img", length = 45)
    private String bankATMInfoImg;
    @Size(max = 45)
    @Column(name = "BankATMInfo_ExpePrd", length = 45)
    private String bankATMInfoExpePrd;
    @Size(max = 45)
    @Column(name = "BankATMInfo_AppDur", length = 45)
    private String bankATMInfoAppDur;
    @Size(max = 45)
    @Column(name = "BankATMInfo_Lctns", length = 45)
    private String bankATMInfoLctns;
    @Size(max = 45)
    @Column(name = "BankATMInfo_UncollectDest", length = 45)
    private String bankATMInfoUncollectDest;
    @Temporal(TemporalType.TIMESTAMP)
    private Date bankATMInfoTime;
    @JoinColumn(name = "BankATMInfo_BankId", referencedColumnName = "BankId")
    @ManyToOne
    private Banks bankATMInfoBankId;

    public Bankatminfo() {
    }

    public Bankatminfo(Integer bankATMInfoid) {
        this.bankATMInfoid = bankATMInfoid;
    }

    public Integer getBankATMInfoid() {
        return bankATMInfoid;
    }

    public void setBankATMInfoid(Integer bankATMInfoid) {
        this.bankATMInfoid = bankATMInfoid;
    }

    public String getBankATMInfoATMAppProc() {
        return bankATMInfoATMAppProc;
    }

    public void setBankATMInfoATMAppProc(String bankATMInfoATMAppProc) {
        this.bankATMInfoATMAppProc = bankATMInfoATMAppProc;
    }

    public String getBankATMInfoOnlineLink() {
        return bankATMInfoOnlineLink;
    }

    public void setBankATMInfoOnlineLink(String bankATMInfoOnlineLink) {
        this.bankATMInfoOnlineLink = bankATMInfoOnlineLink;
    }

    public String getBankATMInfoATMReplacProc() {
        return bankATMInfoATMReplacProc;
    }

    public void setBankATMInfoATMReplacProc(String bankATMInfoATMReplacProc) {
        this.bankATMInfoATMReplacProc = bankATMInfoATMReplacProc;
    }

    public String getBankATMInfoOffers() {
        return bankATMInfoOffers;
    }

    public void setBankATMInfoOffers(String bankATMInfoOffers) {
        this.bankATMInfoOffers = bankATMInfoOffers;
    }

    public String getBankATMInfoRestrict() {
        return bankATMInfoRestrict;
    }

    public void setBankATMInfoRestrict(String bankATMInfoRestrict) {
        this.bankATMInfoRestrict = bankATMInfoRestrict;
    }

    public Integer getBankATMInfoIssCharge() {
        return bankATMInfoIssCharge;
    }

    public void setBankATMInfoIssCharge(Integer bankATMInfoIssCharge) {
        this.bankATMInfoIssCharge = bankATMInfoIssCharge;
    }

    public Integer getBankATMInfoWithCharge() {
        return bankATMInfoWithCharge;
    }

    public void setBankATMInfoWithCharge(Integer bankATMInfoWithCharge) {
        this.bankATMInfoWithCharge = bankATMInfoWithCharge;
    }

    public Integer getBankATMInfoDepoCharge() {
        return bankATMInfoDepoCharge;
    }

    public void setBankATMInfoDepoCharge(Integer bankATMInfoDepoCharge) {
        this.bankATMInfoDepoCharge = bankATMInfoDepoCharge;
    }

    public byte[] getBankATMInfoVISAsupp() {
        return bankATMInfoVISAsupp;
    }

    public void setBankATMInfoVISAsupp(byte[] bankATMInfoVISAsupp) {
        this.bankATMInfoVISAsupp = bankATMInfoVISAsupp;
    }

    public String getBankATMInfoAddServ() {
        return bankATMInfoAddServ;
    }

    public void setBankATMInfoAddServ(String bankATMInfoAddServ) {
        this.bankATMInfoAddServ = bankATMInfoAddServ;
    }

    public String getBankATMInfoImg() {
        return bankATMInfoImg;
    }

    public void setBankATMInfoImg(String bankATMInfoImg) {
        this.bankATMInfoImg = bankATMInfoImg;
    }

    public String getBankATMInfoExpePrd() {
        return bankATMInfoExpePrd;
    }

    public void setBankATMInfoExpePrd(String bankATMInfoExpePrd) {
        this.bankATMInfoExpePrd = bankATMInfoExpePrd;
    }

    public String getBankATMInfoAppDur() {
        return bankATMInfoAppDur;
    }

    public void setBankATMInfoAppDur(String bankATMInfoAppDur) {
        this.bankATMInfoAppDur = bankATMInfoAppDur;
    }

    public String getBankATMInfoLctns() {
        return bankATMInfoLctns;
    }

    public void setBankATMInfoLctns(String bankATMInfoLctns) {
        this.bankATMInfoLctns = bankATMInfoLctns;
    }

    public String getBankATMInfoUncollectDest() {
        return bankATMInfoUncollectDest;
    }

    public void setBankATMInfoUncollectDest(String bankATMInfoUncollectDest) {
        this.bankATMInfoUncollectDest = bankATMInfoUncollectDest;
    }

    public Date getBankATMInfoTime() {
        return bankATMInfoTime;
    }

    public void setBankATMInfoTime(Date bankATMInfoTime) {
        this.bankATMInfoTime = bankATMInfoTime;
    }

    public Banks getBankATMInfoBankId() {
        return bankATMInfoBankId;
    }

    public void setBankATMInfoBankId(Banks bankATMInfoBankId) {
        this.bankATMInfoBankId = bankATMInfoBankId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bankATMInfoid != null ? bankATMInfoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bankatminfo)) {
            return false;
        }
        Bankatminfo other = (Bankatminfo) object;
        if ((this.bankATMInfoid == null && other.bankATMInfoid != null) || (this.bankATMInfoid != null && !this.bankATMInfoid.equals(other.bankATMInfoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Bankatminfo[ bankATMInfoid=" + bankATMInfoid + " ]";
    }
    
}

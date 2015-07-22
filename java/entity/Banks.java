/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Xcelsia
 */
@Entity
@Table(catalog = "bankingguide", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Banks.findAll", query = "SELECT b FROM Banks b"),
    @NamedQuery(name = "Banks.findByBankId", query = "SELECT b FROM Banks b WHERE b.bankId = :bankId"),
    @NamedQuery(name = "Banks.findByBankName", query = "SELECT b FROM Banks b WHERE b.bankName = :bankName"),
    @NamedQuery(name = "Banks.findByBankLogo", query = "SELECT b FROM Banks b WHERE b.bankLogo = :bankLogo"),
    @NamedQuery(name = "Banks.findByBanksSlogan", query = "SELECT b FROM Banks b WHERE b.banksSlogan = :banksSlogan"),
    @NamedQuery(name = "Banks.findByBankTel", query = "SELECT b FROM Banks b WHERE b.bankTel = :bankTel"),
    @NamedQuery(name = "Banks.findByBankPhysicalAddress", query = "SELECT b FROM Banks b WHERE b.bankPhysicalAddress = :bankPhysicalAddress"),
    @NamedQuery(name = "Banks.findByBanksPostalAddress", query = "SELECT b FROM Banks b WHERE b.banksPostalAddress = :banksPostalAddress"),
    @NamedQuery(name = "Banks.findByBanksSupportTel", query = "SELECT b FROM Banks b WHERE b.banksSupportTel = :banksSupportTel"),
    @NamedQuery(name = "Banks.findByBanksSupportEmail", query = "SELECT b FROM Banks b WHERE b.banksSupportEmail = :banksSupportEmail"),
    @NamedQuery(name = "Banks.findByBanksTime", query = "SELECT b FROM Banks b WHERE b.banksTime = :banksTime")})
public class Banks implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer bankId;
    @Size(max = 45)
    @Column(length = 45)
    private String bankName;
    @Size(max = 100)
    @Column(length = 100)
    private String bankLogo;
    @Size(max = 45)
    @Column(length = 45)
    private String banksSlogan;
    @Size(max = 45)
    @Column(length = 45)
    private String bankTel;
    @Size(max = 45)
    @Column(length = 45)
    private String bankPhysicalAddress;
    @Size(max = 45)
    @Column(length = 45)
    private String banksPostalAddress;
    @Size(max = 45)
    @Column(length = 45)
    private String banksSupportTel;
    @Size(max = 45)
    @Column(length = 45)
    private String banksSupportEmail;
    @Temporal(TemporalType.TIMESTAMP)
    private Date banksTime;
    @OneToMany(mappedBy = "bankFnExInfoBankId")
    private Collection<Bankforeignexinfo> bankforeignexinfoCollection;
    @OneToMany(mappedBy = "bankATMInfoBankId")
    private Collection<Bankatminfo> bankatminfoCollection;
    @OneToMany(mappedBy = "bankAcctsInfoBankId")
    private Collection<Bankacctsinfo> bankacctsinfoCollection;
    @OneToMany(mappedBy = "articlePoster4")
    private Collection<Articles> articlesCollection;
    @OneToMany(mappedBy = "bankMortInfoBankId")
    private Collection<Bankmortinfo> bankmortinfoCollection;
    @OneToMany(mappedBy = "bankLoanInfoBankId")
    private Collection<Bankloaninfo> bankloaninfoCollection;
    @OneToMany(mappedBy = "monTrnsPOSInstId2")
    private Collection<Moneytranspointsofsale> moneytranspointsofsaleCollection;

    public Banks() {
        
    }

    public Banks(Integer bankId) {
        this.bankId = bankId;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankLogo() {
        return bankLogo;
    }

    public void setBankLogo(String bankLogo) {
        this.bankLogo = bankLogo;
    }

    public String getBanksSlogan() {
        return banksSlogan;
    }

    public void setBanksSlogan(String banksSlogan) {
        this.banksSlogan = banksSlogan;
    }

    public String getBankTel() {
        return bankTel;
    }

    public void setBankTel(String bankTel) {
        this.bankTel = bankTel;
    }

    public String getBankPhysicalAddress() {
        return bankPhysicalAddress;
    }

    public void setBankPhysicalAddress(String bankPhysicalAddress) {
        this.bankPhysicalAddress = bankPhysicalAddress;
    }

    public String getBanksPostalAddress() {
        return banksPostalAddress;
    }

    public void setBanksPostalAddress(String banksPostalAddress) {
        this.banksPostalAddress = banksPostalAddress;
    }

    public String getBanksSupportTel() {
        return banksSupportTel;
    }

    public void setBanksSupportTel(String banksSupportTel) {
        this.banksSupportTel = banksSupportTel;
    }

    public String getBanksSupportEmail() {
        return banksSupportEmail;
    }

    public void setBanksSupportEmail(String banksSupportEmail) {
        this.banksSupportEmail = banksSupportEmail;
    }

    public Date getBanksTime() {
        return banksTime;
    }

    public void setBanksTime(Date banksTime) {
        this.banksTime = banksTime;
    }

    @XmlTransient
    public Collection<Bankforeignexinfo> getBankforeignexinfoCollection() {
        return bankforeignexinfoCollection;
    }

    public void setBankforeignexinfoCollection(Collection<Bankforeignexinfo> bankforeignexinfoCollection) {
        this.bankforeignexinfoCollection = bankforeignexinfoCollection;
    }

    @XmlTransient
    public Collection<Bankatminfo> getBankatminfoCollection() {
        return bankatminfoCollection;
    }

    public void setBankatminfoCollection(Collection<Bankatminfo> bankatminfoCollection) {
        this.bankatminfoCollection = bankatminfoCollection;
    }

    @XmlTransient
    public Collection<Bankacctsinfo> getBankacctsinfoCollection() {
        return bankacctsinfoCollection;
    }

    public void setBankacctsinfoCollection(Collection<Bankacctsinfo> bankacctsinfoCollection) {
        this.bankacctsinfoCollection = bankacctsinfoCollection;
    }

    @XmlTransient
    public Collection<Articles> getArticlesCollection() {
        return articlesCollection;
    }

    public void setArticlesCollection(Collection<Articles> articlesCollection) {
        this.articlesCollection = articlesCollection;
    }

    @XmlTransient
    public Collection<Bankmortinfo> getBankmortinfoCollection() {
        return bankmortinfoCollection;
    }

    public void setBankmortinfoCollection(Collection<Bankmortinfo> bankmortinfoCollection) {
        this.bankmortinfoCollection = bankmortinfoCollection;
    }

    @XmlTransient
    public Collection<Bankloaninfo> getBankloaninfoCollection() {
        return bankloaninfoCollection;
    }

    public void setBankloaninfoCollection(Collection<Bankloaninfo> bankloaninfoCollection) {
        this.bankloaninfoCollection = bankloaninfoCollection;
    }

    @XmlTransient
    public Collection<Moneytranspointsofsale> getMoneytranspointsofsaleCollection() {
        return moneytranspointsofsaleCollection;
    }

    public void setMoneytranspointsofsaleCollection(Collection<Moneytranspointsofsale> moneytranspointsofsaleCollection) {
        this.moneytranspointsofsaleCollection = moneytranspointsofsaleCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bankId != null ? bankId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Banks)) {
            return false;
        }
        Banks other = (Banks) object;
        if ((this.bankId == null && other.bankId != null) || (this.bankId != null && !this.bankId.equals(other.bankId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Banks[ bankId=" + bankId + " ]";
    }
    
}

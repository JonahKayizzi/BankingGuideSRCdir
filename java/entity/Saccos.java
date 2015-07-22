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
    @NamedQuery(name = "Saccos.findAll", query = "SELECT s FROM Saccos s"),
    @NamedQuery(name = "Saccos.findBySACCOId", query = "SELECT s FROM Saccos s WHERE s.sACCOId = :sACCOId"),
    @NamedQuery(name = "Saccos.findBySACCOName", query = "SELECT s FROM Saccos s WHERE s.sACCOName = :sACCOName"),
    @NamedQuery(name = "Saccos.findBySACCOLogo", query = "SELECT s FROM Saccos s WHERE s.sACCOLogo = :sACCOLogo"),
    @NamedQuery(name = "Saccos.findBySACCOSlogan", query = "SELECT s FROM Saccos s WHERE s.sACCOSlogan = :sACCOSlogan"),
    @NamedQuery(name = "Saccos.findBySACCOTel", query = "SELECT s FROM Saccos s WHERE s.sACCOTel = :sACCOTel"),
    @NamedQuery(name = "Saccos.findBySACCOPhysicalAddress", query = "SELECT s FROM Saccos s WHERE s.sACCOPhysicalAddress = :sACCOPhysicalAddress"),
    @NamedQuery(name = "Saccos.findBySACCOPostalAddress", query = "SELECT s FROM Saccos s WHERE s.sACCOPostalAddress = :sACCOPostalAddress"),
    @NamedQuery(name = "Saccos.findBySACCOSupportTel", query = "SELECT s FROM Saccos s WHERE s.sACCOSupportTel = :sACCOSupportTel"),
    @NamedQuery(name = "Saccos.findBySACCOSupportEmail", query = "SELECT s FROM Saccos s WHERE s.sACCOSupportEmail = :sACCOSupportEmail"),
    @NamedQuery(name = "Saccos.findBySACCOTime", query = "SELECT s FROM Saccos s WHERE s.sACCOTime = :sACCOTime")})
public class Saccos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer sACCOId;
    @Size(max = 45)
    @Column(length = 45)
    private String sACCOName;
    @Size(max = 100)
    @Column(length = 100)
    private String sACCOLogo;
    @Size(max = 45)
    @Column(length = 45)
    private String sACCOSlogan;
    @Size(max = 45)
    @Column(length = 45)
    private String sACCOTel;
    @Size(max = 45)
    @Column(length = 45)
    private String sACCOPhysicalAddress;
    @Size(max = 45)
    @Column(length = 45)
    private String sACCOPostalAddress;
    @Size(max = 45)
    @Column(length = 45)
    private String sACCOSupportTel;
    @Size(max = 45)
    @Column(length = 45)
    private String sACCOSupportEmail;
    @Temporal(TemporalType.TIMESTAMP)
    private Date sACCOTime;
    @OneToMany(mappedBy = "sACCOLoanInfoSACCOId")
    private Collection<Saccoloaninfo> saccoloaninfoCollection;
    @OneToMany(mappedBy = "articlePoster5")
    private Collection<Articles> articlesCollection;

    public Saccos() {
    }

    public Saccos(Integer sACCOId) {
        this.sACCOId = sACCOId;
    }

    public Integer getSACCOId() {
        return sACCOId;
    }

    public void setSACCOId(Integer sACCOId) {
        this.sACCOId = sACCOId;
    }

    public String getSACCOName() {
        return sACCOName;
    }

    public void setSACCOName(String sACCOName) {
        this.sACCOName = sACCOName;
    }

    public String getSACCOLogo() {
        return sACCOLogo;
    }

    public void setSACCOLogo(String sACCOLogo) {
        this.sACCOLogo = sACCOLogo;
    }

    public String getSACCOSlogan() {
        return sACCOSlogan;
    }

    public void setSACCOSlogan(String sACCOSlogan) {
        this.sACCOSlogan = sACCOSlogan;
    }

    public String getSACCOTel() {
        return sACCOTel;
    }

    public void setSACCOTel(String sACCOTel) {
        this.sACCOTel = sACCOTel;
    }

    public String getSACCOPhysicalAddress() {
        return sACCOPhysicalAddress;
    }

    public void setSACCOPhysicalAddress(String sACCOPhysicalAddress) {
        this.sACCOPhysicalAddress = sACCOPhysicalAddress;
    }

    public String getSACCOPostalAddress() {
        return sACCOPostalAddress;
    }

    public void setSACCOPostalAddress(String sACCOPostalAddress) {
        this.sACCOPostalAddress = sACCOPostalAddress;
    }

    public String getSACCOSupportTel() {
        return sACCOSupportTel;
    }

    public void setSACCOSupportTel(String sACCOSupportTel) {
        this.sACCOSupportTel = sACCOSupportTel;
    }

    public String getSACCOSupportEmail() {
        return sACCOSupportEmail;
    }

    public void setSACCOSupportEmail(String sACCOSupportEmail) {
        this.sACCOSupportEmail = sACCOSupportEmail;
    }

    public Date getSACCOTime() {
        return sACCOTime;
    }

    public void setSACCOTime(Date sACCOTime) {
        this.sACCOTime = sACCOTime;
    }

    @XmlTransient
    public Collection<Saccoloaninfo> getSaccoloaninfoCollection() {
        return saccoloaninfoCollection;
    }

    public void setSaccoloaninfoCollection(Collection<Saccoloaninfo> saccoloaninfoCollection) {
        this.saccoloaninfoCollection = saccoloaninfoCollection;
    }

    @XmlTransient
    public Collection<Articles> getArticlesCollection() {
        return articlesCollection;
    }

    public void setArticlesCollection(Collection<Articles> articlesCollection) {
        this.articlesCollection = articlesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sACCOId != null ? sACCOId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Saccos)) {
            return false;
        }
        Saccos other = (Saccos) object;
        if ((this.sACCOId == null && other.sACCOId != null) || (this.sACCOId != null && !this.sACCOId.equals(other.sACCOId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Saccos[ sACCOId=" + sACCOId + " ]";
    }
    
}

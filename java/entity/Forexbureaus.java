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
    @NamedQuery(name = "Forexbureaus.findAll", query = "SELECT f FROM Forexbureaus f"),
    @NamedQuery(name = "Forexbureaus.findByFxBureauId", query = "SELECT f FROM Forexbureaus f WHERE f.fxBureauId = :fxBureauId"),
    @NamedQuery(name = "Forexbureaus.findByFxBureauName", query = "SELECT f FROM Forexbureaus f WHERE f.fxBureauName = :fxBureauName"),
    @NamedQuery(name = "Forexbureaus.findByFxBureauLogo", query = "SELECT f FROM Forexbureaus f WHERE f.fxBureauLogo = :fxBureauLogo"),
    @NamedQuery(name = "Forexbureaus.findByFxBureaulogan", query = "SELECT f FROM Forexbureaus f WHERE f.fxBureaulogan = :fxBureaulogan"),
    @NamedQuery(name = "Forexbureaus.findByFxBureauTel", query = "SELECT f FROM Forexbureaus f WHERE f.fxBureauTel = :fxBureauTel"),
    @NamedQuery(name = "Forexbureaus.findByFxBureauPhysicalAddress", query = "SELECT f FROM Forexbureaus f WHERE f.fxBureauPhysicalAddress = :fxBureauPhysicalAddress"),
    @NamedQuery(name = "Forexbureaus.findByFxBureauPostalAddress", query = "SELECT f FROM Forexbureaus f WHERE f.fxBureauPostalAddress = :fxBureauPostalAddress"),
    @NamedQuery(name = "Forexbureaus.findByFxBureauSupportTel", query = "SELECT f FROM Forexbureaus f WHERE f.fxBureauSupportTel = :fxBureauSupportTel"),
    @NamedQuery(name = "Forexbureaus.findByFxBureauSupportEmail", query = "SELECT f FROM Forexbureaus f WHERE f.fxBureauSupportEmail = :fxBureauSupportEmail"),
    @NamedQuery(name = "Forexbureaus.findByFxBureauTime", query = "SELECT f FROM Forexbureaus f WHERE f.fxBureauTime = :fxBureauTime")})
public class Forexbureaus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer fxBureauId;
    @Size(max = 45)
    @Column(length = 45)
    private String fxBureauName;
    @Size(max = 100)
    @Column(length = 100)
    private String fxBureauLogo;
    @Size(max = 45)
    @Column(length = 45)
    private String fxBureaulogan;
    @Size(max = 45)
    @Column(length = 45)
    private String fxBureauTel;
    @Size(max = 45)
    @Column(length = 45)
    private String fxBureauPhysicalAddress;
    @Size(max = 45)
    @Column(length = 45)
    private String fxBureauPostalAddress;
    @Size(max = 45)
    @Column(length = 45)
    private String fxBureauSupportTel;
    @Size(max = 45)
    @Column(length = 45)
    private String fxBureauSupportEmail;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fxBureauTime;
    @OneToMany(mappedBy = "articlePoster2")
    private Collection<Articles> articlesCollection;
    @OneToMany(mappedBy = "monTrnsPOSInstId1")
    private Collection<Moneytranspointsofsale> moneytranspointsofsaleCollection;
    @OneToMany(mappedBy = "forexInfoFxBureauId")
    private Collection<Forexinfo> forexinfoCollection;

    public Forexbureaus() {
    }

    public Forexbureaus(Integer fxBureauId) {
        this.fxBureauId = fxBureauId;
    }

    public Integer getFxBureauId() {
        return fxBureauId;
    }

    public void setFxBureauId(Integer fxBureauId) {
        this.fxBureauId = fxBureauId;
    }

    public String getFxBureauName() {
        return fxBureauName;
    }

    public void setFxBureauName(String fxBureauName) {
        this.fxBureauName = fxBureauName;
    }

    public String getFxBureauLogo() {
        return fxBureauLogo;
    }

    public void setFxBureauLogo(String fxBureauLogo) {
        this.fxBureauLogo = fxBureauLogo;
    }

    public String getFxBureaulogan() {
        return fxBureaulogan;
    }

    public void setFxBureaulogan(String fxBureaulogan) {
        this.fxBureaulogan = fxBureaulogan;
    }

    public String getFxBureauTel() {
        return fxBureauTel;
    }

    public void setFxBureauTel(String fxBureauTel) {
        this.fxBureauTel = fxBureauTel;
    }

    public String getFxBureauPhysicalAddress() {
        return fxBureauPhysicalAddress;
    }

    public void setFxBureauPhysicalAddress(String fxBureauPhysicalAddress) {
        this.fxBureauPhysicalAddress = fxBureauPhysicalAddress;
    }

    public String getFxBureauPostalAddress() {
        return fxBureauPostalAddress;
    }

    public void setFxBureauPostalAddress(String fxBureauPostalAddress) {
        this.fxBureauPostalAddress = fxBureauPostalAddress;
    }

    public String getFxBureauSupportTel() {
        return fxBureauSupportTel;
    }

    public void setFxBureauSupportTel(String fxBureauSupportTel) {
        this.fxBureauSupportTel = fxBureauSupportTel;
    }

    public String getFxBureauSupportEmail() {
        return fxBureauSupportEmail;
    }

    public void setFxBureauSupportEmail(String fxBureauSupportEmail) {
        this.fxBureauSupportEmail = fxBureauSupportEmail;
    }

    public Date getFxBureauTime() {
        return fxBureauTime;
    }

    public void setFxBureauTime(Date fxBureauTime) {
        this.fxBureauTime = fxBureauTime;
    }

    @XmlTransient
    public Collection<Articles> getArticlesCollection() {
        return articlesCollection;
    }

    public void setArticlesCollection(Collection<Articles> articlesCollection) {
        this.articlesCollection = articlesCollection;
    }

    @XmlTransient
    public Collection<Moneytranspointsofsale> getMoneytranspointsofsaleCollection() {
        return moneytranspointsofsaleCollection;
    }

    public void setMoneytranspointsofsaleCollection(Collection<Moneytranspointsofsale> moneytranspointsofsaleCollection) {
        this.moneytranspointsofsaleCollection = moneytranspointsofsaleCollection;
    }

    @XmlTransient
    public Collection<Forexinfo> getForexinfoCollection() {
        return forexinfoCollection;
    }

    public void setForexinfoCollection(Collection<Forexinfo> forexinfoCollection) {
        this.forexinfoCollection = forexinfoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fxBureauId != null ? fxBureauId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Forexbureaus)) {
            return false;
        }
        Forexbureaus other = (Forexbureaus) object;
        if ((this.fxBureauId == null && other.fxBureauId != null) || (this.fxBureauId != null && !this.fxBureauId.equals(other.fxBureauId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Forexbureaus[ fxBureauId=" + fxBureauId + " ]";
    }
    
}

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
    @NamedQuery(name = "Microfinances.findAll", query = "SELECT m FROM Microfinances m"),
    @NamedQuery(name = "Microfinances.findByMicroFinId", query = "SELECT m FROM Microfinances m WHERE m.microFinId = :microFinId"),
    @NamedQuery(name = "Microfinances.findByMicroFinName", query = "SELECT m FROM Microfinances m WHERE m.microFinName = :microFinName"),
    @NamedQuery(name = "Microfinances.findByMicroFinLogo", query = "SELECT m FROM Microfinances m WHERE m.microFinLogo = :microFinLogo"),
    @NamedQuery(name = "Microfinances.findByMicroFinSlogan", query = "SELECT m FROM Microfinances m WHERE m.microFinSlogan = :microFinSlogan"),
    @NamedQuery(name = "Microfinances.findByMicroFinTel", query = "SELECT m FROM Microfinances m WHERE m.microFinTel = :microFinTel"),
    @NamedQuery(name = "Microfinances.findByMicroFinPhysicalAddress", query = "SELECT m FROM Microfinances m WHERE m.microFinPhysicalAddress = :microFinPhysicalAddress"),
    @NamedQuery(name = "Microfinances.findByMicroFinPostalAddress", query = "SELECT m FROM Microfinances m WHERE m.microFinPostalAddress = :microFinPostalAddress"),
    @NamedQuery(name = "Microfinances.findByMicroFinSupportTel", query = "SELECT m FROM Microfinances m WHERE m.microFinSupportTel = :microFinSupportTel"),
    @NamedQuery(name = "Microfinances.findByMicroFinSupportEmail", query = "SELECT m FROM Microfinances m WHERE m.microFinSupportEmail = :microFinSupportEmail"),
    @NamedQuery(name = "Microfinances.findByMicroFinancesTime", query = "SELECT m FROM Microfinances m WHERE m.microFinancesTime = :microFinancesTime")})
public class Microfinances implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer microFinId;
    @Size(max = 45)
    @Column(length = 45)
    private String microFinName;
    @Size(max = 100)
    @Column(length = 100)
    private String microFinLogo;
    @Size(max = 45)
    @Column(length = 45)
    private String microFinSlogan;
    @Size(max = 45)
    @Column(length = 45)
    private String microFinTel;
    @Size(max = 45)
    @Column(length = 45)
    private String microFinPhysicalAddress;
    @Size(max = 45)
    @Column(length = 45)
    private String microFinPostalAddress;
    @Size(max = 45)
    @Column(length = 45)
    private String microFinSupportTel;
    @Size(max = 45)
    @Column(length = 45)
    private String microFinSupportEmail;
    @Temporal(TemporalType.TIMESTAMP)
    private Date microFinancesTime;
    @OneToMany(mappedBy = "mFFnExInfoMicroFinId")
    private Collection<Microfinforeignexinfo> microfinforeignexinfoCollection;
    @OneToMany(mappedBy = "mFMortInfoMicroFinId")
    private Collection<Microfinmortinfo> microfinmortinfoCollection;
    @OneToMany(mappedBy = "articlePoster3")
    private Collection<Articles> articlesCollection;
    @OneToMany(mappedBy = "mFLoanInfoMicroFinId")
    private Collection<Microfinloaninfo> microfinloaninfoCollection;
    @OneToMany(mappedBy = "monTrnsPOSInstId")
    private Collection<Moneytranspointsofsale> moneytranspointsofsaleCollection;
    @OneToMany(mappedBy = "mFATMInfoMicroFinId")
    private Collection<Microfinatminfo> microfinatminfoCollection;
    @OneToMany(mappedBy = "mFAcctsInfoMicroFinId")
    private Collection<Microfinacctsinfo> microfinacctsinfoCollection;

    public Microfinances() {
    }

    public Microfinances(Integer microFinId) {
        this.microFinId = microFinId;
    }

    public Integer getMicroFinId() {
        return microFinId;
    }

    public void setMicroFinId(Integer microFinId) {
        this.microFinId = microFinId;
    }

    public String getMicroFinName() {
        return microFinName;
    }

    public void setMicroFinName(String microFinName) {
        this.microFinName = microFinName;
    }

    public String getMicroFinLogo() {
        return microFinLogo;
    }

    public void setMicroFinLogo(String microFinLogo) {
        this.microFinLogo = microFinLogo;
    }

    public String getMicroFinSlogan() {
        return microFinSlogan;
    }

    public void setMicroFinSlogan(String microFinSlogan) {
        this.microFinSlogan = microFinSlogan;
    }

    public String getMicroFinTel() {
        return microFinTel;
    }

    public void setMicroFinTel(String microFinTel) {
        this.microFinTel = microFinTel;
    }

    public String getMicroFinPhysicalAddress() {
        return microFinPhysicalAddress;
    }

    public void setMicroFinPhysicalAddress(String microFinPhysicalAddress) {
        this.microFinPhysicalAddress = microFinPhysicalAddress;
    }

    public String getMicroFinPostalAddress() {
        return microFinPostalAddress;
    }

    public void setMicroFinPostalAddress(String microFinPostalAddress) {
        this.microFinPostalAddress = microFinPostalAddress;
    }

    public String getMicroFinSupportTel() {
        return microFinSupportTel;
    }

    public void setMicroFinSupportTel(String microFinSupportTel) {
        this.microFinSupportTel = microFinSupportTel;
    }

    public String getMicroFinSupportEmail() {
        return microFinSupportEmail;
    }

    public void setMicroFinSupportEmail(String microFinSupportEmail) {
        this.microFinSupportEmail = microFinSupportEmail;
    }

    public Date getMicroFinancesTime() {
        return microFinancesTime;
    }

    public void setMicroFinancesTime(Date microFinancesTime) {
        this.microFinancesTime = microFinancesTime;
    }

    @XmlTransient
    public Collection<Microfinforeignexinfo> getMicrofinforeignexinfoCollection() {
        return microfinforeignexinfoCollection;
    }

    public void setMicrofinforeignexinfoCollection(Collection<Microfinforeignexinfo> microfinforeignexinfoCollection) {
        this.microfinforeignexinfoCollection = microfinforeignexinfoCollection;
    }

    @XmlTransient
    public Collection<Microfinmortinfo> getMicrofinmortinfoCollection() {
        return microfinmortinfoCollection;
    }

    public void setMicrofinmortinfoCollection(Collection<Microfinmortinfo> microfinmortinfoCollection) {
        this.microfinmortinfoCollection = microfinmortinfoCollection;
    }

    @XmlTransient
    public Collection<Articles> getArticlesCollection() {
        return articlesCollection;
    }

    public void setArticlesCollection(Collection<Articles> articlesCollection) {
        this.articlesCollection = articlesCollection;
    }

    @XmlTransient
    public Collection<Microfinloaninfo> getMicrofinloaninfoCollection() {
        return microfinloaninfoCollection;
    }

    public void setMicrofinloaninfoCollection(Collection<Microfinloaninfo> microfinloaninfoCollection) {
        this.microfinloaninfoCollection = microfinloaninfoCollection;
    }

    @XmlTransient
    public Collection<Moneytranspointsofsale> getMoneytranspointsofsaleCollection() {
        return moneytranspointsofsaleCollection;
    }

    public void setMoneytranspointsofsaleCollection(Collection<Moneytranspointsofsale> moneytranspointsofsaleCollection) {
        this.moneytranspointsofsaleCollection = moneytranspointsofsaleCollection;
    }

    @XmlTransient
    public Collection<Microfinatminfo> getMicrofinatminfoCollection() {
        return microfinatminfoCollection;
    }

    public void setMicrofinatminfoCollection(Collection<Microfinatminfo> microfinatminfoCollection) {
        this.microfinatminfoCollection = microfinatminfoCollection;
    }

    @XmlTransient
    public Collection<Microfinacctsinfo> getMicrofinacctsinfoCollection() {
        return microfinacctsinfoCollection;
    }

    public void setMicrofinacctsinfoCollection(Collection<Microfinacctsinfo> microfinacctsinfoCollection) {
        this.microfinacctsinfoCollection = microfinacctsinfoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (microFinId != null ? microFinId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Microfinances)) {
            return false;
        }
        Microfinances other = (Microfinances) object;
        if ((this.microFinId == null && other.microFinId != null) || (this.microFinId != null && !this.microFinId.equals(other.microFinId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Microfinances[ microFinId=" + microFinId + " ]";
    }
    
}

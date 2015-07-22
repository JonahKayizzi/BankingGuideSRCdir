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
    @NamedQuery(name = "Moneytansferagents.findAll", query = "SELECT m FROM Moneytansferagents m"),
    @NamedQuery(name = "Moneytansferagents.findByMonTrnsAgId", query = "SELECT m FROM Moneytansferagents m WHERE m.monTrnsAgId = :monTrnsAgId"),
    @NamedQuery(name = "Moneytansferagents.findByMonTrnsName", query = "SELECT m FROM Moneytansferagents m WHERE m.monTrnsName = :monTrnsName"),
    @NamedQuery(name = "Moneytansferagents.findByMonTrnsLogo", query = "SELECT m FROM Moneytansferagents m WHERE m.monTrnsLogo = :monTrnsLogo"),
    @NamedQuery(name = "Moneytansferagents.findByMonTrnsslogan", query = "SELECT m FROM Moneytansferagents m WHERE m.monTrnsslogan = :monTrnsslogan"),
    @NamedQuery(name = "Moneytansferagents.findByMonTrnsTel", query = "SELECT m FROM Moneytansferagents m WHERE m.monTrnsTel = :monTrnsTel"),
    @NamedQuery(name = "Moneytansferagents.findByMonTrnsPhysicalAddress", query = "SELECT m FROM Moneytansferagents m WHERE m.monTrnsPhysicalAddress = :monTrnsPhysicalAddress"),
    @NamedQuery(name = "Moneytansferagents.findByMonTrnsPostalAddress", query = "SELECT m FROM Moneytansferagents m WHERE m.monTrnsPostalAddress = :monTrnsPostalAddress"),
    @NamedQuery(name = "Moneytansferagents.findByMonTrnsSupportTel", query = "SELECT m FROM Moneytansferagents m WHERE m.monTrnsSupportTel = :monTrnsSupportTel"),
    @NamedQuery(name = "Moneytansferagents.findByMonTrnsSupportEmail", query = "SELECT m FROM Moneytansferagents m WHERE m.monTrnsSupportEmail = :monTrnsSupportEmail"),
    @NamedQuery(name = "Moneytansferagents.findByMonTrnsTime", query = "SELECT m FROM Moneytansferagents m WHERE m.monTrnsTime = :monTrnsTime")})
public class Moneytansferagents implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer monTrnsAgId;
    @Size(max = 45)
    @Column(length = 45)
    private String monTrnsName;
    @Size(max = 100)
    @Column(length = 100)
    private String monTrnsLogo;
    @Size(max = 45)
    @Column(length = 45)
    private String monTrnsslogan;
    @Size(max = 45)
    @Column(length = 45)
    private String monTrnsTel;
    @Size(max = 45)
    @Column(length = 45)
    private String monTrnsPhysicalAddress;
    @Size(max = 45)
    @Column(length = 45)
    private String monTrnsPostalAddress;
    @Size(max = 45)
    @Column(length = 45)
    private String monTrnsSupportTel;
    @Size(max = 45)
    @Column(length = 45)
    private String monTrnsSupportEmail;
    @Temporal(TemporalType.TIMESTAMP)
    private Date monTrnsTime;
    @OneToMany(mappedBy = "monTransInfocolAgentId")
    private Collection<Moneytransinfo> moneytransinfoCollection;
    @OneToMany(mappedBy = "articlePoster")
    private Collection<Articles> articlesCollection;
    @OneToMany(mappedBy = "monTrnsPOSAgId")
    private Collection<Moneytranspointsofsale> moneytranspointsofsaleCollection;

    public Moneytansferagents() {
    }

    public Moneytansferagents(Integer monTrnsAgId) {
        this.monTrnsAgId = monTrnsAgId;
    }

    public Integer getMonTrnsAgId() {
        return monTrnsAgId;
    }

    public void setMonTrnsAgId(Integer monTrnsAgId) {
        this.monTrnsAgId = monTrnsAgId;
    }

    public String getMonTrnsName() {
        return monTrnsName;
    }

    public void setMonTrnsName(String monTrnsName) {
        this.monTrnsName = monTrnsName;
    }

    public String getMonTrnsLogo() {
        return monTrnsLogo;
    }

    public void setMonTrnsLogo(String monTrnsLogo) {
        this.monTrnsLogo = monTrnsLogo;
    }

    public String getMonTrnsslogan() {
        return monTrnsslogan;
    }

    public void setMonTrnsslogan(String monTrnsslogan) {
        this.monTrnsslogan = monTrnsslogan;
    }

    public String getMonTrnsTel() {
        return monTrnsTel;
    }

    public void setMonTrnsTel(String monTrnsTel) {
        this.monTrnsTel = monTrnsTel;
    }

    public String getMonTrnsPhysicalAddress() {
        return monTrnsPhysicalAddress;
    }

    public void setMonTrnsPhysicalAddress(String monTrnsPhysicalAddress) {
        this.monTrnsPhysicalAddress = monTrnsPhysicalAddress;
    }

    public String getMonTrnsPostalAddress() {
        return monTrnsPostalAddress;
    }

    public void setMonTrnsPostalAddress(String monTrnsPostalAddress) {
        this.monTrnsPostalAddress = monTrnsPostalAddress;
    }

    public String getMonTrnsSupportTel() {
        return monTrnsSupportTel;
    }

    public void setMonTrnsSupportTel(String monTrnsSupportTel) {
        this.monTrnsSupportTel = monTrnsSupportTel;
    }

    public String getMonTrnsSupportEmail() {
        return monTrnsSupportEmail;
    }

    public void setMonTrnsSupportEmail(String monTrnsSupportEmail) {
        this.monTrnsSupportEmail = monTrnsSupportEmail;
    }

    public Date getMonTrnsTime() {
        return monTrnsTime;
    }

    public void setMonTrnsTime(Date monTrnsTime) {
        this.monTrnsTime = monTrnsTime;
    }

    @XmlTransient
    public Collection<Moneytransinfo> getMoneytransinfoCollection() {
        return moneytransinfoCollection;
    }

    public void setMoneytransinfoCollection(Collection<Moneytransinfo> moneytransinfoCollection) {
        this.moneytransinfoCollection = moneytransinfoCollection;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (monTrnsAgId != null ? monTrnsAgId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Moneytansferagents)) {
            return false;
        }
        Moneytansferagents other = (Moneytansferagents) object;
        if ((this.monTrnsAgId == null && other.monTrnsAgId != null) || (this.monTrnsAgId != null && !this.monTrnsAgId.equals(other.monTrnsAgId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Moneytansferagents[ monTrnsAgId=" + monTrnsAgId + " ]";
    }
    
}

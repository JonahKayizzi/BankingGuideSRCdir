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
    @NamedQuery(name = "Insurancecos.findAll", query = "SELECT i FROM Insurancecos i"),
    @NamedQuery(name = "Insurancecos.findByInsCoId", query = "SELECT i FROM Insurancecos i WHERE i.insCoId = :insCoId"),
    @NamedQuery(name = "Insurancecos.findByInsCoName", query = "SELECT i FROM Insurancecos i WHERE i.insCoName = :insCoName"),
    @NamedQuery(name = "Insurancecos.findByInsCoLogo", query = "SELECT i FROM Insurancecos i WHERE i.insCoLogo = :insCoLogo"),
    @NamedQuery(name = "Insurancecos.findByInsCoslogan", query = "SELECT i FROM Insurancecos i WHERE i.insCoslogan = :insCoslogan"),
    @NamedQuery(name = "Insurancecos.findByInsCoTel", query = "SELECT i FROM Insurancecos i WHERE i.insCoTel = :insCoTel"),
    @NamedQuery(name = "Insurancecos.findByInsCoPhysicalAddress", query = "SELECT i FROM Insurancecos i WHERE i.insCoPhysicalAddress = :insCoPhysicalAddress"),
    @NamedQuery(name = "Insurancecos.findByInsCoPostalAddress", query = "SELECT i FROM Insurancecos i WHERE i.insCoPostalAddress = :insCoPostalAddress"),
    @NamedQuery(name = "Insurancecos.findByInsCoSupportTel", query = "SELECT i FROM Insurancecos i WHERE i.insCoSupportTel = :insCoSupportTel"),
    @NamedQuery(name = "Insurancecos.findByInsCoSupportEmail", query = "SELECT i FROM Insurancecos i WHERE i.insCoSupportEmail = :insCoSupportEmail"),
    @NamedQuery(name = "Insurancecos.findByInsCoTime", query = "SELECT i FROM Insurancecos i WHERE i.insCoTime = :insCoTime")})
public class Insurancecos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer insCoId;
    @Size(max = 45)
    @Column(length = 45)
    private String insCoName;
    @Size(max = 100)
    @Column(length = 100)
    private String insCoLogo;
    @Size(max = 45)
    @Column(length = 45)
    private String insCoslogan;
    @Size(max = 45)
    @Column(length = 45)
    private String insCoTel;
    @Size(max = 45)
    @Column(length = 45)
    private String insCoPhysicalAddress;
    @Size(max = 45)
    @Column(length = 45)
    private String insCoPostalAddress;
    @Size(max = 45)
    @Column(length = 45)
    private String insCoSupportTel;
    @Size(max = 45)
    @Column(length = 45)
    private String insCoSupportEmail;
    @Temporal(TemporalType.TIMESTAMP)
    private Date insCoTime;
    @OneToMany(mappedBy = "articlePoster1")
    private Collection<Articles> articlesCollection;
    @OneToMany(mappedBy = "insInfoInsCoId")
    private Collection<Insuranceinfo> insuranceinfoCollection;

    public Insurancecos() {
    }

    public Insurancecos(Integer insCoId) {
        this.insCoId = insCoId;
    }

    public Integer getInsCoId() {
        return insCoId;
    }

    public void setInsCoId(Integer insCoId) {
        this.insCoId = insCoId;
    }

    public String getInsCoName() {
        return insCoName;
    }

    public void setInsCoName(String insCoName) {
        this.insCoName = insCoName;
    }

    public String getInsCoLogo() {
        return insCoLogo;
    }

    public void setInsCoLogo(String insCoLogo) {
        this.insCoLogo = insCoLogo;
    }

    public String getInsCoslogan() {
        return insCoslogan;
    }

    public void setInsCoslogan(String insCoslogan) {
        this.insCoslogan = insCoslogan;
    }

    public String getInsCoTel() {
        return insCoTel;
    }

    public void setInsCoTel(String insCoTel) {
        this.insCoTel = insCoTel;
    }

    public String getInsCoPhysicalAddress() {
        return insCoPhysicalAddress;
    }

    public void setInsCoPhysicalAddress(String insCoPhysicalAddress) {
        this.insCoPhysicalAddress = insCoPhysicalAddress;
    }

    public String getInsCoPostalAddress() {
        return insCoPostalAddress;
    }

    public void setInsCoPostalAddress(String insCoPostalAddress) {
        this.insCoPostalAddress = insCoPostalAddress;
    }

    public String getInsCoSupportTel() {
        return insCoSupportTel;
    }

    public void setInsCoSupportTel(String insCoSupportTel) {
        this.insCoSupportTel = insCoSupportTel;
    }

    public String getInsCoSupportEmail() {
        return insCoSupportEmail;
    }

    public void setInsCoSupportEmail(String insCoSupportEmail) {
        this.insCoSupportEmail = insCoSupportEmail;
    }

    public Date getInsCoTime() {
        return insCoTime;
    }

    public void setInsCoTime(Date insCoTime) {
        this.insCoTime = insCoTime;
    }

    @XmlTransient
    public Collection<Articles> getArticlesCollection() {
        return articlesCollection;
    }

    public void setArticlesCollection(Collection<Articles> articlesCollection) {
        this.articlesCollection = articlesCollection;
    }

    @XmlTransient
    public Collection<Insuranceinfo> getInsuranceinfoCollection() {
        return insuranceinfoCollection;
    }

    public void setInsuranceinfoCollection(Collection<Insuranceinfo> insuranceinfoCollection) {
        this.insuranceinfoCollection = insuranceinfoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (insCoId != null ? insCoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Insurancecos)) {
            return false;
        }
        Insurancecos other = (Insurancecos) object;
        if ((this.insCoId == null && other.insCoId != null) || (this.insCoId != null && !this.insCoId.equals(other.insCoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Insurancecos[ insCoId=" + insCoId + " ]";
    }
    
}

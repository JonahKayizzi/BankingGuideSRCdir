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
    @NamedQuery(name = "Forexinfo.findAll", query = "SELECT f FROM Forexinfo f"),
    @NamedQuery(name = "Forexinfo.findByForexInfoId", query = "SELECT f FROM Forexinfo f WHERE f.forexInfoId = :forexInfoId"),
    @NamedQuery(name = "Forexinfo.findByForexInfoCurrency", query = "SELECT f FROM Forexinfo f WHERE f.forexInfoCurrency = :forexInfoCurrency"),
    @NamedQuery(name = "Forexinfo.findByForexInfoBuyingPr", query = "SELECT f FROM Forexinfo f WHERE f.forexInfoBuyingPr = :forexInfoBuyingPr"),
    @NamedQuery(name = "Forexinfo.findByForexInfoSellingPr", query = "SELECT f FROM Forexinfo f WHERE f.forexInfoSellingPr = :forexInfoSellingPr"),
    @NamedQuery(name = "Forexinfo.findByForexInfoTime", query = "SELECT f FROM Forexinfo f WHERE f.forexInfoTime = :forexInfoTime")})
public class Forexinfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer forexInfoId;
    @Size(max = 45)
    @Column(name = "ForexInfo_Currency", length = 45)
    private String forexInfoCurrency;
    @Size(max = 45)
    @Column(name = "ForexInfo_BuyingPr", length = 45)
    private String forexInfoBuyingPr;
    @Size(max = 45)
    @Column(name = "ForexInfo_SellingPr", length = 45)
    private String forexInfoSellingPr;
    @Column(name = "ForexInfo_Time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date forexInfoTime;
    @JoinColumn(name = "ForexInfo_FxBureauId", referencedColumnName = "FxBureauId")
    @ManyToOne
    private Forexbureaus forexInfoFxBureauId;

    public Forexinfo() {
    }

    public Forexinfo(Integer forexInfoId) {
        this.forexInfoId = forexInfoId;
    }

    public Integer getForexInfoId() {
        return forexInfoId;
    }

    public void setForexInfoId(Integer forexInfoId) {
        this.forexInfoId = forexInfoId;
    }

    public String getForexInfoCurrency() {
        return forexInfoCurrency;
    }

    public void setForexInfoCurrency(String forexInfoCurrency) {
        this.forexInfoCurrency = forexInfoCurrency;
    }

    public String getForexInfoBuyingPr() {
        return forexInfoBuyingPr;
    }

    public void setForexInfoBuyingPr(String forexInfoBuyingPr) {
        this.forexInfoBuyingPr = forexInfoBuyingPr;
    }

    public String getForexInfoSellingPr() {
        return forexInfoSellingPr;
    }

    public void setForexInfoSellingPr(String forexInfoSellingPr) {
        this.forexInfoSellingPr = forexInfoSellingPr;
    }

    public Date getForexInfoTime() {
        return forexInfoTime;
    }

    public void setForexInfoTime(Date forexInfoTime) {
        this.forexInfoTime = forexInfoTime;
    }

    public Forexbureaus getForexInfoFxBureauId() {
        return forexInfoFxBureauId;
    }

    public void setForexInfoFxBureauId(Forexbureaus forexInfoFxBureauId) {
        this.forexInfoFxBureauId = forexInfoFxBureauId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (forexInfoId != null ? forexInfoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Forexinfo)) {
            return false;
        }
        Forexinfo other = (Forexinfo) object;
        if ((this.forexInfoId == null && other.forexInfoId != null) || (this.forexInfoId != null && !this.forexInfoId.equals(other.forexInfoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Forexinfo[ forexInfoId=" + forexInfoId + " ]";
    }
    
}

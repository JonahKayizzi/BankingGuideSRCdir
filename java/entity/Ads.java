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
    @NamedQuery(name = "Ads.findAll", query = "SELECT a FROM Ads a"),
    @NamedQuery(name = "Ads.findByAdId", query = "SELECT a FROM Ads a WHERE a.adId = :adId"),
    @NamedQuery(name = "Ads.findByAdURL", query = "SELECT a FROM Ads a WHERE a.adURL = :adURL"),
    @NamedQuery(name = "Ads.findByAdName", query = "SELECT a FROM Ads a WHERE a.adName = :adName"),
    @NamedQuery(name = "Ads.findByAdCoName", query = "SELECT a FROM Ads a WHERE a.adCoName = :adCoName"),
    @NamedQuery(name = "Ads.findByAdPic", query = "SELECT a FROM Ads a WHERE a.adPic = :adPic"),
    @NamedQuery(name = "Ads.findByAdPanelId", query = "SELECT a FROM Ads a WHERE a.adPanelId = :adPanelId"),
    @NamedQuery(name = "Ads.findByAdsTime", query = "SELECT a FROM Ads a WHERE a.adsTime = :adsTime")})
public class Ads implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer adId;
    @Size(max = 45)
    @Column(length = 45)
    private String adURL;
    @Size(max = 45)
    @Column(length = 45)
    private String adName;
    @Size(max = 45)
    @Column(length = 45)
    private String adCoName;
    @Size(max = 45)
    @Column(length = 45)
    private String adPic;
    @Size(max = 45)
    @Column(length = 45)
    private String adPanelId;
    @Column(name = "Ads_Time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date adsTime;
    @JoinColumn(name = "Ad_UserId", referencedColumnName = "UserId")
    @ManyToOne
    private Systemusers adUserId;

    public Ads() {
    }

    public Ads(Integer adId) {
        this.adId = adId;
    }

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public String getAdURL() {
        return adURL;
    }

    public void setAdURL(String adURL) {
        this.adURL = adURL;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName;
    }

    public String getAdCoName() {
        return adCoName;
    }

    public void setAdCoName(String adCoName) {
        this.adCoName = adCoName;
    }

    public String getAdPic() {
        return adPic;
    }

    public void setAdPic(String adPic) {
        this.adPic = adPic;
    }

    public String getAdPanelId() {
        return adPanelId;
    }

    public void setAdPanelId(String adPanelId) {
        this.adPanelId = adPanelId;
    }

    public Date getAdsTime() {
        return adsTime;
    }

    public void setAdsTime(Date adsTime) {
        this.adsTime = adsTime;
    }

    public Systemusers getAdUserId() {
        return adUserId;
    }

    public void setAdUserId(Systemusers adUserId) {
        this.adUserId = adUserId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adId != null ? adId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ads)) {
            return false;
        }
        Ads other = (Ads) object;
        if ((this.adId == null && other.adId != null) || (this.adId != null && !this.adId.equals(other.adId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Ads[ adId=" + adId + " ]";
    }
    
}

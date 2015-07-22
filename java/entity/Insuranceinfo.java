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
    @NamedQuery(name = "Insuranceinfo.findAll", query = "SELECT i FROM Insuranceinfo i"),
    @NamedQuery(name = "Insuranceinfo.findByInsInfoId", query = "SELECT i FROM Insuranceinfo i WHERE i.insInfoId = :insInfoId"),
    @NamedQuery(name = "Insuranceinfo.findByInsInfoInsType", query = "SELECT i FROM Insuranceinfo i WHERE i.insInfoInsType = :insInfoInsType"),
    @NamedQuery(name = "Insuranceinfo.findByInsInfoAppProc", query = "SELECT i FROM Insuranceinfo i WHERE i.insInfoAppProc = :insInfoAppProc"),
    @NamedQuery(name = "Insuranceinfo.findByInsInfoOnlineLink", query = "SELECT i FROM Insuranceinfo i WHERE i.insInfoOnlineLink = :insInfoOnlineLink"),
    @NamedQuery(name = "Insuranceinfo.findByInsInfoReq", query = "SELECT i FROM Insuranceinfo i WHERE i.insInfoReq = :insInfoReq"),
    @NamedQuery(name = "Insuranceinfo.findByInsInfoEligibility", query = "SELECT i FROM Insuranceinfo i WHERE i.insInfoEligibility = :insInfoEligibility"),
    @NamedQuery(name = "Insuranceinfo.findByInsInfoInsCov", query = "SELECT i FROM Insuranceinfo i WHERE i.insInfoInsCov = :insInfoInsCov"),
    @NamedQuery(name = "Insuranceinfo.findByInsInfoTime", query = "SELECT i FROM Insuranceinfo i WHERE i.insInfoTime = :insInfoTime")})
public class Insuranceinfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer insInfoId;
    @Size(max = 45)
    @Column(name = "InsInfo_InsType", length = 45)
    private String insInfoInsType;
    @Size(max = 500)
    @Column(name = "InsInfo_AppProc", length = 500)
    private String insInfoAppProc;
    @Size(max = 45)
    @Column(name = "InsInfo_OnlineLink", length = 45)
    private String insInfoOnlineLink;
    @Size(max = 500)
    @Column(name = "InsInfo_Req", length = 500)
    private String insInfoReq;
    @Size(max = 45)
    @Column(name = "InsInfo_Eligibility", length = 45)
    private String insInfoEligibility;
    @Size(max = 500)
    @Column(name = "InsInfo_InsCov", length = 500)
    private String insInfoInsCov;
    @Column(name = "InsInfo_Time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date insInfoTime;
    @JoinColumn(name = "InsInfo_InsCoId", referencedColumnName = "InsCoId")
    @ManyToOne
    private Insurancecos insInfoInsCoId;

    public Insuranceinfo() {
    }

    public Insuranceinfo(Integer insInfoId) {
        this.insInfoId = insInfoId;
    }

    public Integer getInsInfoId() {
        return insInfoId;
    }

    public void setInsInfoId(Integer insInfoId) {
        this.insInfoId = insInfoId;
    }

    public String getInsInfoInsType() {
        return insInfoInsType;
    }

    public void setInsInfoInsType(String insInfoInsType) {
        this.insInfoInsType = insInfoInsType;
    }

    public String getInsInfoAppProc() {
        return insInfoAppProc;
    }

    public void setInsInfoAppProc(String insInfoAppProc) {
        this.insInfoAppProc = insInfoAppProc;
    }

    public String getInsInfoOnlineLink() {
        return insInfoOnlineLink;
    }

    public void setInsInfoOnlineLink(String insInfoOnlineLink) {
        this.insInfoOnlineLink = insInfoOnlineLink;
    }

    public String getInsInfoReq() {
        return insInfoReq;
    }

    public void setInsInfoReq(String insInfoReq) {
        this.insInfoReq = insInfoReq;
    }

    public String getInsInfoEligibility() {
        return insInfoEligibility;
    }

    public void setInsInfoEligibility(String insInfoEligibility) {
        this.insInfoEligibility = insInfoEligibility;
    }

    public String getInsInfoInsCov() {
        return insInfoInsCov;
    }

    public void setInsInfoInsCov(String insInfoInsCov) {
        this.insInfoInsCov = insInfoInsCov;
    }

    public Date getInsInfoTime() {
        return insInfoTime;
    }

    public void setInsInfoTime(Date insInfoTime) {
        this.insInfoTime = insInfoTime;
    }

    public Insurancecos getInsInfoInsCoId() {
        return insInfoInsCoId;
    }

    public void setInsInfoInsCoId(Insurancecos insInfoInsCoId) {
        this.insInfoInsCoId = insInfoInsCoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (insInfoId != null ? insInfoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Insuranceinfo)) {
            return false;
        }
        Insuranceinfo other = (Insuranceinfo) object;
        if ((this.insInfoId == null && other.insInfoId != null) || (this.insInfoId != null && !this.insInfoId.equals(other.insInfoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Insuranceinfo[ insInfoId=" + insInfoId + " ]";
    }
    
}

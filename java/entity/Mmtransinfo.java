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
    @NamedQuery(name = "Mmtransinfo.findAll", query = "SELECT m FROM Mmtransinfo m"),
    @NamedQuery(name = "Mmtransinfo.findByMMTransInfoId", query = "SELECT m FROM Mmtransinfo m WHERE m.mMTransInfoId = :mMTransInfoId"),
    @NamedQuery(name = "Mmtransinfo.findByMMTransInfocolTransType", query = "SELECT m FROM Mmtransinfo m WHERE m.mMTransInfocolTransType = :mMTransInfocolTransType"),
    @NamedQuery(name = "Mmtransinfo.findByMMTransInfoAmntRange", query = "SELECT m FROM Mmtransinfo m WHERE m.mMTransInfoAmntRange = :mMTransInfoAmntRange"),
    @NamedQuery(name = "Mmtransinfo.findByMMTransInfoTransCost", query = "SELECT m FROM Mmtransinfo m WHERE m.mMTransInfoTransCost = :mMTransInfoTransCost"),
    @NamedQuery(name = "Mmtransinfo.findByMMTransInfoTime", query = "SELECT m FROM Mmtransinfo m WHERE m.mMTransInfoTime = :mMTransInfoTime")})
public class Mmtransinfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer mMTransInfoId;
    @Size(max = 45)
    @Column(name = "MMTransInfocol_TransType", length = 45)
    private String mMTransInfocolTransType;
    @Size(max = 45)
    @Column(name = "MMTransInfo_AmntRange", length = 45)
    private String mMTransInfoAmntRange;
    @Size(max = 45)
    @Column(name = "MMTransInfo_TransCost", length = 45)
    private String mMTransInfoTransCost;
    @Column(name = "MMTransInfo_Time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mMTransInfoTime;
    @JoinColumn(name = "MMTransInfo_UserId", referencedColumnName = "UserId")
    @ManyToOne
    private Systemusers mMTransInfoUserId;
    @JoinColumn(name = "MMTransInfo_MMAgentId", referencedColumnName = "MobMonAgentId")
    @ManyToOne
    private Mobilemoneyagents mMTransInfoMMAgentId;

    public Mmtransinfo() {
    }

    public Mmtransinfo(Integer mMTransInfoId) {
        this.mMTransInfoId = mMTransInfoId;
    }

    public Integer getMMTransInfoId() {
        return mMTransInfoId;
    }

    public void setMMTransInfoId(Integer mMTransInfoId) {
        this.mMTransInfoId = mMTransInfoId;
    }

    public String getMMTransInfocolTransType() {
        return mMTransInfocolTransType;
    }

    public void setMMTransInfocolTransType(String mMTransInfocolTransType) {
        this.mMTransInfocolTransType = mMTransInfocolTransType;
    }

    public String getMMTransInfoAmntRange() {
        return mMTransInfoAmntRange;
    }

    public void setMMTransInfoAmntRange(String mMTransInfoAmntRange) {
        this.mMTransInfoAmntRange = mMTransInfoAmntRange;
    }

    public String getMMTransInfoTransCost() {
        return mMTransInfoTransCost;
    }

    public void setMMTransInfoTransCost(String mMTransInfoTransCost) {
        this.mMTransInfoTransCost = mMTransInfoTransCost;
    }

    public Date getMMTransInfoTime() {
        return mMTransInfoTime;
    }

    public void setMMTransInfoTime(Date mMTransInfoTime) {
        this.mMTransInfoTime = mMTransInfoTime;
    }

    public Systemusers getMMTransInfoUserId() {
        return mMTransInfoUserId;
    }

    public void setMMTransInfoUserId(Systemusers mMTransInfoUserId) {
        this.mMTransInfoUserId = mMTransInfoUserId;
    }

    public Mobilemoneyagents getMMTransInfoMMAgentId() {
        return mMTransInfoMMAgentId;
    }

    public void setMMTransInfoMMAgentId(Mobilemoneyagents mMTransInfoMMAgentId) {
        this.mMTransInfoMMAgentId = mMTransInfoMMAgentId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mMTransInfoId != null ? mMTransInfoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mmtransinfo)) {
            return false;
        }
        Mmtransinfo other = (Mmtransinfo) object;
        if ((this.mMTransInfoId == null && other.mMTransInfoId != null) || (this.mMTransInfoId != null && !this.mMTransInfoId.equals(other.mMTransInfoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Mmtransinfo[ mMTransInfoId=" + mMTransInfoId + " ]";
    }
    
}

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
    @NamedQuery(name = "Mobilemoneyagents.findAll", query = "SELECT m FROM Mobilemoneyagents m"),
    @NamedQuery(name = "Mobilemoneyagents.findByMobMonAgentId", query = "SELECT m FROM Mobilemoneyagents m WHERE m.mobMonAgentId = :mobMonAgentId"),
    @NamedQuery(name = "Mobilemoneyagents.findByMobMonAgentAgntName", query = "SELECT m FROM Mobilemoneyagents m WHERE m.mobMonAgentAgntName = :mobMonAgentAgntName"),
    @NamedQuery(name = "Mobilemoneyagents.findByMobMonAgentAgntLogo", query = "SELECT m FROM Mobilemoneyagents m WHERE m.mobMonAgentAgntLogo = :mobMonAgentAgntLogo"),
    @NamedQuery(name = "Mobilemoneyagents.findByMobMonAgentTime", query = "SELECT m FROM Mobilemoneyagents m WHERE m.mobMonAgentTime = :mobMonAgentTime")})
public class Mobilemoneyagents implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer mobMonAgentId;
    @Size(max = 45)
    @Column(name = "MobMonAgent_AgntName", length = 45)
    private String mobMonAgentAgntName;
    @Size(max = 45)
    @Column(name = "MobMonAgent_AgntLogo", length = 45)
    private String mobMonAgentAgntLogo;
    @Column(name = "MobMonAgent_Time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mobMonAgentTime;
    @OneToMany(mappedBy = "mMTransInfoMMAgentId")
    private Collection<Mmtransinfo> mmtransinfoCollection;

    public Mobilemoneyagents() {
    }

    public Mobilemoneyagents(Integer mobMonAgentId) {
        this.mobMonAgentId = mobMonAgentId;
    }

    public Integer getMobMonAgentId() {
        return mobMonAgentId;
    }

    public void setMobMonAgentId(Integer mobMonAgentId) {
        this.mobMonAgentId = mobMonAgentId;
    }

    public String getMobMonAgentAgntName() {
        return mobMonAgentAgntName;
    }

    public void setMobMonAgentAgntName(String mobMonAgentAgntName) {
        this.mobMonAgentAgntName = mobMonAgentAgntName;
    }

    public String getMobMonAgentAgntLogo() {
        return mobMonAgentAgntLogo;
    }

    public void setMobMonAgentAgntLogo(String mobMonAgentAgntLogo) {
        this.mobMonAgentAgntLogo = mobMonAgentAgntLogo;
    }

    public Date getMobMonAgentTime() {
        return mobMonAgentTime;
    }

    public void setMobMonAgentTime(Date mobMonAgentTime) {
        this.mobMonAgentTime = mobMonAgentTime;
    }

    @XmlTransient
    public Collection<Mmtransinfo> getMmtransinfoCollection() {
        return mmtransinfoCollection;
    }

    public void setMmtransinfoCollection(Collection<Mmtransinfo> mmtransinfoCollection) {
        this.mmtransinfoCollection = mmtransinfoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mobMonAgentId != null ? mobMonAgentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mobilemoneyagents)) {
            return false;
        }
        Mobilemoneyagents other = (Mobilemoneyagents) object;
        if ((this.mobMonAgentId == null && other.mobMonAgentId != null) || (this.mobMonAgentId != null && !this.mobMonAgentId.equals(other.mobMonAgentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Mobilemoneyagents[ mobMonAgentId=" + mobMonAgentId + " ]";
    }
    
}

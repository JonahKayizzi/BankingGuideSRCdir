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
import javax.persistence.Lob;
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
    @NamedQuery(name = "Moneytransinfo.findAll", query = "SELECT m FROM Moneytransinfo m"),
    @NamedQuery(name = "Moneytransinfo.findByMonTransInfoId", query = "SELECT m FROM Moneytransinfo m WHERE m.monTransInfoId = :monTransInfoId"),
    @NamedQuery(name = "Moneytransinfo.findByMonTransInfoDest", query = "SELECT m FROM Moneytransinfo m WHERE m.monTransInfoDest = :monTransInfoDest"),
    @NamedQuery(name = "Moneytransinfo.findByMonTransInfoReq", query = "SELECT m FROM Moneytransinfo m WHERE m.monTransInfoReq = :monTransInfoReq"),
    @NamedQuery(name = "Moneytransinfo.findByMonTransInfoTransCharge", query = "SELECT m FROM Moneytransinfo m WHERE m.monTransInfoTransCharge = :monTransInfoTransCharge"),
    @NamedQuery(name = "Moneytransinfo.findByMonTransInfoTime", query = "SELECT m FROM Moneytransinfo m WHERE m.monTransInfoTime = :monTransInfoTime")})
public class Moneytransinfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer monTransInfoId;
    @Size(max = 45)
    @Column(name = "MonTransInfo_Dest", length = 45)
    private String monTransInfoDest;
    @Lob
    @Column(name = "MonTransInfo_TransType")
    private byte[] monTransInfoTransType;
    @Size(max = 100)
    @Column(name = "MonTransInfo_Req", length = 100)
    private String monTransInfoReq;
    @Size(max = 45)
    @Column(name = "MonTransInfo_TransCharge", length = 45)
    private String monTransInfoTransCharge;
    @Column(name = "MonTransInfo_Time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date monTransInfoTime;
    @JoinColumn(name = "MonTransInfocol_AgentId", referencedColumnName = "MonTrnsAgId")
    @ManyToOne
    private Moneytansferagents monTransInfocolAgentId;

    public Moneytransinfo() {
    }

    public Moneytransinfo(Integer monTransInfoId) {
        this.monTransInfoId = monTransInfoId;
    }

    public Integer getMonTransInfoId() {
        return monTransInfoId;
    }

    public void setMonTransInfoId(Integer monTransInfoId) {
        this.monTransInfoId = monTransInfoId;
    }

    public String getMonTransInfoDest() {
        return monTransInfoDest;
    }

    public void setMonTransInfoDest(String monTransInfoDest) {
        this.monTransInfoDest = monTransInfoDest;
    }

    public byte[] getMonTransInfoTransType() {
        return monTransInfoTransType;
    }

    public void setMonTransInfoTransType(byte[] monTransInfoTransType) {
        this.monTransInfoTransType = monTransInfoTransType;
    }

    public String getMonTransInfoReq() {
        return monTransInfoReq;
    }

    public void setMonTransInfoReq(String monTransInfoReq) {
        this.monTransInfoReq = monTransInfoReq;
    }

    public String getMonTransInfoTransCharge() {
        return monTransInfoTransCharge;
    }

    public void setMonTransInfoTransCharge(String monTransInfoTransCharge) {
        this.monTransInfoTransCharge = monTransInfoTransCharge;
    }

    public Date getMonTransInfoTime() {
        return monTransInfoTime;
    }

    public void setMonTransInfoTime(Date monTransInfoTime) {
        this.monTransInfoTime = monTransInfoTime;
    }

    public Moneytansferagents getMonTransInfocolAgentId() {
        return monTransInfocolAgentId;
    }

    public void setMonTransInfocolAgentId(Moneytansferagents monTransInfocolAgentId) {
        this.monTransInfocolAgentId = monTransInfocolAgentId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (monTransInfoId != null ? monTransInfoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Moneytransinfo)) {
            return false;
        }
        Moneytransinfo other = (Moneytransinfo) object;
        if ((this.monTransInfoId == null && other.monTransInfoId != null) || (this.monTransInfoId != null && !this.monTransInfoId.equals(other.monTransInfoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Moneytransinfo[ monTransInfoId=" + monTransInfoId + " ]";
    }
    
}

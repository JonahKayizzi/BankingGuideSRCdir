/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
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
    @NamedQuery(name = "Moneytranspointsofsale.findAll", query = "SELECT m FROM Moneytranspointsofsale m"),
    @NamedQuery(name = "Moneytranspointsofsale.findByMonTrnsPOSId", query = "SELECT m FROM Moneytranspointsofsale m WHERE m.monTrnsPOSId = :monTrnsPOSId"),
    @NamedQuery(name = "Moneytranspointsofsale.findByMonTrnsPOSName", query = "SELECT m FROM Moneytranspointsofsale m WHERE m.monTrnsPOSName = :monTrnsPOSName"),
    @NamedQuery(name = "Moneytranspointsofsale.findByMonTrnsPOSPhysAdd", query = "SELECT m FROM Moneytranspointsofsale m WHERE m.monTrnsPOSPhysAdd = :monTrnsPOSPhysAdd")})
public class Moneytranspointsofsale implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer monTrnsPOSId;
    @Size(max = 45)
    @Column(name = "MonTrnsPOS_Name", length = 45)
    private String monTrnsPOSName;
    @Size(max = 45)
    @Column(name = "MonTrnsPOS_PhysAdd", length = 45)
    private String monTrnsPOSPhysAdd;
    @JoinColumn(name = "MonTrnsPOS_InstId", referencedColumnName = "MicroFinId")
    @ManyToOne
    private Microfinances monTrnsPOSInstId;
    @PrimaryKeyJoinColumn(name = "MonTrnsPOS_InstId", referencedColumnName = "FxBureauId")
    @ManyToOne
    private Forexbureaus monTrnsPOSInstId1;
    @PrimaryKeyJoinColumn(name = "MonTrnsPOS_InstId", referencedColumnName = "BankId")
    @ManyToOne
    private Banks monTrnsPOSInstId2;
    @JoinColumn(name = "MonTrnsPOS_AgId", referencedColumnName = "MonTrnsAgId")
    @ManyToOne
    private Moneytansferagents monTrnsPOSAgId;

    public Moneytranspointsofsale() {
    }

    public Moneytranspointsofsale(Integer monTrnsPOSId) {
        this.monTrnsPOSId = monTrnsPOSId;
    }

    public Integer getMonTrnsPOSId() {
        return monTrnsPOSId;
    }

    public void setMonTrnsPOSId(Integer monTrnsPOSId) {
        this.monTrnsPOSId = monTrnsPOSId;
    }

    public String getMonTrnsPOSName() {
        return monTrnsPOSName;
    }

    public void setMonTrnsPOSName(String monTrnsPOSName) {
        this.monTrnsPOSName = monTrnsPOSName;
    }

    public String getMonTrnsPOSPhysAdd() {
        return monTrnsPOSPhysAdd;
    }

    public void setMonTrnsPOSPhysAdd(String monTrnsPOSPhysAdd) {
        this.monTrnsPOSPhysAdd = monTrnsPOSPhysAdd;
    }

    public Microfinances getMonTrnsPOSInstId() {
        return monTrnsPOSInstId;
    }

    public void setMonTrnsPOSInstId(Microfinances monTrnsPOSInstId) {
        this.monTrnsPOSInstId = monTrnsPOSInstId;
    }

    public Forexbureaus getMonTrnsPOSInstId1() {
        return monTrnsPOSInstId1;
    }

    public void setMonTrnsPOSInstId1(Forexbureaus monTrnsPOSInstId1) {
        this.monTrnsPOSInstId1 = monTrnsPOSInstId1;
    }

    public Banks getMonTrnsPOSInstId2() {
        return monTrnsPOSInstId2;
    }

    public void setMonTrnsPOSInstId2(Banks monTrnsPOSInstId2) {
        this.monTrnsPOSInstId2 = monTrnsPOSInstId2;
    }

    public Moneytansferagents getMonTrnsPOSAgId() {
        return monTrnsPOSAgId;
    }

    public void setMonTrnsPOSAgId(Moneytansferagents monTrnsPOSAgId) {
        this.monTrnsPOSAgId = monTrnsPOSAgId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (monTrnsPOSId != null ? monTrnsPOSId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Moneytranspointsofsale)) {
            return false;
        }
        Moneytranspointsofsale other = (Moneytranspointsofsale) object;
        if ((this.monTrnsPOSId == null && other.monTrnsPOSId != null) || (this.monTrnsPOSId != null && !this.monTrnsPOSId.equals(other.monTrnsPOSId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Moneytranspointsofsale[ monTrnsPOSId=" + monTrnsPOSId + " ]";
    }
    
}

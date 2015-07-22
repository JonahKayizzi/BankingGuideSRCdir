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
    @NamedQuery(name = "Securitiesinfo.findAll", query = "SELECT s FROM Securitiesinfo s"),
    @NamedQuery(name = "Securitiesinfo.findBySecuritiesInfoId", query = "SELECT s FROM Securitiesinfo s WHERE s.securitiesInfoId = :securitiesInfoId"),
    @NamedQuery(name = "Securitiesinfo.findBySecInfoCompName", query = "SELECT s FROM Securitiesinfo s WHERE s.secInfoCompName = :secInfoCompName"),
    @NamedQuery(name = "Securitiesinfo.findBySecInfoSharePx", query = "SELECT s FROM Securitiesinfo s WHERE s.secInfoSharePx = :secInfoSharePx"),
    @NamedQuery(name = "Securitiesinfo.findBySecInfoDate", query = "SELECT s FROM Securitiesinfo s WHERE s.secInfoDate = :secInfoDate")})
public class Securitiesinfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer securitiesInfoId;
    @Size(max = 45)
    @Column(name = "SecInfo_CompName", length = 45)
    private String secInfoCompName;
    @Size(max = 45)
    @Column(name = "SecInfo_SharePx", length = 45)
    private String secInfoSharePx;
    @Column(name = "SecInfo_Date")
    @Temporal(TemporalType.DATE)
    private Date secInfoDate;
    @JoinColumn(name = "SecInfo_UserId", referencedColumnName = "UserId")
    @ManyToOne
    private Systemusers secInfoUserId;

    public Securitiesinfo() {
    }

    public Securitiesinfo(Integer securitiesInfoId) {
        this.securitiesInfoId = securitiesInfoId;
    }

    public Integer getSecuritiesInfoId() {
        return securitiesInfoId;
    }

    public void setSecuritiesInfoId(Integer securitiesInfoId) {
        this.securitiesInfoId = securitiesInfoId;
    }

    public String getSecInfoCompName() {
        return secInfoCompName;
    }

    public void setSecInfoCompName(String secInfoCompName) {
        this.secInfoCompName = secInfoCompName;
    }

    public String getSecInfoSharePx() {
        return secInfoSharePx;
    }

    public void setSecInfoSharePx(String secInfoSharePx) {
        this.secInfoSharePx = secInfoSharePx;
    }

    public Date getSecInfoDate() {
        return secInfoDate;
    }

    public void setSecInfoDate(Date secInfoDate) {
        this.secInfoDate = secInfoDate;
    }

    public Systemusers getSecInfoUserId() {
        return secInfoUserId;
    }

    public void setSecInfoUserId(Systemusers secInfoUserId) {
        this.secInfoUserId = secInfoUserId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (securitiesInfoId != null ? securitiesInfoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Securitiesinfo)) {
            return false;
        }
        Securitiesinfo other = (Securitiesinfo) object;
        if ((this.securitiesInfoId == null && other.securitiesInfoId != null) || (this.securitiesInfoId != null && !this.securitiesInfoId.equals(other.securitiesInfoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Securitiesinfo[ securitiesInfoId=" + securitiesInfoId + " ]";
    }
    
}

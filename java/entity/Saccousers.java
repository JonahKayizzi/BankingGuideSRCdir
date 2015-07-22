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
    @NamedQuery(name = "Saccousers.findAll", query = "SELECT s FROM Saccousers s"),
    @NamedQuery(name = "Saccousers.findBySACCOUserId", query = "SELECT s FROM Saccousers s WHERE s.sACCOUserId = :sACCOUserId"),
    @NamedQuery(name = "Saccousers.findBySACCOUserName", query = "SELECT s FROM Saccousers s WHERE s.sACCOUserName = :sACCOUserName"),
    @NamedQuery(name = "Saccousers.findBySACCOUserPassword", query = "SELECT s FROM Saccousers s WHERE s.sACCOUserPassword = :sACCOUserPassword"),
    @NamedQuery(name = "Saccousers.findBySACCOUserEmail", query = "SELECT s FROM Saccousers s WHERE s.sACCOUserEmail = :sACCOUserEmail"),
    @NamedQuery(name = "Saccousers.findBySACCOUserSACCOId", query = "SELECT s FROM Saccousers s WHERE s.sACCOUserSACCOId = :sACCOUserSACCOId"),
    @NamedQuery(name = "Saccousers.findBySACCOUserTime", query = "SELECT s FROM Saccousers s WHERE s.sACCOUserTime = :sACCOUserTime")})
public class Saccousers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer sACCOUserId;
    @Size(max = 45)
    @Column(length = 45)
    private String sACCOUserName;
    @Size(max = 45)
    @Column(length = 45)
    private String sACCOUserPassword;
    @Size(max = 45)
    @Column(length = 45)
    private String sACCOUserEmail;
    @Column(name = "SACCOUser_SACCOId")
    private Integer sACCOUserSACCOId;
    @Column(name = "SACCOUser_Time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sACCOUserTime;

    public Saccousers() {
    }

    public Saccousers(Integer sACCOUserId) {
        this.sACCOUserId = sACCOUserId;
    }

    public Integer getSACCOUserId() {
        return sACCOUserId;
    }

    public void setSACCOUserId(Integer sACCOUserId) {
        this.sACCOUserId = sACCOUserId;
    }

    public String getSACCOUserName() {
        return sACCOUserName;
    }

    public void setSACCOUserName(String sACCOUserName) {
        this.sACCOUserName = sACCOUserName;
    }

    public String getSACCOUserPassword() {
        return sACCOUserPassword;
    }

    public void setSACCOUserPassword(String sACCOUserPassword) {
        this.sACCOUserPassword = sACCOUserPassword;
    }

    public String getSACCOUserEmail() {
        return sACCOUserEmail;
    }

    public void setSACCOUserEmail(String sACCOUserEmail) {
        this.sACCOUserEmail = sACCOUserEmail;
    }

    public Integer getSACCOUserSACCOId() {
        return sACCOUserSACCOId;
    }

    public void setSACCOUserSACCOId(Integer sACCOUserSACCOId) {
        this.sACCOUserSACCOId = sACCOUserSACCOId;
    }

    public Date getSACCOUserTime() {
        return sACCOUserTime;
    }

    public void setSACCOUserTime(Date sACCOUserTime) {
        this.sACCOUserTime = sACCOUserTime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sACCOUserId != null ? sACCOUserId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Saccousers)) {
            return false;
        }
        Saccousers other = (Saccousers) object;
        if ((this.sACCOUserId == null && other.sACCOUserId != null) || (this.sACCOUserId != null && !this.sACCOUserId.equals(other.sACCOUserId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Saccousers[ sACCOUserId=" + sACCOUserId + " ]";
    }
    
}

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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
    @NamedQuery(name = "Useraccessrights.findAll", query = "SELECT u FROM Useraccessrights u"),
    @NamedQuery(name = "Useraccessrights.findByUserAccessRightsId", query = "SELECT u FROM Useraccessrights u WHERE u.userAccessRightsId = :userAccessRightsId"),
    @NamedQuery(name = "Useraccessrights.findByUsrAcsRtsUserType", query = "SELECT u FROM Useraccessrights u WHERE u.usrAcsRtsUserType = :usrAcsRtsUserType"),
    @NamedQuery(name = "Useraccessrights.findByUsrAcsRtsFunction", query = "SELECT u FROM Useraccessrights u WHERE u.usrAcsRtsFunction = :usrAcsRtsFunction"),
    @NamedQuery(name = "Useraccessrights.findByUsrAcsRtsStatus", query = "SELECT u FROM Useraccessrights u WHERE u.usrAcsRtsStatus = :usrAcsRtsStatus"),
    @NamedQuery(name = "Useraccessrights.findByUsrAcsRtsTime", query = "SELECT u FROM Useraccessrights u WHERE u.usrAcsRtsTime = :usrAcsRtsTime"),
    //custom name query for selecting the most recent records of the accessrights
    @NamedQuery(name = "Useraccessrights.findAllRecent", query = "SELECT u.userAccessRightsId, u.usrAcsRtsUserType, u.usrAcsRtsFunction, u.usrAcsRtsStatus, "
            + "MAX(u.usrAcsRtsTime) FROM Useraccessrights u GROUP BY u.usrAcsRtsUserType, u.usrAcsRtsFunction"),
    @NamedQuery(name = "Useraccessrights.findUserRecent", query = "SELECT u.userAccessRightsId, u.usrAcsRtsUserType, u.usrAcsRtsFunction, u.usrAcsRtsStatus, "
            + "MAX(u.usrAcsRtsTime) FROM Useraccessrights u WHERE u.usrAcsRtsUserType = :usrAcsRtsUserType GROUP BY u.usrAcsRtsUserType, u.usrAcsRtsFunction")})
public class Useraccessrights implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer userAccessRightsId;
    @Size(max = 45)
    @Column(name = "UsrAcsRts_UserType", length = 45)
    private String usrAcsRtsUserType;
    @Size(max = 45)
    @Column(name = "UsrAcsRts_Function", length = 45)
    private String usrAcsRtsFunction;
    @Column(name = "UsrAcsRts_Status")
    private Boolean usrAcsRtsStatus;
    @Column(name = "UsrAcsRts_Time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrAcsRtsTime;

    public Useraccessrights() {
    }

    public Useraccessrights(Integer userAccessRightsId) {
        this.userAccessRightsId = userAccessRightsId;
    }

    public Integer getUserAccessRightsId() {
        return userAccessRightsId;
    }

    public void setUserAccessRightsId(Integer userAccessRightsId) {
        this.userAccessRightsId = userAccessRightsId;
    }

    public String getUsrAcsRtsUserType() {
        return usrAcsRtsUserType;
    }

    public void setUsrAcsRtsUserType(String usrAcsRtsUserType) {
        this.usrAcsRtsUserType = usrAcsRtsUserType;
    }

    public String getUsrAcsRtsFunction() {
        return usrAcsRtsFunction;
    }

    public void setUsrAcsRtsFunction(String usrAcsRtsFunction) {
        this.usrAcsRtsFunction = usrAcsRtsFunction;
    }

    public Boolean getUsrAcsRtsStatus() {
        return usrAcsRtsStatus;
    }

    public void setUsrAcsRtsStatus(Boolean usrAcsRtsStatus) {
        this.usrAcsRtsStatus = usrAcsRtsStatus;
    }

    public Date getUsrAcsRtsTime() {
        return usrAcsRtsTime;
    }

    public void setUsrAcsRtsTime(Date usrAcsRtsTime) {
        this.usrAcsRtsTime = usrAcsRtsTime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userAccessRightsId != null ? userAccessRightsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Useraccessrights)) {
            return false;
        }
        Useraccessrights other = (Useraccessrights) object;
        if ((this.userAccessRightsId == null && other.userAccessRightsId != null) || (this.userAccessRightsId != null && !this.userAccessRightsId.equals(other.userAccessRightsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Useraccessrights[ userAccessRightsId=" + userAccessRightsId + " ]";
    }
    
}

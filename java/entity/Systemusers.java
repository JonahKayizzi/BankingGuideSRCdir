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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Xcelsia
 */
@Entity
@Table(name = "systemusers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Systemusers.findAll", query = "SELECT s FROM Systemusers s"),
    @NamedQuery(name = "Systemusers.findByUserId", query = "SELECT s FROM Systemusers s WHERE s.userId = :userId"),
    @NamedQuery(name = "Systemusers.findByUserName", query = "SELECT s FROM Systemusers s WHERE s.userName = :userName"),
    @NamedQuery(name = "Systemusers.findByUserPassword", query = "SELECT s FROM Systemusers s WHERE s.userPassword = :userPassword"),
    @NamedQuery(name = "Systemusers.findByUserEmail", query = "SELECT s FROM Systemusers s WHERE s.userEmail = :userEmail"),
    @NamedQuery(name = "Systemusers.findByUserType", query = "SELECT s FROM Systemusers s WHERE s.userType = :userType"),
    @NamedQuery(name = "Systemusers.findByActivation", query = "SELECT s FROM Systemusers s WHERE s.activation = :activation"),
    @NamedQuery(name = "Systemusers.findBySystemUsersTime", query = "SELECT s FROM Systemusers s WHERE s.systemUsersTime = :systemUsersTime"),
    @NamedQuery(name = "Systemusers.findByEnabled", query = "SELECT s FROM Systemusers s WHERE s.enabled = :enabled")})
public class Systemusers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "UserId")
    private Integer userId;
    @Size(max = 45)
    @Column(name = "UserName")
    private String userName;
    @Size(max = 60)
    @Column(name = "UserPassword")
    private String userPassword;
    @Size(max = 45)
    @Column(name = "UserEmail")
    private String userEmail;
    @Size(max = 45)
    @Column(name = "UserType")
    private String userType;
    @Column(name = "Activation")
    private Integer activation;
    @Column(name = "SystemUsersTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date systemUsersTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Enabled")
    private int enabled;

    public Systemusers() {
    }

    public Systemusers(Integer userId) {
        this.userId = userId;
    }

    public Systemusers(Integer userId, int enabled) {
        this.userId = userId;
        this.enabled = enabled;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Integer getActivation() {
        return activation;
    }

    public void setActivation(Integer activation) {
        this.activation = activation;
    }

    public Date getSystemUsersTime() {
        return systemUsersTime;
    }

    public void setSystemUsersTime(Date systemUsersTime) {
        this.systemUsersTime = systemUsersTime;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Systemusers)) {
            return false;
        }
        Systemusers other = (Systemusers) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Systemusers[ userId=" + userId + " ]";
    }
    
}

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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
    @NamedQuery(name = "Microfinusers.findAll", query = "SELECT m FROM Microfinusers m"),
    @NamedQuery(name = "Microfinusers.findByMicroFinUserId", query = "SELECT m FROM Microfinusers m WHERE m.microFinUserId = :microFinUserId"),
    @NamedQuery(name = "Microfinusers.findByMicroFinUserName", query = "SELECT m FROM Microfinusers m WHERE m.microFinUserName = :microFinUserName"),
    @NamedQuery(name = "Microfinusers.findByMicroFinUserPassword", query = "SELECT m FROM Microfinusers m WHERE m.microFinUserPassword = :microFinUserPassword"),
    @NamedQuery(name = "Microfinusers.findByMicroFinUserEmail", query = "SELECT m FROM Microfinusers m WHERE m.microFinUserEmail = :microFinUserEmail"),
    @NamedQuery(name = "Microfinusers.findByMicroFinUserMicroFinId", query = "SELECT m FROM Microfinusers m WHERE m.microFinUserMicroFinId = :microFinUserMicroFinId")})
public class Microfinusers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer microFinUserId;
    @Size(max = 45)
    @Column(length = 45)
    private String microFinUserName;
    @Size(max = 45)
    @Column(length = 45)
    private String microFinUserPassword;
    @Size(max = 45)
    @Column(length = 45)
    private String microFinUserEmail;
    @Column(name = "MicroFinUser_MicroFinId")
    private Integer microFinUserMicroFinId;

    public Microfinusers() {
    }

    public Microfinusers(Integer microFinUserId) {
        this.microFinUserId = microFinUserId;
    }

    public Integer getMicroFinUserId() {
        return microFinUserId;
    }

    public void setMicroFinUserId(Integer microFinUserId) {
        this.microFinUserId = microFinUserId;
    }

    public String getMicroFinUserName() {
        return microFinUserName;
    }

    public void setMicroFinUserName(String microFinUserName) {
        this.microFinUserName = microFinUserName;
    }

    public String getMicroFinUserPassword() {
        return microFinUserPassword;
    }

    public void setMicroFinUserPassword(String microFinUserPassword) {
        this.microFinUserPassword = microFinUserPassword;
    }

    public String getMicroFinUserEmail() {
        return microFinUserEmail;
    }

    public void setMicroFinUserEmail(String microFinUserEmail) {
        this.microFinUserEmail = microFinUserEmail;
    }

    public Integer getMicroFinUserMicroFinId() {
        return microFinUserMicroFinId;
    }

    public void setMicroFinUserMicroFinId(Integer microFinUserMicroFinId) {
        this.microFinUserMicroFinId = microFinUserMicroFinId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (microFinUserId != null ? microFinUserId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Microfinusers)) {
            return false;
        }
        Microfinusers other = (Microfinusers) object;
        if ((this.microFinUserId == null && other.microFinUserId != null) || (this.microFinUserId != null && !this.microFinUserId.equals(other.microFinUserId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Microfinusers[ microFinUserId=" + microFinUserId + " ]";
    }
    
}

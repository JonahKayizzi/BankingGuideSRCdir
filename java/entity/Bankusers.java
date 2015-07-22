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
    @NamedQuery(name = "Bankusers.findAll", query = "SELECT b FROM Bankusers b"),
    @NamedQuery(name = "Bankusers.findByBankUserId", query = "SELECT b FROM Bankusers b WHERE b.bankUserId = :bankUserId"),
    @NamedQuery(name = "Bankusers.findByBankUserName", query = "SELECT b FROM Bankusers b WHERE b.bankUserName = :bankUserName"),
    @NamedQuery(name = "Bankusers.findByBankUserPassword", query = "SELECT b FROM Bankusers b WHERE b.bankUserPassword = :bankUserPassword"),
    @NamedQuery(name = "Bankusers.findByBankUserEmail", query = "SELECT b FROM Bankusers b WHERE b.bankUserEmail = :bankUserEmail"),
    @NamedQuery(name = "Bankusers.findByBankUsersDate", query = "SELECT b FROM Bankusers b WHERE b.bankUsersDate = :bankUsersDate"),
    @NamedQuery(name = "Bankusers.findByBankUserBankId", query = "SELECT b FROM Bankusers b WHERE b.bankUserBankId = :bankUserBankId")})
public class Bankusers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer bankUserId;
    @Size(max = 45)
    @Column(length = 45)
    private String bankUserName;
    @Size(max = 45)
    @Column(length = 45)
    private String bankUserPassword;
    @Size(max = 45)
    @Column(length = 45)
    private String bankUserEmail;
    @Temporal(TemporalType.TIMESTAMP)
    private Date bankUsersDate;
    private Integer bankUserBankId;

    public Bankusers() {
    }

    public Bankusers(Integer bankUserId) {
        this.bankUserId = bankUserId;
    }

    public Integer getBankUserId() {
        return bankUserId;
    }

    public void setBankUserId(Integer bankUserId) {
        this.bankUserId = bankUserId;
    }

    public String getBankUserName() {
        return bankUserName;
    }

    public void setBankUserName(String bankUserName) {
        this.bankUserName = bankUserName;
    }

    public String getBankUserPassword() {
        return bankUserPassword;
    }

    public void setBankUserPassword(String bankUserPassword) {
        this.bankUserPassword = bankUserPassword;
    }

    public String getBankUserEmail() {
        return bankUserEmail;
    }

    public void setBankUserEmail(String bankUserEmail) {
        this.bankUserEmail = bankUserEmail;
    }

    public Date getBankUsersDate() {
        return bankUsersDate;
    }

    public void setBankUsersDate(Date bankUsersDate) {
        this.bankUsersDate = bankUsersDate;
    }

    public Integer getBankUserBankId() {
        return bankUserBankId;
    }

    public void setBankUserBankId(Integer bankUserBankId) {
        this.bankUserBankId = bankUserBankId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bankUserId != null ? bankUserId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bankusers)) {
            return false;
        }
        Bankusers other = (Bankusers) object;
        if ((this.bankUserId == null && other.bankUserId != null) || (this.bankUserId != null && !this.bankUserId.equals(other.bankUserId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Bankusers[ bankUserId=" + bankUserId + " ]";
    }
    
}

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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    @NamedQuery(name = "Institutionprofile.findAll", query = "SELECT i FROM Institutionprofile i"),
    @NamedQuery(name = "Institutionprofile.findByInstId", query = "SELECT i FROM Institutionprofile i WHERE i.instId = :instId"),
    @NamedQuery(name = "Institutionprofile.findByInstName", query = "SELECT i FROM Institutionprofile i WHERE i.instName = :instName"),
    @NamedQuery(name = "Institutionprofile.findByInstLogo", query = "SELECT i FROM Institutionprofile i WHERE i.instLogo = :instLogo"),
    @NamedQuery(name = "Institutionprofile.findByInstSlogan", query = "SELECT i FROM Institutionprofile i WHERE i.instSlogan = :instSlogan"),
    @NamedQuery(name = "Institutionprofile.findByInstTel", query = "SELECT i FROM Institutionprofile i WHERE i.instTel = :instTel"),
    @NamedQuery(name = "Institutionprofile.findByInstPhysicalAddress", query = "SELECT i FROM Institutionprofile i WHERE i.instPhysicalAddress = :instPhysicalAddress"),
    @NamedQuery(name = "Institutionprofile.findByInstPostalAddress", query = "SELECT i FROM Institutionprofile i WHERE i.instPostalAddress = :instPostalAddress"),
    @NamedQuery(name = "Institutionprofile.findByInstSupportTel", query = "SELECT i FROM Institutionprofile i WHERE i.instSupportTel = :instSupportTel"),
    @NamedQuery(name = "Institutionprofile.findByInstSupportEmail", query = "SELECT i FROM Institutionprofile i WHERE i.instSupportEmail = :instSupportEmail"),
    @NamedQuery(name = "Institutionprofile.findByInstTime", query = "SELECT i FROM Institutionprofile i WHERE i.instTime = :instTime")})
public class Institutionprofile implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer instId;
    @Size(max = 45)
    @Column(length = 45)
    private String instName;
    @Size(max = 100)
    @Column(length = 100)
    private String instLogo;
    @Size(max = 45)
    @Column(length = 45)
    private String instSlogan;
    @Size(max = 45)
    @Column(length = 45)
    private String instTel;
    @Size(max = 45)
    @Column(length = 45)
    private String instPhysicalAddress;
    @Size(max = 45)
    @Column(length = 45)
    private String instPostalAddress;
    @Size(max = 45)
    @Column(length = 45)
    private String instSupportTel;
    @Size(max = 45)
    @Column(length = 45)
    private String instSupportEmail;
    @Temporal(TemporalType.TIMESTAMP)
    private Date instTime;
    @JoinColumn(name = "Inst_UserId", referencedColumnName = "UserId")
    @ManyToOne
    private Systemusers instUserId;

    public Institutionprofile() {
    }

    public Institutionprofile(Integer instId) {
        this.instId = instId;
    }

    public Integer getInstId() {
        return instId;
    }

    public void setInstId(Integer instId) {
        this.instId = instId;
    }

    public String getInstName() {
        return instName;
    }

    public void setInstName(String instName) {
        this.instName = instName;
    }

    public String getInstLogo() {
        return instLogo;
    }

    public void setInstLogo(String instLogo) {
        this.instLogo = instLogo;
    }

    public String getInstSlogan() {
        return instSlogan;
    }

    public void setInstSlogan(String instSlogan) {
        this.instSlogan = instSlogan;
    }

    public String getInstTel() {
        return instTel;
    }

    public void setInstTel(String instTel) {
        this.instTel = instTel;
    }

    public String getInstPhysicalAddress() {
        return instPhysicalAddress;
    }

    public void setInstPhysicalAddress(String instPhysicalAddress) {
        this.instPhysicalAddress = instPhysicalAddress;
    }

    public String getInstPostalAddress() {
        return instPostalAddress;
    }

    public void setInstPostalAddress(String instPostalAddress) {
        this.instPostalAddress = instPostalAddress;
    }

    public String getInstSupportTel() {
        return instSupportTel;
    }

    public void setInstSupportTel(String instSupportTel) {
        this.instSupportTel = instSupportTel;
    }

    public String getInstSupportEmail() {
        return instSupportEmail;
    }

    public void setInstSupportEmail(String instSupportEmail) {
        this.instSupportEmail = instSupportEmail;
    }

    public Date getInstTime() {
        return instTime;
    }

    public void setInstTime(Date instTime) {
        this.instTime = instTime;
    }

    public Systemusers getInstUserId() {
        return instUserId;
    }

    public void setInstUserId(Systemusers instUserId) {
        this.instUserId = instUserId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (instId != null ? instId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Institutionprofile)) {
            return false;
        }
        Institutionprofile other = (Institutionprofile) object;
        if ((this.instId == null && other.instId != null) || (this.instId != null && !this.instId.equals(other.instId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Institutionprofile[ instId=" + instId + " ]";
    }
    
}

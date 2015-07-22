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
    @NamedQuery(name = "Editors.findAll", query = "SELECT e FROM Editors e"),
    @NamedQuery(name = "Editors.findByEditorId", query = "SELECT e FROM Editors e WHERE e.editorId = :editorId"),
    @NamedQuery(name = "Editors.findByEditorName", query = "SELECT e FROM Editors e WHERE e.editorName = :editorName"),
    @NamedQuery(name = "Editors.findByEditorProfPic", query = "SELECT e FROM Editors e WHERE e.editorProfPic = :editorProfPic"),
    @NamedQuery(name = "Editors.findByEditorSlogan", query = "SELECT e FROM Editors e WHERE e.editorSlogan = :editorSlogan"),
    @NamedQuery(name = "Editors.findByEditorTel", query = "SELECT e FROM Editors e WHERE e.editorTel = :editorTel"),
    @NamedQuery(name = "Editors.findByEditorPhysicalAddress", query = "SELECT e FROM Editors e WHERE e.editorPhysicalAddress = :editorPhysicalAddress"),
    @NamedQuery(name = "Editors.findByEditorPostalAddress", query = "SELECT e FROM Editors e WHERE e.editorPostalAddress = :editorPostalAddress"),
    @NamedQuery(name = "Editors.findByEditorEmail", query = "SELECT e FROM Editors e WHERE e.editorEmail = :editorEmail"),
    @NamedQuery(name = "Editors.findByEditorUserName", query = "SELECT e FROM Editors e WHERE e.editorUserName = :editorUserName"),
    @NamedQuery(name = "Editors.findByEditorPassword", query = "SELECT e FROM Editors e WHERE e.editorPassword = :editorPassword"),
    @NamedQuery(name = "Editors.findByEditorTime", query = "SELECT e FROM Editors e WHERE e.editorTime = :editorTime")})
public class Editors implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer editorId;
    @Size(max = 45)
    @Column(length = 45)
    private String editorName;
    @Size(max = 100)
    @Column(length = 100)
    private String editorProfPic;
    @Size(max = 45)
    @Column(length = 45)
    private String editorSlogan;
    @Size(max = 45)
    @Column(length = 45)
    private String editorTel;
    @Size(max = 45)
    @Column(length = 45)
    private String editorPhysicalAddress;
    @Size(max = 45)
    @Column(length = 45)
    private String editorPostalAddress;
    @Size(max = 45)
    @Column(length = 45)
    private String editorEmail;
    @Size(max = 45)
    @Column(length = 45)
    private String editorUserName;
    @Size(max = 45)
    @Column(length = 45)
    private String editorPassword;
    @Temporal(TemporalType.TIMESTAMP)
    private Date editorTime;
    @OneToMany(mappedBy = "articlePoster6")
    private Collection<Articles> articlesCollection;

    public Editors() {
    }

    public Editors(Integer editorId) {
        this.editorId = editorId;
    }

    public Integer getEditorId() {
        return editorId;
    }

    public void setEditorId(Integer editorId) {
        this.editorId = editorId;
    }

    public String getEditorName() {
        return editorName;
    }

    public void setEditorName(String editorName) {
        this.editorName = editorName;
    }

    public String getEditorProfPic() {
        return editorProfPic;
    }

    public void setEditorProfPic(String editorProfPic) {
        this.editorProfPic = editorProfPic;
    }

    public String getEditorSlogan() {
        return editorSlogan;
    }

    public void setEditorSlogan(String editorSlogan) {
        this.editorSlogan = editorSlogan;
    }

    public String getEditorTel() {
        return editorTel;
    }

    public void setEditorTel(String editorTel) {
        this.editorTel = editorTel;
    }

    public String getEditorPhysicalAddress() {
        return editorPhysicalAddress;
    }

    public void setEditorPhysicalAddress(String editorPhysicalAddress) {
        this.editorPhysicalAddress = editorPhysicalAddress;
    }

    public String getEditorPostalAddress() {
        return editorPostalAddress;
    }

    public void setEditorPostalAddress(String editorPostalAddress) {
        this.editorPostalAddress = editorPostalAddress;
    }

    public String getEditorEmail() {
        return editorEmail;
    }

    public void setEditorEmail(String editorEmail) {
        this.editorEmail = editorEmail;
    }

    public String getEditorUserName() {
        return editorUserName;
    }

    public void setEditorUserName(String editorUserName) {
        this.editorUserName = editorUserName;
    }

    public String getEditorPassword() {
        return editorPassword;
    }

    public void setEditorPassword(String editorPassword) {
        this.editorPassword = editorPassword;
    }

    public Date getEditorTime() {
        return editorTime;
    }

    public void setEditorTime(Date editorTime) {
        this.editorTime = editorTime;
    }

    @XmlTransient
    public Collection<Articles> getArticlesCollection() {
        return articlesCollection;
    }

    public void setArticlesCollection(Collection<Articles> articlesCollection) {
        this.articlesCollection = articlesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (editorId != null ? editorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Editors)) {
            return false;
        }
        Editors other = (Editors) object;
        if ((this.editorId == null && other.editorId != null) || (this.editorId != null && !this.editorId.equals(other.editorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Editors[ editorId=" + editorId + " ]";
    }
    
}

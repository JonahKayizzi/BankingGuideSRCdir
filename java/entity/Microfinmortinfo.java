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
    @NamedQuery(name = "Microfinmortinfo.findAll", query = "SELECT m FROM Microfinmortinfo m"),
    @NamedQuery(name = "Microfinmortinfo.findByMFMortInfoId", query = "SELECT m FROM Microfinmortinfo m WHERE m.mFMortInfoId = :mFMortInfoId"),
    @NamedQuery(name = "Microfinmortinfo.findByMFMortInfoMortTypes", query = "SELECT m FROM Microfinmortinfo m WHERE m.mFMortInfoMortTypes = :mFMortInfoMortTypes"),
    @NamedQuery(name = "Microfinmortinfo.findByMFMortInfoAppProc", query = "SELECT m FROM Microfinmortinfo m WHERE m.mFMortInfoAppProc = :mFMortInfoAppProc"),
    @NamedQuery(name = "Microfinmortinfo.findByMFMortInfoOnlineLink", query = "SELECT m FROM Microfinmortinfo m WHERE m.mFMortInfoOnlineLink = :mFMortInfoOnlineLink"),
    @NamedQuery(name = "Microfinmortinfo.findByMFMortInfoIntRate", query = "SELECT m FROM Microfinmortinfo m WHERE m.mFMortInfoIntRate = :mFMortInfoIntRate"),
    @NamedQuery(name = "Microfinmortinfo.findByMFMortInfoLVP", query = "SELECT m FROM Microfinmortinfo m WHERE m.mFMortInfoLVP = :mFMortInfoLVP"),
    @NamedQuery(name = "Microfinmortinfo.findByMFMortInfoRepayFee", query = "SELECT m FROM Microfinmortinfo m WHERE m.mFMortInfoRepayFee = :mFMortInfoRepayFee"),
    @NamedQuery(name = "Microfinmortinfo.findByMFMortInfoMortFeat", query = "SELECT m FROM Microfinmortinfo m WHERE m.mFMortInfoMortFeat = :mFMortInfoMortFeat"),
    @NamedQuery(name = "Microfinmortinfo.findByMFMortInfoMaxLoan", query = "SELECT m FROM Microfinmortinfo m WHERE m.mFMortInfoMaxLoan = :mFMortInfoMaxLoan"),
    @NamedQuery(name = "Microfinmortinfo.findByMFMortInfoMinLoan", query = "SELECT m FROM Microfinmortinfo m WHERE m.mFMortInfoMinLoan = :mFMortInfoMinLoan"),
    @NamedQuery(name = "Microfinmortinfo.findByMFMortInfoOtherPay", query = "SELECT m FROM Microfinmortinfo m WHERE m.mFMortInfoOtherPay = :mFMortInfoOtherPay"),
    @NamedQuery(name = "Microfinmortinfo.findByMFMortInfoTime", query = "SELECT m FROM Microfinmortinfo m WHERE m.mFMortInfoTime = :mFMortInfoTime")})
public class Microfinmortinfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer mFMortInfoId;
    @Size(max = 100)
    @Column(name = "MFMortInfo_MortTypes", length = 100)
    private String mFMortInfoMortTypes;
    @Size(max = 500)
    @Column(name = "MFMortInfo_AppProc", length = 500)
    private String mFMortInfoAppProc;
    @Size(max = 45)
    @Column(name = "MFMortInfo_OnlineLink", length = 45)
    private String mFMortInfoOnlineLink;
    @Size(max = 45)
    @Column(name = "MFMortInfo_IntRate", length = 45)
    private String mFMortInfoIntRate;
    @Size(max = 45)
    @Column(name = "MFMortInfo_LVP", length = 45)
    private String mFMortInfoLVP;
    @Size(max = 45)
    @Column(name = "MFMortInfo_RepayFee", length = 45)
    private String mFMortInfoRepayFee;
    @Size(max = 100)
    @Column(name = "MFMortInfo_MortFeat", length = 100)
    private String mFMortInfoMortFeat;
    @Size(max = 45)
    @Column(name = "MFMortInfo_MaxLoan", length = 45)
    private String mFMortInfoMaxLoan;
    @Size(max = 45)
    @Column(name = "MFMortInfo_MinLoan", length = 45)
    private String mFMortInfoMinLoan;
    @Size(max = 100)
    @Column(name = "MFMortInfo_OtherPay", length = 100)
    private String mFMortInfoOtherPay;
    @Column(name = "MFMortInfo_Time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mFMortInfoTime;
    @JoinColumn(name = "MFMortInfo_MicroFinId", referencedColumnName = "MicroFinId")
    @ManyToOne
    private Microfinances mFMortInfoMicroFinId;

    public Microfinmortinfo() {
    }

    public Microfinmortinfo(Integer mFMortInfoId) {
        this.mFMortInfoId = mFMortInfoId;
    }

    public Integer getMFMortInfoId() {
        return mFMortInfoId;
    }

    public void setMFMortInfoId(Integer mFMortInfoId) {
        this.mFMortInfoId = mFMortInfoId;
    }

    public String getMFMortInfoMortTypes() {
        return mFMortInfoMortTypes;
    }

    public void setMFMortInfoMortTypes(String mFMortInfoMortTypes) {
        this.mFMortInfoMortTypes = mFMortInfoMortTypes;
    }

    public String getMFMortInfoAppProc() {
        return mFMortInfoAppProc;
    }

    public void setMFMortInfoAppProc(String mFMortInfoAppProc) {
        this.mFMortInfoAppProc = mFMortInfoAppProc;
    }

    public String getMFMortInfoOnlineLink() {
        return mFMortInfoOnlineLink;
    }

    public void setMFMortInfoOnlineLink(String mFMortInfoOnlineLink) {
        this.mFMortInfoOnlineLink = mFMortInfoOnlineLink;
    }

    public String getMFMortInfoIntRate() {
        return mFMortInfoIntRate;
    }

    public void setMFMortInfoIntRate(String mFMortInfoIntRate) {
        this.mFMortInfoIntRate = mFMortInfoIntRate;
    }

    public String getMFMortInfoLVP() {
        return mFMortInfoLVP;
    }

    public void setMFMortInfoLVP(String mFMortInfoLVP) {
        this.mFMortInfoLVP = mFMortInfoLVP;
    }

    public String getMFMortInfoRepayFee() {
        return mFMortInfoRepayFee;
    }

    public void setMFMortInfoRepayFee(String mFMortInfoRepayFee) {
        this.mFMortInfoRepayFee = mFMortInfoRepayFee;
    }

    public String getMFMortInfoMortFeat() {
        return mFMortInfoMortFeat;
    }

    public void setMFMortInfoMortFeat(String mFMortInfoMortFeat) {
        this.mFMortInfoMortFeat = mFMortInfoMortFeat;
    }

    public String getMFMortInfoMaxLoan() {
        return mFMortInfoMaxLoan;
    }

    public void setMFMortInfoMaxLoan(String mFMortInfoMaxLoan) {
        this.mFMortInfoMaxLoan = mFMortInfoMaxLoan;
    }

    public String getMFMortInfoMinLoan() {
        return mFMortInfoMinLoan;
    }

    public void setMFMortInfoMinLoan(String mFMortInfoMinLoan) {
        this.mFMortInfoMinLoan = mFMortInfoMinLoan;
    }

    public String getMFMortInfoOtherPay() {
        return mFMortInfoOtherPay;
    }

    public void setMFMortInfoOtherPay(String mFMortInfoOtherPay) {
        this.mFMortInfoOtherPay = mFMortInfoOtherPay;
    }

    public Date getMFMortInfoTime() {
        return mFMortInfoTime;
    }

    public void setMFMortInfoTime(Date mFMortInfoTime) {
        this.mFMortInfoTime = mFMortInfoTime;
    }

    public Microfinances getMFMortInfoMicroFinId() {
        return mFMortInfoMicroFinId;
    }

    public void setMFMortInfoMicroFinId(Microfinances mFMortInfoMicroFinId) {
        this.mFMortInfoMicroFinId = mFMortInfoMicroFinId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mFMortInfoId != null ? mFMortInfoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Microfinmortinfo)) {
            return false;
        }
        Microfinmortinfo other = (Microfinmortinfo) object;
        if ((this.mFMortInfoId == null && other.mFMortInfoId != null) || (this.mFMortInfoId != null && !this.mFMortInfoId.equals(other.mFMortInfoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Microfinmortinfo[ mFMortInfoId=" + mFMortInfoId + " ]";
    }
    
}

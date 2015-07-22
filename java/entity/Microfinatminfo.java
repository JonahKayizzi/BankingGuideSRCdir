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
import javax.persistence.Lob;
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
    @NamedQuery(name = "Microfinatminfo.findAll", query = "SELECT m FROM Microfinatminfo m"),
    @NamedQuery(name = "Microfinatminfo.findByMFATMInfoid", query = "SELECT m FROM Microfinatminfo m WHERE m.mFATMInfoid = :mFATMInfoid"),
    @NamedQuery(name = "Microfinatminfo.findByMFATMInfoATMAppProc", query = "SELECT m FROM Microfinatminfo m WHERE m.mFATMInfoATMAppProc = :mFATMInfoATMAppProc"),
    @NamedQuery(name = "Microfinatminfo.findByMFATMInfoOnlineLink", query = "SELECT m FROM Microfinatminfo m WHERE m.mFATMInfoOnlineLink = :mFATMInfoOnlineLink"),
    @NamedQuery(name = "Microfinatminfo.findByMFATMInfoATMReplacProc", query = "SELECT m FROM Microfinatminfo m WHERE m.mFATMInfoATMReplacProc = :mFATMInfoATMReplacProc"),
    @NamedQuery(name = "Microfinatminfo.findByMFATMInfoOffers", query = "SELECT m FROM Microfinatminfo m WHERE m.mFATMInfoOffers = :mFATMInfoOffers"),
    @NamedQuery(name = "Microfinatminfo.findByMFATMInfoRestrict", query = "SELECT m FROM Microfinatminfo m WHERE m.mFATMInfoRestrict = :mFATMInfoRestrict"),
    @NamedQuery(name = "Microfinatminfo.findByMFATMInfoIssCharge", query = "SELECT m FROM Microfinatminfo m WHERE m.mFATMInfoIssCharge = :mFATMInfoIssCharge"),
    @NamedQuery(name = "Microfinatminfo.findByMFATMInfoWithCharge", query = "SELECT m FROM Microfinatminfo m WHERE m.mFATMInfoWithCharge = :mFATMInfoWithCharge"),
    @NamedQuery(name = "Microfinatminfo.findByMFATMInfoDepoCharge", query = "SELECT m FROM Microfinatminfo m WHERE m.mFATMInfoDepoCharge = :mFATMInfoDepoCharge"),
    @NamedQuery(name = "Microfinatminfo.findByMFATMInfoAddServ", query = "SELECT m FROM Microfinatminfo m WHERE m.mFATMInfoAddServ = :mFATMInfoAddServ"),
    @NamedQuery(name = "Microfinatminfo.findByMFATMInfoImg", query = "SELECT m FROM Microfinatminfo m WHERE m.mFATMInfoImg = :mFATMInfoImg"),
    @NamedQuery(name = "Microfinatminfo.findByMFATMInfoExpePrd", query = "SELECT m FROM Microfinatminfo m WHERE m.mFATMInfoExpePrd = :mFATMInfoExpePrd"),
    @NamedQuery(name = "Microfinatminfo.findByMFATMInfoAppDur", query = "SELECT m FROM Microfinatminfo m WHERE m.mFATMInfoAppDur = :mFATMInfoAppDur"),
    @NamedQuery(name = "Microfinatminfo.findByMFATMInfoLctns", query = "SELECT m FROM Microfinatminfo m WHERE m.mFATMInfoLctns = :mFATMInfoLctns"),
    @NamedQuery(name = "Microfinatminfo.findByMicroFinATMInfoTime", query = "SELECT m FROM Microfinatminfo m WHERE m.microFinATMInfoTime = :microFinATMInfoTime"),
    @NamedQuery(name = "Microfinatminfo.findByMicroFinInfoUncollectDest", query = "SELECT m FROM Microfinatminfo m WHERE m.microFinInfoUncollectDest = :microFinInfoUncollectDest")})
public class Microfinatminfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer mFATMInfoid;
    @Size(max = 500)
    @Column(name = "MFATMInfo_ATMAppProc", length = 500)
    private String mFATMInfoATMAppProc;
    @Size(max = 45)
    @Column(name = "MFATMInfo_OnlineLink", length = 45)
    private String mFATMInfoOnlineLink;
    @Size(max = 500)
    @Column(name = "MFATMInfo_ATMReplacProc", length = 500)
    private String mFATMInfoATMReplacProc;
    @Size(max = 100)
    @Column(name = "MFATMInfo_Offers", length = 100)
    private String mFATMInfoOffers;
    @Size(max = 100)
    @Column(name = "MFATMInfo_Restrict", length = 100)
    private String mFATMInfoRestrict;
    @Column(name = "MFATMInfo_IssCharge")
    private Integer mFATMInfoIssCharge;
    @Column(name = "MFATMInfo_WithCharge")
    private Integer mFATMInfoWithCharge;
    @Column(name = "MFATMInfo_DepoCharge")
    private Integer mFATMInfoDepoCharge;
    @Lob
    @Column(name = "MFATMInfo_VISAsupp")
    private byte[] mFATMInfoVISAsupp;
    @Size(max = 100)
    @Column(name = "MFATMInfo_AddServ", length = 100)
    private String mFATMInfoAddServ;
    @Size(max = 45)
    @Column(name = "MFATMInfo_Img", length = 45)
    private String mFATMInfoImg;
    @Size(max = 45)
    @Column(name = "MFATMInfo_ExpePrd", length = 45)
    private String mFATMInfoExpePrd;
    @Size(max = 45)
    @Column(name = "MFATMInfo_AppDur", length = 45)
    private String mFATMInfoAppDur;
    @Size(max = 45)
    @Column(name = "MFATMInfo_Lctns", length = 45)
    private String mFATMInfoLctns;
    @Temporal(TemporalType.TIMESTAMP)
    private Date microFinATMInfoTime;
    @Size(max = 45)
    @Column(name = "MicroFinInfo_UncollectDest", length = 45)
    private String microFinInfoUncollectDest;
    @JoinColumn(name = "MFATMInfo_MicroFinId", referencedColumnName = "MicroFinId")
    @ManyToOne
    private Microfinances mFATMInfoMicroFinId;

    public Microfinatminfo() {
    }

    public Microfinatminfo(Integer mFATMInfoid) {
        this.mFATMInfoid = mFATMInfoid;
    }

    public Integer getMFATMInfoid() {
        return mFATMInfoid;
    }

    public void setMFATMInfoid(Integer mFATMInfoid) {
        this.mFATMInfoid = mFATMInfoid;
    }

    public String getMFATMInfoATMAppProc() {
        return mFATMInfoATMAppProc;
    }

    public void setMFATMInfoATMAppProc(String mFATMInfoATMAppProc) {
        this.mFATMInfoATMAppProc = mFATMInfoATMAppProc;
    }

    public String getMFATMInfoOnlineLink() {
        return mFATMInfoOnlineLink;
    }

    public void setMFATMInfoOnlineLink(String mFATMInfoOnlineLink) {
        this.mFATMInfoOnlineLink = mFATMInfoOnlineLink;
    }

    public String getMFATMInfoATMReplacProc() {
        return mFATMInfoATMReplacProc;
    }

    public void setMFATMInfoATMReplacProc(String mFATMInfoATMReplacProc) {
        this.mFATMInfoATMReplacProc = mFATMInfoATMReplacProc;
    }

    public String getMFATMInfoOffers() {
        return mFATMInfoOffers;
    }

    public void setMFATMInfoOffers(String mFATMInfoOffers) {
        this.mFATMInfoOffers = mFATMInfoOffers;
    }

    public String getMFATMInfoRestrict() {
        return mFATMInfoRestrict;
    }

    public void setMFATMInfoRestrict(String mFATMInfoRestrict) {
        this.mFATMInfoRestrict = mFATMInfoRestrict;
    }

    public Integer getMFATMInfoIssCharge() {
        return mFATMInfoIssCharge;
    }

    public void setMFATMInfoIssCharge(Integer mFATMInfoIssCharge) {
        this.mFATMInfoIssCharge = mFATMInfoIssCharge;
    }

    public Integer getMFATMInfoWithCharge() {
        return mFATMInfoWithCharge;
    }

    public void setMFATMInfoWithCharge(Integer mFATMInfoWithCharge) {
        this.mFATMInfoWithCharge = mFATMInfoWithCharge;
    }

    public Integer getMFATMInfoDepoCharge() {
        return mFATMInfoDepoCharge;
    }

    public void setMFATMInfoDepoCharge(Integer mFATMInfoDepoCharge) {
        this.mFATMInfoDepoCharge = mFATMInfoDepoCharge;
    }

    public byte[] getMFATMInfoVISAsupp() {
        return mFATMInfoVISAsupp;
    }

    public void setMFATMInfoVISAsupp(byte[] mFATMInfoVISAsupp) {
        this.mFATMInfoVISAsupp = mFATMInfoVISAsupp;
    }

    public String getMFATMInfoAddServ() {
        return mFATMInfoAddServ;
    }

    public void setMFATMInfoAddServ(String mFATMInfoAddServ) {
        this.mFATMInfoAddServ = mFATMInfoAddServ;
    }

    public String getMFATMInfoImg() {
        return mFATMInfoImg;
    }

    public void setMFATMInfoImg(String mFATMInfoImg) {
        this.mFATMInfoImg = mFATMInfoImg;
    }

    public String getMFATMInfoExpePrd() {
        return mFATMInfoExpePrd;
    }

    public void setMFATMInfoExpePrd(String mFATMInfoExpePrd) {
        this.mFATMInfoExpePrd = mFATMInfoExpePrd;
    }

    public String getMFATMInfoAppDur() {
        return mFATMInfoAppDur;
    }

    public void setMFATMInfoAppDur(String mFATMInfoAppDur) {
        this.mFATMInfoAppDur = mFATMInfoAppDur;
    }

    public String getMFATMInfoLctns() {
        return mFATMInfoLctns;
    }

    public void setMFATMInfoLctns(String mFATMInfoLctns) {
        this.mFATMInfoLctns = mFATMInfoLctns;
    }

    public Date getMicroFinATMInfoTime() {
        return microFinATMInfoTime;
    }

    public void setMicroFinATMInfoTime(Date microFinATMInfoTime) {
        this.microFinATMInfoTime = microFinATMInfoTime;
    }

    public String getMicroFinInfoUncollectDest() {
        return microFinInfoUncollectDest;
    }

    public void setMicroFinInfoUncollectDest(String microFinInfoUncollectDest) {
        this.microFinInfoUncollectDest = microFinInfoUncollectDest;
    }

    public Microfinances getMFATMInfoMicroFinId() {
        return mFATMInfoMicroFinId;
    }

    public void setMFATMInfoMicroFinId(Microfinances mFATMInfoMicroFinId) {
        this.mFATMInfoMicroFinId = mFATMInfoMicroFinId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mFATMInfoid != null ? mFATMInfoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Microfinatminfo)) {
            return false;
        }
        Microfinatminfo other = (Microfinatminfo) object;
        if ((this.mFATMInfoid == null && other.mFATMInfoid != null) || (this.mFATMInfoid != null && !this.mFATMInfoid.equals(other.mFATMInfoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Microfinatminfo[ mFATMInfoid=" + mFATMInfoid + " ]";
    }
    
}

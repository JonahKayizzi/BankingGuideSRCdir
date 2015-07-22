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
import javax.persistence.PrimaryKeyJoinColumn;
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
    @NamedQuery(name = "Articles.findAll", query = "SELECT a FROM Articles a"),
    @NamedQuery(name = "Articles.findByArticleId", query = "SELECT a FROM Articles a WHERE a.articleId = :articleId"),
    @NamedQuery(name = "Articles.findByArticleDate", query = "SELECT a FROM Articles a WHERE a.articleDate = :articleDate"),
    @NamedQuery(name = "Articles.findByArticleCategory", query = "SELECT a FROM Articles a WHERE a.articleCategory = :articleCategory"),
    @NamedQuery(name = "Articles.findByArticlePic", query = "SELECT a FROM Articles a WHERE a.articlePic = :articlePic"),
    @NamedQuery(name = "Articles.findByArticleTitle", query = "SELECT a FROM Articles a WHERE a.articleTitle = :articleTitle"),
    @NamedQuery(name = "Articles.findByArticleContent", query = "SELECT a FROM Articles a WHERE a.articleContent = :articleContent"),
    @NamedQuery(name = "Articles.findByArticleTime", query = "SELECT a FROM Articles a WHERE a.articleTime = :articleTime")})
public class Articles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer articleId;
    @Temporal(TemporalType.TIMESTAMP)
    private Date articleDate;
    @Size(max = 45)
    @Column(length = 45)
    private String articleCategory;
    @Size(max = 45)
    @Column(length = 45)
    private String articlePic;
    @Size(max = 45)
    @Column(length = 45)
    private String articleTitle;
    @Size(max = 1000)
    @Column(length = 1000)
    private String articleContent;
    @Temporal(TemporalType.TIMESTAMP)
    private Date articleTime;
    @JoinColumn(name = "ArticlePoster", referencedColumnName = "MonTrnsAgId")
    @ManyToOne
    private Moneytansferagents articlePoster;
    @PrimaryKeyJoinColumn(name = "ArticlePoster", referencedColumnName = "InsCoId")
    @ManyToOne
    private Insurancecos articlePoster1;
    @PrimaryKeyJoinColumn(name = "ArticlePoster", referencedColumnName = "FxBureauId")
    @ManyToOne
    private Forexbureaus articlePoster2;
    @PrimaryKeyJoinColumn(name = "ArticlePoster", referencedColumnName = "MicroFinId")
    @ManyToOne
    private Microfinances articlePoster3;
    @PrimaryKeyJoinColumn(name = "ArticlePoster", referencedColumnName = "BankId")
    @ManyToOne
    private Banks articlePoster4;
    @PrimaryKeyJoinColumn(name = "ArticlePoster", referencedColumnName = "SACCOId")
    @ManyToOne
    private Saccos articlePoster5;
    @PrimaryKeyJoinColumn(name = "ArticlePoster", referencedColumnName = "EditorId")
    @ManyToOne
    private Editors articlePoster6;

    public Articles() {
    }

    public Articles(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Date getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(Date articleDate) {
        this.articleDate = articleDate;
    }

    public String getArticleCategory() {
        return articleCategory;
    }

    public void setArticleCategory(String articleCategory) {
        this.articleCategory = articleCategory;
    }

    public String getArticlePic() {
        return articlePic;
    }

    public void setArticlePic(String articlePic) {
        this.articlePic = articlePic;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public Date getArticleTime() {
        return articleTime;
    }

    public void setArticleTime(Date articleTime) {
        this.articleTime = articleTime;
    }

    public Moneytansferagents getArticlePoster() {
        return articlePoster;
    }

    public void setArticlePoster(Moneytansferagents articlePoster) {
        this.articlePoster = articlePoster;
    }

    public Insurancecos getArticlePoster1() {
        return articlePoster1;
    }

    public void setArticlePoster1(Insurancecos articlePoster1) {
        this.articlePoster1 = articlePoster1;
    }

    public Forexbureaus getArticlePoster2() {
        return articlePoster2;
    }

    public void setArticlePoster2(Forexbureaus articlePoster2) {
        this.articlePoster2 = articlePoster2;
    }

    public Microfinances getArticlePoster3() {
        return articlePoster3;
    }

    public void setArticlePoster3(Microfinances articlePoster3) {
        this.articlePoster3 = articlePoster3;
    }

    public Banks getArticlePoster4() {
        return articlePoster4;
    }

    public void setArticlePoster4(Banks articlePoster4) {
        this.articlePoster4 = articlePoster4;
    }

    public Saccos getArticlePoster5() {
        return articlePoster5;
    }

    public void setArticlePoster5(Saccos articlePoster5) {
        this.articlePoster5 = articlePoster5;
    }

    public Editors getArticlePoster6() {
        return articlePoster6;
    }

    public void setArticlePoster6(Editors articlePoster6) {
        this.articlePoster6 = articlePoster6;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (articleId != null ? articleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Articles)) {
            return false;
        }
        Articles other = (Articles) object;
        if ((this.articleId == null && other.articleId != null) || (this.articleId != null && !this.articleId.equals(other.articleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Articles[ articleId=" + articleId + " ]";
    }
    
}

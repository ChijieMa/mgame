package onight.zjfae.ordbgens.app.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="APP_SHAKE_TIPS")
@AllArgsConstructor
@NoArgsConstructor
public class APPShakeTips extends APPShakeTipsKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_SHAKE_TIPS.TIPS_TITLE
     *
     * @mbggenerated Mon May 09 10:59:33 CST 2016
     */
    private String tipsTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_SHAKE_TIPS.TIPS_CONTENT
     *
     * @mbggenerated Mon May 09 10:59:33 CST 2016
     */
    private String tipsContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_SHAKE_TIPS.TIPS_URL
     *
     * @mbggenerated Mon May 09 10:59:33 CST 2016
     */
    private String tipsUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_SHAKE_TIPS.PLATFORMS
     *
     * @mbggenerated Mon May 09 10:59:33 CST 2016
     */
    private String platforms;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_SHAKE_TIPS.APP_VERS
     *
     * @mbggenerated Mon May 09 10:59:33 CST 2016
     */
    private String appVers;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_SHAKE_TIPS.INSERTTIME
     *
     * @mbggenerated Mon May 09 10:59:33 CST 2016
     */
    private Date inserttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_SHAKE_TIPS.STATUS
     *
     * @mbggenerated Mon May 09 10:59:33 CST 2016
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_SHAKE_TIPS.TIPS_TITLE
     *
     * @return the value of APP_SHAKE_TIPS.TIPS_TITLE
     *
     * @mbggenerated Mon May 09 10:59:33 CST 2016
     */
    public String getTipsTitle() {
        return tipsTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_SHAKE_TIPS.TIPS_TITLE
     *
     * @param tipsTitle the value for APP_SHAKE_TIPS.TIPS_TITLE
     *
     * @mbggenerated Mon May 09 10:59:33 CST 2016
     */
    public void setTipsTitle(String tipsTitle) {
        this.tipsTitle = tipsTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_SHAKE_TIPS.TIPS_CONTENT
     *
     * @return the value of APP_SHAKE_TIPS.TIPS_CONTENT
     *
     * @mbggenerated Mon May 09 10:59:33 CST 2016
     */
    public String getTipsContent() {
        return tipsContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_SHAKE_TIPS.TIPS_CONTENT
     *
     * @param tipsContent the value for APP_SHAKE_TIPS.TIPS_CONTENT
     *
     * @mbggenerated Mon May 09 10:59:33 CST 2016
     */
    public void setTipsContent(String tipsContent) {
        this.tipsContent = tipsContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_SHAKE_TIPS.TIPS_URL
     *
     * @return the value of APP_SHAKE_TIPS.TIPS_URL
     *
     * @mbggenerated Mon May 09 10:59:33 CST 2016
     */
    public String getTipsUrl() {
        return tipsUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_SHAKE_TIPS.TIPS_URL
     *
     * @param tipsUrl the value for APP_SHAKE_TIPS.TIPS_URL
     *
     * @mbggenerated Mon May 09 10:59:33 CST 2016
     */
    public void setTipsUrl(String tipsUrl) {
        this.tipsUrl = tipsUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_SHAKE_TIPS.PLATFORMS
     *
     * @return the value of APP_SHAKE_TIPS.PLATFORMS
     *
     * @mbggenerated Mon May 09 10:59:33 CST 2016
     */
    public String getPlatforms() {
        return platforms;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_SHAKE_TIPS.PLATFORMS
     *
     * @param platforms the value for APP_SHAKE_TIPS.PLATFORMS
     *
     * @mbggenerated Mon May 09 10:59:33 CST 2016
     */
    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_SHAKE_TIPS.APP_VERS
     *
     * @return the value of APP_SHAKE_TIPS.APP_VERS
     *
     * @mbggenerated Mon May 09 10:59:33 CST 2016
     */
    public String getAppVers() {
        return appVers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_SHAKE_TIPS.APP_VERS
     *
     * @param appVers the value for APP_SHAKE_TIPS.APP_VERS
     *
     * @mbggenerated Mon May 09 10:59:33 CST 2016
     */
    public void setAppVers(String appVers) {
        this.appVers = appVers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_SHAKE_TIPS.INSERTTIME
     *
     * @return the value of APP_SHAKE_TIPS.INSERTTIME
     *
     * @mbggenerated Mon May 09 10:59:33 CST 2016
     */
    public Date getInserttime() {
        return inserttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_SHAKE_TIPS.INSERTTIME
     *
     * @param inserttime the value for APP_SHAKE_TIPS.INSERTTIME
     *
     * @mbggenerated Mon May 09 10:59:33 CST 2016
     */
    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_SHAKE_TIPS.STATUS
     *
     * @return the value of APP_SHAKE_TIPS.STATUS
     *
     * @mbggenerated Mon May 09 10:59:33 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_SHAKE_TIPS.STATUS
     *
     * @param status the value for APP_SHAKE_TIPS.STATUS
     *
     * @mbggenerated Mon May 09 10:59:33 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APP_SHAKE_TIPS
     *
     * @mbggenerated Mon May 09 10:59:33 CST 2016
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        APPShakeTips other = (APPShakeTips) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getTipsTitle() == null ? other.getTipsTitle() == null : this.getTipsTitle().equals(other.getTipsTitle()))
            && (this.getTipsContent() == null ? other.getTipsContent() == null : this.getTipsContent().equals(other.getTipsContent()))
            && (this.getTipsUrl() == null ? other.getTipsUrl() == null : this.getTipsUrl().equals(other.getTipsUrl()))
            && (this.getPlatforms() == null ? other.getPlatforms() == null : this.getPlatforms().equals(other.getPlatforms()))
            && (this.getAppVers() == null ? other.getAppVers() == null : this.getAppVers().equals(other.getAppVers()))
            && (this.getInserttime() == null ? other.getInserttime() == null : this.getInserttime().equals(other.getInserttime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APP_SHAKE_TIPS
     *
     * @mbggenerated Mon May 09 10:59:33 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getTipsTitle() == null) ? 0 : getTipsTitle().hashCode());
        result = prime * result + ((getTipsContent() == null) ? 0 : getTipsContent().hashCode());
        result = prime * result + ((getTipsUrl() == null) ? 0 : getTipsUrl().hashCode());
        result = prime * result + ((getPlatforms() == null) ? 0 : getPlatforms().hashCode());
        result = prime * result + ((getAppVers() == null) ? 0 : getAppVers().hashCode());
        result = prime * result + ((getInserttime() == null) ? 0 : getInserttime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APP_SHAKE_TIPS
     *
     * @mbggenerated Mon May 09 10:59:33 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tipsTitle=").append(tipsTitle);
        sb.append(", tipsContent=").append(tipsContent);
        sb.append(", tipsUrl=").append(tipsUrl);
        sb.append(", platforms=").append(platforms);
        sb.append(", appVers=").append(appVers);
        sb.append(", inserttime=").append(inserttime);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}
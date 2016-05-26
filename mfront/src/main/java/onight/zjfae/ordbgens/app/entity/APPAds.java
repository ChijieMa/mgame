package onight.zjfae.ordbgens.app.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="APP_ADS")
@AllArgsConstructor
@NoArgsConstructor
public class APPAds extends APPAdsKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_ADS.FUNC_ICONS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private String funcIcons;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_ADS.ANI_METHOD
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private String aniMethod;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_ADS.ANI_PARAMS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private String aniParams;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_ADS.FUNC_URL
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private String funcUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_ADS.PLATFORMS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private String platforms;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_ADS.APP_VERS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private String appVers;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_ADS.SHOW_TYPE
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private String showType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_ADS.INTERVAL_MIN
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private Integer intervalMin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_ADS.CTRL_IPARAM
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private Integer ctrlIparam;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_ADS.CTRL_STRPARAM
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private String ctrlStrparam;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_ADS.INSERTTIME
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private Date inserttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_ADS.STATUS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_ADS.FUNC_ICONS
     *
     * @return the value of APP_ADS.FUNC_ICONS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public String getFuncIcons() {
        return funcIcons;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_ADS.FUNC_ICONS
     *
     * @param funcIcons the value for APP_ADS.FUNC_ICONS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setFuncIcons(String funcIcons) {
        this.funcIcons = funcIcons;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_ADS.ANI_METHOD
     *
     * @return the value of APP_ADS.ANI_METHOD
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public String getAniMethod() {
        return aniMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_ADS.ANI_METHOD
     *
     * @param aniMethod the value for APP_ADS.ANI_METHOD
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setAniMethod(String aniMethod) {
        this.aniMethod = aniMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_ADS.ANI_PARAMS
     *
     * @return the value of APP_ADS.ANI_PARAMS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public String getAniParams() {
        return aniParams;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_ADS.ANI_PARAMS
     *
     * @param aniParams the value for APP_ADS.ANI_PARAMS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setAniParams(String aniParams) {
        this.aniParams = aniParams;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_ADS.FUNC_URL
     *
     * @return the value of APP_ADS.FUNC_URL
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public String getFuncUrl() {
        return funcUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_ADS.FUNC_URL
     *
     * @param funcUrl the value for APP_ADS.FUNC_URL
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setFuncUrl(String funcUrl) {
        this.funcUrl = funcUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_ADS.PLATFORMS
     *
     * @return the value of APP_ADS.PLATFORMS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public String getPlatforms() {
        return platforms;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_ADS.PLATFORMS
     *
     * @param platforms the value for APP_ADS.PLATFORMS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_ADS.APP_VERS
     *
     * @return the value of APP_ADS.APP_VERS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public String getAppVers() {
        return appVers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_ADS.APP_VERS
     *
     * @param appVers the value for APP_ADS.APP_VERS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setAppVers(String appVers) {
        this.appVers = appVers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_ADS.SHOW_TYPE
     *
     * @return the value of APP_ADS.SHOW_TYPE
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public String getShowType() {
        return showType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_ADS.SHOW_TYPE
     *
     * @param showType the value for APP_ADS.SHOW_TYPE
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setShowType(String showType) {
        this.showType = showType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_ADS.INTERVAL_MIN
     *
     * @return the value of APP_ADS.INTERVAL_MIN
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public Integer getIntervalMin() {
        return intervalMin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_ADS.INTERVAL_MIN
     *
     * @param intervalMin the value for APP_ADS.INTERVAL_MIN
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setIntervalMin(Integer intervalMin) {
        this.intervalMin = intervalMin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_ADS.CTRL_IPARAM
     *
     * @return the value of APP_ADS.CTRL_IPARAM
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public Integer getCtrlIparam() {
        return ctrlIparam;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_ADS.CTRL_IPARAM
     *
     * @param ctrlIparam the value for APP_ADS.CTRL_IPARAM
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setCtrlIparam(Integer ctrlIparam) {
        this.ctrlIparam = ctrlIparam;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_ADS.CTRL_STRPARAM
     *
     * @return the value of APP_ADS.CTRL_STRPARAM
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public String getCtrlStrparam() {
        return ctrlStrparam;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_ADS.CTRL_STRPARAM
     *
     * @param ctrlStrparam the value for APP_ADS.CTRL_STRPARAM
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setCtrlStrparam(String ctrlStrparam) {
        this.ctrlStrparam = ctrlStrparam;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_ADS.INSERTTIME
     *
     * @return the value of APP_ADS.INSERTTIME
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public Date getInserttime() {
        return inserttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_ADS.INSERTTIME
     *
     * @param inserttime the value for APP_ADS.INSERTTIME
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_ADS.STATUS
     *
     * @return the value of APP_ADS.STATUS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_ADS.STATUS
     *
     * @param status the value for APP_ADS.STATUS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APP_ADS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
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
        APPAds other = (APPAds) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getFuncIcons() == null ? other.getFuncIcons() == null : this.getFuncIcons().equals(other.getFuncIcons()))
            && (this.getAniMethod() == null ? other.getAniMethod() == null : this.getAniMethod().equals(other.getAniMethod()))
            && (this.getAniParams() == null ? other.getAniParams() == null : this.getAniParams().equals(other.getAniParams()))
            && (this.getFuncUrl() == null ? other.getFuncUrl() == null : this.getFuncUrl().equals(other.getFuncUrl()))
            && (this.getPlatforms() == null ? other.getPlatforms() == null : this.getPlatforms().equals(other.getPlatforms()))
            && (this.getAppVers() == null ? other.getAppVers() == null : this.getAppVers().equals(other.getAppVers()))
            && (this.getShowType() == null ? other.getShowType() == null : this.getShowType().equals(other.getShowType()))
            && (this.getIntervalMin() == null ? other.getIntervalMin() == null : this.getIntervalMin().equals(other.getIntervalMin()))
            && (this.getCtrlIparam() == null ? other.getCtrlIparam() == null : this.getCtrlIparam().equals(other.getCtrlIparam()))
            && (this.getCtrlStrparam() == null ? other.getCtrlStrparam() == null : this.getCtrlStrparam().equals(other.getCtrlStrparam()))
            && (this.getInserttime() == null ? other.getInserttime() == null : this.getInserttime().equals(other.getInserttime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APP_ADS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getFuncIcons() == null) ? 0 : getFuncIcons().hashCode());
        result = prime * result + ((getAniMethod() == null) ? 0 : getAniMethod().hashCode());
        result = prime * result + ((getAniParams() == null) ? 0 : getAniParams().hashCode());
        result = prime * result + ((getFuncUrl() == null) ? 0 : getFuncUrl().hashCode());
        result = prime * result + ((getPlatforms() == null) ? 0 : getPlatforms().hashCode());
        result = prime * result + ((getAppVers() == null) ? 0 : getAppVers().hashCode());
        result = prime * result + ((getShowType() == null) ? 0 : getShowType().hashCode());
        result = prime * result + ((getIntervalMin() == null) ? 0 : getIntervalMin().hashCode());
        result = prime * result + ((getCtrlIparam() == null) ? 0 : getCtrlIparam().hashCode());
        result = prime * result + ((getCtrlStrparam() == null) ? 0 : getCtrlStrparam().hashCode());
        result = prime * result + ((getInserttime() == null) ? 0 : getInserttime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APP_ADS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", funcIcons=").append(funcIcons);
        sb.append(", aniMethod=").append(aniMethod);
        sb.append(", aniParams=").append(aniParams);
        sb.append(", funcUrl=").append(funcUrl);
        sb.append(", platforms=").append(platforms);
        sb.append(", appVers=").append(appVers);
        sb.append(", showType=").append(showType);
        sb.append(", intervalMin=").append(intervalMin);
        sb.append(", ctrlIparam=").append(ctrlIparam);
        sb.append(", ctrlStrparam=").append(ctrlStrparam);
        sb.append(", inserttime=").append(inserttime);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}
package onight.zjfae.ordbgens.app.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="APP_SYS_JVMS")
@AllArgsConstructor
@NoArgsConstructor
public class APPSysJvms extends APPSysJvmsKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_SYS_JVMS.MANAGER_URL
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private String managerUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_SYS_JVMS.DSC
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private String dsc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_SYS_JVMS.CRT_TIME
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private Date crtTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_SYS_JVMS.LAST_UPTIME
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private Date lastUptime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_SYS_JVMS.STATUS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_SYS_JVMS.FIELD1
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private String field1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_SYS_JVMS.FIELD2
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private String field2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_SYS_JVMS.FIELD3
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private String field3;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_SYS_JVMS.MANAGER_URL
     *
     * @return the value of APP_SYS_JVMS.MANAGER_URL
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public String getManagerUrl() {
        return managerUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_SYS_JVMS.MANAGER_URL
     *
     * @param managerUrl the value for APP_SYS_JVMS.MANAGER_URL
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setManagerUrl(String managerUrl) {
        this.managerUrl = managerUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_SYS_JVMS.DSC
     *
     * @return the value of APP_SYS_JVMS.DSC
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public String getDsc() {
        return dsc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_SYS_JVMS.DSC
     *
     * @param dsc the value for APP_SYS_JVMS.DSC
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setDsc(String dsc) {
        this.dsc = dsc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_SYS_JVMS.CRT_TIME
     *
     * @return the value of APP_SYS_JVMS.CRT_TIME
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public Date getCrtTime() {
        return crtTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_SYS_JVMS.CRT_TIME
     *
     * @param crtTime the value for APP_SYS_JVMS.CRT_TIME
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_SYS_JVMS.LAST_UPTIME
     *
     * @return the value of APP_SYS_JVMS.LAST_UPTIME
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public Date getLastUptime() {
        return lastUptime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_SYS_JVMS.LAST_UPTIME
     *
     * @param lastUptime the value for APP_SYS_JVMS.LAST_UPTIME
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setLastUptime(Date lastUptime) {
        this.lastUptime = lastUptime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_SYS_JVMS.STATUS
     *
     * @return the value of APP_SYS_JVMS.STATUS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_SYS_JVMS.STATUS
     *
     * @param status the value for APP_SYS_JVMS.STATUS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_SYS_JVMS.FIELD1
     *
     * @return the value of APP_SYS_JVMS.FIELD1
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public String getField1() {
        return field1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_SYS_JVMS.FIELD1
     *
     * @param field1 the value for APP_SYS_JVMS.FIELD1
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setField1(String field1) {
        this.field1 = field1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_SYS_JVMS.FIELD2
     *
     * @return the value of APP_SYS_JVMS.FIELD2
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public String getField2() {
        return field2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_SYS_JVMS.FIELD2
     *
     * @param field2 the value for APP_SYS_JVMS.FIELD2
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setField2(String field2) {
        this.field2 = field2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_SYS_JVMS.FIELD3
     *
     * @return the value of APP_SYS_JVMS.FIELD3
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public String getField3() {
        return field3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_SYS_JVMS.FIELD3
     *
     * @param field3 the value for APP_SYS_JVMS.FIELD3
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setField3(String field3) {
        this.field3 = field3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APP_SYS_JVMS
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
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
        APPSysJvms other = (APPSysJvms) that;
        return (this.getMid() == null ? other.getMid() == null : this.getMid().equals(other.getMid()))
            && (this.getManagerUrl() == null ? other.getManagerUrl() == null : this.getManagerUrl().equals(other.getManagerUrl()))
            && (this.getDsc() == null ? other.getDsc() == null : this.getDsc().equals(other.getDsc()))
            && (this.getCrtTime() == null ? other.getCrtTime() == null : this.getCrtTime().equals(other.getCrtTime()))
            && (this.getLastUptime() == null ? other.getLastUptime() == null : this.getLastUptime().equals(other.getLastUptime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getField1() == null ? other.getField1() == null : this.getField1().equals(other.getField1()))
            && (this.getField2() == null ? other.getField2() == null : this.getField2().equals(other.getField2()))
            && (this.getField3() == null ? other.getField3() == null : this.getField3().equals(other.getField3()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APP_SYS_JVMS
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMid() == null) ? 0 : getMid().hashCode());
        result = prime * result + ((getManagerUrl() == null) ? 0 : getManagerUrl().hashCode());
        result = prime * result + ((getDsc() == null) ? 0 : getDsc().hashCode());
        result = prime * result + ((getCrtTime() == null) ? 0 : getCrtTime().hashCode());
        result = prime * result + ((getLastUptime() == null) ? 0 : getLastUptime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getField1() == null) ? 0 : getField1().hashCode());
        result = prime * result + ((getField2() == null) ? 0 : getField2().hashCode());
        result = prime * result + ((getField3() == null) ? 0 : getField3().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APP_SYS_JVMS
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", managerUrl=").append(managerUrl);
        sb.append(", dsc=").append(dsc);
        sb.append(", crtTime=").append(crtTime);
        sb.append(", lastUptime=").append(lastUptime);
        sb.append(", status=").append(status);
        sb.append(", field1=").append(field1);
        sb.append(", field2=").append(field2);
        sb.append(", field3=").append(field3);
        sb.append("]");
        return sb.toString();
    }
}
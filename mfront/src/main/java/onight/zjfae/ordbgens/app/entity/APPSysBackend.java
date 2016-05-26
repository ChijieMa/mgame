package onight.zjfae.ordbgens.app.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="APP_SYS_BACKEND")
@AllArgsConstructor
@NoArgsConstructor
public class APPSysBackend extends APPSysBackendKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_SYS_BACKEND.FACE_CODE
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private String faceCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_SYS_BACKEND.FACE_NAME
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private String faceName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_SYS_BACKEND.FRONT_URL
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private String frontUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_SYS_BACKEND.BACKEDN_URL
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private String backednUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_SYS_BACKEND.STATUS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_SYS_BACKEND.OPERATOR_ID
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private String operatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_SYS_BACKEND.FACE_VERSIONS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private String faceVersions;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_SYS_BACKEND.COMMENTS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private String comments;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_SYS_BACKEND.INSERTTIME
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private Date inserttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_SYS_BACKEND.UPDATETIME
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    private Date updatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_SYS_BACKEND.FACE_CODE
     *
     * @return the value of APP_SYS_BACKEND.FACE_CODE
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public String getFaceCode() {
        return faceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_SYS_BACKEND.FACE_CODE
     *
     * @param faceCode the value for APP_SYS_BACKEND.FACE_CODE
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setFaceCode(String faceCode) {
        this.faceCode = faceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_SYS_BACKEND.FACE_NAME
     *
     * @return the value of APP_SYS_BACKEND.FACE_NAME
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public String getFaceName() {
        return faceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_SYS_BACKEND.FACE_NAME
     *
     * @param faceName the value for APP_SYS_BACKEND.FACE_NAME
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setFaceName(String faceName) {
        this.faceName = faceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_SYS_BACKEND.FRONT_URL
     *
     * @return the value of APP_SYS_BACKEND.FRONT_URL
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public String getFrontUrl() {
        return frontUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_SYS_BACKEND.FRONT_URL
     *
     * @param frontUrl the value for APP_SYS_BACKEND.FRONT_URL
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setFrontUrl(String frontUrl) {
        this.frontUrl = frontUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_SYS_BACKEND.BACKEDN_URL
     *
     * @return the value of APP_SYS_BACKEND.BACKEDN_URL
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public String getBackednUrl() {
        return backednUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_SYS_BACKEND.BACKEDN_URL
     *
     * @param backednUrl the value for APP_SYS_BACKEND.BACKEDN_URL
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setBackednUrl(String backednUrl) {
        this.backednUrl = backednUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_SYS_BACKEND.STATUS
     *
     * @return the value of APP_SYS_BACKEND.STATUS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_SYS_BACKEND.STATUS
     *
     * @param status the value for APP_SYS_BACKEND.STATUS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_SYS_BACKEND.OPERATOR_ID
     *
     * @return the value of APP_SYS_BACKEND.OPERATOR_ID
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_SYS_BACKEND.OPERATOR_ID
     *
     * @param operatorId the value for APP_SYS_BACKEND.OPERATOR_ID
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_SYS_BACKEND.FACE_VERSIONS
     *
     * @return the value of APP_SYS_BACKEND.FACE_VERSIONS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public String getFaceVersions() {
        return faceVersions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_SYS_BACKEND.FACE_VERSIONS
     *
     * @param faceVersions the value for APP_SYS_BACKEND.FACE_VERSIONS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setFaceVersions(String faceVersions) {
        this.faceVersions = faceVersions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_SYS_BACKEND.COMMENTS
     *
     * @return the value of APP_SYS_BACKEND.COMMENTS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public String getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_SYS_BACKEND.COMMENTS
     *
     * @param comments the value for APP_SYS_BACKEND.COMMENTS
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_SYS_BACKEND.INSERTTIME
     *
     * @return the value of APP_SYS_BACKEND.INSERTTIME
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public Date getInserttime() {
        return inserttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_SYS_BACKEND.INSERTTIME
     *
     * @param inserttime the value for APP_SYS_BACKEND.INSERTTIME
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_SYS_BACKEND.UPDATETIME
     *
     * @return the value of APP_SYS_BACKEND.UPDATETIME
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_SYS_BACKEND.UPDATETIME
     *
     * @param updatetime the value for APP_SYS_BACKEND.UPDATETIME
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APP_SYS_BACKEND
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
        APPSysBackend other = (APPSysBackend) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getFaceCode() == null ? other.getFaceCode() == null : this.getFaceCode().equals(other.getFaceCode()))
            && (this.getFaceName() == null ? other.getFaceName() == null : this.getFaceName().equals(other.getFaceName()))
            && (this.getFrontUrl() == null ? other.getFrontUrl() == null : this.getFrontUrl().equals(other.getFrontUrl()))
            && (this.getBackednUrl() == null ? other.getBackednUrl() == null : this.getBackednUrl().equals(other.getBackednUrl()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getOperatorId() == null ? other.getOperatorId() == null : this.getOperatorId().equals(other.getOperatorId()))
            && (this.getFaceVersions() == null ? other.getFaceVersions() == null : this.getFaceVersions().equals(other.getFaceVersions()))
            && (this.getComments() == null ? other.getComments() == null : this.getComments().equals(other.getComments()))
            && (this.getInserttime() == null ? other.getInserttime() == null : this.getInserttime().equals(other.getInserttime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APP_SYS_BACKEND
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getFaceCode() == null) ? 0 : getFaceCode().hashCode());
        result = prime * result + ((getFaceName() == null) ? 0 : getFaceName().hashCode());
        result = prime * result + ((getFrontUrl() == null) ? 0 : getFrontUrl().hashCode());
        result = prime * result + ((getBackednUrl() == null) ? 0 : getBackednUrl().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getOperatorId() == null) ? 0 : getOperatorId().hashCode());
        result = prime * result + ((getFaceVersions() == null) ? 0 : getFaceVersions().hashCode());
        result = prime * result + ((getComments() == null) ? 0 : getComments().hashCode());
        result = prime * result + ((getInserttime() == null) ? 0 : getInserttime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APP_SYS_BACKEND
     *
     * @mbggenerated Thu May 26 19:21:31 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", faceCode=").append(faceCode);
        sb.append(", faceName=").append(faceName);
        sb.append(", frontUrl=").append(frontUrl);
        sb.append(", backednUrl=").append(backednUrl);
        sb.append(", status=").append(status);
        sb.append(", operatorId=").append(operatorId);
        sb.append(", faceVersions=").append(faceVersions);
        sb.append(", comments=").append(comments);
        sb.append(", inserttime=").append(inserttime);
        sb.append(", updatetime=").append(updatetime);
        sb.append("]");
        return sb.toString();
    }
}
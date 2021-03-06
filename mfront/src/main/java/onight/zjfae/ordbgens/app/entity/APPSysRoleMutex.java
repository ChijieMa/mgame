package onight.zjfae.ordbgens.app.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="APP_SYS_ROLE_MUTEX")
@AllArgsConstructor
@NoArgsConstructor
public class APPSysRoleMutex extends APPSysRoleMutexKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_SYS_ROLE_MUTEX.ROLE_ID_A
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
     */
    private String roleIdA;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_SYS_ROLE_MUTEX.ROLE_ID_B
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
     */
    private String roleIdB;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APP_SYS_ROLE_MUTEX.STATUS
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_SYS_ROLE_MUTEX.ROLE_ID_A
     *
     * @return the value of APP_SYS_ROLE_MUTEX.ROLE_ID_A
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
     */
    public String getRoleIdA() {
        return roleIdA;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_SYS_ROLE_MUTEX.ROLE_ID_A
     *
     * @param roleIdA the value for APP_SYS_ROLE_MUTEX.ROLE_ID_A
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
     */
    public void setRoleIdA(String roleIdA) {
        this.roleIdA = roleIdA;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_SYS_ROLE_MUTEX.ROLE_ID_B
     *
     * @return the value of APP_SYS_ROLE_MUTEX.ROLE_ID_B
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
     */
    public String getRoleIdB() {
        return roleIdB;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_SYS_ROLE_MUTEX.ROLE_ID_B
     *
     * @param roleIdB the value for APP_SYS_ROLE_MUTEX.ROLE_ID_B
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
     */
    public void setRoleIdB(String roleIdB) {
        this.roleIdB = roleIdB;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_SYS_ROLE_MUTEX.STATUS
     *
     * @return the value of APP_SYS_ROLE_MUTEX.STATUS
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_SYS_ROLE_MUTEX.STATUS
     *
     * @param status the value for APP_SYS_ROLE_MUTEX.STATUS
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APP_SYS_ROLE_MUTEX
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
        APPSysRoleMutex other = (APPSysRoleMutex) that;
        return (this.getRoleMutexId() == null ? other.getRoleMutexId() == null : this.getRoleMutexId().equals(other.getRoleMutexId()))
            && (this.getRoleIdA() == null ? other.getRoleIdA() == null : this.getRoleIdA().equals(other.getRoleIdA()))
            && (this.getRoleIdB() == null ? other.getRoleIdB() == null : this.getRoleIdB().equals(other.getRoleIdB()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APP_SYS_ROLE_MUTEX
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoleMutexId() == null) ? 0 : getRoleMutexId().hashCode());
        result = prime * result + ((getRoleIdA() == null) ? 0 : getRoleIdA().hashCode());
        result = prime * result + ((getRoleIdB() == null) ? 0 : getRoleIdB().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APP_SYS_ROLE_MUTEX
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleIdA=").append(roleIdA);
        sb.append(", roleIdB=").append(roleIdB);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}
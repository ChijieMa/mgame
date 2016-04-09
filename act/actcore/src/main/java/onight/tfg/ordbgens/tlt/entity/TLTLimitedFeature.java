package onight.tfg.ordbgens.tlt.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="TLT_LIMITED_FEATURE")
@AllArgsConstructor
@NoArgsConstructor
public class TLTLimitedFeature extends TLTLimitedFeatureKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LIMITED_FEATURE.ISSUE_NO
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    private String issueNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LIMITED_FEATURE.PLAY_TYPE
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    private String playType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LIMITED_FEATURE.WAGERDATA
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    private String wagerdata;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LIMITED_FEATURE.CREATEDATE
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    private Long createdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LIMITED_FEATURE.REGION
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    private String region;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LIMITED_FEATURE.LTYPE
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    private String ltype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LIMITED_FEATURE.BONUS_LIMIT
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    private BigDecimal bonusLimit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LIMITED_FEATURE.BETS_BOARDS_LIMIT
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    private Long betsBoardsLimit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LIMITED_FEATURE.BETS_AMOUNT_LIMIT
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    private Long betsAmountLimit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LIMITED_FEATURE.MERCHATID
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    private String merchatid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LIMITED_FEATURE.USER_ID
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LIMITED_FEATURE.LIMIT_TYPE
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    private String limitType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LIMITED_FEATURE.START_DATE
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    private Date startDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LIMITED_FEATURE.EXTRAFIELD1
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    private String extrafield1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LIMITED_FEATURE.EXTRAFIELD2
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    private String extrafield2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LIMITED_FEATURE.EXTRAFIELD3
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    private Integer extrafield3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LIMITED_FEATURE.EXTRAFIELD4
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    private BigDecimal extrafield4;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LIMITED_FEATURE.EXTRAFIELD5
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    private Long extrafield5;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LIMITED_FEATURE.ISSUE_NO
     *
     * @return the value of TLT_LIMITED_FEATURE.ISSUE_NO
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public String getIssueNo() {
        return issueNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LIMITED_FEATURE.ISSUE_NO
     *
     * @param issueNo the value for TLT_LIMITED_FEATURE.ISSUE_NO
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public void setIssueNo(String issueNo) {
        this.issueNo = issueNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LIMITED_FEATURE.PLAY_TYPE
     *
     * @return the value of TLT_LIMITED_FEATURE.PLAY_TYPE
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public String getPlayType() {
        return playType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LIMITED_FEATURE.PLAY_TYPE
     *
     * @param playType the value for TLT_LIMITED_FEATURE.PLAY_TYPE
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public void setPlayType(String playType) {
        this.playType = playType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LIMITED_FEATURE.WAGERDATA
     *
     * @return the value of TLT_LIMITED_FEATURE.WAGERDATA
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public String getWagerdata() {
        return wagerdata;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LIMITED_FEATURE.WAGERDATA
     *
     * @param wagerdata the value for TLT_LIMITED_FEATURE.WAGERDATA
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public void setWagerdata(String wagerdata) {
        this.wagerdata = wagerdata;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LIMITED_FEATURE.CREATEDATE
     *
     * @return the value of TLT_LIMITED_FEATURE.CREATEDATE
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public Long getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LIMITED_FEATURE.CREATEDATE
     *
     * @param createdate the value for TLT_LIMITED_FEATURE.CREATEDATE
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public void setCreatedate(Long createdate) {
        this.createdate = createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LIMITED_FEATURE.REGION
     *
     * @return the value of TLT_LIMITED_FEATURE.REGION
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public String getRegion() {
        return region;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LIMITED_FEATURE.REGION
     *
     * @param region the value for TLT_LIMITED_FEATURE.REGION
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LIMITED_FEATURE.LTYPE
     *
     * @return the value of TLT_LIMITED_FEATURE.LTYPE
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public String getLtype() {
        return ltype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LIMITED_FEATURE.LTYPE
     *
     * @param ltype the value for TLT_LIMITED_FEATURE.LTYPE
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public void setLtype(String ltype) {
        this.ltype = ltype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LIMITED_FEATURE.BONUS_LIMIT
     *
     * @return the value of TLT_LIMITED_FEATURE.BONUS_LIMIT
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public BigDecimal getBonusLimit() {
        return bonusLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LIMITED_FEATURE.BONUS_LIMIT
     *
     * @param bonusLimit the value for TLT_LIMITED_FEATURE.BONUS_LIMIT
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public void setBonusLimit(BigDecimal bonusLimit) {
        this.bonusLimit = bonusLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LIMITED_FEATURE.BETS_BOARDS_LIMIT
     *
     * @return the value of TLT_LIMITED_FEATURE.BETS_BOARDS_LIMIT
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public Long getBetsBoardsLimit() {
        return betsBoardsLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LIMITED_FEATURE.BETS_BOARDS_LIMIT
     *
     * @param betsBoardsLimit the value for TLT_LIMITED_FEATURE.BETS_BOARDS_LIMIT
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public void setBetsBoardsLimit(Long betsBoardsLimit) {
        this.betsBoardsLimit = betsBoardsLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LIMITED_FEATURE.BETS_AMOUNT_LIMIT
     *
     * @return the value of TLT_LIMITED_FEATURE.BETS_AMOUNT_LIMIT
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public Long getBetsAmountLimit() {
        return betsAmountLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LIMITED_FEATURE.BETS_AMOUNT_LIMIT
     *
     * @param betsAmountLimit the value for TLT_LIMITED_FEATURE.BETS_AMOUNT_LIMIT
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public void setBetsAmountLimit(Long betsAmountLimit) {
        this.betsAmountLimit = betsAmountLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LIMITED_FEATURE.MERCHATID
     *
     * @return the value of TLT_LIMITED_FEATURE.MERCHATID
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public String getMerchatid() {
        return merchatid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LIMITED_FEATURE.MERCHATID
     *
     * @param merchatid the value for TLT_LIMITED_FEATURE.MERCHATID
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public void setMerchatid(String merchatid) {
        this.merchatid = merchatid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LIMITED_FEATURE.USER_ID
     *
     * @return the value of TLT_LIMITED_FEATURE.USER_ID
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LIMITED_FEATURE.USER_ID
     *
     * @param userId the value for TLT_LIMITED_FEATURE.USER_ID
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LIMITED_FEATURE.LIMIT_TYPE
     *
     * @return the value of TLT_LIMITED_FEATURE.LIMIT_TYPE
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public String getLimitType() {
        return limitType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LIMITED_FEATURE.LIMIT_TYPE
     *
     * @param limitType the value for TLT_LIMITED_FEATURE.LIMIT_TYPE
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public void setLimitType(String limitType) {
        this.limitType = limitType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LIMITED_FEATURE.START_DATE
     *
     * @return the value of TLT_LIMITED_FEATURE.START_DATE
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LIMITED_FEATURE.START_DATE
     *
     * @param startDate the value for TLT_LIMITED_FEATURE.START_DATE
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LIMITED_FEATURE.EXTRAFIELD1
     *
     * @return the value of TLT_LIMITED_FEATURE.EXTRAFIELD1
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public String getExtrafield1() {
        return extrafield1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LIMITED_FEATURE.EXTRAFIELD1
     *
     * @param extrafield1 the value for TLT_LIMITED_FEATURE.EXTRAFIELD1
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public void setExtrafield1(String extrafield1) {
        this.extrafield1 = extrafield1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LIMITED_FEATURE.EXTRAFIELD2
     *
     * @return the value of TLT_LIMITED_FEATURE.EXTRAFIELD2
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public String getExtrafield2() {
        return extrafield2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LIMITED_FEATURE.EXTRAFIELD2
     *
     * @param extrafield2 the value for TLT_LIMITED_FEATURE.EXTRAFIELD2
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public void setExtrafield2(String extrafield2) {
        this.extrafield2 = extrafield2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LIMITED_FEATURE.EXTRAFIELD3
     *
     * @return the value of TLT_LIMITED_FEATURE.EXTRAFIELD3
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public Integer getExtrafield3() {
        return extrafield3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LIMITED_FEATURE.EXTRAFIELD3
     *
     * @param extrafield3 the value for TLT_LIMITED_FEATURE.EXTRAFIELD3
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public void setExtrafield3(Integer extrafield3) {
        this.extrafield3 = extrafield3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LIMITED_FEATURE.EXTRAFIELD4
     *
     * @return the value of TLT_LIMITED_FEATURE.EXTRAFIELD4
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public BigDecimal getExtrafield4() {
        return extrafield4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LIMITED_FEATURE.EXTRAFIELD4
     *
     * @param extrafield4 the value for TLT_LIMITED_FEATURE.EXTRAFIELD4
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public void setExtrafield4(BigDecimal extrafield4) {
        this.extrafield4 = extrafield4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LIMITED_FEATURE.EXTRAFIELD5
     *
     * @return the value of TLT_LIMITED_FEATURE.EXTRAFIELD5
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public Long getExtrafield5() {
        return extrafield5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LIMITED_FEATURE.EXTRAFIELD5
     *
     * @param extrafield5 the value for TLT_LIMITED_FEATURE.EXTRAFIELD5
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    public void setExtrafield5(Long extrafield5) {
        this.extrafield5 = extrafield5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_LIMITED_FEATURE
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
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
        TLTLimitedFeature other = (TLTLimitedFeature) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getIssueNo() == null ? other.getIssueNo() == null : this.getIssueNo().equals(other.getIssueNo()))
            && (this.getPlayType() == null ? other.getPlayType() == null : this.getPlayType().equals(other.getPlayType()))
            && (this.getWagerdata() == null ? other.getWagerdata() == null : this.getWagerdata().equals(other.getWagerdata()))
            && (this.getCreatedate() == null ? other.getCreatedate() == null : this.getCreatedate().equals(other.getCreatedate()))
            && (this.getRegion() == null ? other.getRegion() == null : this.getRegion().equals(other.getRegion()))
            && (this.getLtype() == null ? other.getLtype() == null : this.getLtype().equals(other.getLtype()))
            && (this.getBonusLimit() == null ? other.getBonusLimit() == null : this.getBonusLimit().equals(other.getBonusLimit()))
            && (this.getBetsBoardsLimit() == null ? other.getBetsBoardsLimit() == null : this.getBetsBoardsLimit().equals(other.getBetsBoardsLimit()))
            && (this.getBetsAmountLimit() == null ? other.getBetsAmountLimit() == null : this.getBetsAmountLimit().equals(other.getBetsAmountLimit()))
            && (this.getMerchatid() == null ? other.getMerchatid() == null : this.getMerchatid().equals(other.getMerchatid()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getLimitType() == null ? other.getLimitType() == null : this.getLimitType().equals(other.getLimitType()))
            && (this.getStartDate() == null ? other.getStartDate() == null : this.getStartDate().equals(other.getStartDate()))
            && (this.getExtrafield1() == null ? other.getExtrafield1() == null : this.getExtrafield1().equals(other.getExtrafield1()))
            && (this.getExtrafield2() == null ? other.getExtrafield2() == null : this.getExtrafield2().equals(other.getExtrafield2()))
            && (this.getExtrafield3() == null ? other.getExtrafield3() == null : this.getExtrafield3().equals(other.getExtrafield3()))
            && (this.getExtrafield4() == null ? other.getExtrafield4() == null : this.getExtrafield4().equals(other.getExtrafield4()))
            && (this.getExtrafield5() == null ? other.getExtrafield5() == null : this.getExtrafield5().equals(other.getExtrafield5()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_LIMITED_FEATURE
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getIssueNo() == null) ? 0 : getIssueNo().hashCode());
        result = prime * result + ((getPlayType() == null) ? 0 : getPlayType().hashCode());
        result = prime * result + ((getWagerdata() == null) ? 0 : getWagerdata().hashCode());
        result = prime * result + ((getCreatedate() == null) ? 0 : getCreatedate().hashCode());
        result = prime * result + ((getRegion() == null) ? 0 : getRegion().hashCode());
        result = prime * result + ((getLtype() == null) ? 0 : getLtype().hashCode());
        result = prime * result + ((getBonusLimit() == null) ? 0 : getBonusLimit().hashCode());
        result = prime * result + ((getBetsBoardsLimit() == null) ? 0 : getBetsBoardsLimit().hashCode());
        result = prime * result + ((getBetsAmountLimit() == null) ? 0 : getBetsAmountLimit().hashCode());
        result = prime * result + ((getMerchatid() == null) ? 0 : getMerchatid().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getLimitType() == null) ? 0 : getLimitType().hashCode());
        result = prime * result + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        result = prime * result + ((getExtrafield1() == null) ? 0 : getExtrafield1().hashCode());
        result = prime * result + ((getExtrafield2() == null) ? 0 : getExtrafield2().hashCode());
        result = prime * result + ((getExtrafield3() == null) ? 0 : getExtrafield3().hashCode());
        result = prime * result + ((getExtrafield4() == null) ? 0 : getExtrafield4().hashCode());
        result = prime * result + ((getExtrafield5() == null) ? 0 : getExtrafield5().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_LIMITED_FEATURE
     *
     * @mbggenerated Thu Apr 07 21:59:26 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", issueNo=").append(issueNo);
        sb.append(", playType=").append(playType);
        sb.append(", wagerdata=").append(wagerdata);
        sb.append(", createdate=").append(createdate);
        sb.append(", region=").append(region);
        sb.append(", ltype=").append(ltype);
        sb.append(", bonusLimit=").append(bonusLimit);
        sb.append(", betsBoardsLimit=").append(betsBoardsLimit);
        sb.append(", betsAmountLimit=").append(betsAmountLimit);
        sb.append(", merchatid=").append(merchatid);
        sb.append(", userId=").append(userId);
        sb.append(", limitType=").append(limitType);
        sb.append(", startDate=").append(startDate);
        sb.append(", extrafield1=").append(extrafield1);
        sb.append(", extrafield2=").append(extrafield2);
        sb.append(", extrafield3=").append(extrafield3);
        sb.append(", extrafield4=").append(extrafield4);
        sb.append(", extrafield5=").append(extrafield5);
        sb.append("]");
        return sb.toString();
    }
}
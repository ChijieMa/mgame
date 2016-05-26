package onight.zjfae.ordbgens.app.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class APPUrlParamsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table APP_URL_PARAMS
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table APP_URL_PARAMS
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table APP_URL_PARAMS
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
     */
    protected List<Criteria> oredCriteria;

    protected int offset;

    protected int limit;

    protected String sumCol;

    protected String groupSelClause;

    protected boolean forUpdate;

    protected String groupByClause;

    String selectCols;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APP_URL_PARAMS
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
     */
    public APPUrlParamsExample() {
        oredCriteria = new ArrayList<Criteria>();
        offset = 0;
        limit = Integer.MAX_VALUE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APP_URL_PARAMS
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APP_URL_PARAMS
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APP_URL_PARAMS
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APP_URL_PARAMS
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APP_URL_PARAMS
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APP_URL_PARAMS
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APP_URL_PARAMS
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APP_URL_PARAMS
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APP_URL_PARAMS
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APP_URL_PARAMS
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
        this.offset= 0;
        this.limit= Integer.MAX_VALUE;
        this.sumCol=null;
        this.groupSelClause=null;
        this.groupByClause=null;
        this.forUpdate=false;
    }

    public void setOffset(int offset) {
         this.offset = offset;
    }

    public int getOffset() {
          return offset;
    }

    public void setLimit(int limit) {
         this.limit = limit;
    }

    public int getLimit() {
          return limit;
    }

    public void setSumCol(String sumCol) {
         this.sumCol = sumCol;
    }

    public String getSumCol() {
          return sumCol;
    }

    public void setGroupSelClause(String groupSelClause) {
         this.groupSelClause = groupSelClause;
    }

    public String getGroupSelClause() {
          return groupSelClause;
    }

    public void setForUpdate(boolean forUpdate) {
         this.forUpdate = forUpdate;
    }

    public boolean isForUpdate() {
          return forUpdate;
    }

    public void setGroupByClause(String groupByClause) {
         this.groupByClause = groupByClause;
    }

    public String getGroupByClause() {
          return groupByClause;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table APP_URL_PARAMS
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
     */
    @Data
    public abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        public GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        public void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        public void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        public void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUuidIsNull() {
            addCriterion("UUID is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("UUID is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("UUID =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("UUID <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("UUID >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("UUID >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("UUID <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("UUID <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("UUID like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("UUID not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("UUID in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("UUID not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("UUID between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("UUID not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andKeyNoIsNull() {
            addCriterion("KEY_NO is null");
            return (Criteria) this;
        }

        public Criteria andKeyNoIsNotNull() {
            addCriterion("KEY_NO is not null");
            return (Criteria) this;
        }

        public Criteria andKeyNoEqualTo(String value) {
            addCriterion("KEY_NO =", value, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoNotEqualTo(String value) {
            addCriterion("KEY_NO <>", value, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoGreaterThan(String value) {
            addCriterion("KEY_NO >", value, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoGreaterThanOrEqualTo(String value) {
            addCriterion("KEY_NO >=", value, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoLessThan(String value) {
            addCriterion("KEY_NO <", value, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoLessThanOrEqualTo(String value) {
            addCriterion("KEY_NO <=", value, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoLike(String value) {
            addCriterion("KEY_NO like", value, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoNotLike(String value) {
            addCriterion("KEY_NO not like", value, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoIn(List<String> values) {
            addCriterion("KEY_NO in", values, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoNotIn(List<String> values) {
            addCriterion("KEY_NO not in", values, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoBetween(String value1, String value2) {
            addCriterion("KEY_NO between", value1, value2, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoNotBetween(String value1, String value2) {
            addCriterion("KEY_NO not between", value1, value2, "keyNo");
            return (Criteria) this;
        }

        public Criteria andBackendUrlIsNull() {
            addCriterion("BACKEND_URL is null");
            return (Criteria) this;
        }

        public Criteria andBackendUrlIsNotNull() {
            addCriterion("BACKEND_URL is not null");
            return (Criteria) this;
        }

        public Criteria andBackendUrlEqualTo(String value) {
            addCriterion("BACKEND_URL =", value, "backendUrl");
            return (Criteria) this;
        }

        public Criteria andBackendUrlNotEqualTo(String value) {
            addCriterion("BACKEND_URL <>", value, "backendUrl");
            return (Criteria) this;
        }

        public Criteria andBackendUrlGreaterThan(String value) {
            addCriterion("BACKEND_URL >", value, "backendUrl");
            return (Criteria) this;
        }

        public Criteria andBackendUrlGreaterThanOrEqualTo(String value) {
            addCriterion("BACKEND_URL >=", value, "backendUrl");
            return (Criteria) this;
        }

        public Criteria andBackendUrlLessThan(String value) {
            addCriterion("BACKEND_URL <", value, "backendUrl");
            return (Criteria) this;
        }

        public Criteria andBackendUrlLessThanOrEqualTo(String value) {
            addCriterion("BACKEND_URL <=", value, "backendUrl");
            return (Criteria) this;
        }

        public Criteria andBackendUrlLike(String value) {
            addCriterion("BACKEND_URL like", value, "backendUrl");
            return (Criteria) this;
        }

        public Criteria andBackendUrlNotLike(String value) {
            addCriterion("BACKEND_URL not like", value, "backendUrl");
            return (Criteria) this;
        }

        public Criteria andBackendUrlIn(List<String> values) {
            addCriterion("BACKEND_URL in", values, "backendUrl");
            return (Criteria) this;
        }

        public Criteria andBackendUrlNotIn(List<String> values) {
            addCriterion("BACKEND_URL not in", values, "backendUrl");
            return (Criteria) this;
        }

        public Criteria andBackendUrlBetween(String value1, String value2) {
            addCriterion("BACKEND_URL between", value1, value2, "backendUrl");
            return (Criteria) this;
        }

        public Criteria andBackendUrlNotBetween(String value1, String value2) {
            addCriterion("BACKEND_URL not between", value1, value2, "backendUrl");
            return (Criteria) this;
        }

        public Criteria andDeatailsIsNull() {
            addCriterion("DEATAILS is null");
            return (Criteria) this;
        }

        public Criteria andDeatailsIsNotNull() {
            addCriterion("DEATAILS is not null");
            return (Criteria) this;
        }

        public Criteria andDeatailsEqualTo(String value) {
            addCriterion("DEATAILS =", value, "deatails");
            return (Criteria) this;
        }

        public Criteria andDeatailsNotEqualTo(String value) {
            addCriterion("DEATAILS <>", value, "deatails");
            return (Criteria) this;
        }

        public Criteria andDeatailsGreaterThan(String value) {
            addCriterion("DEATAILS >", value, "deatails");
            return (Criteria) this;
        }

        public Criteria andDeatailsGreaterThanOrEqualTo(String value) {
            addCriterion("DEATAILS >=", value, "deatails");
            return (Criteria) this;
        }

        public Criteria andDeatailsLessThan(String value) {
            addCriterion("DEATAILS <", value, "deatails");
            return (Criteria) this;
        }

        public Criteria andDeatailsLessThanOrEqualTo(String value) {
            addCriterion("DEATAILS <=", value, "deatails");
            return (Criteria) this;
        }

        public Criteria andDeatailsLike(String value) {
            addCriterion("DEATAILS like", value, "deatails");
            return (Criteria) this;
        }

        public Criteria andDeatailsNotLike(String value) {
            addCriterion("DEATAILS not like", value, "deatails");
            return (Criteria) this;
        }

        public Criteria andDeatailsIn(List<String> values) {
            addCriterion("DEATAILS in", values, "deatails");
            return (Criteria) this;
        }

        public Criteria andDeatailsNotIn(List<String> values) {
            addCriterion("DEATAILS not in", values, "deatails");
            return (Criteria) this;
        }

        public Criteria andDeatailsBetween(String value1, String value2) {
            addCriterion("DEATAILS between", value1, value2, "deatails");
            return (Criteria) this;
        }

        public Criteria andDeatailsNotBetween(String value1, String value2) {
            addCriterion("DEATAILS not between", value1, value2, "deatails");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andInserttimeIsNull() {
            addCriterion("INSERTTIME is null");
            return (Criteria) this;
        }

        public Criteria andInserttimeIsNotNull() {
            addCriterion("INSERTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andInserttimeEqualTo(Date value) {
            addCriterion("INSERTTIME =", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeNotEqualTo(Date value) {
            addCriterion("INSERTTIME <>", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeGreaterThan(Date value) {
            addCriterion("INSERTTIME >", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("INSERTTIME >=", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeLessThan(Date value) {
            addCriterion("INSERTTIME <", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeLessThanOrEqualTo(Date value) {
            addCriterion("INSERTTIME <=", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeIn(List<Date> values) {
            addCriterion("INSERTTIME in", values, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeNotIn(List<Date> values) {
            addCriterion("INSERTTIME not in", values, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeBetween(Date value1, Date value2) {
            addCriterion("INSERTTIME between", value1, value2, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeNotBetween(Date value1, Date value2) {
            addCriterion("INSERTTIME not between", value1, value2, "inserttime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUuidLikeInsensitive(String value) {
            addCriterion("upper(UUID) like", value.toUpperCase(), "uuid");
            return (Criteria) this;
        }

        public Criteria andKeyNoLikeInsensitive(String value) {
            addCriterion("upper(KEY_NO) like", value.toUpperCase(), "keyNo");
            return (Criteria) this;
        }

        public Criteria andBackendUrlLikeInsensitive(String value) {
            addCriterion("upper(BACKEND_URL) like", value.toUpperCase(), "backendUrl");
            return (Criteria) this;
        }

        public Criteria andDeatailsLikeInsensitive(String value) {
            addCriterion("upper(DEATAILS) like", value.toUpperCase(), "deatails");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table APP_URL_PARAMS
     *
     * @mbggenerated do_not_delete_during_merge Thu May 26 19:21:32 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        public Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table APP_URL_PARAMS
     *
     * @mbggenerated Thu May 26 19:21:32 CST 2016
     */
    @Data
    @NoArgsConstructor
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        public Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        public Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        public Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        public Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        public Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
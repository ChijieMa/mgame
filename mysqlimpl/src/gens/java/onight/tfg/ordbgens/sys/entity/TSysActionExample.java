package onight.tfg.ordbgens.sys.entity;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class TSysActionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Wed Dec 16 19:48:41 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Wed Dec 16 19:48:41 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Wed Dec 16 19:48:41 CST 2015
     */
    protected List<Criteria> oredCriteria;

    protected int offset;

    protected int limit;

    protected String sumCol;

    protected String groupSelClause;

    protected String groupByClause;

    String selectCols;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Wed Dec 16 19:48:41 CST 2015
     */
    public TSysActionExample() {
        oredCriteria = new ArrayList<Criteria>();
        offset = 0;
        limit = Integer.MAX_VALUE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Wed Dec 16 19:48:41 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Wed Dec 16 19:48:41 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Wed Dec 16 19:48:41 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Wed Dec 16 19:48:41 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Wed Dec 16 19:48:41 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Wed Dec 16 19:48:41 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Wed Dec 16 19:48:41 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Wed Dec 16 19:48:41 CST 2015
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
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Wed Dec 16 19:48:41 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Wed Dec 16 19:48:41 CST 2015
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

    public void setGroupByClause(String groupByClause) {
         this.groupByClause = groupByClause;
    }

    public String getGroupByClause() {
          return groupByClause;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Wed Dec 16 19:48:41 CST 2015
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

        public Criteria andActionIdIsNull() {
            addCriterion("ACTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andActionIdIsNotNull() {
            addCriterion("ACTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andActionIdEqualTo(Long value) {
            addCriterion("ACTION_ID =", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdNotEqualTo(Long value) {
            addCriterion("ACTION_ID <>", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdGreaterThan(Long value) {
            addCriterion("ACTION_ID >", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ACTION_ID >=", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdLessThan(Long value) {
            addCriterion("ACTION_ID <", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdLessThanOrEqualTo(Long value) {
            addCriterion("ACTION_ID <=", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdIn(List<Long> values) {
            addCriterion("ACTION_ID in", values, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdNotIn(List<Long> values) {
            addCriterion("ACTION_ID not in", values, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdBetween(Long value1, Long value2) {
            addCriterion("ACTION_ID between", value1, value2, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdNotBetween(Long value1, Long value2) {
            addCriterion("ACTION_ID not between", value1, value2, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionFlagIsNull() {
            addCriterion("ACTION_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andActionFlagIsNotNull() {
            addCriterion("ACTION_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andActionFlagEqualTo(String value) {
            addCriterion("ACTION_FLAG =", value, "actionFlag");
            return (Criteria) this;
        }

        public Criteria andActionFlagNotEqualTo(String value) {
            addCriterion("ACTION_FLAG <>", value, "actionFlag");
            return (Criteria) this;
        }

        public Criteria andActionFlagGreaterThan(String value) {
            addCriterion("ACTION_FLAG >", value, "actionFlag");
            return (Criteria) this;
        }

        public Criteria andActionFlagGreaterThanOrEqualTo(String value) {
            addCriterion("ACTION_FLAG >=", value, "actionFlag");
            return (Criteria) this;
        }

        public Criteria andActionFlagLessThan(String value) {
            addCriterion("ACTION_FLAG <", value, "actionFlag");
            return (Criteria) this;
        }

        public Criteria andActionFlagLessThanOrEqualTo(String value) {
            addCriterion("ACTION_FLAG <=", value, "actionFlag");
            return (Criteria) this;
        }

        public Criteria andActionFlagLike(String value) {
            addCriterion("ACTION_FLAG like", value, "actionFlag");
            return (Criteria) this;
        }

        public Criteria andActionFlagNotLike(String value) {
            addCriterion("ACTION_FLAG not like", value, "actionFlag");
            return (Criteria) this;
        }

        public Criteria andActionFlagIn(List<String> values) {
            addCriterion("ACTION_FLAG in", values, "actionFlag");
            return (Criteria) this;
        }

        public Criteria andActionFlagNotIn(List<String> values) {
            addCriterion("ACTION_FLAG not in", values, "actionFlag");
            return (Criteria) this;
        }

        public Criteria andActionFlagBetween(String value1, String value2) {
            addCriterion("ACTION_FLAG between", value1, value2, "actionFlag");
            return (Criteria) this;
        }

        public Criteria andActionFlagNotBetween(String value1, String value2) {
            addCriterion("ACTION_FLAG not between", value1, value2, "actionFlag");
            return (Criteria) this;
        }

        public Criteria andActionNameIsNull() {
            addCriterion("ACTION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andActionNameIsNotNull() {
            addCriterion("ACTION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andActionNameEqualTo(String value) {
            addCriterion("ACTION_NAME =", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameNotEqualTo(String value) {
            addCriterion("ACTION_NAME <>", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameGreaterThan(String value) {
            addCriterion("ACTION_NAME >", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACTION_NAME >=", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameLessThan(String value) {
            addCriterion("ACTION_NAME <", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameLessThanOrEqualTo(String value) {
            addCriterion("ACTION_NAME <=", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameLike(String value) {
            addCriterion("ACTION_NAME like", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameNotLike(String value) {
            addCriterion("ACTION_NAME not like", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameIn(List<String> values) {
            addCriterion("ACTION_NAME in", values, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameNotIn(List<String> values) {
            addCriterion("ACTION_NAME not in", values, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameBetween(String value1, String value2) {
            addCriterion("ACTION_NAME between", value1, value2, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameNotBetween(String value1, String value2) {
            addCriterion("ACTION_NAME not between", value1, value2, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionDescIsNull() {
            addCriterion("ACTION_DESC is null");
            return (Criteria) this;
        }

        public Criteria andActionDescIsNotNull() {
            addCriterion("ACTION_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andActionDescEqualTo(String value) {
            addCriterion("ACTION_DESC =", value, "actionDesc");
            return (Criteria) this;
        }

        public Criteria andActionDescNotEqualTo(String value) {
            addCriterion("ACTION_DESC <>", value, "actionDesc");
            return (Criteria) this;
        }

        public Criteria andActionDescGreaterThan(String value) {
            addCriterion("ACTION_DESC >", value, "actionDesc");
            return (Criteria) this;
        }

        public Criteria andActionDescGreaterThanOrEqualTo(String value) {
            addCriterion("ACTION_DESC >=", value, "actionDesc");
            return (Criteria) this;
        }

        public Criteria andActionDescLessThan(String value) {
            addCriterion("ACTION_DESC <", value, "actionDesc");
            return (Criteria) this;
        }

        public Criteria andActionDescLessThanOrEqualTo(String value) {
            addCriterion("ACTION_DESC <=", value, "actionDesc");
            return (Criteria) this;
        }

        public Criteria andActionDescLike(String value) {
            addCriterion("ACTION_DESC like", value, "actionDesc");
            return (Criteria) this;
        }

        public Criteria andActionDescNotLike(String value) {
            addCriterion("ACTION_DESC not like", value, "actionDesc");
            return (Criteria) this;
        }

        public Criteria andActionDescIn(List<String> values) {
            addCriterion("ACTION_DESC in", values, "actionDesc");
            return (Criteria) this;
        }

        public Criteria andActionDescNotIn(List<String> values) {
            addCriterion("ACTION_DESC not in", values, "actionDesc");
            return (Criteria) this;
        }

        public Criteria andActionDescBetween(String value1, String value2) {
            addCriterion("ACTION_DESC between", value1, value2, "actionDesc");
            return (Criteria) this;
        }

        public Criteria andActionDescNotBetween(String value1, String value2) {
            addCriterion("ACTION_DESC not between", value1, value2, "actionDesc");
            return (Criteria) this;
        }

        public Criteria andActionMenuIsNull() {
            addCriterion("ACTION_MENU is null");
            return (Criteria) this;
        }

        public Criteria andActionMenuIsNotNull() {
            addCriterion("ACTION_MENU is not null");
            return (Criteria) this;
        }

        public Criteria andActionMenuEqualTo(Long value) {
            addCriterion("ACTION_MENU =", value, "actionMenu");
            return (Criteria) this;
        }

        public Criteria andActionMenuNotEqualTo(Long value) {
            addCriterion("ACTION_MENU <>", value, "actionMenu");
            return (Criteria) this;
        }

        public Criteria andActionMenuGreaterThan(Long value) {
            addCriterion("ACTION_MENU >", value, "actionMenu");
            return (Criteria) this;
        }

        public Criteria andActionMenuGreaterThanOrEqualTo(Long value) {
            addCriterion("ACTION_MENU >=", value, "actionMenu");
            return (Criteria) this;
        }

        public Criteria andActionMenuLessThan(Long value) {
            addCriterion("ACTION_MENU <", value, "actionMenu");
            return (Criteria) this;
        }

        public Criteria andActionMenuLessThanOrEqualTo(Long value) {
            addCriterion("ACTION_MENU <=", value, "actionMenu");
            return (Criteria) this;
        }

        public Criteria andActionMenuIn(List<Long> values) {
            addCriterion("ACTION_MENU in", values, "actionMenu");
            return (Criteria) this;
        }

        public Criteria andActionMenuNotIn(List<Long> values) {
            addCriterion("ACTION_MENU not in", values, "actionMenu");
            return (Criteria) this;
        }

        public Criteria andActionMenuBetween(Long value1, Long value2) {
            addCriterion("ACTION_MENU between", value1, value2, "actionMenu");
            return (Criteria) this;
        }

        public Criteria andActionMenuNotBetween(Long value1, Long value2) {
            addCriterion("ACTION_MENU not between", value1, value2, "actionMenu");
            return (Criteria) this;
        }

        public Criteria andField1IsNull() {
            addCriterion("FIELD1 is null");
            return (Criteria) this;
        }

        public Criteria andField1IsNotNull() {
            addCriterion("FIELD1 is not null");
            return (Criteria) this;
        }

        public Criteria andField1EqualTo(String value) {
            addCriterion("FIELD1 =", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1NotEqualTo(String value) {
            addCriterion("FIELD1 <>", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1GreaterThan(String value) {
            addCriterion("FIELD1 >", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1GreaterThanOrEqualTo(String value) {
            addCriterion("FIELD1 >=", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1LessThan(String value) {
            addCriterion("FIELD1 <", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1LessThanOrEqualTo(String value) {
            addCriterion("FIELD1 <=", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1Like(String value) {
            addCriterion("FIELD1 like", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1NotLike(String value) {
            addCriterion("FIELD1 not like", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1In(List<String> values) {
            addCriterion("FIELD1 in", values, "field1");
            return (Criteria) this;
        }

        public Criteria andField1NotIn(List<String> values) {
            addCriterion("FIELD1 not in", values, "field1");
            return (Criteria) this;
        }

        public Criteria andField1Between(String value1, String value2) {
            addCriterion("FIELD1 between", value1, value2, "field1");
            return (Criteria) this;
        }

        public Criteria andField1NotBetween(String value1, String value2) {
            addCriterion("FIELD1 not between", value1, value2, "field1");
            return (Criteria) this;
        }

        public Criteria andActionFlagLikeInsensitive(String value) {
            addCriterion("upper(ACTION_FLAG) like", value.toUpperCase(), "actionFlag");
            return (Criteria) this;
        }

        public Criteria andActionNameLikeInsensitive(String value) {
            addCriterion("upper(ACTION_NAME) like", value.toUpperCase(), "actionName");
            return (Criteria) this;
        }

        public Criteria andActionDescLikeInsensitive(String value) {
            addCriterion("upper(ACTION_DESC) like", value.toUpperCase(), "actionDesc");
            return (Criteria) this;
        }

        public Criteria andField1LikeInsensitive(String value) {
            addCriterion("upper(FIELD1) like", value.toUpperCase(), "field1");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated do_not_delete_during_merge Wed Dec 16 19:48:41 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        public Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Wed Dec 16 19:48:41 CST 2015
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
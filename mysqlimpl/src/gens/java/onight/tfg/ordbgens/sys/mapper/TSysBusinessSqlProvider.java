package onight.tfg.ordbgens.sys.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import java.util.List;
import java.util.Map;
import onight.tfg.ordbgens.sys.entity.TSysBusiness;
import onight.tfg.ordbgens.sys.entity.TSysBusinessExample.Criteria;
import onight.tfg.ordbgens.sys.entity.TSysBusinessExample.Criterion;
import onight.tfg.ordbgens.sys.entity.TSysBusinessExample;

public class TSysBusinessSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_BUSINESS
     *
     * @mbggenerated Wed Dec 16 19:48:41 CST 2015
     */
    public String countByExample(TSysBusinessExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("T_SYS_BUSINESS");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_BUSINESS
     *
     * @mbggenerated Wed Dec 16 19:48:41 CST 2015
     */
    public String deleteByExample(TSysBusinessExample example) {
        BEGIN();
        DELETE_FROM("T_SYS_BUSINESS");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_BUSINESS
     *
     * @mbggenerated Wed Dec 16 19:48:41 CST 2015
     */
    public String insertSelective(TSysBusiness record) {
        BEGIN();
        INSERT_INTO("T_SYS_BUSINESS");
        
        if (record.getBusinessId() != null) {
            VALUES("BUSINESS_ID", "#{businessId,jdbcType=VARCHAR}");
        }
        
        if (record.getBusinessName() != null) {
            VALUES("BUSINESS_NAME", "#{businessName,jdbcType=VARCHAR}");
        }
        
        if (record.getBusinessDesc() != null) {
            VALUES("BUSINESS_DESC", "#{businessDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getBusinessManager() != null) {
            VALUES("BUSINESS_MANAGER", "#{businessManager,jdbcType=VARCHAR}");
        }
        
        if (record.getBusinessMobile() != null) {
            VALUES("BUSINESS_MOBILE", "#{businessMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getBusinessSeq() != null) {
            VALUES("BUSINESS_SEQ", "#{businessSeq,jdbcType=INTEGER}");
        }
        
        if (record.getBeginTime() != null) {
            VALUES("BEGIN_TIME", "#{beginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndTime() != null) {
            VALUES("END_TIME", "#{endTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            VALUES("STATUS", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getBusinessDataPermission() != null) {
            VALUES("BUSINESS_DATA_PERMISSION", "#{businessDataPermission,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_BUSINESS
     *
     * @mbggenerated Wed Dec 16 19:48:41 CST 2015
     */
    public String selectByExample(TSysBusinessExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("BUSINESS_ID");
        } else {
            SELECT("BUSINESS_ID");
        }
        SELECT("BUSINESS_NAME");
        SELECT("BUSINESS_DESC");
        SELECT("BUSINESS_MANAGER");
        SELECT("BUSINESS_MOBILE");
        SELECT("BUSINESS_SEQ");
        SELECT("BEGIN_TIME");
        SELECT("END_TIME");
        SELECT("STATUS");
        SELECT("BUSINESS_DATA_PERMISSION");
        FROM("T_SYS_BUSINESS");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        if(example!=null&&example.getSelectCols()!=null&&example.getSelectCols().trim().length()>0){
		BEGIN();
		if (example != null && example.isDistinct()) {
			SELECT_DISTINCT(example.getSelectCols());
		} else {
				SELECT(example.getSelectCols());
		}
				applyWhere(example, false);
		}
        if(example != null){
            return SQL().concat(" limit "+example.getOffset()+","+example.getLimit());
        }
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_BUSINESS
     *
     * @mbggenerated Wed Dec 16 19:48:41 CST 2015
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TSysBusiness record = (TSysBusiness) parameter.get("record");
        TSysBusinessExample example = (TSysBusinessExample) parameter.get("example");
        
        BEGIN();
        UPDATE("T_SYS_BUSINESS");
        
        if (record.getBusinessId() != null) {
            SET("BUSINESS_ID = #{record.businessId,jdbcType=VARCHAR}");
        }
        
        if (record.getBusinessName() != null) {
            SET("BUSINESS_NAME = #{record.businessName,jdbcType=VARCHAR}");
        }
        
        if (record.getBusinessDesc() != null) {
            SET("BUSINESS_DESC = #{record.businessDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getBusinessManager() != null) {
            SET("BUSINESS_MANAGER = #{record.businessManager,jdbcType=VARCHAR}");
        }
        
        if (record.getBusinessMobile() != null) {
            SET("BUSINESS_MOBILE = #{record.businessMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getBusinessSeq() != null) {
            SET("BUSINESS_SEQ = #{record.businessSeq,jdbcType=INTEGER}");
        }
        
        if (record.getBeginTime() != null) {
            SET("BEGIN_TIME = #{record.beginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndTime() != null) {
            SET("END_TIME = #{record.endTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            SET("STATUS = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getBusinessDataPermission() != null) {
            SET("BUSINESS_DATA_PERMISSION = #{record.businessDataPermission,jdbcType=INTEGER}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_BUSINESS
     *
     * @mbggenerated Wed Dec 16 19:48:41 CST 2015
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("T_SYS_BUSINESS");
        
        SET("BUSINESS_ID = #{record.businessId,jdbcType=VARCHAR}");
        SET("BUSINESS_NAME = #{record.businessName,jdbcType=VARCHAR}");
        SET("BUSINESS_DESC = #{record.businessDesc,jdbcType=VARCHAR}");
        SET("BUSINESS_MANAGER = #{record.businessManager,jdbcType=VARCHAR}");
        SET("BUSINESS_MOBILE = #{record.businessMobile,jdbcType=VARCHAR}");
        SET("BUSINESS_SEQ = #{record.businessSeq,jdbcType=INTEGER}");
        SET("BEGIN_TIME = #{record.beginTime,jdbcType=TIMESTAMP}");
        SET("END_TIME = #{record.endTime,jdbcType=TIMESTAMP}");
        SET("STATUS = #{record.status,jdbcType=INTEGER}");
        SET("BUSINESS_DATA_PERMISSION = #{record.businessDataPermission,jdbcType=INTEGER}");
        
        TSysBusinessExample example = (TSysBusinessExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_BUSINESS
     *
     * @mbggenerated Wed Dec 16 19:48:41 CST 2015
     */
    public String updateByPrimaryKeySelective(TSysBusiness record) {
        BEGIN();
        UPDATE("T_SYS_BUSINESS");
        
        if (record.getBusinessName() != null) {
            SET("BUSINESS_NAME = #{businessName,jdbcType=VARCHAR}");
        }
        
        if (record.getBusinessDesc() != null) {
            SET("BUSINESS_DESC = #{businessDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getBusinessManager() != null) {
            SET("BUSINESS_MANAGER = #{businessManager,jdbcType=VARCHAR}");
        }
        
        if (record.getBusinessMobile() != null) {
            SET("BUSINESS_MOBILE = #{businessMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getBusinessSeq() != null) {
            SET("BUSINESS_SEQ = #{businessSeq,jdbcType=INTEGER}");
        }
        
        if (record.getBeginTime() != null) {
            SET("BEGIN_TIME = #{beginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndTime() != null) {
            SET("END_TIME = #{endTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            SET("STATUS = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getBusinessDataPermission() != null) {
            SET("BUSINESS_DATA_PERMISSION = #{businessDataPermission,jdbcType=INTEGER}");
        }
        
        WHERE("BUSINESS_ID = #{businessId,jdbcType=VARCHAR}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_BUSINESS
     *
     * @mbggenerated Wed Dec 16 19:48:41 CST 2015
     */
    protected void applyWhere(TSysBusinessExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}
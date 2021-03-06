package onight.mgame.autogens;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import java.math.BigDecimal;
import onight.mgame.utils.PBFields;
import lombok.NoArgsConstructor;

// 风险测评提交,客户信息,RiskAssessmentController,POST,JSON,/ife/riskassessment/riskAssessmentCommit.html
@onight.mgame.utils.PBInfo(name = "PBIFE_riskassessment_riskAssessmentCommit", path = "/ife/riskassessment/riskAssessmentCommit.html") 
public class IF_风险测评提交 {
	// =======REQuest==============

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public static class Request {

		 @PBFields(name = ",分数,String,不校验,否,")
		String point;//  ,分数,String,不校验,否,
		 String tfw__reserved;//保留字段

	}

	// ======RESponse==========

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public static class Response {
		@PBFields(name = ",风险等级,String,不校验,否,")
		String riskLevel;//  ,风险等级,String,不校验,否,
		@PBFields(name = ",风险测评有效期,String,不校验,否,")
		String riskExpiredDate;//  ,风险有效期,String,不校验,否,
		@PBFields(name = ",分数,String,不校验,否,")
		String point;//  ,分数,String,不校验,否,
		 String tfw__reserved;//保留字段
        @PBFields(name = ",风险等级名称,String,不校验,否,")
        String riskLevelName;//  ,风险等级名称,String,不校验,否,
	}

}

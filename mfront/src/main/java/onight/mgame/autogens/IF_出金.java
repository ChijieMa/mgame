package onight.mgame.autogens;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import java.math.BigDecimal;
import onight.mgame.utils.PBFields;
import lombok.NoArgsConstructor;

// 出金,电子账户,FundController,POST,JSON,/ife/fund/withDraw.html@onight.mgame.utils.PBInfo(name = "PBIFE_fund_withDraw", path = "/ife/fund/withDraw.html") 
public class IF_出金 {
	// =======REQuest==============

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public static class Request {

		 @PBFields(name = ",,String,不校验,否,")
		String amount;//  ,,String,不校验,否,
		 @PBFields(name = ",,String,不校验,否,")
		String password;//  ,,String,不校验,否,
		 @PBFields(name = ",,String,不校验,否,")
		String repeatCommitCheckCode;//  ,,String,不校验,否,
		 @PBFields(name = ",,String,不校验,是,")
		String branchNo;//  ,,String,不校验,是,
		 @PBFields(name = ",,String,不校验,是,")
		String branchName;//  ,,String,不校验,是,
		 @PBFields(name = ",,String,不校验,是,")
		String bankCard;//  ,,String,不校验,是,
		 String tfw__reserved;//保留字段

	}

	// ======RESponse==========

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public static class Response {
		 String tfw__reserved;//保留字段 

	}

}

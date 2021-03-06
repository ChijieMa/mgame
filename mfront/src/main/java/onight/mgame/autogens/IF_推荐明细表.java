package onight.mgame.autogens;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import java.math.BigDecimal;
import onight.mgame.utils.PBFields;
import lombok.NoArgsConstructor;

// 推荐明细表,客户信息,FriendsRecommendController,POST,JSON,/ife/friendsrecommend/recommendDetailsInfo.html@onight.mgame.utils.PBInfo(name = "PBIFE_friendsrecommend_recommendDetailsInfo", path = "/ife/friendsrecommend/recommendDetailsInfo.html") 
public class IF_推荐明细表 {
	// =======REQuest==============

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public static class Request {

		 @PBFields(name = ",当前页,String,不校验,否,")
		String pageIndex;//  ,当前页,String,不校验,否,
		 @PBFields(name = ",页大小,String,不校验,否,")
		String pageSize;//  ,页大小,String,不校验,否,
		 @PBFields(name = ",开始日期,String,不校验,是,")
		String startDate;//  ,开始日期,String,不校验,是,
		 @PBFields(name = ",结束日期,String,不校验,是,")
		String endDate;//  ,结束日期,String,不校验,是,
		 @PBFields(name = ",被推荐人姓名,String,不校验,是,")
		String frname;//  ,被推荐人姓名,String,不校验,是,
		 String tfw__reserved;//保留字段

	}

	// ======RESponse==========

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public static class Response {
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public static class PageInfo {

		 @PBFields(name = ",页大小,String,不校验,是,")
				String pageSize;//  ,页大小,String,不校验,是,
		 @PBFields(name = ",当前页,String,不校验,是,")
				String pageIndex;//  ,当前页,String,不校验,是,
		 @PBFields(name = ",总页数,String,不校验,是,")
				String pageCount;//  ,总页数,String,不校验,是,
		 @PBFields(name = ",总条数,String,不校验,是,")
				String totalCount;//  ,总条数,String,不校验,是,
}

		 @PBFields(name = ",推荐列表,List,不校验,是,")
PageInfo pageInfo;// 
 
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public static class RecommendDetailsList {

		 @PBFields(name = ",编号,String,不校验,是,")
				String id;//  ,编号,String,不校验,是,
		 @PBFields(name = ",推荐人账号,String,不校验,是,")
				String reaccount;//  ,推荐人账号,String,不校验,是,
		 @PBFields(name = ",推荐人资金账号,String,不校验,是,")
				String refundAccount;//  ,推荐人资金账号,String,不校验,是,
		 @PBFields(name = ",推荐人手机号,String,不校验,是,")
				String remobile;//  ,推荐人手机号,String,不校验,是,
		 @PBFields(name = ",好友账号,String,不校验,是,")
				String fraccount;//  ,好友账号,String,不校验,是,
		 @PBFields(name = ",好友资金账号,String,不校验,是,")
				String frfundAccount;//  ,好友资金账号,String,不校验,是,
		 @PBFields(name = ",好友名称,String,不校验,是,")
				String frname;//  ,好友名称,String,不校验,是,
		 @PBFields(name = ",好友手机号,String,不校验,是,")
				String frmobile;//  ,好友手机号,String,不校验,是,
		 @PBFields(name = ",是否成功绑定银行卡号,String,不校验,是,0-否，1-是")
				String isBindCard;//  ,是否成功绑定银行卡号,String,不校验,是,0-否，1-是
		 @PBFields(name = ",是否成功投资,String,不校验,是,0-否，1-是")
				String isInvest;//  ,是否成功投资,String,不校验,是,0-否，1-是
		 @PBFields(name = ",成功绑定银行卡奖励,String,不校验,是,")
				String cardAward;//  ,成功绑定银行卡奖励,String,不校验,是,
		 @PBFields(name = ",成功投资奖励,String,不校验,是,")
				String investAward;//  ,成功投资奖励,String,不校验,是,
		 @PBFields(name = ",好友绑卡时间,String,不校验,是,")
				String gmtBinding;//  ,好友绑卡时间,String,不校验,是,
		 @PBFields(name = ",好友投资时间,String,不校验,是,")
				String gmtInvest;//  ,好友投资时间,String,不校验,是,
		 @PBFields(name = ",推荐时间,String,不校验,是,")
				String gmtRecommend;//  ,推荐时间,String,不校验,是,
		 @PBFields(name = ",创建时间,String,不校验,是,")
				String gmtCreate;//  ,创建时间,String,不校验,是,
		 @PBFields(name = ",修改时间,String,不校验,是,")
				String gmtModify;//  ,修改时间,String,不校验,是,
		 @PBFields(name = ",查询起始日,String,不校验,是,")
				String createTimeStart;//  ,查询起始日,String,不校验,是,
		 @PBFields(name = ",查询终止日,String,不校验,是,")
				String createTimeEnd;//  ,查询终止日,String,不校验,是,
}

		 List<RecommendDetailsList>recommendDetailsList;// 
 
		 String tfw__reserved;//保留字段 

	}

}

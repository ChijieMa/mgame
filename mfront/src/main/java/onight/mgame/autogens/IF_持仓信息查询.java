package onight.mgame.autogens;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.math.BigDecimal;

import onight.mgame.utils.PBFields;
import lombok.NoArgsConstructor;

// 持仓信息查询,产品相关,PrdQueryController,POST,JSON,/ife/prdquery/prdQueryTaUnitFinance.html
@onight.mgame.utils.PBInfo(name = "PBIFE_prdquery_prdQueryTaUnitFinance", path = "/ife/prdquery/prdQueryTaUnitFinance.html")
public class IF_持仓信息查询 {
    // =======REQuest==============

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Request {

        @PBFields(name = ",当前页,String,不校验,是,默认1")
        String pageIndex;//  ,当前页,String,不校验,是,默认1
        @PBFields(name = ",页大小,String,不校验,是,默认10")
        String pageSize;//  ,页大小,String,不校验,是,默认10
        @PBFields(name = ",开始日期,String,不校验,是,")
        String startDate;//  ,开始日期,String,不校验,是,
        @PBFields(name = ",结束七日,String,不校验,是,")
        String endDate;//  ,结束七日,String,不校验,是,
        @PBFields(name = ",排序列名,String,不校验,是,")
        String orderBy;//  ,排序列名,String,不校验,是,
        @PBFields(name = ",排序顺序,String,不校验,是,")
        String orderAsc;//  ,排序顺序,String,不校验,是,
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

        @PBFields(name = ",持仓列表,List,不校验,是,")
        PageInfo pageInfo;//

        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        public static class TaUnitFinanceList {

            @PBFields(name = ",编号,String,不校验,是,")
            String id;//  ,编号,String,不校验,是,
            @PBFields(name = ",产品编号,String,不校验,是,")
            String productCode;//  ,产品编号,String,不校验,是,
            @PBFields(name = ",交易账户,String,不校验,是,")
            String shareholdersCode;//  ,交易账户,String,不校验,是,
            @PBFields(name = ",本金,String,不校验,是,")
            String unit;//  ,本金,String,不校验,是,
            @PBFields(name = ",可转让本金,String,不校验,是,")
            String canTransferAmount;//  ,可转让本金,String,不校验,是,
            @PBFields(name = ",不可转让本金,String,不校验,是,")
            String noTransferAmount;//  ,不可转让本金,String,不校验,是,
            @PBFields(name = ",创建时间,String,不校验,是,")
            String gmtCreate;//  ,创建时间,String,不校验,是,
            @PBFields(name = ",最后一次修改时间,String,不校验,是,")
            String gmtModify;//  ,最后一次修改时间,String,不校验,是,
            @PBFields(name = ",冻结资产,String,不校验,是,")
            String freeze;//  ,冻结资产,String,不校验,是,
            @PBFields(name = ",产品最少购买,String,不校验,是,")
            String buyerSmallestAmount;//  ,产品最少购买,String,不校验,是,
            @PBFields(name = ",产品发行量,String,不校验,是,")
            String buyTotalAmount;//  ,产品发行量,String,不校验,是,
            @PBFields(name = ",最少购买,String,不校验,是,")
            String buySmallestAmount;//  ,最少购买,String,不校验,是,
            @PBFields(name = ",最少持仓,String,不校验,是,")
            String buyRemainAmount;//  ,最少持仓,String,不校验,是,
            @PBFields(name = ",预期收益率,String,不校验,是,")
            String expectedMaxAnnualRate;//  ,预期收益率,String,不校验,是,
            @PBFields(name = ",,String,不校验,是,")
            String tradeIncomeAll;//  ,,String,不校验,是,
            @PBFields(name = ",募集开始日,String,不校验,是,")
            String buyStartDate;//  ,募集开始日,String,不校验,是,
            @PBFields(name = ",募集结束日,String,不校验,是,")
            String buyEndDate;//  ,募集结束日,String,不校验,是,
            @PBFields(name = ",起息日,String,不校验,是,")
            String manageStartDate;//  ,起息日,String,不校验,是,
            @PBFields(name = ",结息日,String,不校验,是,")
            String manageEndDate;//  ,结息日,String,不校验,是,
            @PBFields(name = ",,String,不校验,是,")
            String deadline;//  ,,String,不校验,是,
            @PBFields(name = ",,String,不校验,是,")
            String unActualPriceIncreases;//  ,,String,不校验,是,
            @PBFields(name = ",,String,不校验,是,")
            String unActualPrice;//  ,,String,不校验,是,
            @PBFields(name = ",,String,不校验,是,")
            String unActualTradeApplyRate;//  ,,String,不校验,是,
            @PBFields(name = ",,String,不校验,是,")
            String financeCode;//  ,,String,不校验,是,
            @PBFields(name = ",,String,不校验,是,")
            String zsjRate;//  ,,String,不校验,是,
            @PBFields(name = ",,String,不校验,是,")
            String currentRate;//  ,,String,不校验,是,
            @PBFields(name = ",,String,不校验,是,")
            String transferFee;//  ,,String,不校验,是,
            @PBFields(name = ",,String,不校验,是,")
            String productSubType;//  ,,String,不校验,是,
            @PBFields(name = ",,String,不校验,是,")
            String tradeStartDate;//  ,,String,不校验,是,
            @PBFields(name = ",,String,不校验,是,")
            String tradeEndDate;//  ,,String,不校验,是,
            @PBFields(name = ",,String,不校验,是,")
            String leastHoldDays;//  ,,String,不校验,是,
            @PBFields(name = ",,String,不校验,是,")
            String tradeLeastHoldDay;//  ,,String,不校验,是,
            @PBFields(name = ",,String,不校验,是,")
            String status;//  ,,String,不校验,是,
            @PBFields(name = ",,String,不校验,是,")
            String statusStr;//  ,,String,不校验,是,
            @PBFields(name = ",,String,不校验,是,")
            String productType;//  ,,String,不校验,是,
            @PBFields(name = ",,String,不校验,是,")
            String productName;//  ,,String,不校验,是,
            @PBFields(name = ",状态,String,不校验,是,")
            String unitStatus;//  ,状态,String,不校验,是,
            @PBFields(name = ",,String,不校验,是,")
            String delegationCode;//  ,,String,不校验,是,
            @PBFields(name = ",持有天数,String,不校验,是,")
            String myHoldDays;//  ,持有天数,String,不校验,是,
            @PBFields(name = ",剩余持有天数,String,不校验,是,")
            String surplusHoldDays;//  ,剩余持有天数,String,不校验,是,
            @PBFields(name = ",预期年化收益率,String,不校验,是,")
            String annualDaysExpectIncome;//  ,预期年化收益率,String,不校验,是,
            @PBFields(name = ",持有期预期收益,String,不校验,是,")
            String myHoldDaysExpectIncome;//  ,持有期预期收益,String,不校验,是,
            @PBFields(name = ",获取可卖出的产品份额,String,不校验,是,")
            String saleableNumber;//  ,获取可卖出的产品份额,String,不校验,是,
            @PBFields(name = ",限制交易期,String,不校验,是,")
            String holderType;//  ,限制交易期,String,不校验,是,
            @PBFields(name = ",计息方式,String,不校验,是,")
            String yearDay;//  ,计息方式,String,不校验,是,
            @PBFields(name = ",产品小类,String,不校验,是,")
            String prodSubType;//  ,产品小类,String,不校验,是,
            @PBFields(name = ",,String,不校验,是,")
            String computerClosedPeriod;//  ,,String,不校验,是,
            @PBFields(name = ",是否可转让交易,String,不校验,是,")
            String isTransfer;//  ,是否可转让交易,String,不校验,是,
            @PBFields(name = ",产品认购期是否允许撤单,String,不校验,是,")
            String productCancel;//  ,产品认购期是否允许撤单,String,不校验,是,
            @PBFields(name = ",二级市场买入份额,String,不校验,是,")
            String transBuy;//  ,二级市场买入份额,String,不校验,是,
            @PBFields(name = ",二级市场挂卖中份额,String,不校验,是,")
            String transSaling;//  ,二级市场挂卖中份额,String,不校验,是,
            @PBFields(name = ",展期类型,String,不校验,是,")
            String optionType;//  ,展期类型,String,不校验,是,
            @PBFields(name = ",选择权公告开始日,String,不校验,是,")
            String optionDateStart;//  ,选择权公告开始日,String,不校验,是,
            @PBFields(name = ",选择权公告截止日,String,不校验,是,")
            String optionDateEnd;//  ,选择权公告截止日,String,不校验,是,
            @PBFields(name = ",持仓查询标记,String,不校验,是,")
            String holderFlag;//  ,持仓查询标记,String,不校验,是,
            @PBFields(name = ",已持有天数,String,不校验,是,")
            String leftDays;//  ,已持有天数,String,不校验,是,
            @PBFields(name = ",操作状态,String,不校验,是,")
            String operType;//  ,操作状态,String,不校验,是,
            @PBFields(name = ",转让是否支持浮动利率,String,不校验,是,")
            String transferIsfloat;//  ,转让是否支持浮动利率,String,不校验,是,
            @PBFields(name = ",转让浮动利率幅度,String,不校验,是,")
            String transferFloat;//  ,转让浮动利率幅度,String,不校验,是,
            @PBFields(name = ",转让浮动利率开始利率,String,不校验,是,")
            String transferFloatBegin;//  ,转让浮动利率开始利率,String,不校验,是,
            @PBFields(name = ",转让浮动利率结束利率,String,不校验,是,")
            String transferFloatEnd;//  ,转让浮动利率结束利率,String,不校验,是,
            @PBFields(name = ",转让折扣,String,不校验,是,")
            String discountRate;//  ,转让折扣,String,不校验,是,
            @PBFields(name = ",产品状态条件,String,不校验,是,")
            String productStatusList;//  ,产品状态条件,String,不校验,是,
            @PBFields(name = ",排序字段,String,不校验,是,")
            String orderBy;//  ,排序字段,String,不校验,是,
            @PBFields(name = ",正反向排序,String,不校验,是,")
            String orderAsc;//  ,正反向排序,String,不校验,是,
            @PBFields(name = ",查询起始日,String,不校验,是,")
            String gmtCreateStart;//  ,查询起始日,String,不校验,是,
            @PBFields(name = ",查询终止日,String,不校验,是,")
            String gmtCreateEnd;//  ,查询终止日,String,不校验,是,
            @PBFields(name = ",是否可以转让,String,不校验,是,")
            String ifCanTransfer;//  ,是否可以转让,String,不校验,是,
            @PBFields(name = ",是否可以撤销,String,不校验,是,")
            String ifCanCancel;//  ,是否可以撤销,String,不校验,是,
            @PBFields(name = ",是否期限选择,String,不校验,是,")
            String ifTimeChoose;//  ,是否期限选择,String,不校验,是,
            @PBFields(name = ",是否封闭期,String,不校验,是,")
            String ifClosedPeriod;//  ,是否封闭期,String,不校验,是,
            @PBFields(name = ",持有期预期收益,String,不校验,是,")
            String preProfit;//  ,持有期预期收益,String,不校验,是,
            @PBFields(name = ",下一到期日,String,不校验,是,")
            String nextEndDate;//  ,下一到期日,String,不校验,是,
            @PBFields(name = ",选择期所在付息计划结束日,String,不校验,是,")
            String intervalEndDate;//  ,选择期所在付息计划结束日,String,不校验,是,
            @PBFields(name = ",产品起息日,String,不校验,是,")
            String productStartDate;//  ,产品起息日,String,不校验,是,
            @PBFields(name = ",最低持有本金,String,不校验,是,")
            String leastHoldAmount;//  ,最低持有本金,String,不校验,是,
            @PBFields(name = ",最低转让本金,String,不校验,是,")
            String leastTranAmount;//  ,最低转让本金,String,不校验,是,
            @PBFields(name = ",转让递增金额,String,不校验,是,")
            String tradeIncrease;//  ,转让递增金额,String,不校验,是,
            @PBFields(name = ",付息日,String,不校验,是,")
            String payCashDate;//  ,付息日,String,不校验,是,
        }

        List<TaUnitFinanceList> taUnitFinanceList;//

        String tfw__reserved;//保留字段

    }

}

package xyz.redtorch.node.master.rpc.service;

import java.util.List;

import xyz.redtorch.pb.CoreField.CancelOrderReqField;
import xyz.redtorch.pb.CoreField.CommonReqField;
import xyz.redtorch.pb.CoreField.ContractField;
import xyz.redtorch.pb.CoreField.GatewayField;
import xyz.redtorch.pb.CoreField.SubmitOrderReqField;

/**
 * 
 * @author sun0x00@gmail.com
 *
 */
public interface RpcServerReqHandlerService {

	void subscribe(CommonReqField commonReq, ContractField contract, String gatewayId);

	void unsubscribe(CommonReqField commonReq, ContractField contract, String gatewayId);

	void submitOrder(CommonReqField commonReq, SubmitOrderReqField submitOrderReq);

	void cancelOrder(CommonReqField commonReq, CancelOrderReqField cancelOrderReq);

	void searchContract(CommonReqField commonReq, ContractField contract);

	// -------------------------------------------------------
	void getOrderList(CommonReqField commonReq);

	void getWorkingOrderList(CommonReqField commonReq);

	void queryOrderByOrderId(CommonReqField commonReq, String orderId);

	void queryOrderByOriginOrderId(CommonReqField commonReq, String originOrderId);

	void queryOrderListByAccountId(CommonReqField commonReq, String accountId);

	void queryOrderListByUnifiedSymbol(CommonReqField commonReq, String unifiedSymbol);

	void getTradeList(CommonReqField commonReq);

	void queryTradeByTradeId(CommonReqField commonReq, String tradeId);

	void queryTradeListByUnifiedSymbol(CommonReqField commonReq, String unifiedSymbol);

	void queryTradeListByAccountId(CommonReqField commonReq, String accountId);

	void queryTradeListByOrderId(CommonReqField commonReq, String orderId);

	void queryTradeListByOriginOrderId(CommonReqField commonReq, String originOrderId);

	void getPositionList(CommonReqField commonReq);

	void queryPositionByPositionId(CommonReqField commonReq, String positionId);

	void queryPositionListByAccountId(CommonReqField commonReq, String accountId);

	void queryPositionListByUnifiedSymbol(CommonReqField commonReq, String unifiedSymbol);

	void getAccountList(CommonReqField commonReq);

	void queryAccountByAccountId(CommonReqField commonReq, String accountId);

	void queryAccountListByAccountCode(CommonReqField commonReq, String accountCode);

	void getContractList(CommonReqField commonReq);

	void queryContractByContractId(CommonReqField commonReq, String contractId);

	void queryContractListByUnifiedSymbol(CommonReqField commonReq, String unifiedSymbol);

	void queryContractListByGatewayId(CommonReqField commonReq, String gatewayId);

	// ---------------------------------------------------------------------
	void syncSlaveNodeRuntimeData(CommonReqField commonReq, List<GatewayField> gatewayList);

	void getMixContractList(CommonReqField commonReq);

	void getTickList(CommonReqField commonReq);
}

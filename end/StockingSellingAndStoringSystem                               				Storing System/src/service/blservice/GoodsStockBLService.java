package service.blservice;

import objects.ResultMessage;
import vo.GoodsStockVO;
import vo.GoodsVO;

import java.rmi.RemoteException;

public interface GoodsStockBLService {
    /**
     * 在不更改定价的情况下增加进货商品，单价（默认为商品信息中的进价）
     * @param vo
     * @param stockNumber
     * @param remark
     * @return
     */
    public ResultMessage add(GoodsVO vo, int stockNumber, String remark) throws RemoteException;


    /**
     * 在更改定价的情况下增加进货商品
     * @param vo
     * @param stockNumber
     * @param price
     * @param remark
     * @return
     */
    public ResultMessage add(GoodsVO vo, int stockNumber, double price, String remark) throws RemoteException;


    /**
     * 删除进货商品
     * @param vo
     * @return
     */
    public ResultMessage delete(GoodsStockVO vo) throws RemoteException;

    /**
     * 更新进货商品
     * @param vo
     * @return
     * @throws RemoteException
     */
    public ResultMessage update(GoodsStockVO vo) throws RemoteException;


}

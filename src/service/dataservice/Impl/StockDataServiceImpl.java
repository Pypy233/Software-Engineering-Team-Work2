package service.dataservice.Impl;

import objects.HQLTools;
import objects.ResultMessage;
import po.StockPO;
import service.dataservice.StockDataService;

public class StockDataServiceImpl implements StockDataService {
    @Override
    public ResultMessage add(StockPO po) {
        if(po == null)
            return ResultMessage.Fail;
        HQLTools.add(po);
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage delete(StockPO po) {
        if(po == null)
            return ResultMessage.Fail;
        HQLTools.delete(po);
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage update(StockPO po) {
        if(po == null)
            return ResultMessage.Fail;
        HQLTools.update(po);
        return ResultMessage.Success;
    }
}
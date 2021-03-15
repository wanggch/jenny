package my.jenny.finance.controller;

import lombok.extern.slf4j.Slf4j;
import my.jenny.finance.entity.dto.StockLogDTO;
import my.jenny.finance.entity.mapper.StockLogMapper;
import my.jenny.finance.entity.po.StockLog;
import my.jenny.finance.entity.query.StockLogParam;
import my.jenny.finance.service.StockLogService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/stockLog")
public class StockLogController {
    @Resource
    private StockLogService stockLogService;
    @Resource
    private StockLogMapper stockLogMapper;
    @RequestMapping("/add")
    public void add(StockLogDTO dto) {
        StockLog stockLog = stockLogMapper.dto2po(dto);
        log.info("stock log: {}", stockLog);
        stockLogService.add(stockLog);
    }
    @RequestMapping("/query")
    public List<StockLogDTO> query(String holdDate) {
        StockLogParam param = new StockLogParam();
        param.setHoldDate(holdDate);
        List<StockLog> stockLogList = stockLogService.query(param);
        return stockLogMapper.po2dto(stockLogList);
    }

}

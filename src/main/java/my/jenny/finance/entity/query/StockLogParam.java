package my.jenny.finance.entity.query;

import lombok.Data;
import lombok.NoArgsConstructor;
import my.jenny.base.api.BaseParam;

@Data
@NoArgsConstructor
public class StockLogParam extends BaseParam {
    private String stockCode;
    private String holdDate;
}

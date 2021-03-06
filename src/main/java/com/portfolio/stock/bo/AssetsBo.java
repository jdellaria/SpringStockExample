package com.portfolio.stock.bo;

import com.portfolio.stock.model.Assets;
import java.util.List;

public interface AssetsBo {

	void save(Assets stock);

	void update(Assets stock);

	void delete(Assets stock);

	Assets findByStockId(String stockCode);

	List<?> findAllAssets();

	List<?> findByType(String stockType);

}

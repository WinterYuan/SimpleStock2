
package com.nkl.admin.action;

import java.util.HashMap;
import java.util.List;

import com.nkl.admin.manager.AdminManager;
import com.nkl.common.action.BaseAction;
import com.nkl.page.domain.Goods;
import com.nkl.page.domain.Orders;
import com.nkl.page.domain.Sale;

public class ExportExcelAction extends BaseAction{

	private static final long serialVersionUID = 8143993190677252109L;
	AdminManager adminManager =  new AdminManager();
	
	//导出参数
	Goods paramsGoods;
	Sale paramsSale;
	Orders paramsOrders;
	HashMap<String, Object> report = new HashMap<String, Object>();

	/**
	 * @Title: exportGoodss
	 * @Description: 导出商品信息
	 * @return String
	 */
	public String exportGoods(){
		try{
			if (paramsGoods==null) {
				paramsGoods = new Goods();
			}
			//设置分页信息
			paramsGoods.setStart(-1);
			//查询商品列表
			List<Goods> goodss = adminManager.listGoodss(paramsGoods,null); 
			report.put("goodss", goodss);
			
			//设置导出文件名
			setExportExcelName("商品信息清单.xls");
		}
        catch(Exception e){
            setErrorReason("导出异常，请稍后再试", e);
            return ERROR;
        }
        return SUCCESS; 
	}
	
	/**
	 * @Title: exportSales
	 * @Description: 导出出库信息
	 * @return String
	 */
	public String exportSales(){
		try{
			if (paramsSale==null) {
				paramsSale = new Sale();
			}
			//设置分页信息
			paramsSale.setStart(-1);
			//查询出库列表
			List<Sale> sales = adminManager.listSales(paramsSale,null); 
			report.put("sales", sales);
			
			//设置导出文件名
			setExportExcelName("出库信息清单.xls");
		}
        catch(Exception e){
            setErrorReason("导出异常，请稍后再试", e);
            return ERROR;
        }
        return SUCCESS; 
	}
	
	/**
	 * @Title: exportOrders
	 * @Description: 导出入库信息
	 * @return String
	 */
	public String exportOrders(){
		try{
			if (paramsOrders==null) {
				paramsOrders = new Orders();
			}
			//设置分页信息
			paramsOrders.setStart(-1);
			//查询入库列表
			List<Orders> orderss = adminManager.listOrderss(paramsOrders,null); 
			report.put("orderss", orderss);
			
			//设置导出文件名
			setExportExcelName("入库信息清单.xls");
		}
        catch(Exception e){
            setErrorReason("导出异常，请稍后再试", e);
            return ERROR;
        }
        return SUCCESS; 
	}

	public HashMap<String, Object> getReport() {
		return report;
	}

	public void setReport(HashMap<String, Object> report) {
		this.report = report;
	}



	public Goods getParamsGoods() {
		return paramsGoods;
	}



	public void setParamsGoods(Goods paramsGoods) {
		this.paramsGoods = paramsGoods;
	}

	public Sale getParamsSale() {
		return paramsSale;
	}

	public Orders getParamsOrders() {
		return paramsOrders;
	}

	public void setParamsSale(Sale paramsSale) {
		this.paramsSale = paramsSale;
	}

	public void setParamsOrders(Orders paramsOrders) {
		this.paramsOrders = paramsOrders;
	}
	
	
}

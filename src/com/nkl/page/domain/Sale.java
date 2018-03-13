package com.nkl.page.domain;

import com.nkl.common.domain.BaseDomain;

public class Sale extends BaseDomain {

	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = -6925524708882684408L;
	private int sale_id; // 
	private int goods_id; // 
	private int sale_count;
	private String sale_admin; // 
	private String sale_date; //
	
	private String goods_no; // 
	private String goods_name; //
	private int goods_type_id; // 
	private String goods_type_name; // 
	private String sale_date_min;
	private String sale_date_max;
	
	private String ids;
	
	public int getSale_id() {
		return sale_id;
	}

	public void setSale_id(int sale_id) {
		this.sale_id = sale_id;
	}

	public String getSale_date() {
		return sale_date;
	}

	public void setSale_date(String sale_date) {
		this.sale_date = sale_date;
	}


	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public String getSale_date_min() {
		return sale_date_min;
	}

	public void setSale_date_min(String sale_date_min) {
		this.sale_date_min = sale_date_min;
	}

	public String getSale_date_max() {
		return sale_date_max;
	}

	public void setSale_date_max(String sale_date_max) {
		this.sale_date_max = sale_date_max;
	}

	public int getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}

	public int getSale_count() {
		return sale_count;
	}

	public void setSale_count(int sale_count) {
		this.sale_count = sale_count;
	}

	public String getSale_admin() {
		return sale_admin;
	}

	public void setSale_admin(String sale_admin) {
		this.sale_admin = sale_admin;
	}

	public String getGoods_no() {
		return goods_no;
	}

	public void setGoods_no(String goods_no) {
		this.goods_no = goods_no;
	}

	public String getGoods_name() {
		return goods_name;
	}

	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	public int getGoods_type_id() {
		return goods_type_id;
	}

	public void setGoods_type_id(int goods_type_id) {
		this.goods_type_id = goods_type_id;
	}

	public String getGoods_type_name() {
		return goods_type_name;
	}

	public void setGoods_type_name(String goods_type_name) {
		this.goods_type_name = goods_type_name;
	}

	 

}

package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 订单信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-12-31 09:59:17
 */
@TableName("dingdanxinxi")
public class DingdanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DingdanxinxiEntity() {
		
	}
	
	public DingdanxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 订单编号
	 */
					
	private String dingdanbianhao;
	
	/**
	 * 歌名
	 */
					
	private String geming;
	
	/**
	 * 类型
	 */
					
	private String leixing;
	
	/**
	 * 价格
	 */
					
	private String jiage;
	
	/**
	 * 购买日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date goumairiqi;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：订单编号
	 */
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
	}
	/**
	 * 设置：歌名
	 */
	public void setGeming(String geming) {
		this.geming = geming;
	}
	/**
	 * 获取：歌名
	 */
	public String getGeming() {
		return geming;
	}
	/**
	 * 设置：类型
	 */
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
	/**
	 * 设置：价格
	 */
	public void setJiage(String jiage) {
		this.jiage = jiage;
	}
	/**
	 * 获取：价格
	 */
	public String getJiage() {
		return jiage;
	}
	/**
	 * 设置：购买日期
	 */
	public void setGoumairiqi(Date goumairiqi) {
		this.goumairiqi = goumairiqi;
	}
	/**
	 * 获取：购买日期
	 */
	public Date getGoumairiqi() {
		return goumairiqi;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}

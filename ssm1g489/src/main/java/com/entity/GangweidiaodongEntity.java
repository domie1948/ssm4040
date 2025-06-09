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
 * 岗位调动
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-26 17:21:57
 */
@TableName("gangweidiaodong")
public class GangweidiaodongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GangweidiaodongEntity() {
		
	}
	
	public GangweidiaodongEntity(T t) {
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
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 部门
	 */
					
	private String bumen;
	
	/**
	 * 职位
	 */
					
	private String zhiwei;
	
	/**
	 * 入职时间
	 */
					
	private String ruzhishijian;
	
	/**
	 * 原职薪资
	 */
					
	private Integer yuanzhixinzi;
	
	/**
	 * 调入部门
	 */
					
	private String diaorubumen;
	
	/**
	 * 调入岗位
	 */
					
	private String diaorugangwei;
	
	/**
	 * 调动说明
	 */
					
	private String diaodongshuoming;
	
	/**
	 * 申请日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shenqingriqi;
	
	/**
	 * 岗位薪酬
	 */
					
	private Integer gangweixinchou;
	
	/**
	 * 生效日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shengxiaoriqi;
	
	
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
	 * 设置：工号
	 */
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
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
	 * 设置：部门
	 */
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
	}
	/**
	 * 设置：职位
	 */
	public void setZhiwei(String zhiwei) {
		this.zhiwei = zhiwei;
	}
	/**
	 * 获取：职位
	 */
	public String getZhiwei() {
		return zhiwei;
	}
	/**
	 * 设置：入职时间
	 */
	public void setRuzhishijian(String ruzhishijian) {
		this.ruzhishijian = ruzhishijian;
	}
	/**
	 * 获取：入职时间
	 */
	public String getRuzhishijian() {
		return ruzhishijian;
	}
	/**
	 * 设置：原职薪资
	 */
	public void setYuanzhixinzi(Integer yuanzhixinzi) {
		this.yuanzhixinzi = yuanzhixinzi;
	}
	/**
	 * 获取：原职薪资
	 */
	public Integer getYuanzhixinzi() {
		return yuanzhixinzi;
	}
	/**
	 * 设置：调入部门
	 */
	public void setDiaorubumen(String diaorubumen) {
		this.diaorubumen = diaorubumen;
	}
	/**
	 * 获取：调入部门
	 */
	public String getDiaorubumen() {
		return diaorubumen;
	}
	/**
	 * 设置：调入岗位
	 */
	public void setDiaorugangwei(String diaorugangwei) {
		this.diaorugangwei = diaorugangwei;
	}
	/**
	 * 获取：调入岗位
	 */
	public String getDiaorugangwei() {
		return diaorugangwei;
	}
	/**
	 * 设置：调动说明
	 */
	public void setDiaodongshuoming(String diaodongshuoming) {
		this.diaodongshuoming = diaodongshuoming;
	}
	/**
	 * 获取：调动说明
	 */
	public String getDiaodongshuoming() {
		return diaodongshuoming;
	}
	/**
	 * 设置：申请日期
	 */
	public void setShenqingriqi(Date shenqingriqi) {
		this.shenqingriqi = shenqingriqi;
	}
	/**
	 * 获取：申请日期
	 */
	public Date getShenqingriqi() {
		return shenqingriqi;
	}
	/**
	 * 设置：岗位薪酬
	 */
	public void setGangweixinchou(Integer gangweixinchou) {
		this.gangweixinchou = gangweixinchou;
	}
	/**
	 * 获取：岗位薪酬
	 */
	public Integer getGangweixinchou() {
		return gangweixinchou;
	}
	/**
	 * 设置：生效日期
	 */
	public void setShengxiaoriqi(Date shengxiaoriqi) {
		this.shengxiaoriqi = shengxiaoriqi;
	}
	/**
	 * 获取：生效日期
	 */
	public Date getShengxiaoriqi() {
		return shengxiaoriqi;
	}

}

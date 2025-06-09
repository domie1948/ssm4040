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
 * 工资单
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-26 17:21:57
 */
@TableName("gongzidan")
public class GongzidanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GongzidanEntity() {
		
	}
	
	public GongzidanEntity(T t) {
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
	 * 固定月薪
	 */
					
	private Integer gudingyuexin;
	
	/**
	 * 绩效奖金
	 */
					
	private Integer jixiaojiangjin;
	
	/**
	 * 所得税
	 */
					
	private Integer suodeshui;
	
	/**
	 * 社保
	 */
					
	private Integer shebao;
	
	/**
	 * 公积金
	 */
					
	private Integer gongjijin;
	
	/**
	 * 应发工资
	 */
					
	private Integer yingfagongzi;
	
	/**
	 * 实发工资
	 */
					
	private Integer shifagongzi;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	
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
	 * 设置：固定月薪
	 */
	public void setGudingyuexin(Integer gudingyuexin) {
		this.gudingyuexin = gudingyuexin;
	}
	/**
	 * 获取：固定月薪
	 */
	public Integer getGudingyuexin() {
		return gudingyuexin;
	}
	/**
	 * 设置：绩效奖金
	 */
	public void setJixiaojiangjin(Integer jixiaojiangjin) {
		this.jixiaojiangjin = jixiaojiangjin;
	}
	/**
	 * 获取：绩效奖金
	 */
	public Integer getJixiaojiangjin() {
		return jixiaojiangjin;
	}
	/**
	 * 设置：所得税
	 */
	public void setSuodeshui(Integer suodeshui) {
		this.suodeshui = suodeshui;
	}
	/**
	 * 获取：所得税
	 */
	public Integer getSuodeshui() {
		return suodeshui;
	}
	/**
	 * 设置：社保
	 */
	public void setShebao(Integer shebao) {
		this.shebao = shebao;
	}
	/**
	 * 获取：社保
	 */
	public Integer getShebao() {
		return shebao;
	}
	/**
	 * 设置：公积金
	 */
	public void setGongjijin(Integer gongjijin) {
		this.gongjijin = gongjijin;
	}
	/**
	 * 获取：公积金
	 */
	public Integer getGongjijin() {
		return gongjijin;
	}
	/**
	 * 设置：应发工资
	 */
	public void setYingfagongzi(Integer yingfagongzi) {
		this.yingfagongzi = yingfagongzi;
	}
	/**
	 * 获取：应发工资
	 */
	public Integer getYingfagongzi() {
		return yingfagongzi;
	}
	/**
	 * 设置：实发工资
	 */
	public void setShifagongzi(Integer shifagongzi) {
		this.shifagongzi = shifagongzi;
	}
	/**
	 * 获取：实发工资
	 */
	public Integer getShifagongzi() {
		return shifagongzi;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}

}

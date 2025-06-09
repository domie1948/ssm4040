package com.entity.view;

import com.entity.GongzidanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 工资单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 17:21:57
 */
@TableName("gongzidan")
public class GongzidanView  extends GongzidanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongzidanView(){
	}
 
 	public GongzidanView(GongzidanEntity gongzidanEntity){
 	try {
			BeanUtils.copyProperties(this, gongzidanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

package com.entity.view;

import com.entity.DiaoxiushenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 调休申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 17:21:57
 */
@TableName("diaoxiushenqing")
public class DiaoxiushenqingView  extends DiaoxiushenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiaoxiushenqingView(){
	}
 
 	public DiaoxiushenqingView(DiaoxiushenqingEntity diaoxiushenqingEntity){
 	try {
			BeanUtils.copyProperties(this, diaoxiushenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

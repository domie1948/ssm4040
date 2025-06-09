package com.dao;

import com.entity.GongzidanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongzidanVO;
import com.entity.view.GongzidanView;


/**
 * 工资单
 * 
 * @author 
 * @email 
 * @date 2021-04-26 17:21:57
 */
public interface GongzidanDao extends BaseMapper<GongzidanEntity> {
	
	List<GongzidanVO> selectListVO(@Param("ew") Wrapper<GongzidanEntity> wrapper);
	
	GongzidanVO selectVO(@Param("ew") Wrapper<GongzidanEntity> wrapper);
	
	List<GongzidanView> selectListView(@Param("ew") Wrapper<GongzidanEntity> wrapper);

	List<GongzidanView> selectListView(Pagination page,@Param("ew") Wrapper<GongzidanEntity> wrapper);
	
	GongzidanView selectView(@Param("ew") Wrapper<GongzidanEntity> wrapper);
	
}

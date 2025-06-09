package com.dao;

import com.entity.DiaoxiushenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiaoxiushenqingVO;
import com.entity.view.DiaoxiushenqingView;


/**
 * 调休申请
 * 
 * @author 
 * @email 
 * @date 2021-04-26 17:21:57
 */
public interface DiaoxiushenqingDao extends BaseMapper<DiaoxiushenqingEntity> {
	
	List<DiaoxiushenqingVO> selectListVO(@Param("ew") Wrapper<DiaoxiushenqingEntity> wrapper);
	
	DiaoxiushenqingVO selectVO(@Param("ew") Wrapper<DiaoxiushenqingEntity> wrapper);
	
	List<DiaoxiushenqingView> selectListView(@Param("ew") Wrapper<DiaoxiushenqingEntity> wrapper);

	List<DiaoxiushenqingView> selectListView(Pagination page,@Param("ew") Wrapper<DiaoxiushenqingEntity> wrapper);
	
	DiaoxiushenqingView selectView(@Param("ew") Wrapper<DiaoxiushenqingEntity> wrapper);
	
}

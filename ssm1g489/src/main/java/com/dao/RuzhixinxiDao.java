package com.dao;

import com.entity.RuzhixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RuzhixinxiVO;
import com.entity.view.RuzhixinxiView;


/**
 * 入职信息
 * 
 * @author 
 * @email 
 * @date 2021-04-26 17:21:57
 */
public interface RuzhixinxiDao extends BaseMapper<RuzhixinxiEntity> {
	
	List<RuzhixinxiVO> selectListVO(@Param("ew") Wrapper<RuzhixinxiEntity> wrapper);
	
	RuzhixinxiVO selectVO(@Param("ew") Wrapper<RuzhixinxiEntity> wrapper);
	
	List<RuzhixinxiView> selectListView(@Param("ew") Wrapper<RuzhixinxiEntity> wrapper);

	List<RuzhixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<RuzhixinxiEntity> wrapper);
	
	RuzhixinxiView selectView(@Param("ew") Wrapper<RuzhixinxiEntity> wrapper);
	
}

package com.dao;

import com.entity.GangweidiaodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GangweidiaodongVO;
import com.entity.view.GangweidiaodongView;


/**
 * 岗位调动
 * 
 * @author 
 * @email 
 * @date 2021-04-26 17:21:57
 */
public interface GangweidiaodongDao extends BaseMapper<GangweidiaodongEntity> {
	
	List<GangweidiaodongVO> selectListVO(@Param("ew") Wrapper<GangweidiaodongEntity> wrapper);
	
	GangweidiaodongVO selectVO(@Param("ew") Wrapper<GangweidiaodongEntity> wrapper);
	
	List<GangweidiaodongView> selectListView(@Param("ew") Wrapper<GangweidiaodongEntity> wrapper);

	List<GangweidiaodongView> selectListView(Pagination page,@Param("ew") Wrapper<GangweidiaodongEntity> wrapper);
	
	GangweidiaodongView selectView(@Param("ew") Wrapper<GangweidiaodongEntity> wrapper);
	
}

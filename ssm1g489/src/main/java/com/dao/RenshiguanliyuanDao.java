package com.dao;

import com.entity.RenshiguanliyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenshiguanliyuanVO;
import com.entity.view.RenshiguanliyuanView;


/**
 * 人事管理员
 * 
 * @author 
 * @email 
 * @date 2021-04-26 17:21:57
 */
public interface RenshiguanliyuanDao extends BaseMapper<RenshiguanliyuanEntity> {
	
	List<RenshiguanliyuanVO> selectListVO(@Param("ew") Wrapper<RenshiguanliyuanEntity> wrapper);
	
	RenshiguanliyuanVO selectVO(@Param("ew") Wrapper<RenshiguanliyuanEntity> wrapper);
	
	List<RenshiguanliyuanView> selectListView(@Param("ew") Wrapper<RenshiguanliyuanEntity> wrapper);

	List<RenshiguanliyuanView> selectListView(Pagination page,@Param("ew") Wrapper<RenshiguanliyuanEntity> wrapper);
	
	RenshiguanliyuanView selectView(@Param("ew") Wrapper<RenshiguanliyuanEntity> wrapper);
	
}

package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GangweidiaodongDao;
import com.entity.GangweidiaodongEntity;
import com.service.GangweidiaodongService;
import com.entity.vo.GangweidiaodongVO;
import com.entity.view.GangweidiaodongView;

@Service("gangweidiaodongService")
public class GangweidiaodongServiceImpl extends ServiceImpl<GangweidiaodongDao, GangweidiaodongEntity> implements GangweidiaodongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GangweidiaodongEntity> page = this.selectPage(
                new Query<GangweidiaodongEntity>(params).getPage(),
                new EntityWrapper<GangweidiaodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GangweidiaodongEntity> wrapper) {
		  Page<GangweidiaodongView> page =new Query<GangweidiaodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GangweidiaodongVO> selectListVO(Wrapper<GangweidiaodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GangweidiaodongVO selectVO(Wrapper<GangweidiaodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GangweidiaodongView> selectListView(Wrapper<GangweidiaodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GangweidiaodongView selectView(Wrapper<GangweidiaodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

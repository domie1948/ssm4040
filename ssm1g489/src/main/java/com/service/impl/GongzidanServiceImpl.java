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


import com.dao.GongzidanDao;
import com.entity.GongzidanEntity;
import com.service.GongzidanService;
import com.entity.vo.GongzidanVO;
import com.entity.view.GongzidanView;

@Service("gongzidanService")
public class GongzidanServiceImpl extends ServiceImpl<GongzidanDao, GongzidanEntity> implements GongzidanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongzidanEntity> page = this.selectPage(
                new Query<GongzidanEntity>(params).getPage(),
                new EntityWrapper<GongzidanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongzidanEntity> wrapper) {
		  Page<GongzidanView> page =new Query<GongzidanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongzidanVO> selectListVO(Wrapper<GongzidanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongzidanVO selectVO(Wrapper<GongzidanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongzidanView> selectListView(Wrapper<GongzidanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongzidanView selectView(Wrapper<GongzidanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

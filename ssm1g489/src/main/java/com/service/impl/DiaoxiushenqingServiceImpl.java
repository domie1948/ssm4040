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


import com.dao.DiaoxiushenqingDao;
import com.entity.DiaoxiushenqingEntity;
import com.service.DiaoxiushenqingService;
import com.entity.vo.DiaoxiushenqingVO;
import com.entity.view.DiaoxiushenqingView;

@Service("diaoxiushenqingService")
public class DiaoxiushenqingServiceImpl extends ServiceImpl<DiaoxiushenqingDao, DiaoxiushenqingEntity> implements DiaoxiushenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiaoxiushenqingEntity> page = this.selectPage(
                new Query<DiaoxiushenqingEntity>(params).getPage(),
                new EntityWrapper<DiaoxiushenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiaoxiushenqingEntity> wrapper) {
		  Page<DiaoxiushenqingView> page =new Query<DiaoxiushenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiaoxiushenqingVO> selectListVO(Wrapper<DiaoxiushenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiaoxiushenqingVO selectVO(Wrapper<DiaoxiushenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiaoxiushenqingView> selectListView(Wrapper<DiaoxiushenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiaoxiushenqingView selectView(Wrapper<DiaoxiushenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

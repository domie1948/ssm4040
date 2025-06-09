package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiaoxiushenqingEntity;
import com.entity.view.DiaoxiushenqingView;

import com.service.DiaoxiushenqingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 调休申请
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-26 17:21:57
 */
@RestController
@RequestMapping("/diaoxiushenqing")
public class DiaoxiushenqingController {
    @Autowired
    private DiaoxiushenqingService diaoxiushenqingService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiaoxiushenqingEntity diaoxiushenqing, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqiend,
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("putongyuangong")) {
			diaoxiushenqing.setGonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DiaoxiushenqingEntity> ew = new EntityWrapper<DiaoxiushenqingEntity>();
                if(riqistart!=null) ew.ge("riqi", riqistart);
                if(riqiend!=null) ew.le("riqi", riqiend);
		PageUtils page = diaoxiushenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, diaoxiushenqing), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiaoxiushenqingEntity diaoxiushenqing, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqiend,
		HttpServletRequest request){
        EntityWrapper<DiaoxiushenqingEntity> ew = new EntityWrapper<DiaoxiushenqingEntity>();
                if(riqistart!=null) ew.ge("riqi", riqistart);
                if(riqiend!=null) ew.le("riqi", riqiend);
		PageUtils page = diaoxiushenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, diaoxiushenqing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiaoxiushenqingEntity diaoxiushenqing){
       	EntityWrapper<DiaoxiushenqingEntity> ew = new EntityWrapper<DiaoxiushenqingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( diaoxiushenqing, "diaoxiushenqing")); 
        return R.ok().put("data", diaoxiushenqingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiaoxiushenqingEntity diaoxiushenqing){
        EntityWrapper< DiaoxiushenqingEntity> ew = new EntityWrapper< DiaoxiushenqingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( diaoxiushenqing, "diaoxiushenqing")); 
		DiaoxiushenqingView diaoxiushenqingView =  diaoxiushenqingService.selectView(ew);
		return R.ok("查询调休申请成功").put("data", diaoxiushenqingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiaoxiushenqingEntity diaoxiushenqing = diaoxiushenqingService.selectById(id);
        return R.ok().put("data", diaoxiushenqing);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiaoxiushenqingEntity diaoxiushenqing = diaoxiushenqingService.selectById(id);
        return R.ok().put("data", diaoxiushenqing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiaoxiushenqingEntity diaoxiushenqing, HttpServletRequest request){
    	diaoxiushenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(diaoxiushenqing);

        diaoxiushenqingService.insert(diaoxiushenqing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiaoxiushenqingEntity diaoxiushenqing, HttpServletRequest request){
    	diaoxiushenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(diaoxiushenqing);

        diaoxiushenqingService.insert(diaoxiushenqing);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiaoxiushenqingEntity diaoxiushenqing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(diaoxiushenqing);
        diaoxiushenqingService.updateById(diaoxiushenqing);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        diaoxiushenqingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiaoxiushenqingEntity> wrapper = new EntityWrapper<DiaoxiushenqingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("putongyuangong")) {
			wrapper.eq("gonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = diaoxiushenqingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}

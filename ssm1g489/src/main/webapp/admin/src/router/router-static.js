import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import yuangongpeixun from '@/views/modules/yuangongpeixun/list'
    import gongzidan from '@/views/modules/gongzidan/list'
    import putongyuangong from '@/views/modules/putongyuangong/list'
    import yuangongxinxi from '@/views/modules/yuangongxinxi/list'
    import gangweidiaodong from '@/views/modules/gangweidiaodong/list'
    import kaoqindaka from '@/views/modules/kaoqindaka/list'
    import ruzhixinxi from '@/views/modules/ruzhixinxi/list'
    import renshiguanliyuan from '@/views/modules/renshiguanliyuan/list'
    import diaoxiushenqing from '@/views/modules/diaoxiushenqing/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '系统消息',
        component: news
      }
      ,{
	path: '/yuangongpeixun',
        name: '员工培训',
        component: yuangongpeixun
      }
      ,{
	path: '/gongzidan',
        name: '工资单',
        component: gongzidan
      }
      ,{
	path: '/putongyuangong',
        name: '普通员工',
        component: putongyuangong
      }
      ,{
	path: '/yuangongxinxi',
        name: '员工信息',
        component: yuangongxinxi
      }
      ,{
	path: '/gangweidiaodong',
        name: '岗位调动',
        component: gangweidiaodong
      }
      ,{
	path: '/kaoqindaka',
        name: '考勤打卡',
        component: kaoqindaka
      }
      ,{
	path: '/ruzhixinxi',
        name: '入职信息',
        component: ruzhixinxi
      }
      ,{
	path: '/renshiguanliyuan',
        name: '人事管理员',
        component: renshiguanliyuan
      }
      ,{
	path: '/diaoxiushenqing',
        name: '调休申请',
        component: diaoxiushenqing
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;

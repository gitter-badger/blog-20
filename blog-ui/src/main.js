import Vue from 'vue'
import VueRouter from 'vue-router'
import routes from './conf/blog.router'
import ElementUI from 'element-ui'
import echarts from 'echarts'
window.echarts = echarts
/*import 'vue-fullpage/vue-fullpage.css'
import VueFullPage from 'vue-fullpage'*/
import 'animate.css'
import device from 'current-device'
import 'jquery-mousewheel'
import './lib/plugins/mCustomScrollbar/jquery.mCustomScrollbar.concat.min'
import './lib/plugins/mCustomScrollbar/jquery.mCustomScrollbar.min.css'
import 'node-waves/dist/waves.min.css'
import 'bootstrap/dist/js/bootstrap.min'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'element-ui/lib/theme-chalk/index.css'
import 'element-ui/lib/theme-chalk/display.css';
import './css/global.css';
import './css/main.less'
//myPlugin
import blogCarousel from "./component/plugin/blog-carousel";

import App from './App.vue'
waves.init({duration: 500, delay: 200});
const router = new VueRouter({
  routes
});
Vue.use(VueRouter)
//Vue.use(VueFullPage)
Vue.use(ElementUI)
Vue.use(blogCarousel)

new Vue({
  el: '#blog-body',
  render: h => h(App),
  router
});

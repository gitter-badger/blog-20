import Vue from 'vue'
import VueRouter from 'vue-router'
import routes from './conf/blog.router'
import ElementUI from 'element-ui'
import echarts from 'echarts'
window.echarts = echarts
//import VueFullPage from 'vue-fullpage'
import 'animate.css'
//import 'vue-fullpage/vue-fullpage.css'
import 'bootstrap/dist/js/bootstrap.min'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'element-ui/lib/theme-chalk/index.css'
import 'element-ui/lib/theme-chalk/display.css';
import './css/global.css';
import App from './App.vue'

const router  = new VueRouter({
  routes
});
Vue.use(VueRouter)
//Vue.use(VueFullPage)
Vue.use(ElementUI)
new Vue({
  el: '#blog-body',
  render: h => h(App),
  router
})

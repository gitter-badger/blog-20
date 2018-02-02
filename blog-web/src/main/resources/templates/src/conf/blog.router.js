import blogHome from './../component/blog-home.vue'

export default [
   {path:'/blogHome',component:blogHome},
  {path: '*', redirect: '/blogHome'}

]

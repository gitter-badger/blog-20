<style lang="css">
  #blog-content .el-tabs--border-card > .el-tabs__header {
    background: #393D49;
  }
</style>
<template>
  <div id="blog-content">
    <el-tabs type="border-card" style="border: none;">
      <el-tab-pane>
        <span slot="label"><!--<i class="el-icon-date"></i>--> 首页</span>
       <blog-content-body></blog-content-body>
      </el-tab-pane>
    </el-tabs>
  </div>
</template>
<script>
  import blogContentBody from './blog-content-body.vue'
  export default {
    name: 'blog-content',
    data() {
      return {};
    },
    methods: {},
    components: {
      blogContentBody
    }
  };
</script>

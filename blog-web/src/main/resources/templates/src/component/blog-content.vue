<style lang="css">
  #blog-content .el-tabs--border-card > .el-tabs__header {
    background: #393D49
  }
</style>
<template>
  <div id="blog-content">
    <el-tabs type="border-card"  style="border: none;">
      <el-tab-pane>
        <span slot="label"><!--<i class="el-icon-date"></i>--> 我的行程</span>

      </el-tab-pane>
      <el-tab-pane>
        <span slot="label"><!--<i class="el-icon-document"></i> -->个人中心</span>
        个人中心
      </el-tab-pane>
      <el-tab-pane>
        <span slot="label"><!--<i class="el-icon-service"></i>--> 角色管理</span>
        <p>角色管理</p>
        <p>角色管理</p>
        <p>角色管理</p>
      </el-tab-pane>
      <el-tab-pane>
        <span slot="label"><!--<i class="el-icon-setting"></i> -->定时任务</span>
        定时任务
      </el-tab-pane>
    </el-tabs>
  </div>
</template>
<script>
  export default {
    name: 'blog-content',
    data() {
      return {};
    },
    methods: {}
  };
</script>

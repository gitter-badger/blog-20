<style lang="css">
  #blog-left-menu .el-menu {
    border: none;
  }

  #blog-left-menu .blog-user-info {
    height: 130px;
    cursor: pointer;
    background: url("./images/user-info-bj.png");
  }

  #blog-left-menu .blog-user-info > .user-head-portrait > img {
    border: 3px solid rgba(0,0,0,.14);
    width:60px;
    height: 60px;
    border-radius: 30px;
    margin: 15px 0px 21px 20px;
  }

  #blog-left-menu .blog-user-info > .user-name {
    background: rgba(0, 0, 0, .37);
    height: 32px;
    color: white;
    font-size: 13px;
    padding: 8px 0px 0px 10px;
  }

  #blog-left-menu .blog-user-info > .user-name > span {
    display: inline-block;
    width: 233px;
    overflow: hidden;
    white-space: nowrap;
    text-overflow: ellipsis;
  }
  #blog-left-menu .blog-user-info > .user-name>i{
    position: relative;
    bottom: 5px;
  }
</style>
<template>
  <div id="blog-left-menu">
    <div class="blog-user-info" @click="userInfo()">
      <div class="user-head-portrait">
        <img src="./images/user-def-head-portrait.png" alt="用户头像">
      </div>
      <div class="user-name">
        <span>亮帅，你好！</span>
        <i class="el-icon-caret-bottom"></i>
      </div>
    </div>
    <el-menu
      default-active="2"
      class="el-menu-vertical-demo"
      @open="handleOpen"
      @close="handleClose">
      <!-- background-color="#545c64"
      text-color="#fff"
      active-text-color="#ffd04b"-->
      <el-submenu index="1">
        <template slot="title">
          <i class="el-icon-location"></i>
          <span>我的博客</span>
        </template>
        <el-menu-item-group>
          <template slot="title">分组一</template>
          <el-menu-item index="1-1">选项1</el-menu-item>
          <el-menu-item index="1-2">选项2</el-menu-item>
        </el-menu-item-group>
        <el-menu-item-group title="分组2">
          <el-menu-item index="1-3">选项3</el-menu-item>
        </el-menu-item-group>
        <el-submenu index="1-4">
          <template slot="title">选项4</template>
          <el-menu-item index="1-4-1">选项1</el-menu-item>
        </el-submenu>
      </el-submenu>
      <el-menu-item index="2">
        <i class="el-icon-menu"></i>
        <span slot="title">热门博客</span>
      </el-menu-item>
      <el-menu-item index="3">
        <i class="el-icon-setting"></i>
        <span slot="title">博客管理</span>
      </el-menu-item>
    </el-menu>
  </div>
</template>
<script>
  export default {
    name: 'blog-left-menu',
    methods: {
      handleOpen(key, keyPath) {
        console.log(key, keyPath);
      },
      handleClose(key, keyPath) {
        console.log(key, keyPath);
      },
      userInfo:function () {

      }
    }
  }
</script>

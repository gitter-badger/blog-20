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
    border: 3px solid rgba(0, 0, 0, .14);
    width: 60px;
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

  #blog-left-menu .blog-user-info > .user-name > i {
    position: relative;
    bottom: 5px;
  }
</style>
<template>
  <div id="blog-left-menu">
    <div class="blog-user-info" @click="isOpenUserInfo = !isOpenUserInfo;">
      <div class="user-head-portrait">
        <img src="./images/user-def-head-portrait.png" alt="用户头像">
      </div>
      <div class="user-name">
        <span>帅哥，你好！</span>
        <i class="el-icon-caret-bottom" v-show="isOpenUserInfo"></i>
        <i class="el-icon-caret-top" v-show="!isOpenUserInfo"></i>
      </div>
    </div>
    <div class="blog-user-menu" v-show="!isOpenUserInfo">
      <el-menu
        default-active="2"
        class="el-menu-vertical-demo"
        @open="handleOpen"
        @close="handleClose">
        <el-menu-item index="1">
          <i class="el-icon-setting"></i>
          <span slot="title">个人资料</span>
        </el-menu-item>
        <el-menu-item index="2">
          <i class="el-icon-setting"></i>
          <span slot="title">隐私设置</span>
        </el-menu-item>
        <el-menu-item index="3">
          <i class="el-icon-setting"></i>
          <span slot="title">系统设置</span>
        </el-menu-item>
        <el-menu-item index="4">
          <i class="el-icon-setting"></i>
          <span slot="title">推出登陆</span>
        </el-menu-item>
      </el-menu>
    </div>
    <el-menu
      default-active="2"
      class="el-menu-vertical-demo"
      @open="handleOpen"
      @close="handleClose">
      <!-- background-color="#545c64"
      text-color="#fff"
      active-text-color="#ffd04b"-->
      <el-submenu :index="menuIndexHandler(index)" :key="index" v-for="(item, index) in menuData">

        <template slot="title">
          <i :class="item.iocn"></i>
          <span>{{item.name}}</span>
        </template>


        <el-submenu v-if="item.type === 'submenu'" index="1-4" v-for="(childItem, childIndex) in item.child">
          <template slot="title">{{childItem.name}}</template>
          <el-menu-item index="1-4-1">xxxx</el-menu-item>
        </el-submenu>

        <el-menu-item-group v-else v-for="(childItem, childIndex) in item.child">
          <template slot="title">{{childItem.name}}</template>
          <el-menu-item index="1-1">选项1</el-menu-item>
        </el-menu-item-group>


      </el-submenu>

    </el-menu>
  </div>
</template>
<script>
  import menuData from './data/blog.left.menu.json'

  export default {
    name: 'blog-left-menu',
    data() {
      return {
        isOpenUserInfo: true,
        menuData
      }
    },
    methods: {
      handleOpen(key, keyPath) {
        console.log(key, keyPath);
      },
      handleClose(key, keyPath) {
        console.log(key, keyPath);
      },
      menuIndexHandler(index) {
        return String(index + 1);
      }
    }
  }
</script>

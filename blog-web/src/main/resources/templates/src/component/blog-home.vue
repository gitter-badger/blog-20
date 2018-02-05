<style lang="css">
  @media screen and (min-width: 1200px) {
    #blog-home .blog-content {
      padding-left: 268px;
      display: block;
    }

    #blog-home > #blog-nav > .nave-body > .blog-menu-button {
      display: none;
    }
  }

  @media screen  and (max-width: 1200px) {
    #blog-home .blog-content {
      padding-left: 0px;
    }

    #blog-home .blog-left-menu {
      display: none;
    }

    #blog-home > #blog-nav > .nave-body > .blog-menu-button {
      display: block;
    }

    #blog-home > #blog-nav > .nave-body > .logo {
      display: none;
    }
  }

  #blog-home > #blog-nav > .nave-body {
    /*border: 1px solid white;*/
    position: fixed;
    width: 100%;
    height: 40px;
    top: 15px;
  }

  #blog-home > #blog-nav > .nave-body > .logo {
    margin-left: 10px;
    width: 100px;
    height: 40px;
    color: #fff;
    cursor: pointer;
  }

  #blog-home > #blog-nav > .nave-body > .logo > .sys-title {
    display: inline-block;
    position: absolute;
    font-size: 16px;
    top: 12px;
    left: 115px;
  }

  #blog-home > #blog-nav {
    background: #393D49;
    box-shadow: 0 1px 4px rgba(0, 0, 0, .3);
    width: 100%;
    height: 70px;
    position: fixed;
    top: 0px;
    z-index: 11;
  }

  #blog-home > #blog-nav > .nave-body > .blog-menu-button {
    width: 35px;
    padding: 5px;
    cursor: pointer;
    margin: 5px 0px 0px 10px;
    border-radius: 5px;

  }

  #blog-home > #blog-nav > .nave-body > .blog-menu-button:hover {
    background-color: rgba(255, 255, 255, .22);
  }

  #blog-home > #blog-nav > .nave-body > .blog-menu-back {
    height: 30px;
    background: url("./images/blog-top-return.png");
  }

  #blog-home > #blog-nav > .nave-body > .blog-menu-button > div.ic-bar {
    border: 1px solid white;
    margin: 3px 0px 2px 2px;
    border-radius: 5px;
    width: 20px;
  }

  #blog-home > #blog-nav > .nave-body > .blog-nave-right {
    position: absolute;
    top: 0px;
    right: 0px;
    height: 40px;
    width: 200px;
  }

  #blog-home > #blog-nav > .nave-body > .blog-nave-right > div {
    width: 40px;
    padding: 7px;
    float: right;
    margin-right: 20px;
    cursor: pointer;
    border-radius: 5px;
    text-align: center;
  }

  #blog-home > #blog-nav > .nave-body > .blog-nave-right > div:hover {
    background-color: rgba(255, 255, 255, .22);
  }

  #blog-home .blog-left-menu {
    /* background-color: rgb(84, 92, 100);*/
    width: 268px;
    position: fixed;
    top: 70px;
    transition: all;
    z-index: 9;
    overflow-y: auto;
    height: calc(100% - 90px);
    box-shadow: 1px 0 4px rgba(0, 0, 0, .3);
  }

  #blog-home .blog-content {
    /*  background: salmon;*/
    overflow: auto;
    position: absolute;
    top: 70px;
    width: 100%;
    z-index: 5;
  }

  #blog-home .blog-bottom {
    background-color: #DDDDDD;
    padding: 0px 10px 0px 10px;
    line-height: 25px;
    position: fixed;
    bottom: 0px;
    width: 100%;
    z-index: 10;
    font-size: 12px;
  }
</style>
<template>
  <div id="blog-home">
    <div id="blog-nav">
      <div class="nave-body">
        <div class="logo">
          <img src="./images/blog-def-logo.png" alt="blog"/>
          <span class="sys-title">信息管理系统</span>
        </div>
        <div @click="switchMenu()" class="blog-menu-button">
          <div class="ic-bar"></div>
          <div class="ic-bar"></div>
          <div class="ic-bar"></div>
        </div>

        <div class="blog-nave-right">
          <el-popover
            ref="popover1"
            placement="bottom"
            width="200"
            trigger="click">
            <el-input placeholder="搜索" class="input-with-select">
              <el-button slot="append" icon="el-icon-search"></el-button>
            </el-input>
          </el-popover>
          <el-popover
            ref="popover2"
            placement="bottom"
            width="100"
            trigger="click">
            <p>用户理系统</p>
            <p>支付管理系统</p>
            <p>权限管理系统</p>
            <p>内容管理系统</p>
          </el-popover>
          <el-popover
            ref="popover3"
            placement="bottom"
            width="200"
            trigger="click">
            敬请期待
          </el-popover>
          <div v-popover:popover3><img width="24" src="./images/blog-top-more.png" alt="更多"></div>
          <div v-popover:popover2><img width="24" src="./images/blog-top-config.png" alt="更多"></div>
          <div v-popover:popover1><img width="24" src="./images/blog-top-sreach.png" alt="搜索"></div>
        </div>
      </div>
    </div>

    <div class="blog-left-menu">
      <blog-left-menu></blog-left-menu>
    </div>

    <div class="blog-content">
      <blog-content></blog-content>
    </div>

    <div class="blog-bottom">© PENGLIANG-BLOGWEB V1.0.0 </div>
  </div>
</template>


<script>
  import blogLeftMenu from './blog-left-menu.vue'
  import blogContent from './blog-content.vue'

  export default {
    name: 'blog-home',
    data: function () {
      return {
        menu: {
          isClick: false
        }
      }
    },
    methods: {
      switchMenu: function () {
        var menu = this.menu;
        if (menu.isClick === true) {
          $('#blog-home>.blog-left-menu').hide();
          $('#blog-home > #blog-nav > .nave-body > .blog-menu-button').removeClass("blog-menu-back").find('.ic-bar').show();
          menu.isClick = false;
        } else {
          $('#blog-home>.blog-left-menu').show();
          $('#blog-home > #blog-nav > .nave-body > .blog-menu-button').addClass("blog-menu-back").find('.ic-bar').hide();
          menu.isClick = true;
        }
      }
    }
    , created: function () {
      var _this = this;
      window.onresize = function () {
        var menu = _this.menu;
        var browserWidth = $(window).width() || $(document.body).width() || document.body.clientWidth;
        if (browserWidth >= 1200) {
          $('#blog-home>.blog-left-menu').show();
          return;
        }
        if (browserWidth < 1200) {
          if (menu.isClick === false) {
            $('#blog-home>.blog-left-menu').hide();
          }
          return;
        }
      }
    }
    , components: {
      blogLeftMenu,
      blogContent
    }
  }
</script>

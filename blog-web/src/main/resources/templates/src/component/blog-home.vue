<style lang="css">

  #blog-home nav.blog-nav {
    margin: 0px;
    padding: 0px;
  }

  #blog-home .navbar-inverse .navbar-nav > li > a {
    color: #9d9d9d;
  }

  #blog-home .blog-left-menu {
    background: skyblue;
    width: 268px;
    position: fixed;
    top: 51px;
    transition: all;
    z-index: 10;
    overflow-y: auto;
    height: calc(100% - 70px);
    box-shadow: 1px 0 4px rgba(0, 0, 0, .3);
  }

  #blog-home .blog-content {
    background: salmon;

  }

  @media screen and (min-width: 1200px) {
    #blog-home .blog-content {
      padding-left: 268px;
    }
  }

  @media screen  and (max-width: 1200px) {
    #blog-home .blog-content {
      padding-left: 0px;
    }

    #blog-home .blog-left-menu {
      display: none;
    }
  }


</style>
<template>
  <div id="blog-home">
    <nav class="navbar navbar-inverse navbar-static-top blog-nav">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed blog-top-menu">
            <span class="sr-only">切换菜单</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">BLOG</a>
        </div>

      </div><!-- /.container-fluid -->
    </nav>
    <div class="blog-left-menu">1</div>

    <div class="blog-content">2</div>
  </div>
</template>


<script>
  export default {
    name: 'blog-home',
    data: function () {
      return {}
    }
  }


</script>

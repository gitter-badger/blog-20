export default {
  install: function (Vue, options) {
    Vue.directive('blog-carousel', {
      bind: function (el, binding, vnode, oldVnode) {
        var $this = $(el);
        var $initVal = $this.find('.blog-carousel>.blog-carousel-this[carousel-index]').attr('carousel-index');
        $this.find('[blog-carousel-body]>[carousel-index!='+$initVal+']').css('display','none');
        var $bodyIndexEl = $this.find('[blog-carousel-body] [carousel-index]');
        $bodyIndexEl.addClass('animated');

        $this.find('.blog-carousel>[carousel-index]').click(function () {
          var clickEl = $(this);
          $this.find('.blog-carousel-this').removeClass('blog-carousel-this');
          $(this).addClass('blog-carousel-this');
          $bodyIndexEl.removeClass('slideInLeft');
          $this.find('[blog-carousel-body] [carousel-index='+clickEl.attr('carousel-index')+']').addClass('animated slideInLeft');
        });


      },
      inserted: function () {
        console.log("被绑定元素");
      },
      update: function () {
        console.log("更新元素");
      },
      componentUpdated: function () {
      },
      unbind: function () {
      }
    })
  }
}

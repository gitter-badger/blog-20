<template>
  <div id="blog-body" v-cloak>
    <router-view></router-view>
  </div>
</template>
<script>
  export default {
    name: 'app',
    data: function () {
      return {}
    }
  }
</script>

<style>
  [v-cloak] {
    display: none
  }
</style>

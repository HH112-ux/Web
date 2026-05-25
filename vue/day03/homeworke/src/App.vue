<template>
  <div id="app">
    <XtxShortCut />
    <XtxHeaderNav />
    <XtxBanner />
    <XtxNewGoods />
    <XtxHotBrand />
    <XtxTopic />
    <XtxFooter />
  </div>
</template>

<script>
import XtxShortCut from './components/XtxShortCut.vue'
import XtxHeaderNav from './components/XtxHeaderNav.vue'
import XtxBanner from './components/XtxBanner.vue'
import XtxNewGoods from './components/XtxNewGoods.vue'
import XtxHotBrand from './components/XtxHotBrand.vue'
import XtxTopic from './components/XtxTopic.vue'
import XtxFooter from './components/XtxFooter.vue'

export default {
  name: 'App',
  components: {
    XtxShortCut,
    XtxHeaderNav,
    XtxBanner,
    XtxNewGoods,
    XtxHotBrand,
    XtxTopic,
    XtxFooter
  }
}
</script>

<style>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}
body {
  font-family: "Microsoft YaHei", sans-serif;
  line-height: 1.6;
}
</style>

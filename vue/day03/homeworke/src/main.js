import Vue from 'vue'
import App from './App.vue'

// 引入组件
import XtxShortCut from './components/XtxShortCut.vue'
import XtxHeaderNav from './components/XtxHeaderNav.vue'
import XtxBanner from './components/XtxBanner.vue'
import XtxHotBrand from './components/XtxHotBrand.vue'
import XtxTopic from './components/XtxTopic.vue'
import XtxNewGoods from './components/XtxNewGoods.vue'
import XtxFooter from './components/XtxFooter.vue'

new Vue({
  el: '#app',
  components: {
    // 局部注册（按作业要求）
    XtxShortCut,
    XtxHeaderNav,
    XtxBanner,
    XtxHotBrand,
    XtxTopic,
    XtxNewGoods,
    XtxFooter
  },
  render: h => h(App)
})
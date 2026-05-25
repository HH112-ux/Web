<template>
  <div class="App">
    <!-- 头部组件 -->
    <MyHeader></MyHeader>
    <!-- 主体组件 -->
    <MyMain></MyMain>
    <!-- 底部组件 -->
    <MyFooter></MyFooter>
  </div>
</template>

<script>
import MyHeader from './components/MyHeader.vue'
import MyMain from './components/MyMain.vue'
import MyFooter from './components/MyFooter.vue'
export default {
  components: {
    // '组件名': 组件对象
    MyHeader: MyHeader,
    MyMain,
    MyFooter
  }
}
</script>

<style>
.App {
  width: 600px;
  height: 700px;
  background-color: #87ceeb;
  margin: 0 auto;
  padding: 20px;
}
</style>
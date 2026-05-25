<template>
  <div class="my-header">
    我是my-header
    <MyButton></MyButton>
  </div>
</template>

<script>
// import MyButton from './MyButton.vue'
export default {
  // 局部注册: 注册的组件只能在当前的组件范围内使用
  // components: {
  //   MyButton
  // }
}
</script>

<style>
.my-header {
  height: 100px;
  line-height: 100px;
  text-align: center;
  font-size: 30px;
  background-color: #8064a2;
  color: white;
}
</style>
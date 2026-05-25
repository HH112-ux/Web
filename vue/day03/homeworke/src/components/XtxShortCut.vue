<template>
  <div class="xtx-shortcut">
    <ul class="shortcut-list">
      <li v-for="item in shortcuts" :key="item.id">
        <a href="javascript:;">{{ item.text }}</a>
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: 'XtxShortCut',
  data() {
    return {
      shortcuts: [
        { id: 1, text: '请先登录' },
        { id: 2, text: '免费注册' },
        { id: 3, text: '我的订单' },
        { id: 4, text: '会员中心' },
        { id: 5, text: '帮助中心' },
        { id: 6, text: '在线客服' },
        { id: 7, text: '手机版' }
      ]
    }
  }
}
</script>

<style scoped>
.xtx-shortcut {
  background-color: #333;
  color: #fff;
  font-size: 12px;
  padding: 4px 0;
}
.shortcut-list {
  display: flex;
  justify-content: center;
  list-style: none;
  margin: 0;
  padding: 0;
}
.shortcut-list li {
  margin: 0 10px;
}
.shortcut-list a {
  color: #ccc;
  text-decoration: none;
}
.shortcut-list a:hover {
  color: #fff;
}
</style>
<template>
  <div class="xtx-new-goods">
    <h3 class="title">新鲜好物</h3>
    <div class="goods-list">
      <BaseGoodsItem
        v-for="good in goods"
        :key="good.id"
        :title="good.title"
        :desc="good.desc"
      />
    </div>
  </div>
</template>

<script>
import BaseGoodsItem from './BaseGoodsItem.vue'

export default {
  name: 'XtxNewGoods',
  components: {
    BaseGoodsItem
  },
  data() {
    return {
      goods: [
        { id: 1, title: '木质收纳盒', desc: '天然原木质感' },
        { id: 2, title: '绿色笔记本套装', desc: '文艺复古风' },
        { id: 3, title: '北欧简约沙发', desc: '舒适布艺设计' }
      ]
    }
  }
}
</script>

<style scoped>
.xtx-new-goods {
  padding: 20px 0;
  background-color: #f9f9f9;
}
.title {
  text-align: center;
  font-size: 16px;
  color: #333;
  margin-bottom: 20px;
}
.goods-list {
  display: flex;
  gap: 20px;
  max-width: 1200px;
  margin: 0 auto;
  padding: 0 20px;
}
</style>

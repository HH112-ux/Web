<template>
  <div class="base-goods-item">
    <div class="goods-icon">📦</div>
    <div class="goods-info">
      <h4>{{ title }}</h4>
      <p>{{ desc }}</p>
    </div>
  </div>
</template>

<script>
export default {
  name: 'BaseGoodsItem',
  props: {
    title: {
      type: String,
      required: true
    },
    desc: {
      type: String,
      required: true
    }
  }
}
</script>

<style scoped>
.base-goods-item {
  flex: 1;
  min-width: 280px;
  background: #fff;
  border-radius: 4px;
  overflow: hidden;
  box-shadow: 0 2px 8px rgba(0,0,0,0.05);
}
.goods-icon {
  width: 100%;
  height: 180px;
  display: flex;
  align-items: center;
  justify-content: center;
  font-size: 48px;
  background: linear-gradient(135deg, #f5f7fa 0%, #c3cfe2 100%);
}
.goods-info {
  padding: 16px;
}
.goods-info h4 {
  margin: 0 0 8px 0;
  font-size: 16px;
}
.goods-info p {
  color: #666;
  font-size: 12px;
}
</style>

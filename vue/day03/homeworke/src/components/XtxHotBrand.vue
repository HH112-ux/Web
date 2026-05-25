<template>
  <div class="xtx-hot-brand">
    <h3 class="title">热门品牌</h3>
    <div class="brand-grid">
      <BaseBrandItem
        v-for="brand in brands"
        :key="brand.id"
        :name="brand.name"
        :desc="brand.desc"
      />
    </div>
  </div>
</template>

<script>
import BaseBrandItem from './BaseBrandItem.vue'

export default {
  name: 'XtxHotBrand',
  components: {
    BaseBrandItem
  },
  data() {
    return {
      brands: [
        { id: 1, name: 'inman', desc: '夏季爆款短袖' },
        { id: 2, name: 'PEACEBIRD', desc: '全场1件7.5折' },
        { id: 3, name: 'ONLY', desc: '2件8折 3件7折' },
        { id: 4, name: 'OSA欧莎', desc: '到手低至5.5折' }
      ]
    }
  }
}
</script>

<style scoped>
.xtx-hot-brand {
  padding: 20px 0;
  background-color: #f9f9f9;
}
.title {
  text-align: center;
  font-size: 16px;
  color: #333;
  margin-bottom: 20px;
}
.brand-grid {
  display: grid;
  grid-template-columns: repeat(4, 1fr);
  gap: 20px;
  max-width: 1200px;
  margin: 0 auto;
  padding: 0 20px;
}
</style>

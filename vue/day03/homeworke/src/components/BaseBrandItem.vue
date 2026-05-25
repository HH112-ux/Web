<template>
  <div class="base-brand-item">
    <div class="brand-icon">🏷️</div>
    <p>{{ name }}</p>
    <small>{{ desc }}</small>
  </div>
</template>

<script>
export default {
  name: 'BaseBrandItem',
  props: {
    name: {
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
.base-brand-item {
  text-align: center;
}
.brand-icon {
  width: 120px;
  height: 120px;
  display: flex;
  align-items: center;
  justify-content: center;
  font-size: 36px;
  background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
  border-radius: 4px;
  margin: 0 auto;
}
.base-brand-item p {
  margin: 10px 0 5px;
  font-weight: bold;
}
.base-brand-item small {
  color: #999;
  font-size: 12px;
}
</style>

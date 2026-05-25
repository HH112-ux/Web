<template>
  <div class="base-topic-item">
    <div class="topic-icon">📖</div>
    <div class="info">
      <h4>{{ title }}</h4>
      <p>{{ desc }}</p>
      <div class="stats">
        <span>♡ {{ likes }}</span>
        <span>👁️ {{ views }}</span>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'BaseTopicItem',
  props: {
    title: {
      type: String,
      required: true
    },
    desc: {
      type: String,
      required: true
    },
    likes: {
      type: Number,
      default: 0
    },
    views: {
      type: Number,
      default: 0
    }
  }
}
</script>

<style scoped>
.base-topic-item {
  flex: 1;
  min-width: 280px;
  display: flex;
  background: #fff;
  border-radius: 4px;
  overflow: hidden;
  box-shadow: 0 2px 8px rgba(0,0,0,0.05);
}
.topic-icon {
  width: 120px;
  height: 120px;
  display: flex;
  align-items: center;
  justify-content: center;
  font-size: 32px;
  background: linear-gradient(135deg, #ffecd2 0%, #fcb69f 100%);
}
.info {
  padding: 16px;
  flex: 1;
}
.info h4 {
  margin: 0 0 8px 0;
  font-size: 16px;
}
.info p {
  color: #666;
  font-size: 12px;
  margin-bottom: 12px;
}
.stats {
  display: flex;
  gap: 16px;
  font-size: 12px;
  color: #999;
}
</style>

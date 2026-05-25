<template>
  <div class="xtx-topic">
    <h3 class="title">最新专题</h3>
    <div class="topic-list">
      <BaseTopicItem
        v-for="topic in topics"
        :key="topic.id"
        :title="topic.title"
        :desc="topic.desc"
        :likes="topic.likes"
        :views="topic.views"
      />
    </div>
  </div>
</template>

<script>
import BaseTopicItem from './BaseTopicItem.vue'

export default {
  name: 'XtxTopic',
  components: {
    BaseTopicItem
  },
  data() {
    return {
      topics: [
        {
          id: 1,
          title: '吃这些美食才不算辜负自己',
          desc: '健康轻食守护好物',
          likes: 258,
          views: 1800
        },
        {
          id: 2,
          title: '吃这些美食才不算辜负自己',
          desc: '健康轻食守护好物',
          likes: 295,
          views: 1800
        }
      ]
    }
  }
}
</script>

<style scoped>
.xtx-topic {
  padding: 20px 0;
}
.title {
  text-align: center;
  font-size: 16px;
  color: #333;
  margin-bottom: 20px;
}
.topic-list {
  display: flex;
  gap: 20px;
  max-width: 1200px;
  margin: 0 auto;
  padding: 0 20px;
}
</style>

<template>
  <div class="xtx-banner">
    <div class="container">
      <div class="category-menu">
        <ul>
          <li v-for="item in categories" :key="item.id">
            <span class="category-name">{{ item.name }}</span>
            <span class="arrow">&gt;</span>
          </li>
        </ul>
      </div>
      <div class="banner-slider">
        <div class="slider-wrapper" :style="{ transform: `translateX(-${currentIndex * 100}%)` }">
          <div class="slide" v-for="(slide, index) in slides" :key="index">
            <div class="slide-content">
              <h2>{{ slide.title }}</h2>
              <p>{{ slide.subtitle }}</p>
              <a href="javascript:;" class="btn-go">GO &gt;</a>
            </div>
          </div>
        </div>
        <div class="indicators">
          <span
            v-for="(slide, index) in slides"
            :key="index"
            :class="{ active: currentIndex === index }"
            @click="goToSlide(index)"
          ></span>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'XtxBanner',
  data() {
    return {
      currentIndex: 0,
      categories: [
        { id: 1, name: '生鲜 水果蔬菜' },
        { id: 2, name: '美食 面点干货' },
        { id: 3, name: '餐厨 数码产品' },
        { id: 4, name: '电器 床品四件套' },
        { id: 5, name: '居家 奶粉玩具' },
        { id: 6, name: '洗护 洗发洗护' },
        { id: 7, name: '孕婴 奶粉玩具' },
        { id: 8, name: '服饰 女装男装' },
        { id: 9, name: '杂货 户外图书' },
        { id: 10, name: '品牌 品牌特卖' }
      ],
      slides: [
        { title: 'SPRING NEW', subtitle: '魅力早春' },
        { title: 'SUMMER SALE', subtitle: '夏日特惠' },
        { title: 'AUTUMN FASHION', subtitle: '秋季新品' }
      ],
      timer: null
    }
  },
  mounted() {
    this.startAutoPlay()
  },
  beforeDestroy() {
    this.stopAutoPlay()
  },
  methods: {
    startAutoPlay() {
      this.timer = setInterval(() => {
        this.currentIndex = (this.currentIndex + 1) % this.slides.length
      }, 3000)
    },
    stopAutoPlay() {
      clearInterval(this.timer)
    },
    goToSlide(index) {
      this.currentIndex = index
      this.stopAutoPlay()
      this.startAutoPlay()
    }
  }
}
</script>

<style scoped>
.xtx-banner {
  background-color: #f5f5f5;
}
.container {
  max-width: 1200px;
  margin: 0 auto;
  display: flex;
  height: 500px;
}
.category-menu {
  width: 200px;
  background-color: #333;
  padding: 10px 0;
}
.category-menu ul {
  list-style: none;
  padding: 0;
  margin: 0;
}
.category-menu li {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 12px 20px;
  color: #fff;
  font-size: 14px;
  cursor: pointer;
  transition: background-color 0.3s;
}
.category-menu li:hover {
  background-color: #555;
}
.category-name {
  color: #ccc;
}
.arrow {
  color: #999;
  font-size: 12px;
}
.banner-slider {
  flex: 1;
  position: relative;
  overflow: hidden;
}
.slider-wrapper {
  display: flex;
  height: 100%;
  transition: transform 0.5s ease;
}
.slide {
  min-width: 100%;
  height: 100%;
  display: flex;
  align-items: center;
  justify-content: center;
  background: linear-gradient(135deg, #e8f5e9 0%, #c8e6c9 100%);
}
.slide-content {
  text-align: center;
}
.slide-content h2 {
  font-size: 48px;
  color: #8bc34a;
  font-weight: 300;
  letter-spacing: 8px;
  margin: 0 0 10px 0;
}
.slide-content p {
  font-size: 64px;
  color: #4caf50;
  font-weight: bold;
  margin: 0 0 30px 0;
}
.btn-go {
  display: inline-block;
  width: 60px;
  height: 60px;
  line-height: 60px;
  text-align: center;
  background-color: #8bc34a;
  color: #fff;
  border-radius: 50%;
  text-decoration: none;
  font-size: 14px;
  font-weight: bold;
}
.indicators {
  position: absolute;
  bottom: 20px;
  left: 50%;
  transform: translateX(-50%);
  display: flex;
  gap: 10px;
}
.indicators span {
  width: 10px;
  height: 10px;
  border-radius: 50%;
  background-color: rgba(255, 255, 255, 0.5);
  cursor: pointer;
  transition: background-color 0.3s;
}
.indicators span.active {
  background-color: #fff;
}
</style>

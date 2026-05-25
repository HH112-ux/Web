<template>
  <header class="xtx-header-nav">
    <div class="container">
      <div class="logo">
        <span class="logo-icon">🐰</span>
        <span class="logo-text">小兔鲜儿</span>
      </div>
      <nav class="nav-menu">
        <ul>
          <li v-for="item in navItems" :key="item.id">
            <a href="javascript:;">{{ item.name }}</a>
          </li>
        </ul>
      </nav>
    </div>
  </header>
</template>

<script>
export default {
  name: 'XtxHeaderNav',
  data() {
    return {
      navItems: [
        { id: 1, name: '首页' },
        { id: 2, name: '生鲜' },
        { id: 3, name: '美食' },
        { id: 4, name: '餐厨' },
        { id: 5, name: '电器' },
        { id: 6, name: '居家' },
        { id: 7, name: '洗护' }
      ]
    }
  }
}
</script>

<style scoped>
.xtx-header-nav {
  background-color: #fff;
  border-bottom: 1px solid #eee;
}
.container {
  max-width: 1200px;
  margin: 0 auto;
  display: flex;
  align-items: center;
  padding: 0 20px;
  height: 60px;
}
.logo {
  display: flex;
  align-items: center;
  gap: 8px;
}
.logo-icon {
  font-size: 28px;
}
.logo-text {
  font-size: 20px;
  font-weight: bold;
  color: #4caf50;
}
.nav-menu ul {
  display: flex;
  list-style: none;
  margin: 0;
  padding: 0;
}
.nav-menu li {
  margin-left: 30px;
}
.nav-menu a {
  text-decoration: none;
  color: #333;
  font-size: 14px;
  font-weight: 500;
}
.nav-menu a:hover {
  color: #e4393c;
}
</style>

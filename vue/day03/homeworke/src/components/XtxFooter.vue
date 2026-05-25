<template>
  <footer class="xtx-footer">
    <div class="service-section">
      <div class="container">
        <div class="service-list">
          <div class="service-item">
            <span class="icon">✓</span>
            <span>价格亲民</span>
          </div>
          <div class="service-item">
            <span class="icon">🚚</span>
            <span>物流快捷</span>
          </div>
          <div class="service-item">
            <span class="icon">🌱</span>
            <span>品质新鲜</span>
          </div>
          <div class="service-item">
            <span class="icon">🛡️</span>
            <span>售后无忧</span>
          </div>
        </div>
      </div>
    </div>
    <div class="footer-links">
      <div class="container">
        <div class="footer-top">
          <div class="col">
            <h4>购物指南</h4>
            <ul>
              <li><a href="#">购物流程</a></li>
              <li><a href="#">支付方式</a></li>
            </ul>
          </div>
          <div class="col">
            <h4>配送方式</h4>
            <ul>
              <li><a href="#">配送说明</a></li>
              <li><a href="#">配送范围</a></li>
            </ul>
          </div>
          <div class="col">
            <h4>关于我们</h4>
            <ul>
              <li><a href="#">平台规则</a></li>
              <li><a href="#">联系我们</a></li>
            </ul>
          </div>
          <div class="col">
            <h4>售后服务</h4>
            <ul>
              <li><a href="#">售后政策</a></li>
              <li><a href="#">退换说明</a></li>
            </ul>
          </div>
          <div class="col contact-col">
            <h4>服务热线</h4>
            <p class="phone">400-0000-000</p>
            <p class="time">周一至周日 8:00-18:00</p>
          </div>
        </div>
        <div class="footer-bottom">
          <p>© 2025 小兔鲜儿 版权所有 | 京ICP备12345678号</p>
        </div>
      </div>
    </div>
  </footer>
</template>

<script>
export default {
  name: 'XtxFooter'
}
</script>

<style scoped>
.xtx-footer {
  background-color: #333;
  color: #aaa;
  font-size: 12px;
}
.service-section {
  background-color: #fff;
  border-bottom: 1px solid #eee;
  padding: 30px 0;
}
.service-list {
  display: flex;
  justify-content: space-around;
  max-width: 1200px;
  margin: 0 auto;
  padding: 0 20px;
}
.service-item {
  display: flex;
  align-items: center;
  gap: 10px;
  font-size: 16px;
  color: #333;
}
.service-item .icon {
  width: 40px;
  height: 40px;
  border: 2px solid #4caf50;
  border-radius: 50%;
  display: flex;
  align-items: center;
  justify-content: center;
  color: #4caf50;
  font-size: 18px;
}
.footer-links {
  background-color: #333;
}
.container {
  max-width: 1200px;
  margin: 0 auto;
  padding: 30px 20px;
}
.footer-top {
  display: grid;
  grid-template-columns: repeat(5, 1fr);
  gap: 30px;
  margin-bottom: 20px;
}
.col h4 {
  color: #fff;
  margin-bottom: 12px;
  font-size: 14px;
}
.col ul {
  list-style: none;
  padding: 0;
}
.col li {
  margin-bottom: 8px;
}
.col a {
  color: #aaa;
  text-decoration: none;
}
.col a:hover {
  color: #fff;
}
.contact-col {
  text-align: center;
}
.contact-col .phone {
  color: #4caf50;
  font-size: 18px;
  font-weight: bold;
  margin: 5px 0;
}
.contact-col .time {
  color: #666;
  font-size: 12px;
}
.footer-bottom {
  text-align: center;
  padding-top: 20px;
  border-top: 1px solid #444;
}
</style>

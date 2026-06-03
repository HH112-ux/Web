export default {
  created () {
    // console.log('嘎嘎')
  },
  data () {
    return {
      title: '标题'
    }
  },
  methods: {
    sayHi () {
      // console.log('你好')
    },

    // 根据登录状态，判断是否需要显示登录确认框
    // 1. 如果未登录 => 显示确认框 返回 true
    // 2. 如果已登录 => 啥也不干   返回 false
    loginConfirm () {
      // 判断 token 是否存在
      if (!this.$store.getters.token) {
        // 弹确认框
        this.$dialog.confirm({
          title: '温馨提示',
          message: '此时需要先登录才能继续操作哦',
          confirmButtonText: '去登陆',
          cancelButtonText: '再逛逛'
        })
          .then(() => {
            this.$router.replace({
              path: '/login',
              query: {
                backUrl: this.$route.fullPath
              }
            })
          })
          .catch(() => {})
        return true
      }
      return false
    }
  }
}

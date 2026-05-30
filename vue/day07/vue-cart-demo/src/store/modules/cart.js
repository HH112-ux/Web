export default {
  namespaced: true,
  state: {
    list: []
  },
  mutations: {
    updateList (state, payload) {
      state.list = payload
    },
    updateCount (state, payload) {
      const { id, count } = payload
      const item = state.list.find(item => item.id === id)
      if (item) {
        item.count = count
      }
    }
  },
  actions: {
    async getList ({ commit }) {
      const res = await fetch('/db/index.json')
      const data = await res.json()
      commit('updateList', data.cart)
    },
    updateCountAsync ({ commit }, payload) {
      commit('updateCount', {
        id: payload.id,
        count: payload.newCount
      })
    }
  },
  getters: {
    total (state) {
      return state.list.reduce((sum, item) => sum + item.count, 0)
    },
    totalPrice (state) {
      return state.list.reduce((sum, item) => sum + item.price * item.count, 0)
    }
  }
}

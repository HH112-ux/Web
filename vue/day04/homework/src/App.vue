<template>
  <div class="todo-container">
    <h1 class="title">记事本</h1>
    <TodoHeader @add="addTask" />
    <TodoMain :tasks="tasks" @delete="deleteTask" />
    <TodoFooter :count="tasks.length" @clear="clearTasks" />
  </div>
</template>

<script>
import TodoHeader from './components/TodoHeader.vue'
import TodoMain from './components/TodoMain.vue'
import TodoFooter from './components/TodoFooter.vue'

export default {
  name: 'App',
  components: {
    TodoHeader,
    TodoMain,
    TodoFooter
  },
  data() {
    return {
      tasks: []
    }
  },
  mounted() {
    this.loadTasks()
  },
  methods: {
    addTask(task) {
      this.tasks.push(task)
      this.saveTasks()
    },
    deleteTask(index) {
      this.tasks.splice(index, 1)
      this.saveTasks()
    },
    clearTasks() {
      this.tasks = []
      this.saveTasks()
    },
    saveTasks() {
      localStorage.setItem('todoTasks', JSON.stringify(this.tasks))
    },
    loadTasks() {
      const saved = localStorage.getItem('todoTasks')
      if (saved) {
        this.tasks = JSON.parse(saved)
      }
    }
  }
}
</script>

<style>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}
body {
  background-color: #f5f5f5;
  font-family: 'Microsoft YaHei', sans-serif;
}
.todo-container {
  width: 400px;
  margin: 50px auto;
  padding: 20px;
  background-color: white;
  border-radius: 8px;
  box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
  border: 1px solid #ddd;
}
.title {
  text-align: center;
  color: #d9534f;
  margin-bottom: 20px;
  font-size: 28px;
}
</style>
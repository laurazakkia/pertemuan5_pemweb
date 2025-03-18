<template>
  <div id="app">
    <Header />
    <router-view></router-view> 
  </div>
</template>

<script>
import Header from '@/components/HeaderPage.vue';

export default {
  name: 'App',
  components: {
    Header,
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #000000;
}

html {
  scroll-behavior: smooth; 
}
</style>
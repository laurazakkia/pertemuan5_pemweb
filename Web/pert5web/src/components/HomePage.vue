<template>
    <section id="home">
      <div class="home-content">
        <h1>HI, I'M ISMI LAURA AZAKKIYYAH</h1>
        <p>An information systems student at the state Islamic university of sunan ampel surabaya</p>
      </div>
    </section>
  </template>
  
  <script>
  export default {
    name: 'HomePage'
  }
  </script>
  
  <style scoped>
section {
  padding: 4rem 2rem;
  text-align: center;
  background-color: #ffffff;
  min-height: 100vh; 
  display: flex;
  align-items: center;
  justify-content: center;
  width: 100%; 
}

.home-content {
  max-width: 800px; 
  margin: 0 auto; 
}

h1 {
  font-size: 2.5rem;
  margin-bottom: 1rem;
}

p {
  font-size: 1.2rem;
  margin-bottom: 1rem;
  line-height: 1.6;
}
</style>
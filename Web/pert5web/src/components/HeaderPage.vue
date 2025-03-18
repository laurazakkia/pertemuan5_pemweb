<template>
    <header>
      <div class="header-content">
        <h1>Ismi Laura Azakkiyyah</h1>
        <nav>
          <ul>
            <li><router-link to="/">Home</router-link></li>
            <li><router-link to="/about">About</router-link></li>
            <li><router-link to="/contact">Contact</router-link></li>
          </ul>
        </nav>
      </div>
    </header>
  </template>
  
  <script>
  export default {
    name: 'HeaderPage'
  }
  </script>
  
  <style scoped>
  header {
    background-color: #f8f8f8;
    color: rgb(0, 0, 0);
    padding: 1rem 0; 
    text-align: center;
    width: 100%; 
    position: fixed; 
    top: 0;
    left: 0;
    z-index: 1000;
  }
  
  .header-content {
    max-width: 1200px; 
    margin: 0 auto; 
    padding: 0 1rem; 
    display: flex;
    justify-content: space-between;
    align-items: center;
  }
  
  h1 {
    font-size: 1.5rem;
    margin: 0;
  }
  
  nav ul {
    list-style: none;
    padding: 0;
    margin: 0;
    display: flex;
    gap: 1rem;
  }
  
  nav ul li {
    display: inline;
  }
  
  nav ul li a {
    color: rgb(0, 0, 0);
    text-decoration: none;
    font-weight: bold;
  }
  
  nav ul li a:hover {
    text-decoration: underline;
  }
  
  nav ul li .router-link-active {
    color: #1DB954; 
    text-decoration: underline;
  }
  </style>
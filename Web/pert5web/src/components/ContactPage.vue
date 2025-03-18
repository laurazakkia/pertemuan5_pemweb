<template>
    <section id="contact">
      <h2>Contact</h2>
      <div class="social-media-grid">
        <div class="social-card">
          <a href="https://github.com/laurazakkia" target="_blank" class="social-link">
            <img src="../assets/github.jpg" alt="GitHub" class="social-icon">
            <h3>GitHub</h3>
            <p>Check out my projects and contributions on GitHub.</p>
          </a>
        </div>
        <div class="social-card">
          <a href="https://www.instagram.com/laura.zakkia?igsh=b2RraGZsYzBlcW1l" target="_blank" class="social-link">
            <img src="../assets/ige.jpg" alt="Instagram" class="social-icon">
            <h3>Instagram</h3>
            <p>Follow me on Instagram for updates and personal posts.</p>
          </a>
        </div>
        <div class="social-card">
          <a href="mailto:laurazakkia12@gmail.com" class="social-link">
            <img src="../assets/emaill.jpg" alt="Email" class="social-icon">
            <h3>Email</h3>
            <p>Reach out to me directly via email.</p>
          </a>
        </div>
      </div>
    </section>
  </template>
  
  <script>
  export default {
    name: 'ContactPage'
  }
  </script>
  
  <style scoped>
  section {
    padding: 2rem 1rem;
    text-align: center;
    background-color: #ffffff;
    min-height: 100vh;
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    width: 100%;
  }
  
  h2 {
    font-size: 2.5rem;
    margin-bottom: 2rem;
    color: #333;
    font-weight: bold;
  }
  
  .social-media-grid {
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
    gap: 2rem;
    width: 100%;
    max-width: 1200px;
    margin: 0 auto;
  }
  
  .social-card {
    background: #f8f8f8;
    padding: 2rem;
    border-radius: 10px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    transition: transform 0.3s ease, box-shadow 0.3s ease;
  }
  
  .social-card:hover {
    transform: translateY(-5px);
    box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
  }
  
  .social-link {
    text-decoration: none;
    color: inherit;
    display: flex;
    flex-direction: column;
    align-items: center;
    text-align: center;
  }
  
  .social-icon {
    width: 60px;
    height: 60px;
    border-radius: 50%;
    margin-bottom: 1rem;
    transition: transform 0.3s ease;
  }
  
  .social-icon:hover {
    transform: scale(1.1);
  }
  
  h3 {
    font-size: 1.5rem;
    margin-bottom: 0.5rem;
    color: #333;
  }
  
  p {
    font-size: 1rem;
    color: #555;
    margin: 0;
  }
  </style>
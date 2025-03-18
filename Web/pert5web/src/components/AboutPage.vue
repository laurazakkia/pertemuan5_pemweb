<template>
    <section id="about">
      <div class="about-content">
        <img src="../assets/laura1.jpg" alt="Laura" class="profile-image">
        <h2>Get to Know Me!</h2>
        <p>
          I am an Information Systems student who is currently studying and trying to understand the world of Technology. Currently, my knowledge is still limited, but I am very excited to explore and learn more about this world.
        </p>
        <p>
          During these four semesters of college, I have worked on various project assignments that I share on GitHub. My goal is to document my experiences and open up a space to discuss with others in this field.
           </p>
        <p>
          I am open to discussing, learning, and contributing. If you have an opportunity that fits my interests and skills, please contact me.  </p>
      </div>
    </section>
  </template>
  
  <script>
  export default {
    name: 'AboutPage'
  }
  </script>
  
  <style scoped>
  section {
    padding: 4rem 2rem;
    text-align: left; 
    background-color: #ffffff;
    min-height: 100vh; 
    display: flex;
    align-items: center;
    justify-content: center;
    width: 100%;
  }
  
  .about-content {
    max-width: 800px; 
    margin: 0 auto; 
  }
  
  .profile-image {
    width: 150px;
    height: 150px;
    border-radius: 50%;
    margin-bottom: 1.5rem;
    display: block;
    margin-left: auto;
    margin-right: auto; 
  }
  
  h2 {
    font-size: 2.5rem;
    margin-bottom: 1.5rem;
    text-align: center; 
  }
  
  p {
    font-size: 1.1rem;
    margin-bottom: 1.5rem;
    line-height: 1.6;
    color: #555; 
  }
  
  strong {
    color: #333; 
    font-weight: bold;
  }
  </style>
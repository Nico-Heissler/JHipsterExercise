<template>
<div id="app">
  <form>
    <!-- username input -->
    <input type="text" v-model="username" placeholder="Username">

    
    <input type="text" v-model="email" placeholder="Email">

    
    <input type="password" v-model="password" placeholder="Password">

    
    <button onclick=function() type="submit">Submit</button>

  </form>
</div>
</template>

    
<script lang="ts" src="./adyen.component.ts">
import axios from 'axios';
import Vue from 'vue/types/umd';
var app = new Vue({
  el:'#app',
  components:{

  },

  mounted: function(){

    axios.post('/paiement',{"password":"ntm"})
      .then(response => console.log(response.data));
      //.catch(error => this.posts = [{title: 'No Posts found.'}])
      //.finally(()=> console.log('Data loading complete'));
  },
    data:{
    posts: null,
  }
  /*data:{
    username:'',
    email:'',
    password:''
  },
  methods:{
    updatePost(){
      console.log("-----------POST Vue------------");
      const article = {
        username: this.username,
        email: this.email,
        password: this.password
      };
      axios.post('http://localhost:8080/paiement',article).then(reponse => {
        const data = reponse.data;
        this.article.push(reponse.data);
      });
    }
  }*/
})
</script>
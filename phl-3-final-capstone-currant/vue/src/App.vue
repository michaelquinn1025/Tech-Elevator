<template>
  <div class="app-header">
    <div id= "headersection"> 
    <div id="nav">
      <div class="inner-app-header">
        <div class="logo-container">
          <img v-bind:src="require('@/assets/logo.png')" id="logo">
          <h1>PHL <span>MY PLATE </span></h1> 
        </div>
        <ul class="navigation">
          <br> <br>
            <a><li><router-link v-bind:to="{ name: 'home' }" style="color: white">Home</router-link> </li></a> 
            <a><li><router-link v-bind:to="{ name: 'favorites' }" style="color: white" >Favorites</router-link></li></a>
            <a><li><router-link v-bind:to="{ name: 'logout' }" style="color: white" v-if="$store.state.token != ''">Logout</router-link></li></a>
        </ul>
      </div>
    </div>
    </div>
    <router-view />
  </div>

</template>

<script>

</script>

<style>
* {
  margin: 0;
  padding: 0;
  list-style: none;
  text-decoration: none;
}
#headersection {
  height: 80px;
  /* width: 100vw; */
}
.app-header {
  width: 100%;
  height: 80px;
  display: block;
  background-color: #9c0a0a;
 
}
.inner-app-header {
  width: 1000px;
  height: 100%;
  display: block;
  margin: 0 auto;
  background-color: white;
}
.logo-container {
  height: 100%;
  display: table;
  float: left;
}
.logo-container h1 {
  color: white;
  height: 100%;
  display: table-cell;
  vertical-align: bottom;
  font-family: Verdana, Geneva, Tahoma, sans-serif;
  font-size: 32px;
  font-weight: 200;
  
  
}
.logo-container h1 span {
  font-weight: 800;
  width: 200;
}
.navigation {
  float: right;
  height: 100%;
}
.navigation a {
  height: 100%;
  display: table;
  float: left;
  padding: 0px 20px;
}
.navigation a:last-child {
  padding-right: 0;
}
.navigation a li {
  display: table-cell;
  vertical-align: middle;
  height: 100%;
  color: white;
  font-family: Verdana, Geneva, Tahoma, sans-serif;
  font-size: 16px;
}
#logo {
  width: 60px;
  background-color: white;
  height: 100%;
  display: table-cell;
  vertical-align: middle;
  margin: 0;
  margin-top: 10px;
}
</style>
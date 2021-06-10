<template>
  <div id="login" class="text-center" >
    <form class="form-signin" @submit.prevent="login">
      <h1 id="title">PHL My Plate</h1> <br>
      
      <h1 id="subtitle">Log In</h1>
      <br>
      <div
        class="alert alert-danger"
        role="alert"
        v-if="invalidCredentials"
      >Invalid username and password!</div>
      <div
        class="alert alert-success"
        role="alert"
        v-if="this.$route.query.registration"
      >Thank you for registering, please sign in.</div>
      <div id="user-inputs" >
      <label for="username" class="sr-only">Username</label>
      <input
        type="text"
        id="username"
        class="form-control"
        placeholder="Username"
        v-model="user.username"
        required
        autofocus
      />
      <label for="password" class="sr-only">Password</label>
      <input
        type="password"
        id="password"
        class="form-control"
        placeholder="Password"
        v-model="user.password"
        required
      />
      <br><br>
      <div id="createAccount">
        <router-link :to="{ name: 'register' }" style="color: white">Create new account.</router-link>
        <br><br>
        <button type="submit">Sign in</button> 
      </div>
      </div>
    </form>
    
  </div>

  
</template>

<script>
import authService from "../services/AuthService";

export default {
  name: "login",
  components: {},
  data() {
    return {
      user: {
        username: "",
        password: ""
      },
      invalidCredentials: false
    };
  },
  methods: {
    login() {
      authService
        .login(this.user)
        .then(response => {
          if (response.status == 200) {
            this.$store.commit("SET_AUTH_TOKEN", response.data.token);
            this.$store.commit("SET_USER", response.data.user);
            this.$router.push("/");
          }
        })
        .catch(error => {
          const response = error.response;

          if (response.status === 401) {
            this.invalidCredentials = true;
          }
        });
    }
  }
};
</script>

<style scoped>
    
#createAccount {
  text-align: center;

}
#login {
  min-height: 100vh;
  min-width:100vw;
  display: flex;  
  align-items: center;
  justify-content: center;   
  background-image: url(../assets/loginimg.jpg);
  background-repeat:no-repeat;
  background-size: cover;
  
  /* background-size: auto; */
  
}
.form-signin {
  display: flex;
  flex-direction: column;
  width: 40vw;
  height: auto;
  max-height: 100vh;
  position: absolute;  
  color: white;
  border-radius: 10px;
  background-color: rgb(0, 0, 0, 0.8);
  border: 1px solid #ffffff
}

#title {
  font-size: 5rem;
  font-family: 'Verdana', cursive;
  text-shadow: -1px 1px 2px #000,
  1px 1px 2px #000,
  1px -1px 0 #000,
  -1px -1px 0 #000;
  text-align: auto; 
  align-items: auto;

  
}
#subtitle {
  font-size: 1.5rem;
  font-family: 'Verdana', cursive;
  text-shadow: -1px 1px 2px #000,
  1px 1px 2px #000,
  1px -1px 0 #000,
  -1px -1px 0 #000;  
  text-align: center;    
}

#login-info {
  width: 50%;
}
#username, #password, #btn {
  width: 30%;  
}
#user-inputs {
  text-align: center;
}
</style>

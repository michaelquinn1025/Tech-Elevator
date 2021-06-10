<template>
  <div class="suggestions-page">
    <h1>Your suggestions: </h1>
    <div>
    <div v-for="restaurant in filteredRestaurants"  v-bind:key="restaurant.id" class="restaurant-card">
        <div >{{ restaurant.name}}</div>
        <div >{{restaurant.phoneNumber}}</div>
        <img v-bind:src= 'restaurant.image' width="300" height="242">
        <div >{{restaurant.description}}</div>
        <div >{{restaurant.ratings}}</div>
        <br>
    </div>
    </div>
  </div>
</template>

<script>

export default {

    name: "suggestions",
    computed: {
        filteredRestaurants() {
           let filteredChoice = this.$store.state.userSelection
           return this.$store.state.restaurants.filter(restaurant => {
            return this.checkForMatch(restaurant, filteredChoice);
           })
        }
    },
    methods: {
      checkForMatch(restaurant, filteredChoice) {
        let found = false;
        filteredChoice.forEach(currentChoice => {
          if (currentChoice == restaurant.foodType) {
            found = true;
          }
        })
        return found;

      }
    }
}
</script>

<style>
.suggestions-page {
  border-radius: 20px;  
  width: 75%;  
  height: auto;  
  margin: 20px;  
  display: flex;  
  flex-direction: column;  
  align-items: center;  
  background-color: #eeebdd;  
  color: #1b1717;  
  font-family: 'Verdana'; 
  max-width: 1000px;  
  padding: 5px;
  text-align: center;
}
h1 {
  text-align: center;
}
</style>
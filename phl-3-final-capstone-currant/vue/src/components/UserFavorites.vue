<template>
  <div class="favorites-page">
    <h1 id="fav-title">Rate Our Favorite Restaurants: </h1> <br>

    <div class="favorite-restaurant">
      <div class="favorite-name" v-show="favoriteName === 'The first restaurant'">Front Street Cafe</div>
      <div class="favorite-food" v-show="favoriteFood === 'Chinese'">American</div>
      <div class="phone-number" v-show="phoneNumber === '555-555-5555'">215-515-3073</div>
      <div class="description" v-show="description === 'Very delicious dimsum'">Brick-and-wood-accented spot with java/juice bar and garden serving locally sourced New American eats.</div>
      <div class="ratings" v-show="ratings === 5">4.4</div>
      <div class="image" v-show="foodType === 'dimsum'">
          <img v-bind:src="require('@/assets/frontstreet.jpg')" width="300" height="242" id="dimsum">
      </div>
      <div id="app">
      <vue-like-dislike-buttons 
        :likes="likes" 
        :dislikes="dislikes" 
        :likeChecked="likeChecked" 
        @like = "like" 
        @dislike = "dislike" 
        />
      </div>
    </div>

    <div class="favorite-restaurant-1">
      <div class="favorite-name" v-if="favoriteName1 === 'The second restaurant'">Han Dynasty</div>
      <div class="favorite-food" v-if="favoriteFood1 === 'Italian'">Chinese</div>
      <div class="phone-number" v-if="phoneNumber1 === '555-555-5555'">215-922-1888</div>
      <div class="description" v-if="description1 === 'Best thin-crust pizza'">Sichuan eats plus late-night street-food menu served in grand digs with high ceilings.</div>
      <div class="ratings" v-if="ratings1 === 4">4.5</div>
      <div class="image" v-if="foodType1 === 'Italian'">
          <img v-bind:src="require('@/assets/handynastywphilly.jpg')" width="300" height="242" id="pizza">
    </div>
      <div id="app">
      <vue-like-dislike-buttons 
        :likes="likes" 
        :dislikes="dislikes" 
        :likeChecked="likeChecked" 
        @like = "like" 
        @dislike = "dislike" 
        />
      </div>
    </div>

    <div class="favorite-restaurant-2">
      <div class="favorite-name" v-if="favoriteName2 === 'The third restaurant'">Murph's Bar</div>
      <div class="favorite-food" v-if="favoriteFood2 === 'Greek'">Irish-Italian</div>
      <div class="phone-number" v-if="phoneNumber2 === '555-555-5555'">215-425-1847</div>
      <div class="description" v-if="description2 === 'Super scrumptious Greek food'">Pennies cover the bar in this comfy Irish pub with an exposed-brick interior and quirky decorations.</div>
      <div class="ratings" v-if="ratings2 === 5">4/5 stars</div>
      <div class="image" v-if="foodType2 === 'Greek'">
          <img v-bind:src="require('@/assets/murphs.jpg')" width="300" height="242" id="kabob">
    </div>
      <div id="app">
      <vue-like-dislike-buttons 
        :likes="likes" 
        :dislikes="dislikes" 
        :likeChecked="likeChecked" 
        @like = "like" 
        @dislike = "dislike" 
        />
      </div>
    </div>

    <div class="favorite-restaurant-3">
      <div class="favorite-name" v-if="favoriteName3 === 'The fourth restaurant'">The Dandelion</div>
      <div class="favorite-food" v-if="favoriteFood3 === 'Vegetarian'">British</div>
      <div class="phone-number" v-if="phoneNumber3 === '555-555-5555'">215-558-2500</div>
      <div class="description" v-if="description3 === 'Best greens around'">This spot serves craft beers and modern takes on British cuisine in a pubby setting.</div>
      <div class="ratings" v-if="ratings3 === 3">4.6</div>
      <div class="image" v-if="foodType3 === 'Vegetarian'">
          <img v-bind:src="require('@/assets/dandelion.jpg')" width="300" height="242" id="salad">
    </div>
      <div id="app">
      <vue-like-dislike-buttons 
        :likes="likes" 
        :dislikes="dislikes" 
        :likeChecked="likeChecked" 
        @like = "like" 
        @dislike = "dislike"
        />
      </div>
    </div>

    <div class="favorite-restaurant-4">
      <div class="favorite-name" v-if="favoriteName4 === 'The fifth restaurant'">Blue Corn Restaurant and Bar</div>
      <div class="favorite-food" v-if="favoriteFood4 === 'Mexican'">Mexican</div>
      <div class="phone-number" v-if="phoneNumber4 === '555-555-5555'">215-925-1010</div>
      <div class="description" v-if="description4 === 'Best Taco Tuesday Deals'">A narrow eatery serving traditional Mexican plates and cocktails in festive surrounds.</div>
      <div class="ratings" v-if="ratings4 === 5">4.7</div>
      <div class="image" v-if="foodType4 === 'Mexican'">
          <img v-bind:src="require('@/assets/tacos.jpg')" width="300" height="242" id="tacos">
    </div>
      <div id="app">
      <vue-like-dislike-buttons 
        :likes="likes" 
        :dislikes="dislikes" 
        :likeChecked="likeChecked" 
        @like = "like" 
        @dislike = "dislike" 
        />
      </div>
    </div>


  </div>
</template>

<script>
import VueLikeDislikeButtons from "vue-like-dislike-buttons";

export default {
  name: "App",
  components: {
    VueLikeDislikeButtons
  },
  data() {
    return {
      favoriteName: "The first restaurant",
      favoriteFood: "Chinese",
      phoneNumber: "555-555-5556",
      description: "Very delicious dimsum",
      foodType: "dimsum",
      ratings: 5,
      favoriteName1: "The second restaurant",
      favoriteFood1: "Italian",
      phoneNumber1: "555-555-5555",
      description1: "Best thin-crust pizza",
      foodType1: "Italian",
      ratings1: 4,
      favoriteName2: "The third restaurant",
      favoriteFood2: "Greek",
      phoneNumber2: "555-555-5555",
      description2: "Super scrumptious Greek food",
      foodType2: "Greek",
      ratings2: 4,
      favoriteName3: "The fourth restaurant",
      favoriteFood3: "Vegetarian",
      phoneNumber3: "555-555-5555",
      description3: "Best greens around",
      foodType3: "Vegetarian",
      ratings3: 3,
      favoriteName4: "The fifth restaurant",
      favoriteFood4: "Mexican",
      phoneNumber4: "555-555-5555",
      description4: "Best Taco Tuesday Deals",
      foodType4: "Mexican",
      ratings4: 2,
      likes:0,
      dislikes: 0,
      likeChecked: false,
      dislikeChecked: false
    };
  },
  methods: {
    getAllUserFavorites() {
      return null;
    },
    likeFavorite() {
      return null;
    },
    like() {
      this.likes += 1;
    },
    dislike() {
      this.dislikes += 1;
    }
  }
}

</script>

<style>
#app {
  font-family: "Verdana", "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  margin-top: 10px;
  margin-bottom: 60px;
}
.favorites-page {
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

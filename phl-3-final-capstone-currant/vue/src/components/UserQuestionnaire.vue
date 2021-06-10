<template>
    <div class="main-page">
    <form v-on:submit.prevent>
    <h1 class="restname">Let's find you some restaurants...</h1>

    <div class="form" id="firstQuestion">
        <br>
        <label for="type">What type of food are you craving? <br> [Please make one selection] <br></label> 
           <input type="checkbox" value="American" v-model="userSelection">American
           <input type="checkbox" value="Cajun" v-model="userSelection">Cajun
           <input type="checkbox" value="German" v-model="userSelection">German
           <input type="checkbox" value="Indian" v-model="userSelection">Indian
           <input type="checkbox" value="Spanish" v-model="userSelection">Spanish
        <br>
           <input type="checkbox" value="Italian" v-model="userSelection">Italian
           <input type="checkbox" value="Greek" v-model="userSelection">Greek
           <input type="checkbox" value="Mexican" v-model="userSelection">Mexican
           <input type="checkbox" value="Chinese" v-model="userSelection">Chinese
           <input type="checkbox" value="French" v-model="userSelection">French
        <br>
           <input type="checkbox" value="Thai" v-model="userSelection">Thai
           <input type="checkbox" value="Russian" v-model="userSelection">Russian
           <input type="checkbox" value="Japanese" v-model="userSelection">Japanese
           <input type="checkbox" value="Caribbean" v-model="userSelection">Caribbean
           <input type="checkbox" value="Moroccan" v-model="userSelection">Moroccan
        <br>
           <input type="checkbox" value="Vietnamese" v-model="userSelection">Vietnamese
           <input type="checkbox" value="Turkish" v-model="userSelection">Turkish
           <input type="checkbox" value="Brazilian" v-model="userSelection">Brazilian
           <input type="checkbox" value="Cuban" v-model="userSelection">Cuban
           <input type="checkbox" value="Vegetarian" v-model="userSelection">Vegetarian
        <br>
    </div>
    <div class="form" id="secondQuestion">
        <br> <br>
        <label for="budget">What is your budget?</label>
            <div class="dollar-sign" v-if="favorite.currency1 === 1">$</div> <input type="checkbox" id="currency">      
            <div class="dollar-sign" v-if="favorite.currency2 === 2">$$</div> <input type="checkbox" id="currency">   
            <div class="dollar-sign" v-if="favorite.currency3 === 3">$$$</div> <input type="checkbox" id="currency">        
            <div class="dollar-sign" v-if="favorite.currency4 === 4">$$$$</div> <input type="checkbox" id="currency">      
            <div class="dollar-sign" >$$$$$</div>
    </div>
    <div class="form" id="thirdQuestion">
         <br> <br>
        <label for="vibe">What vibe are you feeling?</label> 
        <br>
            <input type="checkbox" value="Casual" v-model="userSelection">Casual      
            <input type="checkbox" value="Cozy" v-model="userSelection">Cozy
            <input type="checkbox" value="Date-Night" v-model="userSelection">Date-Night
            <input type="checkbox" value="Romantic" v-model="userSelection">Romantic  
            <br>
            <input type="checkbox" value="Comfort Food" v-model="userSelection">Comfort Food
            <input type="checkbox" value="Family Style" v-model="userSelection">Family Style
            <input type="checkbox" value="Hotspot" v-model="userSelection">Hot Spot
            <input type="checkbox" value="Upscale" v-model="userSelection">Upscale  
    </div>
    <br> <br>
    <button v-on:click="submitAnswers"> Submit </button>

    </form>
    <!-- <div v-for="restaurant in filteredRestaurants" v-bind:key="restaurant.id">
        {{ restaurant.name }}
    </div> -->
    </div>

</template>

<script>
import QuestionnaireService from "@/services/QuestionnaireService";
export default {
    name: "questionnaire-form",
  
    data() {
        return {
            foods: [],
            favorite: {
                currency1: 1,
                currency2: 2,
                currency3: 3,
                currency4: 4,
                currency5: 5,
            },
            foodOptions: [
                {foodType: 'American', value: 'American'},
                {foodType: 'Cajun', value: 'Cajun'},
                {foodType: 'German', value: 'German'},
                {foodType: 'Indian', value: 'Indian'},
                {foodType: 'Spanish', value: 'Spanish'},
                {foodType: 'Italian', value: 'Italian'},
                {foodType: 'Greek', value: 'Greek'},
                {foodType: 'Mexican', value: 'Mexican'},
                {foodType: 'Chinese', value: 'Chinese'},
                {foodType: 'French', value: 'French'},
                {foodType: 'Thai', value: 'Thai'},
                {foodType: 'Russian', value: 'Russian'},
                {foodType: 'Japanese', value: 'Japanese'},
                {foodType: 'Caribbean', value: 'Caribbean'},
                {foodType: 'Moroccan', value: 'Moroccan'},
                {foodType: 'Vietnamese', value: 'Vietnamese'},
                {foodType: 'Turkish', value: 'Turkish'},
                {foodType: 'Brazilian', value: 'Brazilian'},
                {foodType: 'Cuban', value: 'Cuban'},
                {foodType: 'Vegetarian', value: 'Vegetarian'},
            ],
            food: {
                foodType: null
            },
            userSelection: []
        }
    },
    methods: {
        created() {
            QuestionnaireService.getFoods().then(response => {
                this.userSelection = response.data;
            });
        },
        submitAnswers() {
            this.$store.commit("SET_SELECTION", this.userSelection);
            this.$router.push('/suggestions');
        }
    }
}
</script>

<style>
.main-page {
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
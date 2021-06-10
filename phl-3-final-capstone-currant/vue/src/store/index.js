import Vue from 'vue'
import Vuex from 'vuex'
import axios from 'axios'

Vue.use(Vuex)

/*
 * The authorization header is set for axios when you login but what happens when you come back or
 * the page is refreshed. When that happens you need to check for the token in local storage and if it
 * exists you should set the header so that it will be attached to each request
 */
const currentToken = localStorage.getItem('token')
const currentUser = JSON.parse(localStorage.getItem('user'));

if(currentToken != null) {
  axios.defaults.headers.common['Authorization'] = `Bearer ${currentToken}`;
}

export default new Vuex.Store({
  state: {
    token: currentToken || '',
    user: currentUser || {},
    userSelection: '',
    savedCuisines: [],
    restaurants: [
      {
        id: 1,
        name: 'Karma Restaurant',
        foodType: 'Indian',
        description: 'Modern space where Indian staples & a big lunch buffet are served, with a bar & late-night menu.',
        image: require('@/assets/karma.jpg'),
        phoneNumber: '215-925-1444',
        ratings: 4.2
      },
      {
        id: 2,
        name: 'Beck\'s Cajun Cafe',
        foodType: 'Cajun',
        description: 'Whether you\'re craving Crawfish, Po Boys, Beignets or Jalapeno Cheddar Cornbread, BECK\'S CAJUN CAFE\'s has the traditional Cajun Cuisine you will love.',
        image: require('@/assets/becks.jpg'),
        phoneNumber: '215-592-0505',
        ratings: 4.4
      },
      {
        id: 3,
        name: 'Mixto Restaurante',
        foodType: 'Cuban',
        description: 'Philadelphia\'s Favorite Cuban, Latin American & Caribbean Restaurant.',
        image: require('@/assets/almadecuba.jpg'),
        phoneNumber: '215-592-0363',
        ratings: 4.4
      },
      {
        id: 4,
        name: 'Vernick Food & Drink Restaurant',
        foodType: 'American',
        description: 'Great food',
        image: require('@/assets/vernick.jpg'),
        phoneNumber: '267-639-6644',
        ratings: 4.8
      },
      {
        id: 5,
        name: 'Tai Lake',
        foodType: 'Thai',
        description: 'Cantonese seafood dishes are the specialty of this Chinese BYOB joint with banquet-style seating.',
        image: require('@/assets/tailake.jpg'),
        phoneNumber: '215-922-0698',
        ratings: 4.2
      },
      {
        id: 6,
        name: 'Cajun Heroes',
        foodType: 'Cajun',
        description: 'Our Cajun spices boil has been devoured by many for over 25 years down south. We are delighted to bring you the South in array of flavors served',
        image: require('@/assets/cajunheroes.jpg'),
        phoneNumber: '267-273-1292',
        ratings: 4.4
      },
      {
        id: 7,
        name: 'Brauhaus Schmitz',
        foodType: 'German',
        description: 'Since opening in 2009, Brauhaus has quickly become one of the most authentic German Bierhalls and Restaurants in the United States.',
        image: require('@/assets/kabob.jpg'),
        phoneNumber: '267-909-8814',
        ratings: 4.5
      },
      {
        id: 8,
        name: 'Veda - Modern Indian Bistro',
        foodType: 'Indian',
        description: 'Tandoori chicken, samosas & curry dishes served in upbeat space with chandeliers & buzzy bar scene.',
        image: require('@/assets/veda.jpeg'),
        phoneNumber: '267-519-2001',
        ratings: 4.4
      },
      {
        id: 9,
        name: 'Oloroso',
        foodType: 'Spanish',
        description: 'Chef Townsend Wentz’s Spanish tapas bar & restaurant with cocktails, sherry & beer',
        image: require('@/assets/oloroso.jpg'),
        phoneNumber: '267-324-3014',
        ratings: 4.5
      },
      {
        id: 10,
        name: 'Little Nonna\'s Restaurant',
        foodType: 'Italian',
        description: 'Traditional Italian dishes delivered in a homey trattoria setting with an open kitchen & a garden.',
        image: require('@/assets/nonnas.jpg'),
        phoneNumber: '215-546-2100',
        ratings: 4.6
      },
      {
        id: 11,
        name: 'Zorba\'s Tavern',
        foodType: 'Greek',
        description: 'This Greek tavern serves traditional cuisine in a homey space decorated with old-country paintings.',
        image: require('@/assets/zorbas.jpg'),
        phoneNumber: '215-978-5990',
        ratings: 4.6
      },
      {
        id: 12,
        name: 'Tacqueria La Veracruzana',
        foodType: 'Mexican',
        description: 'Mexican BYOB joint serves up sizable portions of tacos, quesadillas & more in an everyday setting.',
        image: require('@/assets/tacqueria.jpg'),
        phoneNumber: '215-465-1440',
        ratings: 4.4
      },
      {
        id: 13,
        name: 'Parc Restaurant',
        foodType: 'French',
        description: 'Traditional bistro fare is served in a bustling setting that reminds of belle epoque Paris.',
        image: require('@/assets/parc.jpg'),
        phoneNumber: '215-545-2262',
        ratings: 4.6
      },
      {
        id: 14,
        name: 'Vientiane Bistro',
        foodType: 'Thai',
        description: 'Restaurant known to locals as a Lao and Thai fusion restaurant. Established in 2002, we became the first restaurant in the Philadelphia area to offer Lao dishes with a twist',
        image: require('@/assets/vientiane.jpeg'),
        phoneNumber: '215-726-1095',
        ratings: 5
      },
      {
        id: 15,
        name: 'Suzani Palace Restaurant',
        foodType: 'Russian',
        description: ' Suzani Palace is a very comfortable, multifunctional and modern place, easily adapted to the event or celebration of any format. Here, you can host an anniversary, corporate, wedding or birthday parties.',
        image: require('@/assets/suzani.jpg'),
        phoneNumber: '215-464-0106',
        ratings: 4.3
      },
      {
        id: 16,
        name: 'Double Knot',
        foodType: 'Japanese',
        description: 'Charming coffee shop with a secret izakaya in the basement offering sushi & robatayaki meats.',
        image: require('@/assets/doubleknot.jpg'),
        phoneNumber: '215-631-3868',
        ratings: 4.7
      },
      {
        id: 17,
        name: 'Caribbean Feast Restaurant',
        foodType: 'Caribbean',
        description: 'Jamaican spot serving curries & jerk dishes with vegetarian options & deck seating out front.',
        image: require('@/assets/caribbeanfeast.jpg'),
        phoneNumber: '215-223-2665',
        ratings: 4.1
      },
      {
        id: 18,
        name: 'Marrakesh',
        foodType: 'Moroccan',
        description: 'Moroccan spot where diners enjoy multicourse meals on shared dishes that are eaten with the hands.',
        image: require('@/assets/marrakesh.jpg'),
        phoneNumber: '215-925-5929',
        ratings: 4.6
      },
      {
        id: 19,
        name: 'Bahn Mi and Bottles',
        foodType: 'Vietnamese',
        description: 'Vietnamese street eats & cocktails in dimly lit digs, plus store offering craft beer to go.',
        image: require('@/assets/bahnmiandbottles.jpg'),
        phoneNumber: '215-800-1533',
        ratings: 4.7
      },
      {
        id: 20,
        name: 'Isot Turkish Cuisine',
        foodType: 'Turkish',
        description: 'Intimate, stylish restaurant serving traditional fare, including seafood, steaks & kebabs.',
        image: require('@/assets/isot.jpg'),
        phoneNumber: '267-457-3622',
        ratings: 4.6
      },
      {
        id: 21,
        name: 'Fogo de Chao',
        foodType: 'Brazilian',
        description: 'Fogo de Chão is a full-service Brazilian steakhouse or churrascaria, serving rodízio style, notable for its roving waiters who serve barbecued meats from large skewers directly onto the seated diners\' plates.',
        image: require('@/assets/fogodechao.jpg'),
        phoneNumber: '215-636-9700',
        ratings: 4.6
      },
      {
        id: 22,
        name: 'Cuba Libre Restaurant & Rum Bar',
        foodType: 'Cuban',
        description: 'Cuban cuisine & a vast rum bar accented by Caribbean decor & late-night salsa dancing.',
        image: require('@/assets/cubalibre.jpg'),
        phoneNumber: '215-627-0666',
        ratings: 4.4
      },
      {
        id: 23,
        name: 'Friday Saturday Sunday',
        foodType: 'American',
        description: 'Friday Saturday Sunday’s transformation from neighborhood landmark to one of the most polished, stunning city restaurants has been complete for years now, but it still never fails to surprise.',
        image: require('@/assets/frisatsat.jpg'),
        phoneNumber: '215-546-4232',
        ratings: 4.7
      },
      {
        id: 24,
        name: 'Vedge',
        foodType: 'Vegetarian',
        description: ' Restaurant serving inventive vegan & vegetarian small plates in a charming old mansion.',
        image: require('@/assets/veg.jpg'),
        phoneNumber: '215-320-7500',
        ratings: 4.7
      },
      {
        id: 25,
        name: 'DanDan Rittenhouse',
        foodType: 'Chinese',
        description: 'Modern bi-level eatery serving dan dan noodles, veggie dishes & spicy Sichuan/Taiwanese specialties.',
        image: require('@/assets/chinese1.jpg'),
        phoneNumber: '215-561-5683',
        ratings: 4.7
      },
      {
        id: 26,
        name: 'Cherry St. Tavern',
        foodType: 'American',
        description: 'Old-school American tavern known for roast beef sandwiches plus a wide selection of brews.',
        image: require('@/assets/cherrySt.jpg'),
        phoneNumber: '215-561-5683',
        ratings: 4.7
      },
      {
        id: 27,
        name: 'FrankFord Hall',
        foodType: 'German',
        description: 'Big German-style beer garden with communal seating & food options to soak up the brews.',
        image: require('@/assets/frankford.jpg'),
        phoneNumber: '215-634-3338',
        ratings: 4.9
      },
      {
        id: 28,
        name: 'Butcher Bar',
        foodType: 'American',
        description: 'Brown spirits, beer & a meaty menu set in a hip dining room accented with butchery accessories.',
        image: require('@/assets/butcher.jpg'),
        phoneNumber: '215-563-6328',
        ratings: 4.7
      },
      {
        id: 29,
        name: 'Estia Restaurant',
        foodType: 'Greek',
        description: 'This stylish, multiroom Greek eatery specializes in whole fish flown in from the Mediterranean',
        image: require('@/assets/estia.jpg'),
        phoneNumber: '215-735-7700',
        ratings: 4.5
      },
      {
        id: 30,
        name: 'EL Vez',
        foodType: 'Mexican',
        description: 'Trendy Mexican joint serving upscale eats & cocktails in a colorful, flashy setting',
        image: require('@/assets/elvez.jpg'),
        phoneNumber: '215-928-9800',
        ratings: 4.8
      },
      {
        id: 31,
        name: 'Crazy Sushi',
        foodType: 'Japanese',
        description: 'Slim BYOB sushi spot offering a big menu of inventive rolls & hot dishes amid color-changing lights.',
        image: require('@/assets/crazysus.jpg'),
        phoneNumber: '215-988-0398',
        ratings: 4.7
      },
      {
        id: 32,
        name: 'Thanal Indian Tavern',
        foodType: 'Indian',
        description: 'A menu featuring classic Indian dishes in a modern setting with bar seating & yellow interiors.',
        image: require('@/assets/indian.jpg'),
        phoneNumber: '215-515-2511',
        ratings: 4.6
      },
      {
        id: 33,
        name: 'Fez Moroccan Restaurant',
        foodType: 'Moroccan',
description: 'Festive Moroccan spot featuring utensil-free feasts, cushion seats, hookahs & weekend belly dancers.',
image: require('@/assets/moroccan.jpg'),
phoneNumber: '215-988-0398',
ratings: 4.4
},
{
id: 34,
name: 'Pho 75',
foodType: 'Vietnamese',
description: 'Quick, simple stop for Vietnamese pho soups in many varieties from vegetable-based to cuts of beef.',
image: require('@/assets/vietnamese.jpg'),
phoneNumber: '215-721-5866',
ratings: 4.5
},
{
id: 35,
name: 'Uzbekistan Restaurant',
foodType: 'Russian',
description: 'Slim BYOB sushi spot offering a big menu of inventive rolls & hot dishes amid color-changing lights.',
image: require('@/assets/crazysus.jpg'),
phoneNumber: '215-671-1990',
ratings: 4.7
},
{
id: 36,
name: 'Amada',
foodType: 'Spanish',
description: 'Iron Chef Jose Garces puts a modern spin on tapas at this contemporary Spanish spot with warm decor.',
image: require('@/assets/spanish.jpg'),
phoneNumber: '215-625-2450',
ratings: 4.7
},
{
id: 37,
name: 'Francos Pizza',
foodType: 'Italian',
description: 'Top of line pizza, pasta, and sandwhiches.',
image: require('@/assets/franco.jpg'),
phoneNumber: '215-425-9133',
ratings: 4.9
},
{
id: 38,
name: 'HipCityVeg',
foodType: 'Vegetarian',
description: 'Contemporary counter-serve cafe serving vegan burgers, sandwiches & salads, plus smoothies.',
image: require('@/assets/veg2.jpg'),
phoneNumber: '267-244-4342',
ratings: 4.8
},
{
id: 39,
name: 'Mercato BYOB',
foodType: 'Italian',
description: 'Italian BYO spot known for inventive cooking that keeps the compact quarters bustling.',
image: require('@/assets/pasta.jpg'),
phoneNumber: '215-985-2962',
ratings: 4.5
},
{
id: 40,
name: 'Best Of The Wurst',
foodType: 'German',
description: 'German, Polish and American - Dine inside or enjoy the beautiful view of the Rancocas Creek out on the patio. Take-out also available. BYOB',
image: require('@/assets/bestofwurst.jpg'),
phoneNumber: '856-764-2500',
ratings: 4.4
},
{
id: 41,
name: 'Bru Craft & Wurst',
foodType: 'German',
description: 'Rustic-chic alehouse with a garage-door wall & ample options on tap, self-serve brews & German eats.',
image: require('@/assets/germanbru.jpg'),
phoneNumber: '215-800-1079',
ratings: 4.6
},
{
id: 42,
name: 'Thanal Indian Restaurant and Bar',
foodType: 'Indian',
description: 'A menu featuring classic Indian dishes in a modern setting with bar seating & yellow interiors.',
image: require('@/assets/thanal.jpg'),
phoneNumber: '215-515-2511',
ratings: 4.6
},
{
id: 43,
name: 'Indeblue Restaurant and Bar',
foodType: 'Indian',
description: 'Modern & traditional Indian fare plus a tasting menu, vegetarian eats & brunch served in sleek digs.',
image: require('@/assets/indeblue.jpg'),
phoneNumber: '215-545-4633',
ratings: 4.5
},
{
id: 44,
name: 'Old San Juan Restaurant',
foodType: 'Spanish',
description: 'Wide array of classic Puerto Rican dishes are available from the steam table at this casual buffet.',
image: require('@/assets/oldjuan.jpg'),
phoneNumber: '856-963-1200',
ratings: 4.4
},
{
id: 45,
name: 'Spanish Island Restaurant',
foodType: 'Spanish',
description: 'Lively Caribbean BYOB option in a colorful space serving mofongo, flan & tropical soft drinks.',
image: require('@/assets/spanishisland.jpg'),
phoneNumber: '215-744-5225',
ratings: 4.3
},
{
id: 46,
name: 'Greek Lady',
foodType: 'Greek',
description: 'Casual, contemporary Greek restaurant & bar featuring TVs, pool tables & a back patio.',
image: require('@/assets/greeklady.jpg'),
phoneNumber: '215-382-2600',
ratings: 4.2
},
{
id: 47,
name: 'South Street Souvlaki',
foodType: 'Greek',
description: 'Flavorful Greek fare & friendly service have kept this spot humming since 1977.',
image: require('@/assets/pasta.jpg'),
phoneNumber: '215-925-3026',
ratings: 4.6
},
{
id: 48,
name: 'Sancho Pistolas',
foodType: 'Mexican',
description: 'Buzzy restaurant serving inventive Mexican eats, cocktails, tequilas & more in an informal space.',
image: require('@/assets/sancho.jpg'),
phoneNumber: '267-324-3530',
ratings: 4.5
},
{
id: 49,
name: 'Que Chula Es Puebla Inc',
foodType: 'Mexican',
description: 'Casual spot for regional Mexican specialty dishes served in a tropically decorated dining room.',
image: require('@/assets/quechula.jpg'),
phoneNumber: '215-203-0404',
ratings: 4.3
},
{
id: 50,
name: 'Red Central Chinese Restaurant',
foodType: 'Chinese',
description: 'Basic Asian eatery serves dishes from a long roster of noodle & rice entrees plus chefs specials.',
image: require('@/assets/red.jpg'),
phoneNumber: '215-743-2088',
ratings: 4.5
},
{
id: 51,
name: 'China House',
foodType: 'Chinese',
description: 'No-nonsense storefront dishing up everyday Chinese food & takeaway in a humble setting.',
image: require('@/assets/chinahouse.jpg'),
phoneNumber: '215-925-2398',
ratings: 4.3
},
{
id: 52,
name: 'Jamaican Ds Caribbean & American Restaurant',
foodType: 'Caribbean',
description: 'Classic Caribbean dishes & chicken wings in a simple setup drawing an oft-long line of diners.',
image: require('@/assets/jamd.jpg'),
phoneNumber: '215-927-7415',
ratings: 4.3
},
    ],
    filteredRestaurants: []
  },
  mutations: {
    SET_AUTH_TOKEN(state, token) {
      state.token = token;
      localStorage.setItem('token', token);
      axios.defaults.headers.common['Authorization'] = `Bearer ${token}`
    },
    SET_USER(state, user) {
      state.user = user;
      localStorage.setItem('user',JSON.stringify(user));
    },
    LOGOUT(state) {
      localStorage.removeItem('token');
      localStorage.removeItem('user');
      state.token = '';
      state.user = {};
      axios.defaults.headers.common = {};
    },
    SET_CUISINES(state, cuisines) {
      state.savedCuisines = cuisines;
    },
    SET_SELECTION(state, selection) {
      state.userSelection = selection;
    },
    SET_FILTERED_RESTAURANTS(state, restaurants) {
      state.filteredRestaurants.push(restaurants); 
    }
  }
})

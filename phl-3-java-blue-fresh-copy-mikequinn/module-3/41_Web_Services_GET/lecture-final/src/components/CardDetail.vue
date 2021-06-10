<template>
  <div>
    <div class="loading" v-if="isLoading">
        <img src="../assets/ping_pong_loader.gif" />
    </div>
    <div v-else>
      <h1>{{ card.title }}</h1>
      <p>{{ card.description }}</p>
      <comments-list v-bind:comments="card.comments" />
      <router-link v-bind:to="{ name: 'Board',
        params:{ id: $route.params.boardID }}">Back to Board</router-link>
    </div>
  </div>
</template>

<script>
// BoardService.js is NOT a component (it is plain JavaScript)
// so we can give it whatever name we want when we import it.
//
// Components have to use the name declared in the 
// component
//
// so CommentsList must match Component
// but boardService does not need to match file
// because it is not a component and does not have name declared
//
import boardService from '@/services/BoardService.js';
import CommentsList from '@/components/CommentsList';
export default {
  name: "card-detail",
  components: {
    CommentsList
  },
  data() {
    return {
      card: {
        title: '',
        description: '',
        status:'',
        comments: []
      },
      isLoading: true
    }
  },
  created() {
    boardService.getCard( this.$route.params.boardID, this.$route.params.cardID)
      .then( (response => {
          // service returns a card so we just use response
          //
          // usually the whole response is returned and
          // we look at response.data
          //
          this.card = response;
          this.isLoading = false;
      }));
  }
};
</script>

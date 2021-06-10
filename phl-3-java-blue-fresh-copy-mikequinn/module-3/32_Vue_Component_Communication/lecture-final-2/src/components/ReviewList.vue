<template>
  <!-- We change review-list to review-table just for demo purposes -->
  <review-table v-bind:reviews="filteredReviews" />
</template>
<script>
import ReviewTable from './ReviewTable.vue';
// import ReviewTableRow from './ReviewTableRow.vue';
// import ReviewDisplay from "./ReviewDisplay";

export default {
  name: "review-list",
  components: {
    // ReviewTableRow,
    ReviewTable
    // ReviewDisplay
  },
  computed: {
    filteredReviews() {
      const reviewsFilter = this.$store.state.filter;
      const reviews = this.$store.state.reviews;

      return reviews.filter(review => {
        // use parseInt because value in $store is string not a number so
        // strict equality does not work. We could also use == rather
        // than === to check the value but ignore the type
        return reviewsFilter === 0 ? true : parseInt(reviewsFilter) === review.rating;
      });
    }
  }
};
</script>

<style>
div.main {
  margin: 1rem 0;
}
div.main div.well-display {
  display: flex;
  justify-content: space-around;
}

div.main div.well-display div.well {
  display: inline-block;
  width: 15%;
  border: 1px black solid;
  border-radius: 6px;
  text-align: center;
  margin: 0.25rem;
}

div.main div.well-display div.well span.amount {
  color: darkslategray;
  display: block;
  font-size: 2.5rem;
}

div.main div.well-display div.well {
  cursor: pointer;
}
</style>

<template>
  <div class="reviews">
    <!--
      
      // we removed this just to demonstrate addimg components
      // and passing data through to them
      
    <review-display
      v-for="(curReview, index) in filteredReviews"
      v-bind:key="index"
      v-bind:review-item="curReview"
      test-text="Hello"
    /> -->
    

      <!--
// Note we are using the  v-for  index above as the key
// we can do that if there is no unique piece of data
// in our objects. The line below is what was
// there before but I'd day a title is not necessarily
// a good thing to assume will be unique
//
// TO SAVE YOURSELF GRIEF AND ERROR, WORK TO
// ASSUME AS LITTLE AS POSSIBLE.
//
//  v-bind:key="curReview.title" -->

    <review-table-row v-for="(curReview, index) in reviews" 
      :key="index" v-bind:the-review="curReview" />

  </div>
</template>



<script>
import ReviewTableRow from './ReviewTableRow.vue';
export default {
  name: "review-table",
  props: ["reviews"],
  components: {
    ReviewTableRow
    // ReviewDisplay
  },
};
</script>

<style style="scoped">
th,
td {
  text-align: left;
}
td {
  padding-right: 10px;
  vertical-align: top;
}
tr:nth-child(even) {
  background-color: rgb(238, 238, 238);
}
.stars {
  display: flex;
}
</style>

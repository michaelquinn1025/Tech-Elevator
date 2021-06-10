<template>
  <review-display v-bind:review-item="theReview" test-text="test"/>
</template>

<script>
import ReviewDisplay from './ReviewDisplay.vue'
export default {
  components: { ReviewDisplay },
  props: ["theReview"]

}
</script>

<style>

</style>
<template>
  <div id="background-image">
  <div class="suggestions">
    <user-suggestions/>
  </div>
  </div>
</template>

<script>
import UserSuggestions from '@/components/UserSuggestions';

export default {
  name: "suggestions",
  components: {
    UserSuggestions
  }
};
</script>

<style>
.suggestions {
  padding: 80px 400px;
  padding-top: 100px;
}

#background-image {
  background-image: url(../assets/table1.jpg);
  background-repeat:no-repeat;
  background-size: 100%;
  background-position: center;
  background-attachment: fixed;
  background-origin: border-box;
}
</style>
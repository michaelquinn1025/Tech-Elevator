<template>
  <div id="background-image">
  <div class="favorites">
    <user-favorites/>
  </div>
  </div>
</template>

<script>
import UserFavorites from '@/components/UserFavorites';

export default {
  name: "favorites",
  components: {
    UserFavorites
  }
};
</script>

<style>
.favorites {
  margin-left: 180px;
  padding: 400px 400px;
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
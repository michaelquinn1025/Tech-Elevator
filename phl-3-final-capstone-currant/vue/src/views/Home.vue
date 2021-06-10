<template>
  <div id="background-image">
  <div class="home">
    <user-questionnaire/>
  </div>
  </div>
</template>

<script>
import UserQuestionnaire from '@/components/UserQuestionnaire';

export default {
  name: "home",
  components: {
    UserQuestionnaire
  }
};
</script>

<style>
.home {
  margin-left: 180px;
  padding: 80px 400px;
  padding-top: 150px;

}

#background-image {
  background-image: url(../assets/table1.jpg);
  background-repeat:no-repeat;
  background-size: 100%;
  background-position: center;
  background-attachment: fixed;
  background-origin: border-box;
  background-color: #9c0a0a;
}
</style>
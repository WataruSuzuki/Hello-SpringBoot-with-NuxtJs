<template>
  <v-row justify="center" align="center">
    <v-col cols="12" sm="8" md="6">
      <v-card>
        <v-card-title class="headline">
          Hello-SpringBoot-with-NuxtJs
        </v-card-title>
        <v-card-text>
          <v-text-field
            placeholder="Input something here"
            outlined
            v-model="message"
          ></v-text-field>
          <v-card-actions>
            <v-spacer />
            <v-btn color="primary" @click="hello(message)">
              Hello spring boot
            </v-btn>
          </v-card-actions>
          <p>{{ kaomoji }}</p>
          <p>Response: {{ response }}</p>

          <hr class="my-3" />

          <nuxt-link to="/inspire">Inspire</nuxt-link>
        </v-card-text>
      </v-card>
    </v-col>
  </v-row>
</template>

<script>
export default {
  data() {
    return {
      kaomoji: "(- 人 -)",
      response: ""
    };
  },
  methods: {
    async hello(msg) {
      console.log(msg);
      this.kaomoji = "(・∀・)b";
      this.response = await fetch(
        "http://localhost:8080/hello?message=" + msg
      ).then(res => res.data);
    }
  }
};
</script>

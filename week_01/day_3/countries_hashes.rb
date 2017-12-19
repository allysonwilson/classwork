
# countries = {
#   uk: {
#     capital: "London",
#     population: 1_000_000
#   }
#   germany: {
#     capital: "Berlin",
#     population: 5_000_000
#     }
# }
#
# puts countries [:germany]{}

avengers = {
  hulk:{
    name: "Bruce Banner",
    attack_moves: {
      Smash: 1000,
      Roll: 500
    }
  },
  iron_man:{
    name: "Tony Stark",
    attack_moves: {
      Punch: 10,
      Kick: 100
    }
  }
}

puts avengers [:hulk][:attack_moves]


avengers[iron_man][:attack_moves][:witty_sarcasm] = 1_000_000

require('pry-byebug')
require_relative('models/bounty')

bounty1 = SpaceCowboy.new({
  "name" => "Sid",
  "species" => "Saturine",
  "bounty_value" => "$4000",
  "danger_level" => "high"


  })

  bounty1.save()

  # bounties = SpaceCowboy.all()

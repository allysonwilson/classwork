SELECT victims.name, zombies.name FROM victims
  INNER JOIN bitings ON victims.id = bitings.victims_id
  INNER JOIN zombies ON bitings.zombie_id = zombies.id;


SELECT victims.* FROM victims
INNER JOIN bitings ON vicitms.id = bitings.victim_id
WHERE bitings.zombie_id = $1

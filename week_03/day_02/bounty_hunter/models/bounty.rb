require('pg')

class SpaceCowboy

attr_accessor(:name, :species, :bounty_value, :danger_level )
attr_reader(:id)

def initialize( bounty_details )
  @id = bounty_details["id"].to_i() if bounty_details["id"]
  @name = bounty_details["name"]
  @species = bounty_details["species"]
  @bounty_value = bounty_details["bounty_value"]
  @danger_level = bounty_details["danger_level"]
end

def save()
  db = PG.connect({ dbname: "bounty_hunter" , host: "localhost"})
  sql = "
  INSERT INTO bounty_hunter

  (name, species, bounty_value, danger_level)
  VALUES
  ($1, $2, $3, $4)
  RETURNING *;
  "
values = [@name, @species, @bounty_value, @danger_level]

db.prepare("save" , sql)

pg_result = db.exec_prepared("save", values)
saved_order_hash = pg_result[0]
id_string = saved_order_hash["id"]
@id = id_string.to_i

db.close()
end

def update()
  db = PG.connect({ dbname: "bounty_hunter", host: "localhost"  })
  sql = "
  UPDATE bounty_hunter
  SET
  (name, species, bounty_value, danger_level)
  =
  =
    ($1, $2, $3, $4)
    WHERE id = $5;
  "
  values = [@name, @species, @bounty_value, @danger_level]
  db.prepare("update", sql)
  db.exec_prepared("update" , values)
  db.close()
end

  def delete()
    db = PG.connect({ dbname: "bounty_hunter", host: "localhost"})
    sql = "
      DELETE FROM bounty_hunter
      WHERE id = $1;
    "
    values = [@id]
    db.prepare("delete_one", sql)
    db.close()
  end
  def find()

  end
end

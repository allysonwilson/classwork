require_relative("../db/sql_runner")

class User

  attr_reader :id
  attr_accessor :name

  def initialize( options )
    @id = options['id'].to_i
    @name = options['name']
  end

  def save()
    sql = "INSERT INTO users
    (
      name
    )
    VALUES
    (
      $1
    )
    RETURNING id"
    values = [@name]
    user = SqlRunner.run( sql, values ).first
    @id = user['id'].to_i
  end

  def self.all()
    sql = "SELECT * FROM users"
    values = []
    users = SqlRunner.run(sql, values)
    result = User.map_items(users)
    return result
  end

  def self.delete_all()
    sql = "DELETE FROM users"
    values = []
    SqlRunner.run(sql, values)
  end

  def locations_visited()
    sql = "
    SELECT locations.* FROM locations
     INNER JOIN visits ON locations.id = visits.location_id
      WHERE user_id = $1;
    "
    #your selecting from table that you want array returned from
    values = [@id]
    result = SqlRunner.run(sql , values)
    return Location.map_items(results)
  end

  def self.map_items(rows)
    return rows.map { |row| User.new(row) }
  end

end

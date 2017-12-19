class Wizard

  attr_reader ( :name )

  def initialize( name , wand_wood , wand_core )
    @name = name
    @wand = wand
    @wand_collection = {
      favourite_wand: wand,
      backup_wand: Wand.new()
    }
  end

  def cast_spell(spell_name)
    return @wand.cast(spell_name)
  end

end

//Super Class
abstract class PokemonStore {
    public abstract Pokemon createPokemon(String type, String skillName);

    public String orderPokemon(String type, String skillName, String color) {
        Pokemon pokemon = createPokemon(type, skillName);
        pokemon.setSkillName(skillName);
        pokemon.setColor(color);
        return pokemon.toString();
    }
}

// Super Class
abstract class Pokemon {
    public abstract void setColor(String color);

    public abstract void setSkillName(String skillName);

    public abstract String getSkillName();

    public abstract Integer getHp();

    public abstract Integer getSp();

    public abstract String getColor();

    @Override
    public String toString() {
        return "Skill= " + this.getSkillName()
                + ", HP=" + this.getHp() + ", SP=" + this.getSp()
                + ", COLOR=" + this.getColor();
    }
}

class OsakaPokemonStore extends PokemonStore {
    public Pokemon createPokemon(String name, String skillName) {
        if (name.equals("Pikachu")) {
            return new OsakaPikachu(30, 15);
        } else if (name.equals("Fushigidane")) {
            return new OsakaFushigidane(10, 20);
        }
        return null;
    }
}

class TokyoPokemonStore extends PokemonStore {
    public Pokemon createPokemon(String name, String skillName) {
        if (name.equals("Pikachu")) {
            return new TokyoPikachu(50, 1500);
        } else if (name.equals("Fushigidane")) {
            return new TokyoFushigidane(1000, 400);
        }
        return null;
    }
}

// sub class - 1
class OsakaPikachu extends Pokemon {
    private String skillName;
    private String color;
    private Integer hp;
    private Integer sp;

    public OsakaPikachu(Integer hp, Integer sp) {
        this.hp = hp;
        this.sp = sp;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    };

    public void setColor(String color) {
        this.color = color;
    };

    public String getSkillName() {
        return this.skillName;
    };

    public Integer getHp() {
        return this.hp;
    };

    public Integer getSp() {
        return this.sp;
    };

    public String getColor() {
        return this.color;
    }

}

// // sub class -2
class OsakaFushigidane extends Pokemon {
    private String color;
    private String skillName;
    private Integer hp;
    private Integer sp;

    public OsakaFushigidane(Integer hp, Integer sp) {
        this.hp = hp;
        this.sp = sp;
    }

    public void setColor(String color) {
        this.color = color;
    };

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    };

    public String getSkillName() {
        return this.skillName;
    };

    public Integer getHp() {
        return this.hp;
    };

    public Integer getSp() {
        return this.sp;
    };

    public String getColor() {
        return this.color;
    }
}

// sub class - 3
class TokyoPikachu extends Pokemon {
    private String color;
    private String skillName;
    private Integer hp;
    private Integer sp;

    public TokyoPikachu(Integer hp, Integer sp) {
        this.hp = hp;
        this.sp = sp;
    }

    public void setColor(String color) {
        this.color = color;
    };

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    };

    public String getSkillName() {
        return this.skillName;
    };

    public Integer getHp() {
        return this.hp;
    };

    public Integer getSp() {
        return this.sp;
    };

    public String getColor() {
        return this.color;
    }

}

// sub class -4
class TokyoFushigidane extends Pokemon {
    private String color;
    private String skillName;
    private Integer hp;
    private Integer sp;

    public TokyoFushigidane(Integer hp, Integer sp) {
        this.hp = hp;
        this.sp = sp;
    }

    public void setColor(String color) {
        this.color = color;
    };

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    };

    public String getSkillName() {
        return this.skillName;
    };

    public Integer getHp() {
        return this.hp;
    };

    public Integer getSp() {
        return this.sp;
    };

    public String getColor() {
        return this.color;
    }
}

class ClientTest {
    public static void main(String[] args) {
        // 정해진 한 가지 제품군만 사용
        System.out.println(new OsakaPokemonStore().orderPokemon("Pikachu", "Volt Tackle", "Black"));
        System.out.println(new TokyoPokemonStore().orderPokemon("Fushigidane", "Fury Cutter", "White"));

    }
}
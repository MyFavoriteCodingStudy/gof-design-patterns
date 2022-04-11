//Super Class
public abstract class Pokemon {
    public abstract String getSkillName();

    public abstract String getHp();

    public abstract String getSp();

    @Override
    public String toString() {
        return "Skill= " + this.getSkillName() + ", HP=" + this.getHp() + ", SP=" + this.getSp();
    }
}

// sub class - 1
class Pikachu extends Pokemon {
    private String skillName;
    private String hp;
    private String sp;

    public Pikachu(String skillName, String hp, String sp) {
        this.skillName = skillName;
        this.hp = hp;
        this.sp = sp;
    }

    public String getSkillName() {
        return this.skillName;
    };

    public String getHp() {
        return this.hp;
    };

    public String getSp() {
        return this.sp;
    };

}

// sub class -2
class Fushigidane extends Pokemon {
    private String skillName;
    private String hp;
    private String sp;

    public Fushigidane(String skillName, String hp, String sp) {
        this.skillName = skillName;
        this.hp = hp;
        this.sp = sp;
    }

    public String getSkillName() {
        return this.skillName;
    };

    public String getHp() {
        return this.hp;
    };

    public String getSp() {
        return this.sp;
    };
}

interface PokemonAbstractFactory {
    // return타입이 Super class인 Pokemon이다
    // 팩토리는 다형성으로 처리를
    Pokemon createPokemon();
}

class PikachuFactory implements PokemonAbstractFactory {
    private String skillName;
    private String hp;
    private String sp;

    PikachuFactory(String skillName, String hp, String sp) {
        this.skillName = skillName;
        this.hp = hp;
        this.sp = sp;
    }

    @Override
    public Pokemon createPokemon() {
        return new Pikachu(skillName, hp, sp);
    }
}

class FushigidaneFactory implements PokemonAbstractFactory {
    private String skillName;
    private String hp;
    private String sp;

    FushigidaneFactory(String skillName, String hp, String sp) {
        this.skillName = skillName;
        this.hp = hp;
        this.sp = sp;
    }

    @Override
    public Pokemon createPokemon() {
        return new Fushigidane(skillName, hp, sp);
    }
}

class PokemonFactory {
    static Pokemon getPokemon(PokemonAbstractFactory factory) {
        return factory.createPokemon();
    }
}

class ClientFactoryTest {
    public static void main(String[] args) {
        // 팩토리로 여러제품군 생성
        Pokemon pikachu = PokemonFactory.getPokemon(new PikachuFactory("Volt tackle", "30", "15"));
        System.out.println(pikachu.getSkillName());
        Pokemon fushigidane = PokemonFactory.getPokemon(new FushigidaneFactory("Fury Cutter", "15", "20"));
        System.out.println(fushigidane.getSkillName());
    }
}
<?php

//Super Class
abstract class PokemonPrototype {
    protected  $type;
    protected  $skillName;

    public function setSkillName($skillName)
    {
        $this->skillName = $skillName;
    }
    /**
     * @abstract
     * @return void
     */
    abstract public function __clone();

}

class PikachuPrototype extends PokemonPrototype {
    protected $type = 'Pikachu';
    
    public function getSkillName()
    {
        return $this->skillName;
    }

    public function getType()
    {
        return $this->type;
    }

    /**
     * empty clone(명시적 클론, 의도적 표시)
     */
    public function __clone()
    {
    }

    public function __toString()
    {
        return "Skill Name= " . $this->getSkillName() . ", type=" . $this->getType();
    }
}

class FushigidanePrototype  extends PokemonPrototype {
    protected $type = 'Fushigidane';

    public function getSkillName()
    {
        return $this->skillName;
    }

    public function getType()
    {
        return $this->type;
    }

    /**
     * empty clone(명시적 클론, 의도적 표시)
     */
    public function __clone()
    {
    }

    public function __toString()
    {
        return "Skill Name= " . $this->getSkillName() . ", type=" . $this->getType();
    }
}

$pikachuPrototype = new PikachuPrototype();
$hushigidanePrototype = new FushigidanePrototype();

for ($i = 0; $i < 10000; $i++) {
    $pikachu = clone $pikachuPrototype;
    $pikachu->setSkillName("Thunderbolt $i");
}
//var_dump($pikachu->__toString());

for ($i = 0; $i < 100000; $i++) {
    $hushigidane = clone $hushigidanePrototype;
    $hushigidane->setSkillName("??? ! $i");
}
//var_dump($hushigidane->__toString());

var_dump($pikachu);
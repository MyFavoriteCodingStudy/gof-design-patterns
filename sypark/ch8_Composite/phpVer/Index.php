<?php 
// 트리 구조 =_=; 포켓몬 진화과정정보..
// 대표 포켓몬 (피카츄) 
// 타입 : 전기
// 진화 종류(피츄-피카츄-라이츄) 

abstract class PokemonComponent {
    protected $parent;
    protected $mainPokemonName;
    public function __construct(string $mainPokemonName)
    {
        $this->mainPokemonName = $mainPokemonName;
    }
    public function addType (string $typeName): void {}
    public function addPokemonInfo (PokemonComponent $evolveName): void {}
    //감싸기
    public function setParent(PokemonComponent $pokemon = null)
    {
        $this->parent = $pokemon;
    }
    abstract public function print(): string;
}

class PokemonComposite extends PokemonComponent {
    protected $pokemon;
    protected $type;
	function __construct($pokemonName = 'pokemon') {
        parent::__construct($pokemonName);
        $this->pokemon = new SplObjectStorage();
	}
    function addType(string $type): void
    {   
        $this->type = $type;
    }
    /**
     * 진화내역 포켓몬 삽입
     *
     * @param PokemonComponent $pokemon
     * @return void
     */
    function addPokemonInfo(PokemonComponent $pokemon): void
    {
        $this->pokemon->attach($pokemon);
        //그 부모클래스에 $this 객체를 통째로 보내는 게 중요..
        //그래야 안에 들어감.
        $pokemon->setParent($this);
    }
    /**
     * 1포켓몬 당 진화과정 포켓몬 1개씩 insert
     *
     * @param PokemonComponent $component
     * @return void
     */
    function addEvolveName(PokemonComponent $component): void
    {
        $this->pokemon->attach($component);
        $component->setParent($this);
    }
    public function print(): string
    {
        $results = [];
        foreach ($this->pokemon as $child) {
            $results[] = $child->print();
        }

        return "Branch(" . implode("+", $results) . ")";
    }
}

class PokemonLeaf extends PokemonComponent {
    private $name;
	function __construct($name) {
        $this->name = $name;
	}
    public function print(): string
    {
        return $this->name;
    }
}
//포켓몬 트리 생성.
$treePokemon = new PokemonComposite();
//포켓몬 타입 지정.
$treePokemon->addType('electric');

//메인 포켓몬 이름 지정
$branch1 = new PokemonComposite('pikachu');
//진화과정 포켓몬 정보 추가
$branch1->addEvolveName(new PokemonLeaf('pichu'));
$branch1->addEvolveName(new PokemonLeaf('pikachu'));
$branch1->addEvolveName(new PokemonLeaf('raichu'));

$treePokemon->addPokemonInfo($branch1);

//pokemon(전체) -> 피카츄(대표) -> 진화과정(피츄-피카츄-라이츄)
//string(36) "Branch(Branch(pichu+pikachu+raichu))"
var_dump($treePokemon);
var_dump($treePokemon->print());
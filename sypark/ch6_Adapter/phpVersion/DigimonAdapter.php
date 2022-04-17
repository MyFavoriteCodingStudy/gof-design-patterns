<?php
include_once 'Pokemon.php';
include_once 'Digimon.php';
//Pokemon 오브젝트로 Digimon 오브젝트를 사용가능 'ㅁ'!
class DigimonAdapter implements Pokemon {
    private $digimon;
	function __construct(Digimon $digimon)
    {
        $this->digimon = $digimon;
	}
	/**
	 *
	 * @return mixed
	 */
	function getSkillName()
    {
        return $this->digimon->getSkillName();
	}
	
	/**
	 *
	 * @return mixed
	 */
	function getHp()
    {
        return $this->digimon->getHp();
	}
	
	/**
	 *
	 * @return mixed
	 */
	function getSp()
    {
        return $this->digimon->getSp();
	}

    function getIq()
    {
        return $this->digimon->getIq();
    }

    public function getDigimonOj()
    {
        return $this->digimon;
    }
}

$picachu = new Pikachu();
$agumon = new Agumon();

$digimonAdapter = new DigimonAdapter($agumon);

//Pokemon객체인데 어댑터를 써서 digimon 인터페이스의 메소드를 사용가능.
if ($digimonAdapter instanceof Pokemon) {
    var_dump($digimonAdapter->getIq());
    var_dump($digimonAdapter->getSkillName());
}


<?php
//Super Class
interface Pokemon {
    function getSkillName();

    function getHp();

    function getSp();
}

// sub class - 1
class Pikachu implements Pokemon {
	/**
	 *
	 * @return mixed
	 */
	function getSkillName() {
        return "100만볼트.....";
	}
	
	/**
	 *
	 * @return mixed
	 */
	function getHp() {
        return 10000;
	}
	
	/**
	 *
	 * @return mixed
	 */
	function getSp() {
        return 20000;
	}
	/**
	 */
	function __construct() {
	}
}
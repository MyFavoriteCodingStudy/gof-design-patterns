<?php
interface Digimon {
    function getSkillName();

    function getHp();

    function getSp();

	function getIq();
}

class Agumon implements Digimon {
	/**
	 *
	 * @return mixed
	 */
	function getSkillName() {
        return "Ice Melt......";
	}
	
	/**
	 *
	 * @return mixed
	 */
	function getHp() {
        return 77777;
	}
	
	/**
	 *
	 * @return mixed
	 */
	function getSp() {
        return 88888;
	}
	/**
	 *
	 * @return mixed
	 */
	function getIq() {
        return "digimon IQ TEST";
	}
}
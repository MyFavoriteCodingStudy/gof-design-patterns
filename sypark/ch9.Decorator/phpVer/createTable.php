<?php
/** 
 * 간단하게 "<table><tr><td>메세지</td></tr></table>"
 *  형식으로 데코레이터 간단한 예제연습
 * 
 */

//인터페이스 컴포넌트
interface tableComponent
{
    function tableOperation();
    function tableEndOperation();
}

//기본 토대가 되는 개념컴포넌트. 요기선 테이블로잡음.
class tableConcreteComponent implements tableComponent {
    function tableOperation()
    {
        return "<table>";
    }
    function tableEndOperation()
    {
        return "</table>";
    }
}

//(중요!!!)데코레이터의 실질적인 부분. 
// 컴포넌트 객체를 다형성으로 받아서 셋업
// 그리고 그 객체의 정의된 내용 리턴 
class tableDecorator  implements tableComponent {
    private tableComponent $table;
	function __construct(tableComponent $table) {
        $this->table  = $table;
	}
	/**
	 *
	 * @return mixed
	 */
	function tableOperation() {
        return $this->table->tableOperation();
	}

    function tableEndOperation()
    {
        return $this->table->tableEndOperation();
    }
}

class tableTrConcreteDecorator extends tableDecorator {
	/**
	 *
	 * @return mixed
	 */
	function tableOperation() {
        return parent::tableOperation() . "<tr>";
	}

    function tableEndOperation()
    {
        return "</tr>" .  parent::tableEndOperation();
    }
}

class tableTdConcreteDecorator extends tableDecorator {
	/**
	 *
	 * @return mixed
	 */
	function tableOperation() {
        return parent::tableOperation() . "<td>";
	}

    function tableEndOperation()
    {
        return "</td>"  .  parent::tableEndOperation();
    }
}


class tableTextConcreteDecorator extends tableDecorator {
    private $message;
    function tableOperation() {
        if (!$this->message) $this->message = 'test message';
        return parent::tableOperation() . $this->message;
	}

    function tableEndOperation()
    {
        return  parent::tableEndOperation();
    }

    function setTableText($message)
    {
        $this->message = $message;
    }
}


$newTable =  new tableTextConcreteDecorator(new tableTdConcreteDecorator(new tableTrConcreteDecorator(new tableConcreteComponent())));
$newTable->setTableText('お腹すいて勉強できへん');
var_dump($newTable->tableOperation() . $newTable->tableEndOperation());
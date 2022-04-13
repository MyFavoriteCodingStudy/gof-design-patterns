<?php
//날짜별로 사용 서비스가 다를 때
// (메소드) 호텔이름, 공원티켓, 저녁코스, 어떤 이벤트이름
class VactionPlan { 
    private $day;
    //추가옵션
    private $hotelName;
    private $parkTickets;
    private $diningCourse;
    private $specialEventName;

    static function createBuilder($day): VactionPlanBuilder
    { 
        return new VactionPlanBuilder($day); 
    }

    function __construct(VactionPlanBuilder $builder)
    {
        $this->day = $builder->getDay();
        //추가 옵션^^!
        $this->hotelName = $builder->getHotelName();
        $this->parkTickets = $builder->getParkTickets();
        $this->diningCourse = $builder->getDiningCourse();
        $this->specialEventName = $builder->getSpecialEventName();
    }

    public function __toString(): String
    {
        return "day =  $this->day
                , HotelName= $this->hotelName
                , ParkTickets= $this->parkTickets
                , DiningCourse= $this->diningCourse
                , SpecialEventName= $this->specialEventName";
    }
}

class VactionPlanBuilder {
    private $day;
    //추가 옵션^^!
    private $hotelName;
    private $parkTickets;
    private $diningCourse;
    private $specialEventName;

	public function __construct($day)
    {
        $this->day = $day;
    }

    public function buildDay()
    {
        return new VactionPlan($this);
    }

    public function hotelName($hotelName)
    {
        $this->hotelName = $hotelName;
        return $this;
    }

    public function parkTickets($parkTickets)
    {
        $this->parkTickets = $parkTickets;
        return $this;
    }

    public function diningCourse($diningCourse)
    {
        $this->diningCourse = $diningCourse;
        return $this;
    }

    public function specialEventName($specialEventName)
    {
        $this->specialEventName = $specialEventName;
        return $this;
    }

    public function getDay(): String
    {
		return $this->day ?? '';
	}

    public function getHotelName(): String
    {
		return $this->hotelName ?? ' X ';
	}
	
    public function getParkTickets(): String
    {
		return $this->parkTickets ?? ' X ';
	}
	
    public function getDiningCourse(): String
    {
		return $this->diningCourse ?? ' X ';
	}
	
    public function getSpecialEventName(): String
    {
		return $this->specialEventName ?? ' X ';
	}

}

//client 작성
$vactionPlanBuilder = VactionPlan::createBuilder(1);
$vactionPlanBuilder->hotelName('Grand Intercontinental Hotel');
$vactionPlanBuilder->getDiningCourse('course..........');
$vactionPlanBuilder->diningCourse('takoyaki & okonomiyaki');
//1일차 플랜을 build해서 결과물 리턴받아서 출력
$vacationPlan = $vactionPlanBuilder->buildDay();
var_dump($vacationPlan->__toString());

$vactionPlanBuilder = VactionPlan::createBuilder(2);
$vactionPlanBuilder->hotelName('capsule hotel');
$vactionPlanBuilder->diningCourse('tomato ramen');
$vactionPlanBuilder->specialEventName('코스프레 관람..?');
//1일차 플랜을 build해서 결과물 리턴받아서 출력
$vacationPlan = $vactionPlanBuilder->buildDay();
var_dump($vacationPlan->__toString());
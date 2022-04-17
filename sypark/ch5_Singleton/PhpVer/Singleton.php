<?php

class Singleton
{
    private static $singleton;
    
    // new Singleton()でインスタンスを作成できないよう、アクセス修飾子はprivateにする
    private function __construct()
    {
    }

    public static function getInstance(): Singleton
    {
        if (is_null(self::$singleton))
        {
            self::$singleton = new Singleton();
        }
        return self::$singleton;
    }
    
    final function __clone()
    {
        throw new Exception(sprintf('Clone is not allowed: %s', get_class($this)));
    }
}

var_dump(Singleton::getInstance());
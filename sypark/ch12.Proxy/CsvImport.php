<?php
interface CsvImport
{
    public function fileReading();
}

class Import implements CsvImport
{
    public function fileReading():String
    {
        $filePath =  "test.csv";
        $file = new \SplFileObject($filePath);
        $file->setFlags(
            \SplFileObject::READ_CSV |
            \SplFileObject::SKIP_EMPTY |
            \SplFileObject::READ_AHEAD
        );
        $list = "<table>";
        while(!$file->eof()){
           $line = preg_replace('/\r\n|\r|\n/','', $file->fgetcsv(",", '"', "\\") ?? []);
           $list = $list . "<tr>";
           foreach ($line as $value) {
               $list = $list .  "<td>" . $value . "</td>";
            }
            $list = $list .  "</tr>";
        }
        $list = $list .  "</table>";
        echo "success!";
        return $list ?? "";
    }
}

class ImportFroxy implements CsvImport
{
    private $csvImport;
    private $data;
    function __construct(CsvImport $csvImport)
    {
        $this->csvImport = $csvImport;
    }
    private function checkAccess()
    {
        return isset($this->csvImport->data);
    }
    public function fileReading(): string
    {
        if (!$this->checkAccess()) {
            echo "loading...";
            $this->csvImport->data = $this->csvImport->fileReading();
        }
        return $this->csvImport->data;
    }
}

$csvOb = new Import();

$proxyOb = new ImportFroxy($csvOb);

var_dump($proxyOb->fileReading());
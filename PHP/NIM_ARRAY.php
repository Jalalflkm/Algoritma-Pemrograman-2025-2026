<?php

$nim = readline("Masukkan NIM: ");

$array_digit = [];
$total = 0;
$count = 0;

for ($i = 0; $i < strlen($nim); $i++) {
    $char = $nim[$i];
    if (ctype_digit($char)) {
        $d = (int) $char;
        $array_digit[] = $d;
        
        $total += $d;
    }
}

if (empty($array_digit)) {
    echo "NIM tidak valid atau tidak memiliki digit.\n";
    exit;
}

$count = count($array_digit);

$maks = $array_digit[0];
foreach ($array_digit as $d) {
    if ($d > $maks) {
        $maks = $d;
    }
}

$minim = $array_digit[0];
foreach ($array_digit as $d) {
    if ($d < $minim) {
        $minim = $d;
    }
}

$rata = $total / $count;

$rev = [];
$rev = array_reverse($array_digit); 

echo "\n--- Hasil Perhitungan ---\n";
echo "Digit          : " . implode(", ", $array_digit) . "\n";
echo "Total          : " . $total . "\n";
echo "Maksimum       : " . $maks . "\n";
echo "Minimum        : " . $minim . "\n";
echo "Rata-rata      : " . $rata . "\n";
echo "Reverse array  : " . implode(", ", $rev) . "\n";
?>
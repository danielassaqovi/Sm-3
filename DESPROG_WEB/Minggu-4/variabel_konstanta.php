<?php
$angka1 = 10; // ini adalah variabel
$angka2 = 5; // ini adalah variabel
$hasil = $angka1 + $angka2; // ini adalah variabel
echo "Hasil penjumlahan $angka1 + $angka2 = $hasil\n";

$benar = true; // ini adalah variabel
$salah = false; // ini adalah variabel
echo "variabel benar: $benar, variabel salah: $salah\n";

// Mendefinisikan konstanta
define("NAMA_SITUS", "daniel.com"); // ini adalah konstanta
define("TAHUN_PENDIRIAN", 2023); // ini adalah konstanta

echo "Selamat datang di " . NAMA_SITUS . ", situs yang
didirikan pada tahun " . TAHUN_PENDIRIAN . ".\n";
?>
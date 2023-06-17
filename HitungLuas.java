// Interface untuk menghitung luas
interface HitungLuas {
    double hitungLuas();
}

// Abstract class sebagai superclass untuk bangun datar
abstract class BangunDatar implements HitungLuas {
    abstract void printInfo();
}
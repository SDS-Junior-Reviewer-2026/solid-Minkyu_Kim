package house;

abstract class Apartment {
    int squareFootage;
    int numberOfBedrooms;

    abstract void setSquareFootage(int sqft);
    abstract void upgradeBedroomNumber();

    void upgrade() {
        setSquareFootage(squareFootage + 40);
        upgradeBedroomNumber();
    }
}
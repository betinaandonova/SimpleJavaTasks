//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    double holidayPriceTotal=10500.50;
    double pricePerNight = holidayPriceTotal * 0.5; //50% from the holiday price
    double rentBeachBed = holidayPriceTotal * 0.05; //5% from the holiday price
    double restaurantExpenses = holidayPriceTotal * 0.3; //30% from the holiday price
    double additionalEntertainments = holidayPriceTotal * 0.1; //10% from the holiday price
    double other = holidayPriceTotal * 0.05; //5% from the holiday price

    System.out.printf("holiday price total = " + holidayPriceTotal +
            " \nprice per night = " + pricePerNight +
            " \nrent beach bed price = " + rentBeachBed +
            " \nrestaurant expenses = " + restaurantExpenses +
            " \nadditional entertainments = " + additionalEntertainments +
            " \nother = " + other);
}

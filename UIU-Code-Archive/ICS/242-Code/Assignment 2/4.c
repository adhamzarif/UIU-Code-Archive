#include <stdio.h>

int main() {
    float totalAmount, discount = 0.0, finalAmount;

    printf("Enter the total purchase amount: ");
    scanf("%f", &totalAmount);

    if (totalAmount < 50) {
        discount = 0.0;
        printf("No discount\n");
    } else if (totalAmount >= 50 && totalAmount <= 100) {
        discount = 5.0;
        printf("5%% discount\n");
    } else if (totalAmount >= 101 && totalAmount <= 200) {
        discount = 10.0;
        printf("10%% discount\n");
    } else if (totalAmount >= 201 && totalAmount <= 500) {
        discount = 15.0;
        printf("15%% discount\n");
    } else if (totalAmount > 500) {
        discount = 20.0;
        printf("20%% discount\n");
    }


    finalAmount = totalAmount - (totalAmount * discount / 100);

    printf("Final amount after discount is: %.2f\n", finalAmount);

    return 0;
}

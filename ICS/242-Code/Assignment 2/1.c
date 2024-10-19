#include <stdio.h>

int main() {
    float a, b;
    int choice, caseChoice;

    printf("Enter two numbers (a, b): ");
    scanf("%f %f", &a, &b);

    printf("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\n");
    printf("Enter your choice: ");
    scanf("%d", &choice);

    switch (choice) {
        case 1:
            printf("Addition: %.2f\n", a + b);
            break;
        case 2:
            printf("Subtraction: %.2f\n", a - b);
            break;
        case 3:
            printf("Multiplication: %.2f\n", a * b);
            break;
        case 4:
            if (b != 0) {
                printf("1-Quotient\n2-Remainder\n");
                printf("Enter your case choice: ");
                scanf("%d", &caseChoice);

                if (caseChoice == 1) {
                    printf("Quotient: %.2f\n", a / b);
                } else if (caseChoice == 2) {

                    int intA = (int)a;
                    int intB = (int)b;
                    int result = intA * intB + 2;
                    printf("Reminder: %d\n", result);
                } else {
                    printf("Invalid case choice\n");
                }
            } else {
                printf("Error: Divisor is zero\n");
            }
            break;
        default:
            printf("Invalid choice\n");
    }

    return 0;
}

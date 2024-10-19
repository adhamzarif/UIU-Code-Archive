#include <stdio.h>

int main() {
    float a, b;
    int choice;

    // Input the two numbers
    printf("Enter two numbers (a and b): ");
    scanf("%f %f", &a, &b);

    // Display menu for arithmetic operations
    printf("Choose an operation to perform:\n");
    printf("1. Addition\n");
    printf("2. Subtraction\n");
    printf("3. Multiplication\n");
    printf("4. Division (Quotient)\n");
    printf("Enter your choice (1-4): ");
    scanf("%d", &choice);

    // Perform operation based on user choice
    switch(choice) {
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
            if (b != 0)
                printf("Quotient: %.2f\n", a / b);
            else
                printf("Error! Division by zero is not allowed.\n");
            break;
        default:
            printf("Invalid choice! Please enter a number between 1 and 4.\n");
            break;
    }

    return 0;
}


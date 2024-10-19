
#include <stdio.h>

int main() {
    float a, b;
    int choice, caseNum;

    printf("Enter two real numbers (a, b): ");
    scanf("%f %f", &a, &b);

    printf("Enter your choice (1 for addition, 2 for subtraction, 3 for multiplication, 4 for division): ");
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
            printf("Enter your choice (1 for quotient, 2 for remainder): ");
            scanf("%d", &caseNum);

            if (caseNum == 1) {
                printf("Quotient: %.2f\n", a / b);
            } else if (caseNum == 2) {
                printf("Reminder: %.2f\n", (a%b));
            } else {
                printf("Invalid choice for caseNum.\n");
            }
            break;
        default:
            printf("Invalid choice.\n");
    }

    return 0;
}

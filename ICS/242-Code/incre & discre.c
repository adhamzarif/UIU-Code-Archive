#include <stdio.h>

int main() {
    int x, y;

    printf("Enter the value for X: ");
    scanf("%d",&x);

    printf("Enter the value for Y: ");
    scanf("%d",&y);

    x + y;
    printf("Increment value: %d\n", x);

    x - y;
    printf("Decrement value: %d\n", x);

    return 0;
}

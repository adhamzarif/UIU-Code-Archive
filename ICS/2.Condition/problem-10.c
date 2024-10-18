#include <stdio.h>

int main() {
    int total_inches, feet, inches;

    printf("Enter the height in inches: ");
    scanf("%d", &total_inches);

    feet = total_inches / 12;
    inches = total_inches % 12;

    printf("%d feet %d inch\n", feet, inches);

    return 0;
}

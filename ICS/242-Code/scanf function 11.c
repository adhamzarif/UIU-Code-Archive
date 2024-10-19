#include <stdio.h>

int main() {
    int total_seconds, hours, minutes, seconds;

    // Input: time in seconds
    printf("Enter time in seconds: ");
    scanf("%d", &total_seconds);

    // Calculate hours, minutes, and seconds
    hours = total_seconds / 3600;
    total_seconds = total_seconds % 3600;
    minutes = total_seconds / 60;
    seconds = total_seconds % 60;

    // Output the result in hour-minute-second format
    printf("%d hour %d minute %d second\n", hours, minutes, seconds);

    return 0;
}


#include <stdio.h>

int main() {
    int aqi;

    printf("Enter the Air Quality Index (AQI): ");
    scanf("%d", &aqi);

    if (aqi >= 0 && aqi <= 50) {
        printf("Good\n");
    } else if (aqi >= 51 && aqi <= 100) {
        printf("Moderate\n");
    } else if (aqi >= 101 && aqi <= 150) {
        printf("Unhealthy for Sensitive Groups\n");
    } else if (aqi >= 151 && aqi <= 200) {
        printf("Unhealthy\n");
    } else if (aqi >= 201 && aqi <= 300) {
        printf("Very Unhealthy\n");
    } else if (aqi > 300) {
        printf("Hazardous\n");
    } else {
        printf("Invalid AQI value\n");
    }

    return 0;
}

#include <stdio.h>

int main() {
    int X, n1, n2, n3;

    printf("Player-1, pick a number: ");
    scanf("%d", &X);

    printf("Player-2, enter your 3 guesses: ");
    scanf("%d", &n1);

    if (n1 == X) {
        printf("Right, Player-2 wins!\n");
        return 0;
    } else {
        printf("Wrong, 2 Chance(s) Left!\n");
    }

    scanf("%d", &n2);
    if (n2 == X) {
        printf("Right, Player-2 wins!\n");
        return 0;
    } else {
        printf("Wrong, 1 Chance(s) Left!\n");
    }
    scanf("%d", &n3);
    if (n3 == X) {
        printf("Right, Player-2 wins!\n");
    } else {
        printf("Wrong, 0 Chance(s) Left!\n");
        printf("Player-1 wins!\n");
    }

    return 0;
}

#include <stdio.h>

int main() {
  int X, N, guess, tries = 0;

  printf("Player-1, enter the number to be guessed: ");
  scanf("%d", &X);

  printf("Enter the total number of tries for Player-2: ");
  scanf("%d", &N);

  while (tries < N) {
    printf("Player-2, enter your guess: ");
    scanf("%d", &guess);

    if (guess == X) {
      printf("Right, Player-2 wins!\n");
      return 0; // also can use break
    } else {
      printf("Wrong, %d Choice(s) Left!\n", N - tries - 1);
      tries++;
    }
  }

  printf("Player-1 wins!\n");

  return 0;
}

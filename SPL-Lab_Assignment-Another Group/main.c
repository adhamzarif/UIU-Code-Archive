#include <stdio.h>

void printFloors(int currentFloor, int targetFloor, FILE *output) {
  if (currentFloor > targetFloor) {
    return;
  }

  fprintf(output, "I've reached the %d", currentFloor);

  if (currentFloor == 1) {
    fprintf(output, "st");
  } else if (currentFloor == 2) {
    fprintf(output, "nd");
  } else if (currentFloor == 3) {
    fprintf(output, "rd");
  } else {
    fprintf(output, "th");
  }

  fprintf(output, " floor\n");

  printFloors(currentFloor + 1, targetFloor, output);
}

int main() {
  FILE *inputFile = fopen("input.txt", "w");
  if (inputFile == NULL) {
    printf("Error opening input file.\n");
    return 1;
  }

  int n;
  printf("Enter the number of floors: ");
  scanf("%d", &n);
  fprintf(inputFile, "%d", n);
  fclose(inputFile);

  FILE *output = fopen("output.txt", "w");
  if (output == NULL) {
    printf("Error opening output file.\n");
    return 1;
  }

  printFloors(1, n, output);

  fclose(output);

  return 0;
}

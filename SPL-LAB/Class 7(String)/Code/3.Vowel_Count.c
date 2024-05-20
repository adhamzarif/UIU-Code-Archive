#include <stdio.h>

int main(void) {
  char x[1000];
  gets(x);
  //puts(x);
  int count = 0;
  for (int i = 0; x[i]; i++) {
    if (x[i] == 'a' || x[i] == 'e' || x[i] == 'i' || x[i] == 'o' ||
        x[i] == 'u' || x[i] == 'A' || x[i] == 'E' || x[i] == 'I' ||
        x[i] == 'O' || x[i] == 'U')
      count++;
  }
  printf("Length: %d", count);
  return 0;
}

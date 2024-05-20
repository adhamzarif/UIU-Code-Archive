#include <stdio.h>

int main(void) {
  char x[1000];
  gets(x);
  //puts(x);
  int count = 0;
  for (int i = 0; x[i]; i++) {
    count++;
  }
  printf("Length: %d", count);
  return 0;
}

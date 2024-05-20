#include <stdio.h>

int main(void) {
  char x[1000];
  gets(x);
  //puts(x);
  int count = 0;
  for (int i = 0; x[i]; i++) {
    if(x[i] >= 'a' && x[i] <= 'z'){
      x[i]+=32;
    }
  }
  printf("Length: %s", x);
  return 0;
}

#include <stdio.h>
int main() {
  int i = 0, count = 0, j = 0;
  char num1[200], num2[200];
  gets(num1);
  gets(num2);
  while (num1[i] != '\0') {
    i++;
    count++;
  }
  while (num2[j] != '\0') {
    num1[count + j] = num2[j];
    j++;
  }
  printf("%s", num1);
  return 0;
}

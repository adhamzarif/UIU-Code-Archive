#include <stdio.h>
int main() {
  int i, j, k, count = 0;
  char str[100];
  scanf("%[^\n]s", str);

  for (i = 0; i < 100; i++) {

    if (str[i] != '\0') {
      count++;
    } else {
      break;
    }
  }
  for (i = 0; i < count; i++) {
    for (j = i + 1; j < count; j++) {
      if (str[i] == str[j]) {
        for (k = j; k < count; k++) {
          str[k] = str[k + 1];
        }
      }
    }
  }
  printf("%s", str);
  return 0;
}

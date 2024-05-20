#include <stdio.h>
int main() {
  int N, i, count = 0;
  scanf("%d", &N);
  char arr[N];
  for (i = 0; i < N; i++) {
    scanf("%c", &arr[i]);
  }
  for (i = 0; i < N; i++) {
    if (arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' ||
        arr[i] == 'U')
      count++;
  }
  printf("%d", count);
  return 0;
}

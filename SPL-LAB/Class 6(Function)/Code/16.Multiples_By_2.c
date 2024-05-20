#include <stdio.h>
void mult_num(int a[], int n) {
  int i, answer;
  for (i = 0; i < n; i++) {
    answer = a[i] * 2;
    printf("%d ", answer);
  }
}
int main(void) {
  int numb, i, result;
  scanf("%d", &numb);
  int num[numb];
  for (i = 0; i < numb; i++) {
    scanf("%d", &num[i]);
  }

  mult_num(num, numb);

  return 0;
}

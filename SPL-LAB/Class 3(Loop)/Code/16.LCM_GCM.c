#include <stdio.h>
int main() {
  int num1, num2, gcd, lcm, max;
  printf("Enter integers:");
  scanf("%d%d", &num1, &num2);

  for (int i = 1; i <= num1 && i <= num2; i++) {
    if (num1 % i == 0 && num2 % i == 0) {
      gcd = i;
    }
  }

  if (num1 > num2) {
    max = num1;
  } else {
    max = num2;
  }
  for (lcm = max;; lcm++) {
    if ((lcm % num1 == 0) && (lcm % num2 == 0)) {
      break;
    }
  }
  printf("GCD: %d\n", gcd);
  printf("LCM: %d\n", lcm);
  return 0;
}

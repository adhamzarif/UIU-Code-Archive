#include <stdio.h>

struct area {
  int triangle_id;
  int height;
  int base;
};

int main() {

  int size, i;
  int add[500];
  scanf("%d", &size);
  struct area s1[size];
  for (i = 0; i < size; i++) {
    printf("\tEnter triangle number\n");
    printf("Triangle_id : ");
    scanf("%d", &s1[i].triangle_id);
    printf("Base : ");
    scanf("%d", &s1[i].base);
    printf("Height : ");
    scanf("%d", &s1[i].height);
  }
  for (i = 0; i < size; i++) {
    add[i] = ((s1[i].height * s1[i].base) / 2);
    printf("Area of %d: %d\n", i + 1, add[i]);
  }

  return 0;
}

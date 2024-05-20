#include <stdio.h>
struct student {
  char name[20];
  int age;
  float mark;
};
int main(void) {
  struct student std;
  printf("Enter name: ");
  scanf("%s", std.name);
  printf("Enter age: ");
  scanf("%d", &std.age);
  printf("Enter mark: ");
  scanf("%f", &std.mark);

  printf("Display the information: \n");

  printf("Name: %s\n", std.name);
  printf("Age: %d\n", std.age);
  printf("Mark: %.2f\n", std.mark);

  return 0;
}



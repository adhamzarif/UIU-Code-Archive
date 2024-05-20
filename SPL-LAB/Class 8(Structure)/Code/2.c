#include <stdio.h>
struct student {
  char name[20];
  int age;
  float mark;
};

struct student std[3]; // global variable //it will take 3 details of student

void read_array() {
  for (int i = 0; i < 3; i++) {
    fflush(stdin); // clear the input buffer
    printf("Enter name: \n");
    scanf("%s", std[i].name);
    printf("Enter age: \n");
    scanf("%d", &std[i].age);
    printf("Enter mark: \n");
    scanf("%f", &std[i].mark);
  }
}

void display() {
  printf("Information of students: \n");
  for (int i = 0; i < 3; i++) {
    printf("Name: %s\n", std[i].name);
    printf("Age: %d\n", std[i].age);
    printf("Mark: %.2f\n", std[i].mark);
  }
}
int main(void) {

  read_array();
  display();

  return 0;
}

// #include <stdio.h>
// struct student {
//   char name[20];
//   int age;
//   float mark;
// };

// struct student std[3]; // global variable //it will take 3 details of student

// void read_array() {
//   for (int i = 0; i < 3; i++) {
//     fflush(stdin); // clear the input buffer
//     printf("Enter name: \n");
//     scanf("%s", std[i].name);
//     printf("Enter age: \n");
//     scanf("%d", &std[i].age);
//     printf("Enter mark: \n");
//     scanf("%f", &std[i].mark);
//   }
// }

// void display() {
//   printf("Information of students: \n");
//   for (int i = 0; i < 3; i++) {
//     printf("Name: %s\n", std[i].name);
//     printf("Age: %d\n", std[i].age);
//     printf("Mark: %.2f\n", std[i].mark);
//   }
// }

// void senior() {
//   int max = std[0].age;
//   int pos;
//   for (int i = 0; i < 3; i++) {
//     if (std[i].age > max) {
//       max = std[i].age;
//       pos = i;
//     }
//   }

//   printf("\nSenior student is : %s", std[pos].name);
// }
// int main(void) {

//   read_array();
//   display();
//   senior();

//   return 0;
// }

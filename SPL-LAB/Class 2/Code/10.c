#include <stdio.h>

int main(void) {
  double num1,num2;
  char ch;
  printf("Enter number the charecter: ");
  scanf(" %lf %c %lf",&num1,&ch,&num2);
  if(ch == '+')
  {
    printf("Addition is %lf",num1+num2);
  }
  else if(ch == '-')
  {
    printf("Substraction is %lf",num1-num2);
  }
  else if(ch == '*')
  {
    printf("Multiplication is %lf",num1*num2);
  }
  else if(ch == '/')
  {
    if( num2 == 0)
    {
      printf("Divide by zero error");
    }
    else
    {
      printf("Divition is %lf",num1/num2);
    }
  }
  else
  {
    printf("Wrong input");
  }
  
  return 0;
}

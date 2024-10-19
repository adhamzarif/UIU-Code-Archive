#include<stdio.h>
int main()
{
    int  num1,num2,result;
    printf("enter two numbers:");
    scanf("%d %d",&num1,&num2);

    //result = num1 + num2;
    printf("sum =%d\n",(num1+num2));

      result = num1 - num2;
    printf("sub =%d\n",result);

      result = num1 * num2;
    printf("mul =%d\n",result);

      result = num1 / num2;
    printf("div =%d\n",result);

      result = num1 % num2;
    printf("modulus =%d\n",result);
    return 0;
}


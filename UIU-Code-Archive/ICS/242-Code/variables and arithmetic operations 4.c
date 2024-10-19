#include<stdio.h>
int main()
{
    int a,b,c,d;
    float result;
    printf(" enter inputs:");
    scanf("%d %d %d %d",&a,&b,&c,&d);
    result=(a * b) + ((a - c) / (float)d) + b;
    printf("the sum is:%f\n",result);
    return 0;
}


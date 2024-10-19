#include<stdio.h>
int main()
{
    float u,a,t,s;
    printf("enter the value of u,a,t:");
    scanf("%f %f %f",&u,&a,&t);

    s= u*t+0.5*a*t*t;
    printf("S=%.0f\n",s);

    return 0;
}

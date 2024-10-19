
 #include<stdio.h>
int main()
{
       int a,b,c,d;

    printf("enter 4 numbers:");
    scanf("%d %d %d %d",&a,&b,&c,&d);
      int result = a * b + (a - c) / (float)d + b;
printf("%d * %d + (%d - %d) / %d + %d = %d\n", a, b, a, c, d, b, result);
    return 0;
}

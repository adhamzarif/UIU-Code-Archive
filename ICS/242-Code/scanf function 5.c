
 #include<stdio.h>
int main()
{
       float a,b,c,d;

    printf("enter 4 numbers:");
    scanf("%f %f %f %f",&a,&b,&c,&d);
      float result = ((a + b-c) * d-a / d);
printf("%f + %f – %f) * %f – %f / %f = %f\n", a, b, c, d, a, d, result);
    return 0;
}


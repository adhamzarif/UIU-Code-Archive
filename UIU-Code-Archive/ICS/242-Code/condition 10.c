#include<stdio.h>
int main()
{
     float x,y;
char ch;
    printf("take input:");
    scanf("%f %c%f",&x,&ch,&y);
    if(ch='*')
        printf("Multiplication:%.1f\n",x*y);
   else  if(ch='/') {if( y!=0)
        {printf("division:%.1f\n",x/y);}
        else {

            printf("Division: Zero as divisor is not valid!\n");
        }
   }
       else  if(ch='+')
        printf("sum:%.1f\n",x+y);
      else   if(ch='-')
        printf("sub:%.1f\n",x-y);

        else
            printf("invalid");
    return 0;
}

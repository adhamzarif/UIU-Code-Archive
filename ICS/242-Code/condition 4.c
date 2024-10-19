#include<stdio.h>
int main()
{
    int a,b,c;
    printf("Enter 3 degrees:");
    scanf("%d %d %d",&a,&b,&c);
     if(a+b+c==180){
    printf("yes it is valid");
     }
    else{
        printf("No it is not valid");
    }
    return 0;
}

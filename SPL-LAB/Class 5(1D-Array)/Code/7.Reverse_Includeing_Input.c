#include <stdio.h>
int main() {
  int N, i;
  scanf("%d", &N);
  int arr[N];
  for (i = 0; i < N; i++) {
    scanf("%d", &arr[i]);
  }
  for (i = 0; i < N / 2; i++) {
    int temp = arr[i];
    arr[i] = arr[N - 1 - i];
    arr[N - 1 - i] = temp;
  }
  for (i = 0; i < N; i++) {
    printf("%d ", arr[i]);
  }
  return 0;
}

// #include <stdio.h>
// int main()
// {
//     int N,i;
//     scanf("%d",&N);
//     int arr[N],B[N];
//     for(i = 0;i < N;i++)
//     {
//         scanf("%d",&arr[i]);
//     }
//     for(i = 0;i < N;i++)
//     {
//         B[i] = arr[N - 1 - i];
//     }

//     for(i = 0;i < N;i++)
//     {
//         printf("%d ",B[i]);
//     }
//     return 0;
// }

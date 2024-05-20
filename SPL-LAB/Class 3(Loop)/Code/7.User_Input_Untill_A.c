int main() {
  char input;

  printf("Enter value: ");
  for (;;) {
    scanf(" %c", &input);
    printf("Input: %c\n", input);
    if (input == 'A')
      break;
  }
  return 0;
}

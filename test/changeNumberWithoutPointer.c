#include <stdio.h>
#include <string.h>
#include <stdlib.h>

// declare functions
void change(int number);

int main(void)
{
  int test = 20;
  printf("the number is %i\n", test);

  change(test);

  printf("the number is %i\n", test);
  return 0;
}

void change(int number)
{
  number = 15;
}